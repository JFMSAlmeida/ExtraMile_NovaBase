import React from 'react'
import { Switch, Route } from 'react-router-dom'
import Home from './Home'
import AdventureFinder from './AdventureFinder'
import AdventureBuilder from './AdventureBuilder'
import Signup from './Signup'

class Main extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
        return (
          <main>
            <Switch>
              <Route exact path='/' component={Home}/>
              <Route path='/adventurefinder' component={AdventureFinder}/>
              <Route path='/adventurebuilder' component={AdventureBuilder}/>
              <Route path='/signup' component={Signup}/>
            </Switch>
          </main>
        );
    }
}

export default Main
