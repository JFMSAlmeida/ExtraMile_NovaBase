import React, {Component} from 'react'
import $ from 'jquery';

class Payment extends Component {
    constructor(props){
        super(props);

        this.confirmCheckout = this.confirmCheckout.bind(this);

        this.state = {
            paymentConfirmation : false
        };
    }

    confirmCheckout(e) {
        e.preventDefault();

        const size = this.props.products.length;
        var link = 'http://localhost:8083/rest/brokers/processPayment?param=B100';

        for(var i = 0; i < size; i++) {
            link = link + '&param=' + this.props.products[i].id;
        }

        console.log(link);

        fetch(link)
            .then(response => {
                /*console.log(response);*/
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
                const response = JSON.parse(body);
                if(response.success){
                    this.setState({
                        paymentConfirmation : true
                    });
                    this.props.remove();
                }
                else
                    console.log("cancelled");
            }).catch(function (error) {
                console.log("erro de fetch");
        });

        //this.props.history.push('/finalCheckout');
    }

    /*
    {this.state.paymentConfirmation && <h1>Confirmed</h1>}
    {!this.state.paymentConfirmation && <h2>Cancelled</h2>}
    data-backdrop="static" data-keyboard="false"
    */

    render() {
        return (
            <div>
                <div id="confirmModal" className="modal fade">
                    <div className="modal-dialog modal-confirm">
                        <div className="modal-content">
                            <div className="modal-header">
                                <div className="icon-box">
                                    <i className="material-icons">&#x2754;</i>
                                </div>
                                <h4 className="modal-title">Are you sure?</h4>
                                <button type="button" className="close" data-dismiss="modal"
                                        aria-hidden="true">&times;</button>
                            </div>
                            <div className="modal-body">
                                <p>Do you really want to delete these records? This process cannot be undone.</p>
                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-primary" data-dismiss="modal" onClick={this.confirmCheckout}>Yes</button>
                                <button type="button" className="btn btn-danger" data-dismiss="modal">No</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div className="text-center" href="#confirmModal" data-toggle="modal">
                    <div className="buy-btn">
                        <span>Buy</span>
                    </div>
                </div>


                <div className="text-center">
                    <a id="successModal" href="#successModal" className="trigger-btn" data-toggle="modal">Click to Open Confirm Modal</a>
                </div>
                <div id="successModal" className="modal fade" data-backdrop="static" data-keyboard="false">
                    <div className="modal-dialog modal-success">
                        <div className="modal-content">
                            <div className="modal-header">
                                <div className="icon-box">
                                    <i className="material-icons">&#9989;</i>
                                </div>
                                <h4 className="modal-title">Awesome!</h4>
                            </div>
                            <div className="modal-body">
                                <p className="text-center">Your booking has been confirmed. Check your email for
                                    detials.</p>
                            </div>
                            <div className="modal-footer">
                                <button className="btn btn-success btn-block" data-dismiss="modal">OK</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Payment;