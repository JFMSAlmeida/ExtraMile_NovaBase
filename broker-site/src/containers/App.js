import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureFinder from "./AdventureFinder";
import Options from "./Options";
import Signup from "./Signup";
import Home from "./Home";
import createBrowserHistory from 'history/createBrowserHistory'
import Header from "../components/Header";
const history = createBrowserHistory();

class App extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            product:null
        };

        this.addProduct = this.addProduct.bind(this);
    }

    addProduct(product){
        this.setState({
            product : product
        });
        console.log(product);
    }


    render() {

        return (
            <div>
                <Header
                    history={history}
                    product = {this.state.product}
                />
                <Route exact path='/' component={Home} history={history}/>
                <Route path='/adventurefinder' render={()=><AdventureFinder addCart = {product => this.addProduct(product)} a = {10}/>}/>
                <Route path='/adventurebuilder' component={AdventureBuilder} history={history}/>
                <Route path='/signup' component={Signup} history={history}/>
                <Route path='/options' component={Options} history={history}/>
            </div>
        );
    }
}

export default App;