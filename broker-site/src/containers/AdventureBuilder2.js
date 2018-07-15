import React, { Component } from 'react';
import './App.css';
import VehicleShelf from '../components/shelf/VehicleShelf';

class AdventureBuilder2 extends Component {

    constructor(props){
        super(props);
        this.state = {
                       vehicles: []
                    }

 

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


    componentWillMount() {

        fetch('http://localhost:8084/rest/rentacars/vehicles')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({vehicles: response});
                console.log(this.state);
            });
    }  

    render() {

        const info = {
            activityName: this.props.location.activityName,
            begin: this.props.location.begin,
            end: this.props.location.end,
            age: this.props.location.age,
            hasRoom: this.props.location.hasRoom,
            hotelName: this.props.location.hotelName,
            roomNumber: this.props.location.roomNumber,
            roomType: this.props.location.roomType,
            addCart: this.props.location.addCart

        };

        return (<div>
                    <h3>Vehicle picker</h3>
                        <VehicleShelf
                            process = {i3 => this.process(i3)}
                            vehicles = {this.state.vehicles}
                            room = {info}                     
                    />

                
                </div>
                );
    }

}

export default AdventureBuilder2;
