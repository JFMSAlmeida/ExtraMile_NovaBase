import React, { Component } from 'react';
import './App.css';

class Forward extends Component {

    constructor(props){
        super(props);
        this.handleTab = this.handleTab.bind(this)
    } 

    handleTab() {
        if(this.props.state.tab === 1) {
            this.props.handleTab(2);
        }

        else if (this.props.state.tab === 2) {
            if (this.props.state.hasRoom)
                this.props.handleTab(3);
            else if(!this.props.state.hasRoom && this.props.state.rentVehicle)
                this.props.handleTab(4);
            else if(!this.props.state.hasRoom && !this.props.state.rentVehicle)
                this.props.handleTab(5);
        }

        else if (this.props.state.tab === 3) {
            if(this.props.state.rentVehicle)
                this.props.handleTab(4);
            else if (!this.props.state.rentVehicle)
                this.props.handleTab(5);
        }

        else if (this.props.state.tab === 4) {
            this.props.handleTab(5);
        }
    }

    render() {
        return (
            <div onClick={this.handleTab}>
                {this.props.state.tab === 1 && this.props.state.value === '' ?
                    <div className="buy-btn-disabled" style={{float: 'right'}}> Forward </div>
                    :
                    this.props.state.tab === 2 && this.props.state.activity == null ?
                        <div className="buy-btn-disabled" style={{float: 'right'}}> Forward </div>
                        :
                        this.props.state.tab === 3 && this.props.state.room == null ?
                            <div className="buy-btn-disabled" style={{float: 'right'}}> Forward </div>
                            :
                            this.props.state.tab === 4 && this.props.state.vehicle == null ?
                                <div className="buy-btn-disabled" style={{float: 'right'}}> Forward </div>
                                :
                                this.props.state.tab === 5 ?
                                    null
                                    :
                                    <div className="buy-btn" style={{float: 'right'}}> Forward </div>
                }

            </div>
        );
    }

}

export default Forward;
