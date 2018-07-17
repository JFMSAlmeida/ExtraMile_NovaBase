import React, { Component } from 'react';
import './App.css';
import ConfirmShelf from '../components/shelf/ConfirmShelf'

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

        return (<div>
                    <h3>Final Look</h3>
                     <ConfirmShelf
                        advParts = {advParts}
                        addCart = {this.props.addCart}
                        hasRoom = {this.props.hasRoom}
                        hasVehicle = {this.props.hasVehicle}
                        advId = {this.props.advId}
                     />
                </div>
                );
    }
}

export default AdventureBuilder3;
