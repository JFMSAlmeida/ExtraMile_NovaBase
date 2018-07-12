import React, {Component} from 'react'
import $ from 'jquery';

class Payment extends Component {
    constructor(props){
        super(props);
        this.state = {
          paymentConfirmation : false
        };
    }


     componentWillMount() {
        const size = this.props.location.state.products.length;
        var link = 'http://localhost:8083/rest/brokers/processPayment?param=B100';

        for(var i = 0; i < size; i++) {
            link = link + '&param=' + this.props.location.state.products[i].id;
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
                 }

             });
    }

    render() {
        this.props.location.remove();
        return (
            <div>
                {this.state.paymentConfirmation && <h1>Confirmed</h1>}
                {!this.state.paymentConfirmation && <h2>Cancelled</h2>}
            </div>
        );
    }
}

export default Payment;