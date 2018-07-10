import React from 'react'
import CheckoutProduct from "./CheckoutProduct";
import {Link} from "react-router-dom";


export default class Checkout extends React.Component {
    constructor(props){
        super(props);

        this.state = {
            products : this.props.location.state.products
        }

        this.cleanCheckout = this.cleanCheckout.bind(this);
    }

    cleanCheckout(){
        this.setState({
            products : []
        });
    }

    render(){
        console.log(this.props.location.state.total);
        const productsArray = this.state.products.map(adv => {
            return (
                <CheckoutProduct
                    product={adv}
                    key={adv.id}
                />
            );
        });
        return (
            <div>
                {this.state.products.length && <div className="wrapper">
                    <div className="checkout_header">
                        <h1>
                            <img width="40" height="47" src={require(`../../containers/bag-icon-black.png`)} alt=""/>
                            <span className="checkout_header-text">Shopping Cart</span>
                        </h1>
                        <div className="clean-btn" onClick={() => this.cleanCheckout()}>
                            Empty Shopping Cart
                        </div>
                    </div>
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
                                                <td><font size="5">Total:</font></td>
                                                <td className="totalPrice">{this.props.location.state.total}€</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <div>
                        <div className="back-btn">
                            <Link to={{ pathname: '/'}}>Back to Store</Link>
                        </div>
                        <div className="buy-btn">
                            <Link to={{ pathname: '/payment', state:{products : this.state.products, total : totalPrice}}}>Buy</Link>
                        </div>
                    </div>
                </div>}
                {!this.state.products.length && <div> <h1>Carrinho Vazio</h1></div> }
            </div>
        )
    }
}

