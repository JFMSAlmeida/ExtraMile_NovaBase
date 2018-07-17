import React, { Component } from 'react';
import './App.css';
import Transaction from "../components/options/Transaction";
import Dashboard from "../components/options/Dashboard";

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
        this.handleTab = this.handleTab.bind(this);
        this.disableFields = this.disableFields.bind(this);
        this.alert = this.alert.bind(this);

        this.state = {
            broker: this.props.location.state.info.broker,
            nif: this.props.location.state.info.nif,
            iban: this.props.location.state.info.iban,
            age: this.props.location.state.info.age,
            drivinglicense: this.props.location.state.info.drivinglicense,
            alert: false,
            tab: 'dashboard',
            transactions: [],
            couldFetchTransactions: false
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

    disableFields() {
        document.getElementById('iban').disabled = true;
        document.getElementById('iban-edit').hidden = false;
        document.getElementById('iban-remove').hidden = true;
        document.getElementById('age').disabled = true;
        document.getElementById('age-edit').hidden = false;
        document.getElementById('age-remove').hidden = true;
        document.getElementById('dl').disabled = true;
        document.getElementById('dl-edit').hidden = false;
        document.getElementById('dl-remove').hidden = true;
    }

    alert(str) {
        if (str == "success") {
            document.getElementById("alert-icon").className = "glyphicon glyphicon-ok-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Fields updated with success!";
            document.getElementById("alert").setAttribute("class", "alert alert-success");
        }
        if (str == "warning") {
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later.";
        }
        if (str == "error") {
            document.getElementById("alert").setAttribute("class", "alert alert-danger");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-exclamation-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Abort: Driving License already in use by other user.";
        }
    }

    handleOk(e) {
        e.preventDefault();
        this.setState({alert: true});
        var self = this;
        fetch('http://localhost:8083/rest/brokers/updateClientInfo?brokerCode=' + this.state.broker +
            '&nif=' + this.state.nif +
            '&iban=' + this.state.iban +
            '&age=' + this.state.age +
            '&dl=' + this.state.drivinglicense)

            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
                if (!JSON.parse(body).success) {
                    //DL invalido
                    this.alert("error");
                    this.handleRemove(e, "iban");
                    this.handleRemove(e, "age");
                    this.handleRemove(e, "dl");
                }
                else {
                    //Atualizar fields e states
                    this.props.location.handleInfoChange(this.state.iban, this.state.age, this.state.drivinglicense);
                    this.props.location.state.info.iban = this.state.iban;
                    this.props.location.state.info.age = this.state.age;
                    this.props.location.state.info.drivinglicense = this.state.drivinglicense;
                    this.props.location.calculateBalance();
                    this.disableFields();
                    this.alert("success");
                }
            }).catch(function (error) {
            self.alert("warning");
        });
        this.componentWillMount();
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

    handleTab(e, tab) {
        e.preventDefault();
        this.setState({tab: tab});
    }

    async componentWillMount() {
        try {
            await fetch('http://localhost:8082/rest/banks/transactions?iban=' + this.state.iban)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    console.log((JSON).parse(body).transactions);
                    if ((JSON).parse(body).success) {
                        this.state.transactions = JSON.parse(body).transactions;
                        this.setState({
                            couldFetchTransactions: true
                        });
                    }
                    else {
                        //invalid iban
                        this.setState({
                            couldFetchTransactions: false
                        });
                        // to distinguish from the catch result (length = 1)
                        this.state.transactions = [{reference: null, time: null, value: null, type: null}];
                    }
                });
        } catch (e) {
            // bank server down
            this.setState({
                couldFetchTransactions: false
            });
            this.state.transactions = [];
        }
    }

    render() {
        return (
            <div className="container">
                {this.state.alert ? <div id="alert" className="alert alert-info alert-dismissable">
                    <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                    <span id="alert-icon" className=""></span>
                    <div id="alert-text" style={{display: "inline"}}></div>
                </div> : null }
                <div className="row">
                    <div className="col-md-3 ">
                        <div className="list-group">
                            {this.state.tab == 'dashboard' ? <a className="list-group-item list-group-item-action active" onClick={(e) => this.handleTab(e, 'dashboard')}>Dashboard</a> : <a className="list-group-item list-group-item-action" onClick={(e) => this.handleTab(e, 'dashboard')}>Dashboard</a>}
                            {this.state.tab == 'transactions' ? <a className="list-group-item list-group-item-action active" onClick={(e) => this.handleTab(e, 'transactions')}>Transactions</a> : <a className="list-group-item list-group-item-action" onClick={(e) => this.handleTab(e, 'transactions')}>Transactions</a>}
                        </div>
                    </div>

                    {this.state.tab == 'dashboard' ?
                        <Dashboard
                            fieldState = {this.props.location.state.info}
                            handleOk = {this.handleOk}
                            handleEdit = {this.handleEdit}
                            handleRemove = {this.handleRemove}
                            handleIBANChange = {this.handleIBANChange}
                            handleAgeChange = {this.handleAgeChange}
                            handleDrivingLicenseChange = {this.handleDrivingLicenseChange}
                        />
                        :null}

                    {this.state.tab == 'transactions' ?
                        <div id="transactions">
                            <div className="col-md-9">
                                <div className="card">
                                    <div className="card-body">
                                        <div className="row">
                                            <div className="col-md-12">
                                                <h4>Transactions</h4>
                                                <hr className="home_hr"></hr>
                                                <Transaction
                                                    transactions = {this.state.transactions}
                                                    couldFetchTransactions = {this.state.couldFetchTransactions}/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        :null}
                </div>
            </div>
        );
    }
}

export default AdventureBuilder;