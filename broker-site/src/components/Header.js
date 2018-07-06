import React from 'react'
import {Link} from 'react-router-dom'
import avatar from '../components/avatar.png'

// The Header creates links that can be used to navigate
// between routes.
export default class Header extends React.Component {
    constructor(props){
        super(props);
        this.handleLogin = this.handleLogin.bind(this);
        this.handleSignUp = this.handleSignUp.bind(this);

        this.handleLoginNifChange = this.handleLoginNifChange.bind(this);

        this.handleSignUpNifChange = this.handleSignUpNifChange.bind(this);
        this.handleIBANChange = this.handleIBANChange.bind(this);
        this.handleAgeChange = this.handleAgeChange.bind(this);
        this.handleDrivingLicenseChange = this.handleDrivingLicenseChange.bind(this);
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
        console.log(this.state.signupNif);
        console.log(this.state.signupIBAN);
        console.log(this.state.signupAge);
        console.log(this.state.signupDrivingLicense);
        document.getElementById('errorSignUp').innerHTML = "Error: It was not possible to create the client"
    }

    handleLogin(e) {
        e.preventDefault(); /*
        fetch('http://localhost:8083/rest/brokers/echo?request=ola')
            .then(response => {
                return response.text();
            })
            .then(body => {
                if (JSON.parse(body).success) {
                    //ativar variavel global authenticated e mudar o header
                    console.log("ola");
                    this.props.history.push('/');
                }
                else {
                    console.log("adeus");
                    document.getElementById('errorLogin').innerHTML = "Error: Inserted NIF isn't registered"
                }
            });*/
        console.log(this.state.loginNif);
        document.getElementById('errorLogin').innerHTML = "Error: Inserted NIF isn't registered"
    }

    render(){
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
                        <li data-toggle="modal" data-target="#signupModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Sign Up</Link></li>
                        <li data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Login</Link></li>
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
                          <form onSubmit={this.handleSignUp}>
                              <div className="modal-body">
                                  <div id="errorSignUp" style={{color: 'red', fontSize: 'small'}}></div>
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
                              <button type="button" className="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                          </div>
                          <form onSubmit={this.handleLogin}>
                              <div className="modal-body">
                                  <div id="errorLogin" style={{color: 'red', fontSize: 'small'}}></div>
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