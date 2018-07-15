import React, { Component } from 'react';
import './App.css';
import Shelf from '../components/shelf/Shelf'

class AdventureFinder extends Component {

    constructor(props){
        super(props);
        this.state = {adventures: []};
    }

    componentWillMount() {
        fetch('http://localhost:8083/rest/brokers/process?param1=B100')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
            });

        fetch('http://localhost:8083/rest/brokers/showAdventures?param1=B100&param2=999999999')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({adventures: response});
                console.log(this.state);
            });
    }

    render() {
        console.log(this.props.a);
        console.log(this.props.addCart);
        return (<div>
                    <h3>AdventureFinder</h3>
                    <Shelf
                        adventures = {this.state.adventures}
                        addCart = {this.props.addCart}
                        a = {this.props.a}
                    />
                </div>
                );
    }
}

export default AdventureFinder;