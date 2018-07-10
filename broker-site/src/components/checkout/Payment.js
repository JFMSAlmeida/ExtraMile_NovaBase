import React, {Component} from 'react'


class Payment extends Component {
    constructor(props){
        super(props);
        this.state = {
          paymentConfirmation : false
        };
    }



    async componentWillMount() {
        const size = this.props.location.state.products.length;

        const ids = () => {
            for(var i = 0; i < size; i++){
                ids.push(this.props.location.state.products[i].id)
            }
        }
        console.log(ids);

        fetch('http://localhost:8083/rest/brokers/processPayment?param1=B100', {
            body: JSON.stringify(ids)
        }).then(res=>res.json())
            .then(res => console.log(res));
    }

    render() {
        return (<div>
                {this.state.paymentConfirmation && <h1>Payment</h1>}
                {!this.state.paymentConfirmation && <h2>Cancelled</h2>}
            </div>
        );
    }
}

export default Payment;