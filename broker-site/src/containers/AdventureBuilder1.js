import React, { Component } from 'react';
import './App.css';
import RoomShelf from '../components/shelf/RoomShelf'
import {button} from "react-router-dom";
import Order from "../components/shelf/Order";
import Filter from "../components/shelf/Filter";

const sortBy = [
    { value: '',           label: 'Select'  },
    { value: 'lowestprice', label: 'Lowest to highest Price' },
    { value: 'highestprice', label: 'Highest to lowest Price' },
    { value: 'alphabetical', label: 'Alphabetical'}
]

const availableFilters = [
    'Single',
    'Double',
];

const ros = [
    {
        "number": 1,
        "type": "SINGLE",
        "hotelName": "NOT PARIS",
        "hotelCode": "NP1231",
        "price": 100
    },

    {
        "number": 2,
        "type": "DOUBLE",
        "hotelName": "NOT PARIS",
        "hotelCode": "NP1231",
        "price": 100
    },

    { 
        "number": 1,
        "type": "DOUBLE",
        "hotelName": "LISBON",
        "hotelCode": "NP12312",
        "price": 100
    },

    {
        "number": 2,
        "type": "DOUBLE",
        "hotelName": "LISBON",
        "hotelCode": "NP12312",
        "price": 101
    }

];


class AdventureBuilder1 extends Component {
    constructor(props){
        super(props);
        this.state = { 
            rooms: ros,
            filteredRooms : ros,
            value : "",
            filterFlag : false
        };

        this.selectedFilters = new Set();
        this.orderRooms = this.orderRooms.bind(this);
        this.filterRooms = this.filterRooms.bind(this);
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);
    } 


    /*async componentWillMount() {
        try {
            this.props.changeLoading(true);
            var date1 = this.props.begin.format("YYYY-MM-DD");
            var date2 = this.props.end.format("YYYY-MM-DD");
            await fetch('http://localhost:8085/rest/hotels/rooms?param1=' + date1 + '&param2=' + date2)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    console.log(JSON.parse(body));

                    const response = JSON.parse(body);
                    console.log(response);

                    this.setState({rooms: response, filteredRooms: response});
                    console.log(this.state);

                    this.props.changeLoading(false);
                })
        } catch (e) {
            this.props.changeLoading(false);
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later.";
        }
    }
    */

    handleAlertDismiss(e) {
        e.preventDefault();
        this.setState({alert: false});
    }

    filterRooms(label){

        if (this.selectedFilters.has(label)) {
            this.selectedFilters.delete(label);
        } else {
            this.selectedFilters.add(label);
            this.state.filterFlag = true;
        }

        if(this.selectedFilters.size === 0){
            this.state.filterFlag = false;
        }

        var filteredRooms = [];

        this.selectedFilters.forEach(function(value){
            for(let i = this.state.rooms.length-1; i >= 0; i--) {
                if (value === "Single")
                    if (this.state.rooms[i].roomType === "SINGLE")
                        filteredRooms.push(this.state.rooms[i]);

                if (value === "Double")
                    if (this.state.rooms[i].roomType === "DOUBLE")
                        filteredRooms.push(this.state.rooms[i]);
            }
        }, this);

        console.log(filteredRooms);
        this.setState({filteredRooms : filteredRooms}, () => {this.orderRooms(this.state.value)});
    }

    orderRooms(value){
        this.setState({ value : value});
        var orderedRooms;
        if(this.state.filterFlag)
            orderedRooms = this.state.filteredRooms.slice(0);
        else
            orderedRooms = this.state.rooms.slice(0);

        console.log(orderedRooms);
        if(value === 'lowestprice'){
            orderedRooms.sort(function(a, b) {
                return a.roomPrice - b.roomPrice;
            });
        }

        if(value === 'highestprice'){
            orderedRooms.sort(function(a, b) {
                return b.roomPrice - a.roomPrice;
            });
        }

        if(value === 'alphabetical'){
            orderedRooms.sort(function(a, b) {
                if (a.hotelName < b.hotelName) {
                    return -1;
                }
                if (a.hotelName > b.hotelName) {
                    return 1;
                }
                return 0;
            });

        }
        this.setState({
            filteredRooms : orderedRooms
        });
        console.log(orderedRooms);
    }
 
    render() {
        console.log(this.props);
        console.log(this.props.hasVehicle);

        var toShowRooms = this.state.rooms;
        if(this.state.filterFlag || (this.state.value !== "")){
            toShowRooms = this.state.filteredRooms;
        }

        return (<div>
                    {this.state.alert ?
                         <div id="alert" className="alert alert-info alert-dismissable">
                             <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                             <span id="alert-icon" className=""></span>
                            <div id="alert-text" style={{display: "inline"}}></div>
                         </div>
                        :
                        <div>
                             <div>
                                <Filter
                                    availableFilters = {availableFilters}
                                    filterFunction = {label => this.filterRooms(label)}
                                />
                                <Order
                                    options = {sortBy}
                                    handleOnChange = {this.orderRooms}
                                />
                                <RoomShelf rooms = {toShowRooms} updateRoom={this.props.updateRoom} />
                             </div>
                        </div>
                    }

                </div>
                );
    }
}

export default AdventureBuilder1;

