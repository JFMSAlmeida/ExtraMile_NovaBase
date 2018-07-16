import React, { Component } from 'react';
import './App.css';
import ActivityShelf from '../components/shelf/ActivityShelf';


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

class AdventureBuilder1 extends Component {


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

        return (<div>
                    <h3>Activity picker</h3>
                    <ActivityShelf
                        process = {i3 => this.process(i3)}
                        activities = {this.state.activities}
                        addCart = {this.props.location.addCart}
                    />
                </div>
                );
    }
}

export default AdventureBuilder1;

