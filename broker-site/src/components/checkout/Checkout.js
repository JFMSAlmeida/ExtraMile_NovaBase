import React from 'react'
import CheckoutProduct from "./CheckoutProduct";


export default class Checkout extends React.Component {
    constructor(props){
        super(props);
         }

    render(){
        console.log(this.props.location.state);
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
                                                <td className="strong">Total:</td>
                                                <td className="strong">€81.97</td>
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