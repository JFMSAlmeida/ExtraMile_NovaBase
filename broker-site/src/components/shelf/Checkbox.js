import React, { Component } from 'react';

class Checkbox extends Component {
    render(){
        return (
                <label className="checkbox__container"> With {this.props.label}
                    <input
                        type="checkbox"
                        value={this.props.label}
                        onChange={this.props.filterFunction}
                    />
                    <span className="checkbox__checkmark"/>
                </label>
        )

    }
}

export default Checkbox;