import React, { Component } from 'react';
import Product from './Product';


class Shelf extends Component {
    render(){
        const adv = this.props.adventures;
        console.log(adv);
        console.log(adv.constructor === Array);
        console.log(Array.isArray(adv));

        const advArray = adv.map(adv => {
            return (
                <Product
                    product={adv}
                    key={adv.id}
                 />
                );
        });

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