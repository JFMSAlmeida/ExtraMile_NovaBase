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
        this.checkChanges = this.checkChanges.bind(this);

        this.state = {
            broker: this.props.location.state.info.broker,
            nif: this.props.location.state.info.nif,
            iban: this.props.location.state.info.iban,
            age: this.props.location.state.info.age,
            drivinglicense: this.props.location.state.info.drivinglicense,
            alert: false
        };
    }

    handleEdit(e, str) {
        e.preventDefault();
        console.log(this.props.location.state.info);
        console.log(str);
        document.getElementById(str).disabled = false;
        document.getElementById(str+'-edit').hidden = true;
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
    checkChanges() {
        if (document.getElementById('iban').disabled && document.getElementById('age').disabled && document.getElementById('dl').disabled)
            return false;
    }

    handleOk(e) {
        e.preventDefault();
        //if (this.checkChanges()) {
            this.setState({alert: true});
            fetch('http://localhost:8083/rest/brokers/updateClientInfo?brokerCode=' + this.state.broker +
                '&nif=' + this.state.nif +
                '&iban=' + this.state.iban +
                '&age=' + this.state.age +
                '&dl=' + this.state.drivinglicense)

                .then(function (response) {
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
                        document.getElementById("alert").setAttribute("class", "alert alert-danger");
                        document.getElementById("alert-icon").className = "glyphicon glyphicon-exclamation-sign";
                        document.getElementById("alert-text").innerHTML = "&nbsp;Abort: Driving License already in use by other user."
                    }
                    else {
                        //Atualizar fields e states
                        this.props.location.handleInfoChange(this.state.iban, this.state.age, this.state.drivinglicense);
                        this.props.location.state.info.iban = this.state.iban;
                        this.props.location.state.info.age = this.state.age;
                        this.props.location.state.info.drivinglicense = this.state.drivinglicense;
                        document.getElementById('iban').disabled = true;
                        document.getElementById('iban-edit').hidden = false;
                        document.getElementById('iban-remove').hidden = true;
                        document.getElementById('age').disabled = true;
                        document.getElementById('age-edit').hidden = false;
                        document.getElementById('age-remove').hidden = true;
                        document.getElementById('dl').disabled = true;
                        document.getElementById('dl-edit').hidden = false;
                        document.getElementById('dl-remove').hidden = true;
                        document.getElementById("alert-icon").className = "glyphicon glyphicon-ok-sign";
                        document.getElementById("alert-text").innerHTML = "&nbsp;Fields updated with success!";
                        document.getElementById("alert").setAttribute("class", "alert alert-success");
                    }
                }).catch(function (error) {
                document.getElementById("alert").setAttribute("class", "alert alert-warning");
                document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
                document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later."
            });
        //}
    }

    handleRemove(e, str) {
        e.preventDefault()
        if (str == "iban") {
            document.getElementById(str).value = this.props.location.state.info.iban;
            this.state.iban = this.props.location.state.info.iban;
        }
        if (str == "age") {
            document.getElementById(str).value = this.props.location.state.info.age;
            this.state.age = this.props.location.state.info.age;
        }
        if (str == "dl") {
            document.getElementById(str).value = this.props.location.state.info.drivinglicense;
            this.state.drivinglicense = this.props.location.state.info.drivinglicense;
        }
        document.getElementById(str).disabled = true;
        document.getElementById(str+'-edit').hidden = false;
        document.getElementById(str+'-remove').hidden = true;
    }

    render() {
        return (
            <div class="container" style={{paddingTop: "25px"}}>
                {this.state.alert ? <div id="alert" className="alert alert-info alert-dismissable">
                    <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                    <span id="alert-icon" className=""></span>
                    <div id="alert-text" style={{display: "inline"}}></div>
                </div> : null }
                <div className="row">
                    <div className="col-md-3 ">
                        <div className="list-group ">
                            <a className="list-group-item list-group-item-action active">Dashboard</a>
                            <a className="list-group-item list-group-item-action">Wish List</a>


                        </div>
                    </div>
                    <div className="col-md-9">
                        <div className="card">
                            <div className="card-body">
                                <div className="row">
                                    <div className="col-md-12">
                                        <h4>Your Profile</h4>
                                        <hr></hr>
                                    </div>
                                </div>
                                <div className="row" style={{paddingLeft: "18px"}}>
                                    <div className="col-md-12">
                                        <div className="form-group row">
                                            <label htmlFor="username" className="col-4 col-form-label">NIF:</label>
                                            <div className="col-8">
                                                <div className="col-lg-8">
                                                    <div className="col-lg-8">
                                                        <span>{this.props.location.state.info.nif}</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>


                                        <div className="form-group row">
                                            <label htmlFor="username" className="col-4 col-form-label">IBAN:</label>
                                            <div className="col-8">
                                                <div className="col-lg-8">
                                                    <input id="iban" disabled="true" type="text" defaultValue={this.props.location.state.info.iban} onChange={this.handleIBANChange}></input>&nbsp;
                                                    <button id="iban-edit" onClick={(e) => this.handleEdit(e, "iban")}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button id="iban-remove" onClick={(e) => this.handleRemove(e, "iban")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>

                                        <div className="form-group row">
                                            <label htmlFor="username" className="col-4 col-form-label">Age:</label>
                                            <div className="col-8">
                                                <div className="col-lg-8">
                                                    <input id="age" disabled="true" className="form-cont rol" type="number" min="1" max="120" defaultValue={this.props.location.state.info.age} onChange={this.handleAgeChange}></input>&nbsp;
                                                    <button id="age-edit" onClick={(e) => this.handleEdit(e, "age")}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button id="age-remove" onClick={(e) => this.handleRemove(e, "age")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>

                                        <div className="form-group row">
                                            <label htmlFor="username" className="col-4 col-form-label">Driving License:</label>
                                            <div className="col-8">
                                                <div className="col-lg-8">
                                                    <input id="dl" disabled="true" className="form-cont rol" type="text" defaultValue={this.props.location.state.info.drivinglicense} onChange={this.handleDrivingLicenseChange}></input>&nbsp;
                                                    <button id="dl-edit" onClick={(e) => this.handleEdit(e, "dl")}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button id="dl-remove" onClick={(e) => this.handleRemove(e, "dl")} hidden="true" ><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>

                                        <div className="form-group row">
                                            <div className="offset-4 col-8">
                                                <button name="submit" type="submit"
                                                        className="btn btn-primary" onClick={(e) => this.handleOk(e)}>Update My Profile
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default AdventureBuilder;