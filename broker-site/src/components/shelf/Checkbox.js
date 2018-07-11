import React, { Component } from 'react';

class Checkbox extends Component {
    render(){
        return (
            <label>
                <input
                    type="checkbox"
                    value={this.props.label}
                    onChange={this.props.filterFunction}
                /> With {this.props.label} <br/>
            </label>
        )

    }
}

export default Checkbox;