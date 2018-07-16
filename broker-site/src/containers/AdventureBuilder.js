import React, { Component } from 'react';
import './App.css';
import DateRangePicker from "react-daterange-picker";
import "react-daterange-picker/dist/css/react-calendar.css";
import originalMoment from "moment";
import { extendMoment } from "moment-range";
import { Link } from 'react-router-dom'

const moment = extendMoment(originalMoment);


class AdventureBuilder extends Component {

    constructor(props){
        super(props);

        const today = moment();

        this.state = {
            rentVehicle: false,
            value: moment.range(today.clone(), today.clone().add(7, "days"))
        };
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

    render() {

        const info = {
            pathname: '/adventureBuilder0',
            addCart: this.props.addCart
        };

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
                        <Link to={info} className="shelf-item__buy-btn" > Start the builder!</Link>
                    </div>

                </div>
                )
    }  
}

export default AdventureBuilder;
