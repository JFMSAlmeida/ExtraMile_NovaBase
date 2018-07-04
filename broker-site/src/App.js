import React, { Component } from 'react';
import './App.css';

//const client = require('./client');

class App extends Component {

    constructor(props) {
        super(props);
         // This binding is necessary to make `this` work in the callback
        this.handleClickEcho = this.handleClickEcho.bind(this);
        this.handleClickProcess = this.handleClickProcess.bind(this);
    }

    handleClickProcess() {
        fetch('/rest/brokers/process?param1=B100&param2=B1001', {
            method: 'POST'})
            .then(response => {
                return response.text();
            })
            .then(body => {
                alert(body)
            });
    }

    render() {
        return (
          <div>
            <h1>HELLO THIS IS A TEST</h1>
              <button onClick={this.handleClickProcess}>Click Process</button>
          </div>
        );
    }
}

export default App;
