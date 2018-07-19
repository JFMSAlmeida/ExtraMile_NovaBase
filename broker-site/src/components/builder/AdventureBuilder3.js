import React, { Component } from 'react';
import '../../containers/App.css';
import ConfirmShelf from '../shelf/ConfirmShelf'

class AdventureBuilder3 extends Component {
    constructor(props){
        super(props);

        this.state = {
            price: 0
        };

    } 


    render() {
        let advParts = [];
        advParts.push(this.props.activity);

        if(this.props.hasRoom)
            advParts.push(this.props.room);

        if(this.props.hasVehicle)
            advParts.push(this.props.vehicle);

        return (
            <div>
                <ConfirmShelf
                    begin = {this.props.begin}
                    end = {this.props.end}
                    getLoading = {this.props.getLoading}
                    changeLoading={this.props.changeLoading}
                    advParts={advParts}
                    addCart={this.props.addCart}
                    hasRoom={this.props.hasRoom}
                    hasVehicle={this.props.hasVehicle}
                    advId={this.props.advId}
                />
            </div>
        );
    }
}

export default AdventureBuilder3;
