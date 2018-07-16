import React, { Component } from 'react';
import './App.css';
import ActivityShelf from '../components/shelf/ActivityShelf';

class AdventureBuilder1 extends Component {
    constructor(props){
        super(props);
        this.state = { 
                       activities: []
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

        
    }  
 
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

