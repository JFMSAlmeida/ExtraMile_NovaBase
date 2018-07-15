import React, { Component } from 'react';
import './App.css';
import Shelf from '../components/shelf/Shelf'

class AdventureBuilder3 extends Component {
    constructor(props){
        super(props);

        this.state = {
            adventure: []
        };

    } 

    /*componentWillMount() {

        fetch da aventura, para obter preço, data inicio e de fim
            OU
          fetch de todas (reusar) e depois só guardar a que tem id certo
        
    }*/

    render() {

        const adventures = {
            id: "B1001",
            price: 390.01,
            age: this.props.location.age,
            begin: this.props.location.begin,
            end: this.props.location.end,
            activityName: this.props.location.activityName,
            hasRoom: this.props.location.hasRoom,
            hotelName: this.props.location.roomNumber,
            roomNumber: this.props.location.roomNumber,
            roomType: this.props.location.roomType,
            hasVehicle: this.props.location.hasVehicle,
            vehicleType: this.props.location.vehicleType,
            kilometers: this.props.location.kilometers

        };

        return (<div>
                    <h3>Final Look</h3>
                     <Shelf
                        adventures = {[adventures]}
                        addCart = {this.props.location.addCart}
                        a = {this.props.a}
                    />
                </div>
                );
    }
}

export default AdventureBuilder3;
