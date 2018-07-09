import React from 'react'
import CheckoutProduct from "./CheckoutProduct";


export default class Checkout extends React.Component {
    constructor(props){
        super(props);

        this.calculateTotalAmount = this.calculateTotalAmount.bind(this);
    }

    calculateTotalAmount = () => {
        var acumulator = 0;
        for(var i = 0; i < this.props.location.state.products.length; i++){
            acumulator = acumulator + this.props.location.state.products[i].price;
        }
        console.log(acumulator);
        return acumulator;
    }

    render(){

        console.log(this.props.location.state.total);
        const productsArray = this.props.location.state.products.map(adv => {
            return (
                <CheckoutProduct
                    product={adv}
                    key={adv.id}
                />
            );
        });
        return (<div className="wrapper">
                    <table className="product_list">
                        <thead>
                            <tr>
                                <th className="name_td">Produtos</th>
                                <th className="price_td">Preço</th>
                                <th className="delete_td" >Remover</th>
                            </tr>
                        </thead>
                        <tbody>
                            {productsArray}
                            <tr>
                                <td></td>
                                <td className="totals">
                                    <table className="totals-table">
                                        <tbody>
                                            <tr>
                                                <td><font size="5">Totals:</font></td>
                                                <td className="totalPrice">{this.calculateTotalAmount()}€</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
        )
    }
}