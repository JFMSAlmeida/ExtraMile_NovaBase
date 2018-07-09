import React from "react";

export default class CheckoutProduct extends React.Component{
    render() {
        return (
            <tr className="cart_line">
                <td className="thumb_td">
                    <img width="90" height="90" src={require(`../shelf/B1001.jpg`)} alt=""/>

                </td>
                <td className="title_td">
                    <strong>Real Mass Gainer 2722 g</strong>
                    <div className="variant">Sabor: Chocolate</div>
                    <br/>
                </td>
                <td className="price_td">
                    €26.99
                </td>
                <td className="delete_td">
                    <button type="submit">
                        <i className="icon-close"/>
                    </button>
                </td>
            </tr>

            );
    }
}