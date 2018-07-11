import React, { Component } from 'react';

class CartProduct extends Component {

    state = {
        isMouseOver: false,
    }

    handleMouseOver = () => {
        this.setState({isMouseOver: true});
    }

    handleMouseOut = () => {
        this.setState({isMouseOver: false});
    }


    render(){
        const product = this.props.product;
        console.log(product);

        const classes = ['shelf-item'];

        if(this.state.isMouseOver){
            classes.push('shelf-item--mouseover');
        }

        return (
            <div className={classes.join(" ")}>
                <div
                    className="shelf-item__del"
                    onMouseOver={() => this.handleMouseOver()}
                    onMouseOut={() => this.handleMouseOut()}
                    onClick={this.props.remove}
                />
                <img className="shelf-item__image" src={require(`../shelf/B1001.jpg`)} alt={product.id}/>
                <div className="shelf-item__details">
                    <b><p className="title">Package {product.id}</p></b>
                    <p className="desc">
                        {`| ${product.activityName} | ${product.hotelName} | ${product.vehicleType} |`}
                    </p>
                </div>
                <div className="shelf-item__price">
                    <p>{product.price} €</p>
                </div>
            </div>
        );
    }
}

export default CartProduct;