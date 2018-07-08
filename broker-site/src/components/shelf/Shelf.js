import React, { Component } from 'react';
import Product from './Product';


class Shelf extends Component {
    render(){
        const adv = this.props.adventures;
        console.log(adv);
        console.log(adv.constructor === Array);
        console.log(Array.isArray(adv));
        console.log(this.props.addCart);

        const advArray = adv.map(adv => {
            return (
                <Product
                    product={adv}
                    addCart={() => this.props.addCart(adv)}
                    a = {this.props.a}
                    key={adv.id}
                 />
                );
        });

        console.log(this.props.a);

        return (
            <React.Fragment>
                <div className="shelf-container">
                    {advArray}
                </div>
            </React.Fragment>
        )

    }
}

export default Shelf;