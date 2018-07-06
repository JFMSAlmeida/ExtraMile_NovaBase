import React from 'react'
import { Switch, Route } from 'react-router-dom'
import Home from './Home'
import AdventureFinder from './AdventureFinder'
import AdventureBuilder from './AdventureBuilder'
import Signup from './Signup'
import createBrowserHistory from 'history/createBrowserHistory'
const history = createBrowserHistory();

class Main extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
        return (
          <main>
            <Switch>
              <Route exact path='/' component={Home} history={history}/>
              <Route path='/adventurefinder' component={AdventureFinder} history={history}/>
              <Route path='/adventurebuilder' component={AdventureBuilder} history={history}/>
              <Route path='/signup' component={Signup}/>
            </Switch>
          </main>
        );
    }
}

export default Main
