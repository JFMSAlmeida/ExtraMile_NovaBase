import React, { Component } from 'react';
import './App.css';

class AdventureBuilder extends Component {

    constructor(props){
        super(props);
        this.state = {rooms: [],
                      vehicles: []};
    }

    componentWillMount() {

        fetch('http://localhost:8083/rest/hotels/rooms')
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

        fetch('http://localhost:8083/rest/rentacars/vehicles')
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