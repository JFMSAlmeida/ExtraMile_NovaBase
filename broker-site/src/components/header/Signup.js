import React, { Component } from 'react';
import avatar from './avatar.png'
import {Link} from 'react-router-dom'

class Signup extends Component {
    constructor(props){
        super(props);
        this.handleSignUp = this.handleSignUp.bind(this);
        this.handleSignUpNifChange = this.handleSignUpNifChange.bind(this);
        this.handleIBANChange = this.handleIBANChange.bind(this);
        this.handleAgeChange = this.handleAgeChange.bind(this);
        this.handleDrivingLicenseChange = this.handleDrivingLicenseChange.bind(this);

        this.state = {
            signupNif: '',
            signupIBAN: '',
            signupAge: '',
            signupDrivingLicense: '',
        };
    }

    handleSignUpNifChange(e) {
        this.setState({signupNif: e.target.value});
    }
    handleIBANChange(e) {
        this.setState({signupIBAN: e.target.value});
    }
    handleAgeChange(e) {
        this.setState({signupAge: e.target.value});
    }
    handleDrivingLicenseChange(e) {
        this.setState({signupDrivingLicense: e.target.value});
    }

    handleSignUp(e, nif, iban, age, dl) {
        e.preventDefault();
        console.log("handleSignUp");
        fetch('http://localhost:8083/rest/brokers/signup?brokerCode=' + this.props.getAuthState().broker +
            '&nif=' + nif +
            '&iban=' + iban +
            '&age=' + age +
            '&dl=' + dl)

            .then(function(response) {
                if (!response.ok) {
                    throw Error(response.statusText);
                }
                return response;
            }).then(function(response) {
            document.getElementById('errorSignUp').innerHTML = "";
            document.getElementById('successSignUp').innerHTML = "Client registered with success!";
        }).catch(function(error) {
            document.getElementById('successSignUp').innerHTML = "";
            document.getElementById('errorSignUp').innerHTML = "Error: It was not possible to create the client<br>" +
                "NIF and/or Driving License already registered";
        });
    }

    render() {
        return (
            <div id="signupModal" className="modal fade">
                <div className="modal-dialog modal-login">
                    <div className="modal-content">
                        <div className="modal-header">
                            <div className="avatar">
                                <img src={avatar} alt="Avatar"></img>
                            </div>
                            <h4 className="modal-title">Client Sign Up</h4>
                            <button type="button" className="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <form id="signupform" onSubmit={(e) => this.handleSignUp(e, this.state.signupNif, this.state.signupIBAN, this.state.signupAge, this.state.signupDrivingLicense)}>
                            <div className="modal-body">
                                <div id="errorSignUp" style={{color: 'red', fontSize: 'small'}}></div>
                                <div id="successSignUp" style={{color: 'green', fontSize: 'small'}}></div>
                                <div className="form-group">
                                    <input type="text" size="9" className="form-control" name="NIF" placeholder="NIF"
                                           required="required" onChange={this.handleSignUpNifChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="IBAN" placeholder="IBAN"
                                           required="required" onChange={this.handleIBANChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="number" min="1" max="120" className="form-control" name="AGE" placeholder="Age"
                                           required="required" onChange={this.handleAgeChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="drivingLicense" placeholder="Driving License"
                                           required="required" onChange={this.handleDrivingLicenseChange}></input>
                                </div>
                                <div className="form-group">
                                    <button type="submit" className="btn btn-primary btn-lg btn-block login-btn">Sign Up
                                    </button>
                                </div>
                            </div>
                        </form>
                        <div className="modal-footer">
                            <a data-dismiss="modal" data-toggle="modal" data-target="#loginModal"><a style={{cursor: 'pointer'}}>Already have an account? Login</a></a>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Signup;