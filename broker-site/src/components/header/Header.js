import React from 'react'
import {Link, withRouter} from 'react-router-dom'
import $ from 'jquery';
import Cart from '../cart/Cart'
import Signup from './Signup'
import Login from "./Login";

// The Header creates links that can be used to navigate
// between routes.
class Header extends React.Component {
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
        this.handleInfoChange = this.handleInfoChange.bind(this);
        this.calculateBalance = this.calculateBalance.bind(this);

        this.state = {
            auth: false,
            broker: 'B100',
            nif: '',
            iban: '',
            age: '',
            drivinglicense: '',
            balance: '',
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
              <header className="header">
                <nav className="navbar navbar-inverse">
                  <ul className="nav navbar-nav">
                    <a className="navbar-brand">ExtraMile</a>
                    <li><Link to='/'>Home</Link></li>
                    <li><Link to='/adventurefinder'>Adventure Finder</Link></li>
                    <li><Link to='/adventurebuilder'>Adventure Builder</Link></li>
                  </ul>
                    <ul className="nav navbar-nav navbar-right">
                        { !this.state.auth ? <li id="resetModal1" data-toggle="modal" data-target="#signupModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Sign Up</Link></li> : null}
                        { !this.state.auth ? <li id="resetModal2" data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Login</Link></li> : null }
                        { this.state.auth ? <div className="dropdownLogin">
                                                <button className="dropbtnLogin">Welcome {this.state.nif} &nbsp;
                                                    <i className="fa fa-caret-down"></i>
                                                </button>
                                                <div className="dropdown-contentLogin">
                                                    <a><span className="glyphicon glyphicon-usd"></span>&nbsp; {this.state.balance}
                                                        <a onClick={this.calculateBalance} style={{display: 'inline', cursor: 'pointer'}}>
                                                            <span className="glyphicon glyphicon-refresh"></span>
                                                        </a>
                                                        {this.state.balance == 'Error' ?
                                                            <span className="glyphicon glyphicon-question-sign" title="Bank server is down"></span>
                                                            : null}
                                                    </a>
                                                    <Link to={{pathname:'/options', handleInfoChange: this.handleInfoChange, state:{info: this.state}}}><span className="glyphicon glyphicon-cog"></span>&nbsp; Preferences</Link>
                                                    <a href="" onClick={this.handleLogout}><span className="glyphicon glyphicon-log-out"></span>&nbsp; Logout</a>
                                                </div>
                                            </div>
                                            : null }
          
                        <Cart
                            product = {this.props.product} resetProduct = {this.props.resetProduct} hasCar = {this.state.hasCar} hasRoom = {this.state.hasRoom}
                        />
                        { !this.state.auth ? <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> : null }
                    </ul>
                </nav>
              </header>

              <Signup
                  handleSignUp = {this.handleSignUp}
                  handleSignUpNifChange = {this.handleSignUpNifChange}
                  handleIBANChange = {this.handleIBANChange}
                  handleAgeChange = {this.handleAgeChange}
                  handleDrivingLicenseChange = {this.handleDrivingLicenseChange}
                  history = {this.props.history}
              />

              <Login
                  handleLogin = {this.handleLogin}
                  handleLoginNifChange = {this.handleLoginNifChange}
                  history = {this.props.history}
              />

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
        fetch('http://localhost:8083/rest/brokers/signup?brokerCode=' + this.state.broker +
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
        fetch('http://localhost:8083/rest/brokers/login?brokerCode=' + this.state.broker +
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
                    this.calculateBalance();
                }
            }).catch(function(error) {
                document.getElementById('errorLogin').innerHTML = "Something went wrong. Try again later.";
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
            drivinglicense: '',
            balance: 'Undertermined'
        });
        this.props.history.push('/');
    }

    handleInfoChange(newIban, newAge, newDl) {
        this.setState({ iban: newIban,
                        age: newAge,
                        drivinglicense: newDl});
        /*if (str == "age")
            this.state.age
        if (str == "dl")
            this.state.drivinglicense */
    }

    async calculateBalance() {
        console.log("handleBalance");
        this.setState({balance: 'Fetching...'});

        try {
            await fetch('http://localhost:8082/rest/banks/balance?iban=' + this.state.iban)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    if (JSON.parse(body).success)
                        this.setState({balance: JSON.parse(body).balance});
                    else {
                        this.setState({balance: "Invalid IBAN"});
                    }
                });
        } catch (e) {
            this.setState({balance: "Error"});
        }
    }
}

export default withRouter(Header);