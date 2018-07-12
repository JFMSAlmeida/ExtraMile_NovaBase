import React, { Component } from 'react';
import avatar from '../components/avatar.png'
import {Link} from 'react-router-dom'

class Signup extends Component {
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
                        <form id="signupform" onSubmit={this.props.handleSignUp}>
                            <div className="modal-body">
                                <div id="errorSignUp" style={{color: 'red', fontSize: 'small'}}></div>
                                <div id="successSignUp" style={{color: 'green', fontSize: 'small'}}></div>
                                <div className="form-group">
                                    <input type="text" size="9" className="form-control" name="NIF" placeholder="NIF"
                                           required="required" onChange={this.props.handleSignUpNifChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="IBAN" placeholder="IBAN"
                                           required="required" onChange={this.props.handleIBANChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="number" min="1" max="120" className="form-control" name="AGE" placeholder="Age"
                                           required="required" onChange={this.props.handleAgeChange}></input>
                                </div>
                                <div className="form-group">
                                    <input type="text" className="form-control" name="drivingLicense" placeholder="Driving License"
                                           required="required" onChange={this.props.handleDrivingLicenseChange}></input>
                                </div>
                                <div className="form-group">
                                    <button type="submit" className="btn btn-primary btn-lg btn-block login-btn">Sign Up
                                    </button>
                                </div>
                            </div>
                        </form>
                        <div className="modal-footer">
                            <a data-dismiss="modal" data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}>Already have an account? Login</Link></a>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Signup;