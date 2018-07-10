import React, { Component } from 'react';
import './App.css';
import Carousel from "../components/Carousel";

class Home extends Component {

    constructor(props) {
        super(props);
        // This binding is necessary to make `this` work in the callback
        this.handleClickProcess = this.handleClickProcess.bind(this);
        this.handleClickEcho = this.handleClickEcho.bind(this);
        this.test = this.test.bind(this);
    }

    handleClickProcess() {
        fetch('http://localhost:8083/rest/brokers/process?param1=B100')
        .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
    }
    handleClickShowAdventures() {
        fetch('http://localhost:8083/rest/brokers/showAdventures?param1=B100&param2=111111115')
            .then(response => {
                console.log(response);
                return response.text();
            })
            .then(body => {
                const response = JSON.parse(body);
                console.log(response);
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

    test() {
        var i1 = "B100";
        var i2 = "B1001";
        var i3 = "AP1234;AP12341";

        fetch('http://localhost:8083/rest/brokers/processTest?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
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
                <button onClick={this.handleClickShowAdventures}>Show Adventures</button>
                <button onClick={this.test}>test</button>
            </div>
        );
    }
}

export default Home;