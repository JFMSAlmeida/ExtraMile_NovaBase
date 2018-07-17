import React, { Component } from 'react';
import './App.css';
import VehicleShelf from '../components/shelf/VehicleShelf';
/*
const vecs = [
    {
        "type": "MOTORCYCLE",
        "plate": "AA-11-XX",
        "kilometers": 100,
        "price": 200,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MC234"
    },

    {
        "type": "CAR",
        "plate": "AA-12-XX",
        "kilometers": 200,
        "price": 100,
        "PRICE": 200,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MC234"
    },

    {
        "type": "MOTORCYCLE",
        "plate": "AA-11-XY",
        "kilometers": 1000,
        "price": 200,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MC234"
    },

    {
        "type": "MOTORCYCLE",
        "plate": "AB-11-XY",
        "kilometers": 1000,
        "PRICE": 2000,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MC234"
    },

     {
        "type": "MOTORCYCLE",
        "plate": "AB-34-EF",
        "kilometers": 1000,
        "price": 192,
        "rentACarName": "MotorsOnly",
        "rentACarCode": "MO234"
    },

     {
        "type": "CAR",
        "plate": "BE-45-DO",
        "kilometers": 1000,
        "price": 192,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MO234"
    }


];*/


class AdventureBuilder2 extends Component {

    constructor(props){
        super(props);
        this.state = {
                       vehicles: []
                    }

    } 



   componentWillMount() {

        fetch('http://localhost:8084/rest/rentacars/vehicles')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({vehicles: response});
                console.log(this.state);
            });
    }  


    render() {
        console.log("aaaa");
        console.log(this.props.updateVehicle);
        console.log("bbbb");
        return (
                    <div>
                        <h3>Vehicle picker</h3>
                            <VehicleShelf vehicles = {this.state.vehicles} updateVehicle={this.props.updateVehicle}/>
                        <button onClick={()=> this.props.handleTab(5)}>
                            <div className="back-btn2">
                                <span>Confirm</span>
                            </div>
                        </button>
                    </div>
                );
    }

}

export default AdventureBuilder2;
