import React, { Component } from 'react';
import './App.css';
import BuilderShelf from '../components/shelf/BuilderShelf'

class AdventureBuilder extends Component {

    constructor(props){
        super(props);
        this.state = { activities: [],
                       rooms: [],
                       vehicles: []
                     };

        this.process = this.process.bind(this);
    } 


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
        return (<div>
                    <h3>AdventureBuilder</h3>
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
