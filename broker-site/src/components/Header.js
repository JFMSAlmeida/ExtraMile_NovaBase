import React from 'react'
import {Link} from 'react-router-dom'
import avatar from '../components/avatar.png'

// The Header creates links that can be used to navigate
// between routes.
export default class Header extends React.Component {
    constructor(props){
        super(props);
        this.handleLogin = this.handleLogin.bind(this);
    }

    handleLogin(e) {
        e.preventDefault();
        fetch('http://localhost:8083/rest/brokers/echo?request=ola')
            .then(response => {
                return response.text();
            })
            .then(body => {
                if (JSON.parse(body).success)
                //ativar variavel global authenticated e mudar o header
                    console.log("ola");
                else {
                    console.log("adeus");
                    //this.context.router.push('/');
                }
            });
        }

    render(){
        return (
          <div className="headerContainer">
              <header>
                <nav className="navbar navbar-inverse">
                  <ul className="nav navbar-nav">
                    <a className="navbar-brand">ExtraMile</a>
                    <li id="Home"><Link to='/'>Home</Link></li>
                    <li id="AdventureFinder"><Link to='/adventurefinder'>AdventureFinder</Link></li>
                    <li id="AdventureBuilder"><Link to='/adventurebuilder'>AdventureBuilder</Link></li>
                  </ul>
                    <ul className="nav navbar-nav navbar-right">
                        <li><Link to='/signup'><span className="glyphicon glyphicon-user"></span> Sign Up</Link></li>
                        <li data-toggle="modal" data-target="#myModal"><Link to={'/'}><span className="glyphicon glyphicon-log-in"></span> Login</Link></li>
                    </ul>
                </nav>
              </header>

              <div id="myModal" className="modal fade">
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
                                  <div className="form-group">
                                      <input type="text" className="form-control" name="username" placeholder="Client Id"
                                             required="required"></input>
                                  </div>
                                  <div className="form-group">
                                      <button type="submit" className="btn btn-primary btn-lg btn-block login-btn">Login
                                      </button>
                                  </div>
                              </div>
                          </form>
                          <div className="modal-footer">
                              <a onClick="#closemodal"><Link to='/signup'>Not registered? Sign Up</Link></a>
                          </div>
                      </div>
                  </div>
              </div>

          </div>
        );
    }
}