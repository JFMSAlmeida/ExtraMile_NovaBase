import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureFinder from "./AdventureFinder";
import Options from "./Options";
import Signup from "./Signup";
import Home from "./Home";
import createBrowserHistory from 'history/createBrowserHistory'
import Header from "../components/Header";
import Footer from './Footer'
import About from './About'
import Faq from './Faq'
import { library } from '@fortawesome/fontawesome-svg-core'
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faMapMarkerAlt } from '@fortawesome/free-solid-svg-icons'
import { faEnvelope} from '@fortawesome/free-solid-svg-icons'
import { faPhone} from '@fortawesome/free-solid-svg-icons'
library.add(faMapMarkerAlt)
library.add(faEnvelope)
library.add(faPhone)

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
                <Footer />
                <Route exact path='/' component={Home} history={history}/>
                <Route path='/adventurefinder' render={()=><AdventureFinder addCart = {product => this.addProduct(product)} a = {10}/>}/>
                <Route path='/adventurebuilder' component={AdventureBuilder} history={history}/>
                <Route path='/signup' component={Signup} history={history}/>
                <Route path='/options' component={Options} history={history}/>
                <Route path='/about' component={About}/>
                <Route path='/faq' component={Faq}/>
            </div>
        );
    }
}

export default App;