import React, {Component} from 'react'
import {Link} from "react-router-dom";
import TableReference from './TableReference'
import sadFace from './sad_face.jpg'
import sucessImg from './success.png'
import loading from '../../containers/loading.gif'

class Payment extends Component {
    constructor(props) {
        super(props);
        this.state = {
            paymentSuccess: 0,
            references : [],
        };
    }

    printDiv() {
        var prtContent = document.getElementById("printableArea");
        var WinPrint = window.open('', '', 'left=0,top=0,width=800,height=900,toolbar=0,scrollbars=0,status=0');
        WinPrint.document.write(prtContent.innerHTML);
        WinPrint.document.close();
        WinPrint.focus();
        WinPrint.print();
        WinPrint.close();
    }

    async componentDidMount() {
        const size = this.props.location.state.products.length;
        let link = 'http://localhost:8083/rest/brokers/processPayment?param=B100';
        let link2 = 'http://localhost:8083/rest/brokers/showReferences?param=B100&param=999999999';
        for(let i = 0; i < size; i++) {
            link = link + '&param=' + this.props.location.state.products[i].id;
            link2 = link2 + '&param=' + this.props.location.state.products[i].id;
        }


        const result = await fetch(link);
        const data = await result.text();
        const response = await JSON.parse(data);
        if(response.success){
            const result2 = await fetch(link2);
            const data2 = await result2.text();
            const response2 = await JSON.parse(data2);
            this.setState({
                references : response2,
                paymentSuccess : 1
            });
            this.props.location.calculateBalance();
        }
        else {
            this.setState({
                paymentSuccess: 2
            });
        }
    }

    render() {
        let i = 0;
        if(this.state.paymentSuccess){
            var referencesArray = this.state.references.map(adv => {
                return (
                    <TableReference
                        id = {adv[0]}
                        reference = {adv[1]}
                        price = {adv[2]}
                        key={i++}
                    />
                );
            });

            this.props.location.remove();
        }
        var today = new Date();
        var dd = today.getDate();
        var mm = today.getMonth()+1; //January is 0!
        var yyyy = today.getFullYear();

        if(dd < 10) {
            dd = '0' + dd;
        }

        if(mm < 10) {
            mm = '0' + mm;
        }

        return (<div className="container">
                {this.state.paymentSuccess === 0 ?
                    <div style={{textAlign: 'center'}}>
                        <img src={loading} alt=""></img>
                    </div>
                    :
                    null
                }
                {(this.state.paymentSuccess !== 0) && <div>
                    {(this.state.paymentSuccess === 1) && <div className="payment-confirmed">
                        <img className="payment-confirmed__img" src={sucessImg} alt=""/>
                        <h1><b>Your payment was confirmed!</b></h1>
                        <div id="printableArea">
                            <table className="table_references">
                                <thead>
                                    <tr>
                                        <th>Adventure ID</th>
                                        <th>Transaction Reference</th>
                                        <th>Amount</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    {referencesArray}
                                    <tr className="table_references_date">
                                        <td colSpan="2">
                                            <b>Date</b>
                                        </td>
                                        <td>{dd}/{mm}/{yyyy}</td>
                                    </tr>
                                    <tr className="table_references_total">
                                        <td colSpan="2">
                                            <b>Total Amount</b>
                                        </td>
                                        <td> {this.props.location.state.total}€</td>
                                    </tr>
                                    <tr className="table_references_print">
                                        <td colSpan="3">
                                            <button type="button" className="btn btn-default btn-sm" onClick={this.printDiv}>
                                                <span className="glyphicon glyphicon-print"></span> Print
                                            </button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>}
                    {(this.state.paymentSuccess === 2) && <div className="payment-cancelled">
                        <img className="payment-confirmed__img" src={sadFace} alt="" style={{width: '200px'}}/>
                        <h1><b>Ups, something went wrong!</b></h1>
                        <br/>
                        <span style={{fontSize: '20px'}}>Your transation was cancelled. <br/> Please try again later.</span>
                    </div>}
                    <div className="finalPaymentButton">
                        <Link to={{ pathname: '/'}} style={{textDecoration: 'none'}}>
                            <div className="back-btn2">
                                <span>Back to Store</span>
                            </div>
                        </Link>
                    </div>
                </div>}
            </div>
        );
    }
}

export default Payment;