import React, { Component } from 'react';
import './App.css';
import Carousel from "../components/Carousel";

//const client = require('./client');

class App extends Component {

    constructor(props) {
        super(props);
        // This binding is necessary to make `this` work in the callback
        this.handleClickProcess = this.handleClickProcess.bind(this);
        this.handleClickEcho = this.handleClickEcho.bind(this);
    }

    handleClickProcess() {
        fetch('http://localhost:8083/rest/brokers/process?param1=B100&param2=B1001')
        .then(response => {
            console.log(response.text);
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
    }

    handleClickEcho() {
        fetch('http://localhost:8083/rest/brokers/echo?request=ola')
            .then(response => {
                console.log(response.text);
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
            });
    }

    render() {
        return (
            <div className="App">
                <Carousel/>
                <h1>HELLO THIS IS A TEST</h1>
                <button onClick={this.handleClickProcess}>Click Process</button>
                <button onClick={this.handleClickEcho}>Click Echo</button>
            </div>
        );
    }
}

export default App;