import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureFinder from "./AdventureFinder";
import Signup from "./Signup";
import Home from "./Home";
import createBrowserHistory from 'history/createBrowserHistory'
import Header from "../components/Header";
import Checkout from "../components/checkout/Checkout";
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
                <Route path='/adventurefinder' render={()=><AdventureFinder addCart = {product => this.addProduct(product)}/>}/>
                <Route path='/adventurebuilder' component={AdventureBuilder} history={history}/>
                <Route path='/signup' component={Signup} history={history}/>
                <Route path='/checkout' component={Checkout} />
            </div>
        );
    }
}

export default App;