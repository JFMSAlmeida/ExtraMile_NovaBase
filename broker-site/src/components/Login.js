import React, { Component } from 'react';
import avatar from '../components/avatar.png'
import {Link} from 'react-router-dom'

class Login extends Component {
    render() {
        return (
            <div id="loginModal" className="modal fade">
                <div className="modal-dialog modal-login">
                    <div className="modal-content">
                        <div className="modal-header">
                            <div className="avatar">
                                <img src={avatar} alt="Avatar"></img>
                            </div>
                            <h4 className="modal-title">Client Login</h4>
                            <button id="closeLoginModal" type="button" className="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div id="hideafterlogin">
                            <form id="loginform" onSubmit={this.props.handleLogin}>
                                <div className="modal-body">
                                    <div id="errorLogin" style={{ color: 'red', fontSize: 'small'}}></div>
                                    <div className="form-group">
                                        <input type="text" className="form-control" name="NIF" placeholder="NIF"
                                               required="required" onChange={this.props.handleLoginNifChange}></input>
                                    </div>
                                    <div className="form-group">
                                        <button type="submit" className="btn btn-primary btn-lg btn-block login-btn">Login
                                        </button>
                                    </div>
                                </div>
                            </form>
                            <div className="modal-footer">
                                <a data-dismiss="modal" data-toggle="modal" data-target="#signupModal"><Link to={this.props.history}>Not registered? Sign Up</Link></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default Login;