import React, { Component } from 'react';
import './App.css';
import BuilderShelf from '../components/shelf/BuilderShelf'
import DateRangePicker from "react-daterange-picker";
import "react-daterange-picker/dist/css/react-calendar.css";
import originalMoment from "moment";
import { extendMoment } from "moment-range";
const moment = extendMoment(originalMoment);


class AdventureBuilder extends Component {

    constructor(props){
        super(props);

        const today = moment();

        this.state = {
            activities: [],
            rooms: [],
            vehicles: [],
            rentVehicle: false,
            value: moment.range(today.clone(), today.clone().add(7, "days"))
        };

        this.process = this.process.bind(this);
    }

    handleSubmit = (event) => {
        console.log(this.state.value);
        this.createAdventure();
        alert("Your custom adventure was successfully submitted");
        event.preventDefault(); 
    };

    handleChange = () => {
        this.setState({ rentVehicle: !this.state.rentVehicle });
    };

    onSelect = (value, states) => {
        this.setState({ value, states });
    };


    /*process(i1,i2,i3) {

       fetch('http://localhost:8083/rest/brokers/processTest?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
        
    }*/

     process(i3) {

        var i1 = "B100";
        var i2 = "B1001";

       fetch('http://localhost:8083/rest/brokers/processTest?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
        
    }

    createAdventure () {

        fetch('http://localhost:8083/rest/brokers/createAdventure?brokerCode=B100&clientNif=999999999&begin=' + 
            this.state.value.start.format("YYYY-MM-DD") + '&end=' + this.state.value.end.format("YYYY-MM-DD") +
            '&margin=1&rentVehicle=' + this.state.rentVehicle)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
    }

    componentWillMount() {

        fetch('http://localhost:8081/rest/providers/activities')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({activities: response});
                console.log(this.state);
            });

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
        return (
                <div>
                    <h3>AdventureBuilder</h3>
                    <div>
                        <div>
                            Do you want to rent a vehicle?
                            <input
                                type="checkbox"
                                checked={this.state.rentVehicle}
                                onChange={this.handleChange} />
                        </div>
                        <br/>
                        <div>
                            <p>Choose your adventure begin and end dates:</p>
                            <DateRangePicker
                                value={this.state.value}
                                onSelect={this.onSelect}
                                singleDateRange={true} />
                        </div>
                        <br/>
                        <button type="submit" onClick={this.handleSubmit}>Submit your adventure</button>
                    </div>

                    <BuilderShelf
                        process = {i3 => this.process(i3)}
                        activities = {this.state.activities}
                        rooms = {this.state.rooms}
                        vehicles = {this.state.vehicles}
                    />
                </div>
                );
    }
}

export default AdventureBuilder;
