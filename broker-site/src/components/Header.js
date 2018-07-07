import React from 'react'
import {Link} from 'react-router-dom'
import avatar from '../components/avatar.png'
import $ from 'jquery';

// The Header creates links that can be used to navigate
// between routes.
export default class Header extends React.Component {
    constructor(props){
        super(props);
        this.handleLogin = this.handleLogin.bind(this);
        this.handleLogout = this.handleLogout.bind(this);
        this.handleSignUp = this.handleSignUp.bind(this);

        this.handleLoginNifChange = this.handleLoginNifChange.bind(this);

        this.handleSignUpNifChange = this.handleSignUpNifChange.bind(this);
        this.handleIBANChange = this.handleIBANChange.bind(this);
        this.handleAgeChange = this.handleAgeChange.bind(this);
        this.handleDrivingLicenseChange = this.handleDrivingLicenseChange.bind(this);

        this.state = {
            auth: false,
            nif: '',
            iban: '',
            age: '',
            drivinglicense: ''
        };
    }

    render(){
        $("#resetModal1").click(function () {
            $('#signupform')[0].reset();
            $('#loginform')[0].reset();
            $('#errorSignUp').empty();
            $('#successSignUp').empty();
        });
        $("#resetModal2").click(function () {
            $('#signupform')[0].reset();
            $('#loginform')[0].reset();
            $('#errorLogin').empty();
        });

        return (
          <div className="headerContainer">
              <header>
                <nav className="navbar navbar-inverse">
                  <ul className="nav navbar-nav">
                    <a className="navbar-brand">ExtraMile</a>
                    <li><Link to='/'>Home</Link></li>
                    <li><Link to='/adventurefinder'>AdventureFinder</Link></li>
                    <li><Link to='/adventurebuilder'>AdventureBuilder</Link></li>
                  </ul>
                    <ul className="nav navbar-nav navbar-right">
                        { !this.state.auth ? <li id="resetModal1" data-toggle="modal" data-target="#signupModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Sign Up</Link></li> : null}
                        { !this.state.auth ? <li id="resetModal2" data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Login</Link></li> : null }
                        { this.state.auth ? <div className="dropdownLogin">
                                                <button className="dropbtnLogin">Welcome {this.state.nif} &nbsp;
                                                    <i className="fa fa-caret-down"></i>
                                                </button>
                                                <div className="dropdown-contentLogin">
                                                    <a href="#"><span className="glyphicon glyphicon-usd"></span>&nbsp; Balance</a>
                                                    <Link to='/options'><span className="glyphicon glyphicon-cog"></span>&nbsp; Options</Link>
                                                    <a onClick={this.handleLogout}><span className="glyphicon glyphicon-log-out"></span>&nbsp; Logout</a>
                                                </div>
                                            </div>
                                            : null }
                    </ul>
                </nav>
              </header>

              /* SIGN UP MODAL */
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
                          <form id="signupform" onSubmit={this.handleSignUp}>
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
                              <a data-dismiss="modal" data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}>Already have an account? Login</Link></a>
                          </div>
                      </div>
                  </div>
              </div>


              /* LOGIN MODAL */
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
                              <form id="loginform" onSubmit={this.handleLogin}>
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

          </div>
        );
    }

    handleLoginNifChange(e) {
        this.setState({loginNif: e.target.value});
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

    handleSignUp(e) {
        e.preventDefault();
        console.log("handleSignUp");
        fetch('http://localhost:8083/rest/brokers/signup?brokerCode=' + 'B100' +
            '&nif=' + this.state.signupNif +
            '&iban=' + this.state.signupIBAN +
            '&age=' + this.state.signupAge +
            '&dl=' + this.state.signupDrivingLicense)

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

    handleLogin(e) {
        e.preventDefault();
        console.log("handleLogin");
        fetch('http://localhost:8083/rest/brokers/login?brokerCode=' + 'B100' +
            '&nif=' + this.state.loginNif)

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
                    this.setState({ auth: true,
                        nif: JSON.parse(body).nif,
                        iban: JSON.parse(body).iban,
                        age: JSON.parse(body).age,
                        drivinglicense: JSON.parse(body).drivinglicense});
                }
            }).catch(function(error) {
            document.getElementById('errorLogin').innerHTML = "Something went wrong. Try again.";
        });
    }

    handleLogout(e) {
        console.log("logout");
        e.preventDefault();
        this.setState({
            auth: false,
            nif: '',
            iban: '',
            age: '',
            drivinglicense: ''
        });
    }
}