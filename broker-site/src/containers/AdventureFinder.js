import React, { Component } from 'react';
import './App.css';
import Shelf from '../components/shelf/Shelf'

class AdventureFinder extends Component {

    componentWillMount() {
        fetch('http://localhost:8083/rest/brokers/process?param1=B100')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
            });
    }

    render() {
        return (<div>
                    <h3>AdventureFinder</h3>
                    <Shelf />
                </div>
                );
    }
}

export default AdventureFinder;