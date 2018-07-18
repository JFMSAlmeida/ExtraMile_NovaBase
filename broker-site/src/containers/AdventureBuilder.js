import React, { Component } from 'react';
import './App.css';
import DateRangePicker from "react-daterange-picker";
import "react-daterange-picker/dist/css/react-calendar.css";
import originalMoment from "moment";
import { extendMoment } from "moment-range";
import AdventureBuilder0 from "./AdventureBuilder0";
import AdventureBuilder1 from "./AdventureBuilder1";
import AdventureBuilder2 from "./AdventureBuilder2";
import AdventureBuilder3 from "./AdventureBuilder3";
import loading from './loading.gif';
import Forward from "./Forward";

const moment = extendMoment(originalMoment);


class AdventureBuilder extends Component {

    constructor(props){
        super(props);

        const today = moment();

        this.state = {
            advId: "B0D4",
            rentVehicle: false,
            hasRoom: false,
            value: '',
            activity: null,
            room: null,
            vehicle: null,
            tab: 1,
            canBuild: false,
            loading: false,
        };
        this.updateActivity = this.updateActivity.bind(this);
        this.updateRoom = this.updateRoom.bind(this);
        this.updateVehicle = this.updateVehicle.bind(this);
        this.handleTab = this.handleTab.bind(this);
    }

    handleSubmit = (event) => {
        console.log(this.state.value);

        this.createAdventure();
        this.setState({
            canBuild : true
        });
    };

    handleChange = () => {
        this.setState({ rentVehicle: !this.state.rentVehicle });
    };

    changeLoading = (arg) => {
        this.setState({ loading: arg });
    };

    onSelect = (value, states) => {
        this.setState({ value, states },
            () => {
                var duration = moment.duration(this.state.value.end.diff(this.state.value.start));
                if (duration.as('days') !== 0) {
                    this.setState({hasRoom : true});
                }
                else {
                    this.setState({hasRoom: false});
                }
            });
    };

    async createAdventure () {
        await fetch('http://localhost:8083/rest/brokers/createAdventure?brokerCode=B100&clientNif=999999999&begin=' + 
            this.state.value.start.format("YYYY-MM-DD") + '&end=' + this.state.value.end.format("YYYY-MM-DD") +
            '&margin=1&rentVehicle=' + this.state.rentVehicle)
            .then(response => {
            return response.text();
        })
        .then(body => {
            alert("Your custom adventure was successfully submitted");
            console.log(JSON.parse(body));
            console.log(body);
            const response = JSON.parse(body);
             console.log(response);
            console.log(response.advId);
            this.setState({
                advId: response.advId,
                canBuild : true
            });
        });

    }
    updateActivity(activity){
        this.setState({
            activity: activity
        }, () => console.log(this.state.activity)
        );
    }
    updateRoom(room){
        this.setState({
            room: room
        });
    }
    updateVehicle(vehicle){
        this.setState({
            vehicle: vehicle
        });
    }

    handleTab(tab) {
        this.setState({tab: tab});
    }

    render() {
        return (
                <div className="container">
                    <h3>AdventureBuilder</h3>
                    <div className="row" style={{textAlign: 'center', paddingBottom:"50px"}}>
                        <div className="btn-group btn-breadcrumb">
                            {this.state.tab == 1 ? <a className="btn btn-default active">Adventure Specs</a> : <a onClick={() => this.handleTab(1)} className="btn btn-default">Adventure Specs</a>}
                            {this.state.tab == 2 ? <a className="btn btn-default active">Activity Picker</a> : <a onClick={() => this.handleTab(2)} className="btn btn-default">Activity Picker</a>}


                            { this.state.hasRoom ?
                                this.state.tab == 3 ? <a className="btn btn-default active">Hotel Picker</a> : <a onClick={() => this.handleTab(3)} className="btn btn-default">Hotel Picker</a>
                            :
                            null}

                            { this.state.rentVehicle ?
                                this.state.tab == 4 ? <a className="btn btn-default active">Vehicle Picker</a> : <a onClick={() => this.handleTab(4)} className="btn btn-default">Vehicle Picker</a>
                            :
                            null}

                            {this.state.tab == 5 ? <a className="btn btn-default active">Confirm</a> : <a onClick={() => this.handleTab(5)} className="btn btn-default">Confirm</a>}
                        </div>
                    </div>
                    <div className="breadcrumb-buttons">
                        {this.state.tab == 1 ? null :<div className="buy-btn" style={{float: 'left', marginRight: "30px"}}> Back </div>}
                        <Forward
                            state = {this.state}
                            handleTab = {this.handleTab}
                        />
                    </div>


                    {this.state.loading ?
                        <div id="loading" style={{textAlign: 'center'}}>
                            <img src={loading} alt=""></img>
                        </div> : null}

                    {this.state.tab == 1 ?
                        <div style={{textAlign: 'center'}}>
                            <div>
                                <br/>
                                <p>Choose your adventure begin and end dates:</p>
                                <DateRangePicker
                                    value={this.state.value}
                                    onSelect={this.onSelect}
                                    singleDateRange={true} />
                            </div>
                            <br/>
                            <div>
                                Do you want to rent a vehicle?
                                <input
                                    type="checkbox"
                                    checked={this.state.rentVehicle}
                                    onChange={this.handleChange} />
                            </div>
                            <br/>
                            <button type="submit" onClick={this.handleSubmit}>Submit your adventure</button>
                            {this.state.canBuild && <button onClick={() => this.handleTab(2)}> Start the builder!</button>}
                        </div>
                        :
                        null
                    }
                    {this.state.tab == 2 ? <AdventureBuilder0 begin = {this.state.value.start} end = {this.state.value.end} hasRoom = {this.state.hasRoom} hasVehicle = {this.state.rentVehicle} updateActivity = {this.updateActivity} handleTab = {this.handleTab} changeLoading = {this.changeLoading} /> : null}
                    {this.state.tab == 3 ? <AdventureBuilder1 begin = {this.state.value.start} end = {this.state.value.end} hasVehicle = {this.state.rentVehicle} updateRoom = {this.updateRoom} handleTab = {this.handleTab} changeLoading = {this.changeLoading} /> : null}
                    {this.state.tab == 4 ? <AdventureBuilder2 begin = {this.state.value.start} end = {this.state.value.end} updateVehicle = {this.updateVehicle} handleTab = {this.handleTab} changeLoading = {this.changeLoading} /> : null}
                    {this.state.tab == 5 ? <AdventureBuilder3 begin = {this.state.value.start} end = {this.state.value.end} advId = {this.state.advId} addCart={this.props.addCart} hasRoom = {this.state.hasRoom} hasVehicle = {this.state.rentVehicle} activity = {this.state.activity} room = {this.state.room} vehicle = {this.state.vehicle} handleTab = {this.handleTab} changeLoading = {this.changeLoading} /> : null}

                    <br/>
                    <div>
                        Your selections:
                        <div>
                            Period: {this.state.value !== '' ? <span>{this.state.value.start.format("YYYY/MM/DD")} - {this.state.value.end.format("YYYY/MM/DD")}</span> : null}
                        </div>
                        <div>
                            Vehicle: {this.state.rentVehicle ? "Yes" : "No"}
                        </div>
                        <div>
                            Activity: {this.state.activity == null ? null : this.state.activity.activityCode}
                        </div>
                        <div>
                            HotelRoom: {this.state.room == null ? null : this.state.room.number}
                        </div>
                        <div>
                            Vehicle: {this.state.vehicle == null ? null : this.state.vehicle.plate}
                        </div>
                    </div>
                </div>
                )
    }  
}

export default AdventureBuilder;
