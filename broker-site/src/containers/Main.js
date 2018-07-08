import React from 'react'
import { Switch, Route } from 'react-router-dom'
import Home from './Home'
import AdventureFinder from './AdventureFinder'
import AdventureBuilder from './AdventureBuilder'
import About from './About'
import Faq from './Faq'

const Main = () => (
  <main>
    <Switch>
      <Route exact path='/' component={Home}/>
      <Route path='/adventurefinder' component={AdventureFinder}/>
      <Route path='/adventurebuilder' component={AdventureBuilder}/>
      <Route path='/about' component={About}/>
      <Route path='/faq' component={Faq}/>
    </Switch>
  </main>
)

export default Main
