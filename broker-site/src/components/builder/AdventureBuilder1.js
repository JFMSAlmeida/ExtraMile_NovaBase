import React, { Component } from 'react';
import '../../containers/App.css';
import RoomShelf from '../shelf/RoomShelf'
import Order from "../shelf/Order";
import Filter from "../shelf/Filter";

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

class AdventureBuilder1 extends Component {
    constructor(props){
        super(props);
        this.state = { 
            rooms: [],
            filteredRooms : [],
            value : "",
            filterFlag : false
        };

        this.selectedFilters = new Set();
        this.orderRooms = this.orderRooms.bind(this);
        this.filterRooms = this.filterRooms.bind(this);
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);
    } 


    async componentWillMount() {
        try {
            this.props.changeLoading(true);
            var date1 = this.props.begin.format("YYYY-MM-DD");
            var date2 = this.props.end.format("YYYY-MM-DD");
            await fetch('http://localhost:8085/rest/hotels/rooms?param1=' + date1 + '&param2=' + date2)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    const response = JSON.parse(body);
                    this.setState({rooms: response, filteredRooms: response});

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

        this.setState({filteredRooms : filteredRooms}, () => {this.orderRooms(this.state.value)});
    }

    orderRooms(value){
        this.setState({ value : value});
        var orderedRooms;
        if(this.state.filterFlag)
            orderedRooms = this.state.filteredRooms.slice(0);
        else
            orderedRooms = this.state.rooms.slice(0);

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
    }
 
    render() {
        var toShowRooms = this.state.rooms;
        if(this.state.filterFlag || (this.state.value !== "")){
            toShowRooms = this.state.filteredRooms;
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
                                    <div className="filtersBuilder">
                                        <Filter
                                            availableFilters = {availableFilters}
                                            filterFunction = {label => this.filterRooms(label)}
                                        />
                                    </div>
                                     <div className="selectbox-advbuilder">
                                        <Order
                                            options = {sortBy}
                                            handleOnChange = {this.orderRooms}
                                        />
                                     </div>
                                    <RoomShelf
                                        rooms = {toShowRooms}
                                        updateRoom={this.props.updateRoom}
                                        getLoading = {this.props.getLoading}
                                    />
                                 </div>
                            </div>
                    }

                </div>
                );
    }
}

export default AdventureBuilder1;

