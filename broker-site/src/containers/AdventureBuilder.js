import React, { Component } from 'react';
import './App.css';

class AdventureBuilder extends Component {

    constructor(props){
        super(props);
        this.state = { activities: [],
                       rooms: [],
                       vehicles: []};
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
            <h3>AdventureBuilder</h3>
        );
    }
}

export default AdventureBuilder;