import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureBuilder1 from "./AdventureBuilder1";
import AdventureBuilder2 from "./AdventureBuilder2";
import AdventureBuilder3 from "./AdventureBuilder3";
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
                <Route path='/adventurebuilder' render={()=><AdventureBuilder addCart = {product => this.addProduct(product)} a = {10}/>}/>
                <Route path='/signup' component={Signup} history={history}/>
                <Route path='/options' component={Options} history={history}/>
                <Route path='/adventurebuilder1' component={AdventureBuilder1} render={()=><AdventureBuilder1 />}/>
                <Route path='/adventurebuilder2' component={AdventureBuilder2} render={()=><AdventureBuilder2 />}/>
                <Route path='/adventurebuilder3' component={AdventureBuilder3} render={()=><AdventureBuilder3 />}/>

            </div>
        );
    }
}

export default App;