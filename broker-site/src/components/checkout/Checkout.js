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
        this.deleteProduct = this.deleteProduct.bind(this);
    }

    cleanCheckout(){
        for(var i = 0; i < this.state.products.length; i++){
            this.props.location.remove(this.state.products[i]);
        }
        this.setState({
            products : []
        });
    }

    calculateTotalAmount(){
        var acumulator = 0;
        for(var i = 0; i < this.state.products.length; i++){
            acumulator = acumulator + this.state.products[i].price;
        }
        return acumulator;
    }

    deleteProduct(product){
        console.log(product);
        const cartProducts = this.state.products;
        console.log(cartProducts.length);

        const index = cartProducts.findIndex(p => p.id === product.id);
        this.props.location.remove(this.state.products[index]);

        this.setState({
            products : cartProducts
        });

        console.log(cartProducts.length);

    }

    render(){
        const total = this.calculateTotalAmount();
        const productsArray = this.state.products.map(adv => {
            return (
                <CheckoutProduct
                    product={adv}
                    key={adv.id}
                    remove = {() => this.deleteProduct(adv)}
                />
            );
        });
        return (
            <div>
                {this.state.products.length ? <div className="wrapper">
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
                                                <td className="totalPrice">{total}€</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <div>
                        <Link to={{ pathname: '/'}} style={{textDecoration: 'none'}}>
                            <div className="back-btn">
                                <span>Back to Store</span>
                            </div>
                        </Link>
                        <Link to={{ pathname: '/payment', state:{products : this.state.products}}} style={{textDecoration: 'none'}}>
                            <div className="buy-btn">
                                <span>Buy</span>
                            </div>
                        </Link>
                    </div>
                </div>
                :

                <div align="center" className="empty-checkout">
                    <div className="empty-checkout-text">
                        <h1> Your Shopping Cart is empty </h1>
                        <span> Click here to continue shopping</span>
                    </div>
                        <Link to={{ pathname: '/'}} style={{textDecoration: 'none'}}>
                            <div className="back-btn2">
                                <span>Back to Store</span>
                            </div>
                        </Link>
                </div> }
            </div>
        )
    }
}
