import React, { Component } from 'react';
import CartProduct from './CartProduct';
import {Link} from "react-router-dom";

class Cart extends Component{
    constructor(props){
        super(props);
        this.state= {
            isOpen : false,
            products : [],
            newProduct : null
        };
        this.activity = false;
        this.hotel = false;
        this.car = false;
        this.removeProduct = this.removeProduct.bind(this);
        this.addProduct = this.addProduct.bind(this);
    }

    componentWillReceiveProps(nextProps) {
        console.log("nextProps.product:" + nextProps.product);
        console.log("this.state.newProduct:" + this.state.newProduct);
        if(nextProps.product == null){
            return;
        }
        if(nextProps.product !== this.state.newProduct) {
            console.log("aqui2");
            this.setState({newProduct: nextProps.product});
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
        console.log("aqui");
        if(product.providerCode != null || product.hotelCode != null || product.rentACarCode != null){

            if(product.providerCode != null){
                console.log("provider não é null");
                if(this.activity === false){
                    console.log("não tenho activity logo vou meter a true");
                    this.activity = true;
                    this.state.products.push(product);
                }
            }
            else if(product.hotelCode != null){
                console.log("hotelcode não é null");
                if(this.hotel === false){
                    this.hotel = true;
                    this.state.products.push(product);
                }
            }
            else {
                console.log("car não é null");
                if (this.car === false) {
                    this.car = true;
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
        var index;
        if(product.providerCode != null || product.hotelCode != null || product.rentACarCode != null) {
            console.log("entrei pq sou builder");
            if (product.providerCode != null) {
                console.log("provider não é null");
                this.activity = false;
                index = cartProducts.findIndex(p => p.providerCode === product.providerCode);
            }

            else if (product.hotelCode != null) {
                console.log("hotelcode não é null");
                this.hotel = false;
                index = cartProducts.findIndex(p => p.hotelCode === product.hotelCode);
            }
            else {
                console.log("car não é null");
                this.car = false;
                index = cartProducts.findIndex(p => p.rentACarCode === product.rentACarCode);
            }
            if (index >= 0)
                cartProducts.splice(index, 1);
        }
        else{
            console.log("Sou adventure");
            index = cartProducts.findIndex(p => p.id === product.id);
            if (index >= 0) {
                cartProducts.splice(index, 1);
            }
        }
        this.setState({
            products : cartProducts,
            newProduct : null
        });
        console.log(this.props.resetProduct);
        this.props.resetProduct();
    }

    render(){
        console.log("this.props.hasRoom " + this.props.hasRoom);
        console.log("this.props.hasVehicle " + this.props.hasCar);
        console.log("this.activity " + this.activity);
        console.log("this.hotel "+ this.hotel);
        console.log("this.car "+ this.car);
        console.log("CART-FLAG:" + this.props.flag);
        console.log("RESULT1 " + (this.activity && !this.props.hasRoom && !this.props.hasCar));
        console.log("RESULT2 " + (this.activity && this.props.hasRoom && !this.props.hasCar && this.hotel));
        console.log("RESULT3" + (this.activity && !this.props.hasRoom && this.props.hasCar && this.car));
        console.log("RESULT4 " + (this.activity && this.props.hasRoom && this.props.hasCar && this.hotel && this.car));
        console.log("FINAL RESULT " + ((this.activity && !this.props.hasRoom && !this.props.hasCar) ||
            (this.activity && this.props.hasRoom && !this.props.hasCar && this.hotel) ||
            (this.activity && !this.props.hasRoom && this.props.hasCar && this.car) ||
            (this.activity && this.props.hasRoom && this.props.hasCar && this.hotel && this.car)))

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
                        {this.props.flag ?
                            ((this.activity && !this.props.hasRoom && !this.props.hasCar) ||
                            (this.activity && this.props.hasRoom && !this.props.hasCar && this.hotel) ||
                            (this.activity && !this.props.hasRoom && this.props.hasCar && this.car) ||
                            (this.activity && this.props.hasRoom && this.props.hasCar && this.hotel && this.car))
                            &&  <Link to={{ pathname: '/checkout', remove : this.removeProduct, total : totalPrice, state:{products : this.state.products}}} onClick={() => this.closeFloatCart()} style={{textDecoration: 'none'}}>
                                    <div className="buy-btn">
                                        <span>CheckoutBUILDER</span>
                                    </div>
                                </Link>
                            :
                                <Link to={{ pathname: '/checkout', remove : this.removeProduct, total : totalPrice, state:{products : this.state.products}}} onClick={() => this.closeFloatCart()} style={{textDecoration: 'none'}}>
                                    <div className="buy-btn">
                                        <span>CheckoutFINDER</span>
                                    </div>
                                </Link>
                        }

                    </div>
                </div>
            </div>
        );
    }
}

export default Cart;