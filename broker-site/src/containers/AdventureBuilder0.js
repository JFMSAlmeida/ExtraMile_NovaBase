import React, { Component } from 'react';
import './App.css';
import ActivityShelf from '../components/shelf/ActivityShelf';
import {Link} from "react-router-dom";


 const acts = [
    {
        "title": "ActivityOne",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 10,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO1"

    },

    {
        "title": "ActivityOne",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 15,
        "begin": [2018,7,6],
        "end": [2018,7,9],
        "minAge": 19,
        "maxAge": 32,
        "capacity": 25,
        "id": "ABERO1"
    },

    {
        "title": "ActivityTwo",
        "providerName": "BAUHD",
        "providerCode": "B10012",
        "price": 10,
        "begin": [2018,7,2],
        "end": [2018,7,3],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO2"
    },

    {
        "title": "ActivityThree",
        "providerName": "BAUHD1",
        "providerCode": "B100122",
        "price": 10,
        "begin": [2018,7,8],
        "end": [2018,7,25],
        "minAge": 19,
        "maxAge": 30,
        "capacity": 20,
        "id": "ABERO13"
    }

];

class AdventureBuilder0 extends Component {


    constructor(props){
        super(props);
        this.state = { 
                       activities: acts
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

        
        fetch('http://localhost:8081/rest/providers/activities')
            .then(response => {
                return response.text();
            })
            .then(body => {
                const response = JSON.parse(body);
                console.log(response);
                this.setState({activities: response});
            });

        
    }  */
 
    render() {
        console.log(this.props.location.hasRoom);
        console.log(this.props.location.hasVehicle);
        console.log("aaaa");
        console.log(this.props.location.addCart);
        console.log("bbbb");
        return (<div className="container">
                    <h3>Activity picker</h3>
                    <ActivityShelf
                        activities = {this.state.activities}
                        addCart = {this.props.location.addCart}
                    />
                    {this.props.location.hasRoom &&
                        <Link to={{ pathname: '/AdventureBuilder1', hasVehicle: this.props.location.hasVehicle , addCart:this.props.location.addCart}} style={{textDecoration: 'none'}}>
                            <div className="back-btn2">
                                <span>Room Picker</span>
                            </div>
                        </Link>
                    }
                    {!this.props.location.hasRoom && this.props.location.hasVehicle &&
                        <Link to={{ pathname: '/AdventureBuilder2', addCart:this.props.location.addCart}} style={{textDecoration: 'none'}}>
                            <div className="back-btn2">
                                <span>Vehicle Picker</span>
                            </div>
                        </Link>
                    }
                </div>
            );
    }
}

export default AdventureBuilder0;

