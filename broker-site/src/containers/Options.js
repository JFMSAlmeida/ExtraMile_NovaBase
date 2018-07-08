import React, { Component } from 'react';
import './App.css';

class AdventureBuilder extends Component {
    constructor(props){
        super(props);
        this.handleEdit = this.handleEdit.bind(this);
        this.handleIBANChange = this.handleIBANChange.bind(this);
        this.handleAgeChange = this.handleAgeChange.bind(this);
        this.handleDrivingLicenseChange = this.handleDrivingLicenseChange.bind(this);
        this.handleOk = this.handleOk.bind(this);
        this.handleRemove = this.handleRemove.bind(this);
        this.handleAlertDismiss = this.handleAlertDismiss.bind(this);

        this.state = {
            broker: this.props.location.state.info.broker,
            nif: this.props.location.state.info.nif,
            iban: this.props.location.state.info.iban,
            age: this.props.location.state.info.iban,
            drivinglicense: this.props.location.state.info.iban,
            alert: false
        };
    }

    handleEdit(e, str) {
        e.preventDefault();
        console.log(this.props.location.state.info);
        console.log(str);
        document.getElementById(str).disabled = false;
        document.getElementById(str+'-edit').hidden = true;
        document.getElementById(str+'-ok').hidden = false;
        document.getElementById(str+'-remove').hidden = false;
    }

    handleIBANChange(e) {
        this.setState({iban: e.target.value});
    }
    handleAgeChange(e) {
        this.setState({age: e.target.value});
    }
    handleDrivingLicenseChange(e) {
        this.setState({drivinglicense: e.target.value});
    }
    handleAlertDismiss(e) {
        e.preventDefault();
        this.setState({alert: false});
    }

    handleOk(e, str) {
        console.log("handleok", str);
        e.preventDefault();
        this.setState({alert: true});
        fetch('http://localhost:8083/rest/brokers/signup?brokerCode=' + this.state.broker +
                                                        '&nif=' + this.state.nif +
                                                        '&iban=' + this.state.iban +
                                                        '&age=' + this.state.age +
                                                        '&dl=' + this.state.drivinglicense)

            .then(function(response) {
                if (!response.ok) {
                    throw Error(response.statusText);
                }
                return response;
            }).then(response => {
            return response.text();
        })
            .then(body => {
                console.log(JSON.parse(body));
                if (!JSON.parse(body).success) {
                    //DL invalido
                    document.getElementById("alert-text").innerHTML = "It was not possible to update your Driving License field since it is already in use."
                }
                else {
                    //Atualizar fields e states
                    if (str == "iban") {
                        this.props.location.handleInfoChange("iban", this.state.iban);
                        this.props.location.state.info.iban = this.state.iban;
                    }
                    if (str == "age") {
                        this.props.location.handleInfoChange("age", this.state.age);
                        this.props.location.state.info.age = this.state.age;
                    }
                    if (str == "dl") {
                        this.props.location.handleInfoChange("dl", this.state.drivinglicense);
                        this.props.location.state.info.drivinglicense = this.state.drivinglicense;
                    }
                    document.getElementById("alert-text").innerHTML = "Fields updated with success!"
                    document.getElementById(str).disabled = true;
                    document.getElementById(str+'-edit').hidden = false;
                    document.getElementById(str+'-ok').hidden = true;
                    document.getElementById(str+'-remove').hidden = true;
                }
            }).catch(function(error) {
                document.getElementById("alert-text").innerHTML = "Something went wrong... Try again later."
        });
    }

    handleRemove(e, str) {
        e.preventDefault()
        if (str == "iban")
            document.getElementById(str).value = this.props.location.state.info.iban;
        if (str == "age")
            document.getElementById(str).value = this.props.location.state.info.age;
        if (str == "dl")
            document.getElementById(str).value = this.props.location.state.info.drivinglicense;
        document.getElementById(str).disabled = true;
        document.getElementById(str+'-edit').hidden = false;
        document.getElementById(str+'-ok').hidden = true;
        document.getElementById(str+'-remove').hidden = true;
    }

    render() {
        return (
            <div>
                {this.state.alert ? <div id="alert" className="alert alert-info alert-dismissable">
                    <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                    <div id="alert-text">Ola</div>
                </div> : null }

                <h3>Options</h3>
                <div className="form-group">
                    <label className="col-lg-3 control-label">Nif:</label>
                    <div className="col-lg-8">
                        <span>{this.props.location.state.info.nif}</span>
                    </div>
                </div>
                <br/>
                <div className="form-group">
                    <label className="col-lg-3 control-label">Iban:</label>
                    <div className="col-lg-8">
                        <input id="iban" disabled="true" className="form-cont rol" type="text" defaultValue={this.props.location.state.info.iban} onChange={this.handleIBANChange}></input>&nbsp;
                        <button id="iban-edit" onClick={(e) => this.handleEdit(e, "iban")}><span className="glyphicon glyphicon-edit"></span></button>
                        <button id="iban-ok" onClick={(e) => this.handleOk(e, "iban")} hidden="true" ><span className="glyphicon glyphicon-ok"></span></button>&nbsp;
                        <button id="iban-remove" onClick={(e) => this.handleRemove(e, "iban")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                    </div>
                </div>
                <div className="form-group">
                    <label className="col-lg-3 control-label">Age:</label>
                    <div className="col-lg-8">
                        <input id="age" disabled="true" className="form-cont rol" type="number" min="1" max="120" defaultValue={this.props.location.state.info.age} onChange={this.handleAgeChange}></input>&nbsp;
                        <button id="age-edit" onClick={(e) => this.handleEdit(e, "age")}><span className="glyphicon glyphicon-edit"></span></button>
                        <button id="age-ok" onClick={(e) => this.handleOk(e, "age")} hidden="true" ><span className="glyphicon glyphicon-ok"></span></button>&nbsp;
                        <button id="age-remove" onClick={(e) => this.handleRemove(e, "age")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                    </div>
                </div>
                <div className="form-group">
                    <label className="col-lg-3 control-label">Driving License:</label>
                    <div className="col-lg-8">
                        <input id="dl" disabled="true" className="form-cont rol" type="text" defaultValue={this.props.location.state.info.drivinglicense} onChange={this.handleDrivingLicenseChange}></input>&nbsp;
                        <button id="dl-edit" onClick={(e) => this.handleEdit(e, "dl")}><span className="glyphicon glyphicon-edit"></span></button>
                        <button id="dl-ok" onClick={(e) => this.handleOk(e, "dl")} hidden="true" ><span className="glyphicon glyphicon-ok"></span></button>&nbsp;
                        <button id="dl-remove" onClick={(e) => this.handleRemove(e, "dl")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                    </div>
                </div>
            </div>
        );
    }
}

export default AdventureBuilder;