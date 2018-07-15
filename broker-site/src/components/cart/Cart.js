import React, { Component } from 'react';
import CartProduct from './CartProduct';
import {Link} from "react-router-dom";

class Cart extends Component{
    constructor(props){
        super(props);
        this.state= {
            isOpen : false,
            products : [],
            newProduct : null,
            activity : false,
            hotel : false,
            car : false
        };
        this.removeProduct = this.removeProduct.bind(this);
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.product !== this.state.newProduct) {
            this.setState({ newProduct : nextProps.product });
            this.addProduct(nextProps.product);
        }
    }

    calculateTotalAmount(){
        var acumulator = 0;
        for(var i = 0; i < this.state.products.length; i++){
           acumulator = acumulator + this.state.products[i].price;
        }
        return acumulator;
    }

    openFloatCart = () => {
        this.setState({ isOpen: true });
    }

    closeFloatCart = () => {
        this.setState({ isOpen: false });
    }

    addProduct = (product) => {
        if(product.providerCode != null || product.hotelCode != null || product.rentACarCode != null){

            if(product.providerCode != null){
                if(this.state.activity == false){
                    this.state.activity = true;
                    this.state.products.push(product);
                }
            }
            else if(product.hotelCode != null){
                if(this.state.hotel == false){
                    this.state.hotel = true;
                    this.state.products.push(product);
                }
            }
            else {
                if (this.state.car == false) {
                    this.state.car = true;
                    this.state.products.push(product);
                }
            }
        }
        else{
            let productAlreadyInCart = false;

            this.state.products.forEach(p => {
                if (p.id === product.id) {
                    productAlreadyInCart = true;
                }
            });

            if (!productAlreadyInCart) {
                this.state.products.push(product);
            }
        }
        this.openFloatCart();
    }

    removeProduct(product) {
        const cartProducts = this.state.products;

        const index = cartProducts.findIndex(p => p.id === product.id);
        if (index >= 0) {
            cartProducts.splice(index, 1);
        }
        this.setState({
            products : cartProducts
        });
    }

    render() {
        const totalPrice = this.calculateTotalAmount();
        const products = this.state.products.map((p, index) => {
            return (
                <CartProduct
                    product={p}
                    remove = {() => this.removeProduct(p)}
                    key={index}
                />
            );
        });



        let classes = ['float-cart'];

        if (this.state.isOpen) {
            classes.push('float-cart--open');
        }

        return (
            <div className={classes.join(' ')}>
                {/* If cart open, show close (x) button */}
                {this.state.isOpen && (
                    <div
                        onClick={() => this.closeFloatCart()}
                        className="float-cart__close-btn"
                    >
                        X
                    </div>
                )}

                {/* If cart is closed, show bag with quantity of product and open cart action */}
                {!this.state.isOpen && (
                    <span
                        onClick={() => this.openFloatCart()}
                        className="bag bag--float-cart-closed"
                    >
                    <span className="bag__quantity">{this.state.products.length}</span>
                    </span>
                )}

                <div className="float-cart__content">
                    <div className="float-cart__header">
                        <span className="bag">
                            <span className="bag__quantity">
                            {this.state.products.length}
                            </span>
                        </span>
                        <span className="header-title">Bag</span>
                    </div>

                    <div className="float-cart__shelf-container">
                        {products}
                        {!products.length && (
                            <p className="shelf-empty">
                                Add some product in the bag <br />:)
                            </p>
                        )}
                    </div>

                    <div className="float-cart__footer">
                        <div className="sub">TOTAL</div>
                        <div className="sub-price">
                            <p className="sub-price__val">
                                {totalPrice} €
                            </p>
                        </div>
                            <Link to={{ pathname: '/checkout', remove : this.removeProduct, total : totalPrice, state:{products : this.state.products}}} onClick={() => this.closeFloatCart()} style={{textDecoration: 'none'}}>
                                <div className="buy-btn">
                                    <span>Checkout</span>
                                </div>
                            </Link>
                    </div>
                </div>
            </div>
        );
    }
}

export default Cart;