import React, { Component } from 'react';
import './App.css';
import RoomShelf from '../components/shelf/RoomShelf'


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
        const info = {
            activityName: this.props.location.activityName,
            begin: this.props.location.begin,
            end: this.props.location.end,
            age: this.props.location.age,
            addCart: this.props.location.addCart
    
        };

        return (<div>
                    <h3>Room Picker</h3>
                     <RoomShelf
                        process = {i3 => this.process(i3)}
                        rooms = {this.state.rooms}
                        activity = {info}

                    />
                </div>
                );
    }
}

export default AdventureBuilder1;

