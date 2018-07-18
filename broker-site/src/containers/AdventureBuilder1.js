import React, { Component } from 'react';
import './App.css';
import RoomShelf from '../components/shelf/RoomShelf'
import {button} from "react-router-dom";

/*
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
*/

class AdventureBuilder1 extends Component {
    constructor(props){
        super(props);
        this.state = { 
                       rooms: []
                     };

    } 



    componentWillMount() {

        this.props.changeLoading(true);
        var date1 = this.props.begin.format("YYYY-MM-DD");
        var date2 = this.props.end.format("YYYY-MM-DD");
        fetch('http://localhost:8085/rest/hotels/rooms?param1=' + date1 + '&param2=' + date2)
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({rooms: response});
                console.log(this.state);

                this.props.changeLoading(false);
            });
    }
 
    render() {
        console.log(this.props);
        console.log(this.props.hasVehicle);
        return (<div>
                    <h3>Room Picker</h3>
                     <RoomShelf rooms = {this.state.rooms} updateRoom={this.props.updateRoom} />
                    {this.props.hasVehicle &&
                        <button onClick={()=> this.props.handleTab(4)}>
                            <div className="back-btn2">
                                <span>Vehicle Picker</span>
                            </div>
                        </button>
                    }

                    {!this.props.hasVehicle &&
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

export default AdventureBuilder1;

