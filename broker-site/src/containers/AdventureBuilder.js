import React, { Component } from 'react';
import './App.css';
import DateRangePicker from "react-daterange-picker";
import "react-daterange-picker/dist/css/react-calendar.css";
import originalMoment from "moment";
import { extendMoment } from "moment-range";
import AdventureBuilder0 from "../components/builder/AdventureBuilder0";
import AdventureBuilder1 from "../components/builder/AdventureBuilder1";
import AdventureBuilder2 from "../components/builder/AdventureBuilder2";
import AdventureBuilder3 from "../components/builder/AdventureBuilder3";
import loading from './loading.gif';
import Forward from "../components/builder/Forward";
import Backward from "../components/builder/Backward";

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
            loading: false,
        };
        this.updateActivity = this.updateActivity.bind(this);
        this.updateRoom = this.updateRoom.bind(this);
        this.updateVehicle = this.updateVehicle.bind(this);
        this.handleTab = this.handleTab.bind(this);
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);
        this.addToCart = this.addToCart.bind(this);
        this.cleanState = this.cleanState.bind(this);
    }

    addToCart(adv){
        this.props.addCart(adv);
        this.cleanState();
    }

    cleanState() {
        this.setState({
            advId: "B0D4",
            rentVehicle: false,
            hasRoom: false,
            value: '',
            activity: null,
            room: null,
            vehicle: null,
            tab: 1,
            canBuild: false,
            loading: false
        });
    }

    handleSubmit = (event) => {
        this.createAdventure();
    };

    handleChange = () => {
        this.setState({ rentVehicle: !this.state.rentVehicle });
    };

    changeLoading = (arg) => {
        this.setState({ loading: arg });
    };
    getLoading = () => {
        return this.state.loading;
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

    handleAlertDismiss(e) {
        e.preventDefault();
        this.setState({alert: false});
    }

    async createAdventure () {
        try {
            await fetch('http://localhost:8083/rest/brokers/createAdventure?brokerCode=B100&clientNif=999999999&begin=' +
                this.state.value.start.format("YYYY-MM-DD") + '&end=' + this.state.value.end.format("YYYY-MM-DD") +
                '&margin=0.1&rentVehicle=' + this.state.rentVehicle)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    const response = JSON.parse(body);
                    this.setState({
                        advId: response.advId,
                    });
                });
        } catch (e) {
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later.";
        }

    }

    updateActivity(activity){


        if (this.state.activity != null) {
            document.getElementById(this.state.activity.providerCode 
                + this.state.activity.capacity
                 + this.state.activity.activityCode + this.state.activity.begin 
                 + this.state.activity.end).className = "shelf-item";
        }

        document.getElementById(activity.providerCode + 
            activity.capacity + activity.activityCode + activity.begin + activity.end).className = "shelf-click";

        this.setState({
            activity: activity
        });
    }
    updateRoom(room){

        if (this.state.room != null) {
            document.getElementById(this.state.room.hotelCode 
                + this.state.room.number).className = "shelf-item";
        }

        document.getElementById(room.hotelCode + room.number).className = "shelf-click";

        this.setState({
            room: room
        });
    }
    updateVehicle(vehicle){
        if (this.state.vehicle != null) {
            document.getElementById(this.state.vehicle.plate).className = "shelf-item";
        }

        document.getElementById(vehicle.plate).className = "shelf-click";

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
                {this.state.alert ?
                    <div id="alert" className="alert alert-info alert-dismissable">
                        <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                        <span id="alert-icon" className=""></span>
                        <div id="alert-text" style={{display: "inline"}}></div>
                    </div> : null }
                {this.state.tab === 1 ? <h3 style={{textAlign: 'center'}}> AdventureBuilder : Personalize your own adventure! <br/> First you will have to choose the date you prefer and tell us if you want to rent a vehicle.</h3> : null}
                {this.state.tab === 2 ? <h3 style={{textAlign: 'center'}}> AdventureBuilder : Personalize your own adventure! <br/> Among all our options, choose the activity that suits you the most!</h3> : null}
                {this.state.tab === 3 ? <h3 style={{textAlign: 'center'}}> AdventureBuilder : Personalize your own adventure! <br/> View to the city? To the sea? Choose the best room among all our hotels!</h3> : null}
                {this.state.tab === 4 ? <h3 style={{textAlign: 'center'}}> AdventureBuilder : Personalize your own adventure! <br/> From AA-AA-AA to ZZ-ZZ-ZZ! You just have to choose!</h3> : null}
                {this.state.tab === 5 ? <h3 style={{textAlign: 'center'}}> AdventureBuilder : Personalize your own adventure! <br/> Before creating your adventure, please confirm that you chose everything you wanted!</h3> : null}

                <div className="progress_container">
                    <ul className="progressbar">
                        {this.state.tab >= 2 ? <li className="active">Adventure Specs</li> : <li>Adventure Specs</li> }
                        {this.state.tab >= 3 ? <li className="active">Activity Picker</li> : <li>Activity Picker</li> }

                        { this.state.hasRoom ?
                            this.state.tab >= 4 ? <li className="active">Hotel Picker</li> : <li>Hotel Picker</li>
                            :
                            null}

                        { this.state.rentVehicle ?
                            this.state.tab >= 5 ? <li className="active">Vehicle Picker</li> : <li>Vehicle Picker</li>
                            :
                            null}

                        {this.state.tab >= 6 ? <li className="active">Confirm</li> : <li>Confirm</li>}
                    </ul>
                </div>

                <div className="breadcrumb-buttons">
                    <Backward
                        cleanState = {this.cleanState}
                        state = {this.state}
                        handleTab = {this.handleTab}
                    />
                    <Forward
                        handleSubmit = {this.handleSubmit}
                        state = {this.state}
                        handleTab = {this.handleTab}
                    />
                </div>


                {this.state.tab == 1 ?
                    <div className="builder-text-info" style={{textAlign: 'center'}}>
                        <div>
                            <br/>
                            <p className="builder-text">Choose your adventure begin and end dates:</p>
                            <DateRangePicker
                                value={this.state.value}
                                onSelect={this.onSelect}
                                singleDateRange={true} />
                        </div>
                        <br/>
                        <div className="pz">
                            <label className="radio-inline">
                                <input
                                    type="checkbox"
                                    checked={this.state.rentVehicle}
                                    onChange={this.handleChange}
                                />
                                <div className="clab">Do you want to rent a vehicle?</div>
                            </label>
                        </div>

                        <br/>
                    </div>
                    :
                    null
                }

                {this.state.loading ?
                    <div id="loading" style={{textAlign: 'center'}}>
                        <img src={loading} alt=""></img>
                    </div> : null}

                {this.state.tab == 2 ? <AdventureBuilder0 begin = {this.state.value.start} end = {this.state.value.end} hasRoom = {this.state.hasRoom} hasVehicle = {this.state.rentVehicle} updateActivity = {this.updateActivity} handleTab = {this.handleTab} changeLoading = {this.changeLoading} getLoading = {this.getLoading} /> : null}
                {this.state.tab == 3 ? <AdventureBuilder1 begin = {this.state.value.start} end = {this.state.value.end} hasVehicle = {this.state.rentVehicle} updateRoom = {this.updateRoom} handleTab = {this.handleTab} changeLoading = {this.changeLoading} getLoading = {this.getLoading} /> : null}
                {this.state.tab == 4 ? <AdventureBuilder2 begin = {this.state.value.start} end = {this.state.value.end} updateVehicle = {this.updateVehicle} handleTab = {this.handleTab} changeLoading = {this.changeLoading} getLoading = {this.getLoading} /> : null}
                {this.state.tab == 5 ? <AdventureBuilder3 begin = {this.state.value.start.format("YYYY/MM/DD")} end = {this.state.value.end.format("YYYY/MM/DD")} advId = {this.state.advId} addCart={adv => this.addToCart(adv)} hasRoom = {this.state.hasRoom} hasVehicle = {this.state.rentVehicle} activity = {this.state.activity} room = {this.state.room} vehicle = {this.state.vehicle} handleTab = {this.handleTab} changeLoading = {this.changeLoading} getLoading = {this.getLoading} /> : null}

                <br/>
                {this.state.tab != 1 && this.state.tab != 5 ?
                    <div className="selection">
                        <hr className="home_hr"/>
                        <b>Your selections:</b>
                        <div>
                            Period: {this.state.value !== '' ?
                            <span>{this.state.value.start.format("YYYY/MM/DD")} - {this.state.value.end.format("YYYY/MM/DD")}</span> : null}
                        </div>
                        <div>
                            Vehicle: {this.state.rentVehicle ? "Yes" : "No"}
                        </div>
                        {this.state.activity != null ?
                            <div>
                                Activity: {this.state.activity.activityName}
                            </div>
                            :
                            null
                        }
                        {this.state.hasRoom && this.state.room != null ?
                            <div>
                                HotelRoom: {this.state.room.roomType}
                            </div>
                            :
                            null
                        }
                        {this.state.rentVehicle && this.state.vehicle != null ?
                            <div>
                                Vehicle: {this.state.vehicle.vehicleType}
                            </div>
                            :
                            null
                        }
                        <hr className="home_hr"/>
                    </div>
                    :
                    null
                }
            </div>
        )
    }
}

export default AdventureBuilder;
