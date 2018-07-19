import React, { Component } from 'react';
import '../../containers/App.css';
import ActivityShelf from '../shelf/ActivityShelf';
import Order from "../shelf/Order";

const sortBy = [
    { value: '',           label: 'Select'  },
    { value: 'lowestprice', label: 'Lowest to highest Price' },
    { value: 'highestprice', label: 'Highest to lowest Price' },
    { value: 'alphabetical', label: 'Alphabetical'}
]

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
        var toShowActivities = this.state.activities;
        if(this.state.filteredActivities.length > 0){
            toShowActivities = this.state.filteredActivities;
        }



        return (<div>
                {this.state.alert ?
                    <div id="alert" className="alert alert-info alert-dismissable">
                        <span id="alert-icon" className=""></span>
                        <div id="alert-text" style={{display: "inline"}}></div>
                    </div>
                    :
                    this.props.getLoading() ? null :
                        <div>
                            <div>
                                <div className="selectbox-advbuilder">
                                    <Order
                                        options={sortBy}
                                        handleOnChange={this.orderActivities}
                                    />
                                </div>
                                <ActivityShelf
                                    activities={toShowActivities}
                                    updateActivity={this.props.updateActivity}
                                />
                            </div>
                        </div>
                }
                </div>
            );
    }
}

export default AdventureBuilder0;

