import React, { Component } from 'react';
import avatar from './avatar.png'
import {Link} from 'react-router-dom'

class Login extends Component {

    constructor(props){
        super(props);
        this.handleLoginNifChange = this.handleLoginNifChange.bind(this);
        this.handleLogin = this.handleLogin.bind(this);

        this.state = {
            loginNif: '',
        };
    }

    handleLoginNifChange(e) {
        this.setState({loginNif: e.target.value});
    }

    handleLogin(e, nif) {
        e.preventDefault();
        console.log("handleLogin2");
        fetch('http://localhost:8083/rest/brokers/login?brokerCode=' + this.props.getAuthState().broker +
            '&nif=' + nif)

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
                    document.getElementById('errorLogin').innerHTML = "NIF inserted isn't registered";
                }
                else {
                    document.getElementById('errorLogin').innerHTML = "";
                    document.getElementById('closeLoginModal').click();
                    this.props.setAuthState(true, JSON.parse(body).nif, JSON.parse(body).iban, JSON.parse(body).age, JSON.parse(body).drivinglicense);
                    this.props.calculateBalance();
                }
            }).catch(function(error) {
            document.getElementById('errorLogin').innerHTML = "Something went wrong. Try again later.";
        });
    }

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
                            <form id="loginform" onSubmit={(e) => this.handleLogin(e, this.state.loginNif)}>
                                <div className="modal-body">
                                    <div id="errorLogin" style={{ color: 'red', fontSize: 'small'}}></div>
                                    <div className="form-group">
                                        <input type="text" className="form-control" name="NIF" placeholder="NIF"
                                               required="required" onChange={this.handleLoginNifChange}></input>
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