import React from "react";

export default class CheckoutProduct extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            isMouseOver : false
        };
    }
    handleMouseOver = () => {
        this.setState({isMouseOver: true});
    }

    handleMouseOut = () => {
        this.setState({isMouseOver: false});
    }

    render() {
        console.log(this.props.product);

        const classes = ['cart_line'];

        if(this.state.isMouseOver){
            classes.push('cart_line--mouseover');
        }

        return (
            <tr className={classes.join(" ")}>
                <td className="thumb_td-item">
                    <img width="160" height="100" src={require(`../shelf/B1001.jpg`)} alt=""/>

                </td>
                <td className="title_td-item">
                    <strong>{this.props.product.id}</strong>
                    <div className="desc">{`| ${this.props.product.activityName} | ${this.props.product.hotelName} | ${this.props.product.vehicleType} |`}</div>
                    <br/>
                </td>
                <td className="price_td-item">
                    {this.props.product.price}€
                </td>
                <td className="delete_td-item">
                    <div
                        className="checkout__del"
                        onMouseOver={() => this.handleMouseOver()}
                        onMouseOut={() => this.handleMouseOut()}
                    />
                </td>
            </tr>

            );
    }
}