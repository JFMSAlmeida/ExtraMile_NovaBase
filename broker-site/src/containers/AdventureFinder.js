import React, { Component } from 'react';
import './App.css';
import Shelf from '../components/shelf/Shelf'
import loading from './loading.gif';

class AdventureFinder extends Component {

    constructor(props){
        super(props);
        this.state = {adventures: [],
                    loading: true};
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);
    }

    handleAlertDismiss(e) {
        e.preventDefault();
        this.setState({alert: false});
    }

    async componentWillMount() {
        try {
            await fetch('http://localhost:8083/rest/brokers/process?param1=B100')
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    console.log(JSON.parse(body));
                });
        } catch (e) {
            this.setState({loading: false});
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later."
        }

        try {
            await fetch('http://localhost:8083/rest/brokers/showAdventures?param1=B100&param2=999999999')
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    console.log(JSON.parse(body));

                    const response = JSON.parse(body);
                    console.log(response);

                    this.setState({adventures: response});
                    this.setState({loading: false});
                });
        } catch (e) {
            this.setState({loading: false});
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later."
        }
    }

    render() {
        console.log(this.props.a);
        console.log(this.props.addCart);
        return (
            <div>
                {this.state.alert ?
                    <div id="alert" className="alert alert-info alert-dismissable">
                        <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                        <span id="alert-icon" className=""></span>
                        <div id="alert-text" style={{display: "inline"}}></div>
                    </div> : null }

                <h3>AdventureFinder</h3>
                {this.state.loading ? <div id="loading" style={{textAlign: 'center'}}>
                    <img src={loading}></img>
                </div> : null }

                <Shelf
                    adventures = {this.state.adventures}
                    addCart = {this.props.addCart}
                    loading = {this.state.loading}
                />
            </div>
            );
    }
}

export default AdventureFinder;