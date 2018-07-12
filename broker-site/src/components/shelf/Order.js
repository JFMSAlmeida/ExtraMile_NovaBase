import React, {Component} from 'react';
import Selectbox from '../shelf/SelectBox';

class Order extends Component {

    handleSort = (value) => {
        this.props.handleOnChange(value);
    }

    render() {
        return (
            <div className="sort"> Order by
                <Selectbox
                    options={this.props.options}
                    handleOnChange={this.handleSort}
                />
            </div>
        );
    }
}

export default Order;