import React, { Component } from 'react';
import Product from './Product';
import Filter from './Filter'

const availableFilters = [
    'Hotel',
    'Vehicle',
];

const abc = [
    {
        "id": "B1001",
        "price": 100,
        "age": 30,
        "hasRoom": true,
        "hasVehicle": true,
        "activityName": "Bush Walking",
        "begin": [2017,5,1],
        "end": [2017,5,2],
        "hotelName": "Paris Hotel",
        "roomNumber": "100",
        "roomType": "SINGLE",
        "VehicleType": "CAR",
        "rentBegin": [2017,5,1],
        "rentEnd": [2017,5,2],
        "kilometers": 1
    },
    {
        "id": "B1002",
        "price": 200,
        "age": 30,
        "hasRoom": true,
        "hasVehicle": false,
        "activityName": "Ir às gajas, BOAS",
        "begin": [2017,5,3],
        "end": [2017,5,4],
        "hotelName": "One Night Stand",
        "roomNumber": "69",
        "roomType": "DOUBLE"
    },
    {
        "id": "B1003",
        "price": 300,
        "age": 30,
        "hasRoom": false,
        "hasVehicle": true,
        "activityName": "Apanhar o Pau Cucu",
        "begin": [2017,5,5],
        "end": [2017,5,6],
        "VehicleType": "CAR",
        "rentBegin": [2017,5,5],
        "rentEnd": [2017,5,6],
        "kilometers": 3
    },
    {
        "id": "B1004",
        "price": 400,
        "age": 30,
        "hasRoom": false,
        "hasVehicle": false,
        "activityName": "Brincar às Barbies",
        "begin": [2017,5,7],
        "end": [2017,5,8],
    }
];

class Shelf extends Component {

    constructor(props){
        super(props);

        this.state = {
            adventures : abc,
            filteredAdventures : []
        }

        this.selectedFilters = new Set();

        this.filterAdventures = this.filterAdventures.bind(this);

    }

    /*componentWillReceiveProps(nextProps) {
        console.log(nextProps.adventures);
        this.setState({
            adventures : abc
        })
    }*/

    filterAdventures(label){
        if (this.selectedFilters.has(label)) {
            this.selectedFilters.delete(label);
        } else {
            this.selectedFilters.add(label);
        }
        var filteredAdventures = this.state.adventures.slice(0);

        this.selectedFilters.forEach(function(value){
            for(let i = 0; i< filteredAdventures.length; i++) {
                if (value === "Vehicle") {
                    if (!filteredAdventures[i].hasVehicle){
                        const index = filteredAdventures.findIndex(p => p.id === filteredAdventures[i].id);
                        filteredAdventures.splice(index, 1);
                    }

                }
                if (value === "Hotel") {
                    if (!filteredAdventures[i].hasRoom){
                        const index = filteredAdventures.findIndex(p => p.id === filteredAdventures[i].id);
                        filteredAdventures.splice(index, 1);
                    }
                }
            }
        }, this);

        this.setState({
            filteredAdventures : filteredAdventures
        });
    }



    render(){
        var adv;
        var advArray;
        if(this.state.filteredAdventures.length > 0){
            adv = this.state.filteredAdventures;

            advArray = adv.map(adv => {
                return (
                    <Product
                        product={adv}
                        addCart={() => this.props.addCart(adv)}
                        key={adv.id}
                    />
                );
            });
        } else {
            adv = this.state.adventures;

            advArray = adv.map(adv => {
                return (
                    <Product
                        product={adv}
                        addCart={() => this.props.addCart(adv)}
                        key={adv.id}
                    />
                );
            });

        }

        return (
            <React.Fragment>
                <Filter
                    availableFilters = {availableFilters}
                    filterFunction = {label => this.filterAdventures(label)}
                />
                <div className="shelf-container">
                    {advArray}
                </div>
            </React.Fragment>
        )

    }
}

export default Shelf;