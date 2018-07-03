import React, { Component } from 'react';
import './App.css';

//const client = require('./client');

class App extends Component {

    constructor(props) {
        super(props);
         // This binding is necessary to make `this` work in the callback
        this.handleClick = this.handleClick.bind(this);
    }

    handleClick() {

        fetch('http://localhost:8083/brokers/process', {
            method: 'POST'})
            .then(response => response.json())
            .then(data => console.log('Request success: ', data));
    }
    render() {
        return (
          <div>
            <h1>HELLO THIS IS A TEST</h1>
              <button onClick={this.handleClick}>Click me</button>
          </div>
        );
    }
}

export default App;
