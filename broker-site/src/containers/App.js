import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureFinder from "./AdventureFinder";
import Signup from "./Signup";
import Home from "./Home";
import createBrowserHistory from 'history/createBrowserHistory'
import Header from "../components/Header";
const history = createBrowserHistory();

class App extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
        return (
            <div>
                <Header history={history}/>
                <Route exact path='/' component={Home} history={history}/>
                <Route path='/adventurefinder' component={AdventureFinder} history={history}/>
                <Route path='/adventurebuilder' component={AdventureBuilder} history={history}/>
                <Route path='/signup' component={Signup} history={history}/>
            </div>
        );
    }
}

export default App;