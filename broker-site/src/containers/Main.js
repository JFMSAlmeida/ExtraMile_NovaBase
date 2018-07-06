import React from 'react'
import { Switch, Route } from 'react-router-dom'
import Home from './Home'
import AdventureFinder from './AdventureFinder'
import AdventureBuilder from './AdventureBuilder'

const Main = () => (
  <main>
    <Switch>
      <Route exact path='/' component={Home}/>
      <Route path='/adventurefinder' component={AdventureFinder}/>
        <Route path='/adventurebuilder' component={AdventureBuilder}/>
    </Switch>
  </main>
)

export default Main
