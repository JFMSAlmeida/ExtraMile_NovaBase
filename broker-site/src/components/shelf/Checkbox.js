import React, { Component } from 'react';

class Checkbox extends Component {
    render(){
        return (
            <div className="pz">
                <label className="radio-inline">
                    <input
                        type="checkbox"
                        value={this.props.label}
                        onChange={this.props.filterFunction}
                    />
                    <div className="clab">{this.props.label}</div>
                </label>
            </div>
        )

    }
}

export default Checkbox;