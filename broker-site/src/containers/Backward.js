import React, { Component } from 'react';
import './App.css';

class Backward extends Component {

    constructor(props){
        super(props);
        this.handleTab = this.handleTab.bind(this)
    } 

    handleTab() {
        if (this.props.state.tab === 2) {
            this.props.cleanState();
            this.props.handleTab(1);
        }

        else if (this.props.state.tab === 3) {
            this.props.handleTab(2);
        }

        else if (this.props.state.tab === 4) {
            if (this.props.state.hasRoom)
                this.props.handleTab(3);
            else
                this.props.handleTab(2);
        }
        else if (this.props.state.tab === 5) {
            if (this.props.state.rentVehicle)
                this.props.handleTab(4);
            else if (!this.props.state.rentVehicle && this.props.state.hasRoom)
                this.props.handleTab(3);
            else if (!this.props.state.rentVehicle && !this.props.state.hasRoom)
                this.props.handleTab(2);
        }
    }

    render() {
        return (
            <div className="breadcrumb-backward" onClick={this.handleTab}>
                {this.props.state.tab == 1 ? null : <div className="buy-btn" style={{float: 'left'}}> Back </div>}
            </div>
        );
    }

}

export default Backward;
