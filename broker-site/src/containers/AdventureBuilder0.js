import React, { Component } from 'react';
import './App.css';
import ActivityShelf from '../components/shelf/ActivityShelf';
import {button} from "react-router-dom";

/*
 const acts = [
    {
        "title": "ActivityOne",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 10,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO1"

    },

    {
        "title": "ActivityOne",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 15,
        "begin": [2018,7,6],
        "end": [2018,7,9],
        "minAge": 19,
        "maxAge": 32,
        "capacity": 25,
        "id": "ABERO1"
    },

    {
        "title": "ActivityTwo",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 10,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO2"
    },

    {
        "title": "ActivityThree",
        "providerName": "BAUHD1",
        "providerCode": "B100122",
        "price": 10,
        "begin": [2018,7,8],
        "end": [2018,7,25],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO13"
    }

];*/

class AdventureBuilder0 extends Component {


    constructor(props){
        super(props);
        this.state = { 
                       activities: []
                     };

    } 


    componentWillMount() {

        var date1 = this.props.begin.format("YYYY-MM-DD");
        var date2 = this.props.end.format("YYYY-MM-DD");

        fetch('http://localhost:8084/rest/providers/activities?param1=' + date1 + '&param2=' + date2)
            .then(response => {
                return response.text();
            })
            .then(body => {
                const response = JSON.parse(body);
                console.log(response);
                this.setState({activities: response});
            });

        
    }
 
    render() {
        console.log(this.props.hasRoom);
        console.log(this.props.hasVehicle);
        return (<div>
                    <h3>Activity picker</h3>
                    <ActivityShelf
                        activities = {this.state.activities}
                        updateActivity = {this.props.updateActivity}
                    />

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
            );
    }
}

export default AdventureBuilder0;

