import React, { Component } from 'react';
import './App.css';
import RoomShelf from '../components/shelf/RoomShelf'
import {Link} from "react-router-dom";


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
                       rooms: ros
                     };

        this.process = this.process.bind(this);
    } 

     process(i3) {

        var i1 = "B100";
        var i2 = "B1001";

       fetch('http://localhost:8083/rest/brokers/processPart?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
        
    }


    /*componentWillMount() {

        
        fetch('http://localhost:8085/rest/hotels/rooms')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({rooms: response});
                console.log(this.state);
            });

        
    } */
 
    render() {
        console.log(this.props);
        console.log(this.props.location);
        console.log("aaaa");
        console.log(this.props.location.addCart);
        console.log("bbbb");
        return (<div className="container">
                    <h3>Room Picker</h3>
                     <RoomShelf rooms = {this.state.rooms} addCart={this.props.location.addCart} />
                    {
                        this.props.location.hasVehicle &&
                        <Link to={{ pathname: '/AdventureBuilder2' , addCart:this.props.location.addCart }} style={{textDecoration: 'none'}}>
                            <div className="back-btn2">
                                <span>Vehicle Picker</span>
                            </div>
                        </Link>
                    }
                </div>
                );
    }
}

export default AdventureBuilder1;

