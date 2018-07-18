import React, { Component } from 'react';
import './App.css';
import VehicleShelf from '../components/shelf/VehicleShelf';
import Order from "../components/shelf/Order";
import Filter from "../components/shelf/Filter";

const sortBy = [
    { value: '',           label: 'Select'  },
    { value: 'lowestprice', label: 'Lowest to highest Price' },
    { value: 'highestprice', label: 'Highest to lowest Price' },
    { value: 'alphabetical', label: 'Alphabetical'}
];

const availableFilters = [
    'Car',
    'Motorcycle',
];

/*const vecs = [
    {
        "type": "MOTORCYCLE",
        "plate": "AA-11-XX",
        "kilometers": 100,
        "price": 10,
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
        "price": 2000,
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
        "price": 193,
        "rentACarName": "Motor&Cycles",
        "rentACarCode": "MO234"
    }


];*/


class AdventureBuilder2 extends Component {

    constructor(props){
        super(props);
        this.state = {
            vehicles: [],
            filteredVehicles : [],
            value : "",
            filterFlag : false
        };
        this.selectedFilters = new Set();

        this.orderVehicles = this.orderVehicles.bind(this);
        this.filterVehicles = this.filterVehicles.bind(this);
    } 



    componentWillMount() {

       this.props.changeLoading(true);
        var date1 = this.props.begin.format("YYYY-MM-DD");
        var date2 = this.props.end.format("YYYY-MM-DD");

        fetch('http://localhost:8084/rest/rentacars/vehicles?param1=' + date1 + '&param2=' + date2)
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({vehicles: response, filteredVehicles : response});
                console.log(this.state);
                this.props.changeLoading(false);
            });
    }

    filterVehicles(label){

        if (this.selectedFilters.has(label)) {
            this.selectedFilters.delete(label);
        } else {
            this.selectedFilters.add(label);
            this.state.filterFlag = true;
        }

        if(this.selectedFilters.size === 0){
            this.state.filterFlag = false;
        }

        var filteredVehicles = [];

        this.selectedFilters.forEach(function(value){
            for(let i = this.state.vehicles.length-1; i >= 0; i--) {
                if (value === "Car")
                    if (this.state.vehicles[i].vehicleType === "CAR")
                        filteredVehicles.push(this.state.vehicles[i]);

                if (value === "Motorcycle")
                    if (this.state.vehicles[i].vehicleType === "MOTORCYCLE")
                        filteredVehicles.push(this.state.vehicles[i]);
            }
        }, this);

        this.setState({filteredVehicles : filteredVehicles}, () => {this.orderVehicles(this.state.value)});
    }

    orderVehicles(value){
        this.setState({ value : value});

        var orderedVehicles;
        if(this.state.filterFlag)
            orderedVehicles = this.state.filteredVehicles.slice(0);
        else
            orderedVehicles = this.state.vehicles.slice(0);

        if(value === 'lowestprice'){
            orderedVehicles.sort(function(a, b) {
                return a.price - b.price;
            });
        }

        if(value === 'highestprice'){
            orderedVehicles.sort(function(a, b) {
                return b.price - a.price;
            });
        }

        if(value === 'alphabetical'){
            orderedVehicles.sort(function(a, b) {
                if (a.rentACarName < b.rentACarName) {
                    return -1;
                }
                if (a.rentACarName > b.rentACarName) {
                    return 1;
                }
                return 0;
            });

        }
        this.setState({
            filteredVehicles: orderedVehicles
        });
    }


    render() {
        console.log("aaaa");
        console.log(this.props.updateVehicle);
        console.log("bbbb");

        var toShowVehicles = this.state.vehicles;
        if(this.state.filterFlag || (this.state.value !== "")){
            toShowVehicles = this.state.filteredVehicles;
        }

        return (
                    <div>
                        <h3>Vehicle picker</h3>
                        <Filter
                            availableFilters = {availableFilters}
                            filterFunction = {label => this.filterVehicles(label)}
                        />
                        <Order
                            options = {sortBy}
                            handleOnChange = {this.orderVehicles}
                        />
                        <VehicleShelf vehicles = {toShowVehicles} updateVehicle={this.props.updateVehicle}/>
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
