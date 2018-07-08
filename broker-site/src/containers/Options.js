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
        this.state = {
            iban: this.props.location.state.info.iban,
            age: this.props.location.state.info.iban,
            drivinglicense: this.props.location.state.info.iban
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

    handleOk(e, str) {
        console.log("handleok", str);
        e.preventDefault();
        console.log(this.props);
        console.log(this.props.location);
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
        document.getElementById(str).disabled = true;
        document.getElementById(str+'-edit').hidden = false;
        document.getElementById(str+'-ok').hidden = true;
        document.getElementById(str+'-remove').hidden = true;
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
                <div className="alert alert-info alert-dismissable">
                    <a className="panel-close close" data-dismiss="alert">×</a>
                    This is an <strong>.alert</strong>. Use this to show important messages to the user.
                </div>
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
                        <input id="age" disabled="true" className="form-cont rol" type="text" defaultValue={this.props.location.state.info.age} onChange={this.handleAgeChange}></input>&nbsp;
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