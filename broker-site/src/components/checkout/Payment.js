import React, {Component} from 'react'
import {Link} from "react-router-dom";
import TableReference from './TableReference'

class Payment extends Component {
    constructor(props) {
        super(props);
        this.state = {
            paymentSuccess: 0,
            references : []
        };
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
        }
        else {
            this.setState({
                paymentSuccess: 2
            });
        }
    }

    render() {
        let i = 0;
        console.log(this.state.paymentSuccess);
        console.log(this.state.references);
        if(this.state.paymentSuccess){
            var referencesArray = this.state.references.map(adv => {
                return (
                    <TableReference
                        vec = {adv}
                        key={i++}
                    />
                );
            });

            this.props.location.remove();
        }

        return (<div className="container">
                {(this.state.paymentSuccess !== 0) && <div>
                    {(this.state.paymentSuccess === 1) && <div className="payment-confirmed">
                        <img className="payment-confirmed__img" src={require(`../success.png`)} alt=""/>
                        <h1><b>Your payment was confirmed!</b></h1>
                        <div>
                            <table className="table">
                                <tbody>
                                    <tr>
                                        <td><b>Amount</b></td>
                                        <td>100€</td>
                                    </tr>
                                    {referencesArray}
                                    <tr>
                                        <td><b>Date</b></td>
                                        <td>14/7/2018</td>
                                    </tr>
                                    <tr>
                                        <td colSpan="2">
                                        <button type="button" className="btn btn-default btn-sm">
                                            <span className="glyphicon glyphicon-print"></span> Print
                                        </button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>}
                    {(this.state.paymentSuccess === 2) && <div className="payment-cancelled">
                        <img className="payment-confirmed__img" src={require(`../sad_face.jpg`)} alt=""/>
                        <span><b>Ups, something went wrong!<br/> Your transation was cancelled. <br/> Please try again later.</b></span>
                    </div>}
                    <div className="boda">
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