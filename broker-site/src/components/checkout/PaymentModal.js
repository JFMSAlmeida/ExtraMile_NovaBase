import React, {Component} from 'react'
import { Redirect } from 'react-router';
import questionMark from './questionmark.png'

class PaymentModal extends Component {
    constructor(props){
        super(props);
        this.state = {
            paymentConfirmation : false,
        };

        this.removeProducts = this.removeProducts.bind(this);
    }

    handleOnClick = () => {
        this.setState({paymentConfirmation: true});
    }

    removeProducts(){
        this.props.remove();
    }

    /*
    {this.state.paymentConfirmation && <h1>Confirmed</h1>}
    {!this.state.paymentConfirmation && <h2>Cancelled</h2>}
    data-backdrop="static" data-keyboard="false"
    */

    render() {
        if (this.state.paymentConfirmation) {
            return <Redirect to={{pathname: '/payment', remove: this.removeProducts, calculateBalance : this.props.calculateBalance, state:{products : this.props.products, total: this.props.total}}} />;
        }
        return (
            <div>
                <div id="confirmModal" className="modal fade" data-backdrop="static" data-keyboard="false" >
                    <div className="modal-dialog modal-confirm">
                        <div className="modal-content">
                            <div className="modal-header">
                                <div className="icon-box">
                                    <img width="100px" className="material-icons" src={questionMark} alt="" />
                                </div>
                                <h4 className="modal-title">Are you sure?</h4>
                                <button type="button" className="close" data-dismiss="modal"
                                        aria-hidden="true">&times;</button>
                            </div>
                            <div className="modal-body">
                                <p>Do you really want to delete these records? This process cannot be undone.</p>
                            </div>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-primary" data-dismiss="modal" onClick={this.handleOnClick}>Yes</button>
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
            </div>
        );
    }
}

export default PaymentModal;