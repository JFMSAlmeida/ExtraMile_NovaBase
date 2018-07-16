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
        this.handleLogout = this.handleLogout.bind(this);
        this.handleInfoChange = this.handleInfoChange.bind(this);
    }

    render(){
        $("#resetModal1").click(function () {
            //clear modal after dismiss
            $('#signupform')[0].reset();
            $('#loginform')[0].reset();
            $('#errorSignUp').empty();
            $('#successSignUp').empty();
        });
        $("#resetModal2").click(function () {
            //clear modal after dismiss
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

                    { !this.props.getAuthState().auth ?
                        <ul className="nav navbar-nav navbar-right">
                            <li id="resetModal1" data-toggle="modal" data-target="#signupModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Sign Up</Link></li>
                            <li id="resetModal2" data-toggle="modal" data-target="#loginModal"><Link to={this.props.history}><span className="glyphicon glyphicon-log-in"></span> Login</Link></li>
                            <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                        </ul>
                        :
                        <ul className="nav navbar-nav navbar-right">
                        <div className="dropdownLogin">
                            <button className="dropbtnLogin">Welcome {this.props.getAuthState().nif} &nbsp;
                                <i className="fa fa-caret-down"></i>
                            </button>
                            <div className="dropdown-contentLogin">
                                <a>
                                    <span className="glyphicon glyphicon-usd"></span>&nbsp; {this.props.getAuthState().balance}
                                    <a onClick={this.props.calculateBalance} style={{display: 'inline', cursor: 'pointer'}}>
                                        <span className="glyphicon glyphicon-refresh"></span>
                                    </a>
                                    {this.props.getAuthState.balance == 'Error' ?
                                        <span className="glyphicon glyphicon-question-sign" title="Bank server is down"></span>
                                        : null}
                                </a>
                                <Link to={{pathname:'/options', handleInfoChange: this.handleInfoChange, calculateBalance: this.props.calculateBalance, state:{info: this.props.getAuthState()}}}><span className="glyphicon glyphicon-cog"></span>&nbsp; Preferences</Link>
                                <a href="" onClick={this.handleLogout}><span className="glyphicon glyphicon-log-out"></span>&nbsp; Logout</a>
                            </div>
                        </div>
                        </ul>
                    }

                    <Cart
                        product = {this.props.product}
                    />
                </nav>
              </header>

              <Signup
                  history = {this.props.history}
                  getAuthState = {this.props.getAuthState}
                  setAuthState = {this.props.setAuthState}
              />

              <Login
                  history = {this.props.history}
                  getAuthState = {this.props.getAuthState}
                  setAuthState = {this.props.setAuthState}
                  calculateBalance = {this.props.calculateBalance}
              />

          </div>
        );
    }

    handleLogout(e) {
        console.log("logout");
        e.preventDefault();
        this.props.setAuthState(false, '', '', '', '');
        this.props.history.push('/');
    }

    handleInfoChange(newIban, newAge, newDl) {
        this.props.setAuthState(true, this.props.getAuthState().nif, newIban, newAge, newDl);
    }
}

export default withRouter(Header);