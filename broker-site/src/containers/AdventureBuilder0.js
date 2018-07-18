import React, { Component } from 'react';
import './App.css';
import ActivityShelf from '../components/shelf/ActivityShelf';
import {button} from "react-router-dom";
import Filter from '../components/shelf/Filter'
import Order from "../components/shelf/Order";

const sortBy = [
    { value: '',           label: 'Select'  },
    { value: 'lowestprice', label: 'Lowest to highest Price' },
    { value: 'highestprice', label: 'Highest to lowest Price' },
    { value: 'alphabetical', label: 'Alphabetical'}
]

 const acts = [
    {
        "title": "ActivityOne",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "activityPrice": 10,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO1",

    },

    {
        "title": "ActivityTwo",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "activityPrice": 15,
        "begin": [2018,7,6],
        "end": [2018,7,9],
        "minAge": 19,
        "maxAge": 32,
        "capacity": 25,
        "id": "ABERO1"
    },

    {
        "title": "ActivityThree",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "activityPrice": 20,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO2"
    },

    {
        "title": "ActivityFour",
        "providerName": "BAUHD1",
        "providerCode": "B100122",
        "activityPrice": 25,
        "begin": [2018,7,8],
        "end": [2018,7,25],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO13"
    }

];

class AdventureBuilder0 extends Component {


    constructor(props){
        super(props);
        this.state = { 
            activities: [],
            filteredActivities : []
        };
        this.orderActivities = this.orderActivities.bind(this);
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);

    }

    orderActivities(value){
        this.setState({ value : value});

        var orderedActivities =  this.state.activities.slice(0);
        if(value === 'lowestprice'){
            orderedActivities.sort(function(a, b) {
                return a.activityPrice - b.activityPrice;
            });
        }

        if(value === 'highestprice'){
            orderedActivities.sort(function(a, b) {
                return b.activityPrice - a.activityPrice;
            });
        }

        if(value === 'alphabetical'){
            orderedActivities.sort(function(a, b) {
                if (a.title < b.title) {
                    return -1;
                }
                if (a.title > b.title) {
                    return 1;
                }
                return 0;
            });

        }
        this.setState({
            filteredActivities : orderedActivities
        });
    }

    handleAlertDismiss(e) {
        e.preventDefault();
        this.setState({alert: false});
    }

    async componentWillMount() {
        try {
            this.props.changeLoading(true);
            await fetch('http://localhost:8081/rest/providers/activities?begin=' + this.props.begin.format("YYYY-MM-DD") + '&end=' + this.props.end.format("YYYY-MM-DD"))
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    const response = JSON.parse(body);
                    console.log(response);
                    this.setState({activities: response});
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
 
    render() {
        console.log(this.props.hasRoom);
        console.log(this.props.hasVehicle);

        var toShowActivities = this.state.activities;
        if(this.state.filteredActivities.length > 0){
            toShowActivities = this.state.filteredActivities;
        }

        return (<div>
                    <h3>Activity picker</h3>
                    {this.state.alert ?
                        <div id="alert" className="alert alert-info alert-dismissable">
                            <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                            <span id="alert-icon" className=""></span>
                            <div id="alert-text" style={{display: "inline"}}></div>
                        </div>
                        :
                        <div>
                            <div>
                                <Order
                                    options = {sortBy}
                                    handleOnChange = {this.orderActivities}
                                />
                                <ActivityShelf
                                    activities = {toShowActivities}
                                    updateActivity = {this.props.updateActivity}
                                />
                            </div>

                            {this.props.hasRoom &&
                                <button onClick={()=> this.props.handleTab(3)}>
                                    <div className="back-btn2">
                                        <span>Room Picker</span>
                                    </div>
                                </button>
                            }
                            {!this.props.hasRoom && this.props.hasVehicle &&
                                <button onClick={()=> this.props.handleTab(4)}>
                                    <div className="back-btn2">
                                        <span>Vehicle Picker</span>
                                    </div>
                                </button>
                            }
                            {!this.props.hasRoom && !this.props.hasVehicle &&
                            <button onClick={()=> this.props.handleTab(5)}>
                                <div className="back-btn2">
                                    <span>Confirm</span>
                                </div>
                            </button>
                            }
                        </div>
                    }
                </div>
            );
    }
}

export default AdventureBuilder0;

