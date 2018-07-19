import React, { Component } from 'react';
import './App.css';
import Carousel from "../components/home/Carousel";

class Home extends Component {

    render() {
        return (
            <div className="App">
                <Carousel/>
            </div>
        );
    }
}

export default Home;