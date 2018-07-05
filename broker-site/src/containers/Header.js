import React from 'react'
import { Link } from 'react-router-dom'

// The Header creates links that can be used to navigate
// between routes.
const Header = () => (

  <div id="headerContainer">
      <header>
        <nav>
          <ul>
            <li id="Home" className="activePage"><Link to='/'>Home</Link></li>
            <li id="AdventureFinder"><Link to='/adventurefinder'>AdventureFinder</Link></li>
            <li id="AdventureBuilder"><Link to='/adventurebuilder'>AdventureBuilder</Link></li>
            <li id="Sign Up" style={{float: 'right'}}><Link to='/'>Sign Up</Link></li>
            <li id="Log In" style={{float: 'right'}}><Link to='/'>Log In</Link></li>
          </ul>
        </nav>
      </header>
  </div>

)

export default Header
