import React from 'react'
import {Route} from 'react-router-dom'
import AdventureBuilder from "./AdventureBuilder";
import AdventureBuilder0 from "./AdventureBuilder0";
import AdventureBuilder1 from "./AdventureBuilder1";
import AdventureBuilder2 from "./AdventureBuilder2";
import AdventureBuilder3 from "./AdventureBuilder3";
import AdventureFinder from "./AdventureFinder";
import Options from "./Options";
import Home from "./Home";
import createBrowserHistory from 'history/createBrowserHistory'
import Header from "../components/header/Header";
import Payment from "../components/checkout/Payment";
import Checkout from "../components/checkout/Checkout";
import Footer from "../components/Footer";
import About from "../containers/About";
import Faq from "../containers/Faq"
import $ from "jquery";

const history = createBrowserHistory();

class App extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            product:null,
            hasCar : false,
            hasRoom : false
        };

        this.addProduct = this.addProduct.bind(this);
        this.resetProduct = this.resetProduct.bind(this);
        this.updateSpecs = this.updateSpecs.bind(this);
    }

    addProduct(product){
        this.setState({
            product : product
        });
        console.log(product);
    }
    resetProduct(){
        console.log("E QUEM NÃO SALTA NÃO É DA MALTA");
        this.setState({
            product : null
        });
    }
    updateSpecs(hasCar, hasRoom){
        this.setState({
            hasCar : hasCar,
            hasRoom : hasRoom
        })
    }


    render() {

        $(document).ready(
            function() {

                SizeTheTopToolbar();

                $(window).resize(function() {
                    SizeTheTopToolbar();
                });
            });

        function SizeTheTopToolbar() {
            var viewportWidth = $(window).width();
            var viewportHeight = $(window).height();
        }

        return (
            <div>
                <Header
                    history={history}
                    product = {this.state.product}
                    hasCar = {this.state.hasCar}
                    hasRoom = {this.state.hasRoom}
                    resetProduct = {() => this.resetProduct()}
                />

                <Route exact path='/' component={Home} history={history}/>
                <Route path='/adventurebuilder' render={()=><AdventureBuilder addCart = {product => this.addProduct(product)} updateSpecs = {this.updateSpecs} />}/>
                <Route path='/adventurebuilder0' component={AdventureBuilder0} />
                <Route path='/adventurebuilder1' render={()=><AdventureBuilder1 addCart = {product => this.addProduct(product) }/>} />
                <Route path='/adventurebuilder2' render={()=><AdventureBuilder2 addCart = {product => this.addProduct(product) }/>} />
                <Route path='/adventurebuilder3' render={()=><AdventureBuilder addCart = {product => this.addProduct(product) }/>} />
                <Route path='/adventurefinder' render={()=><AdventureFinder addCart = {product => this.addProduct(product)}/>}/>
                <Route path='/checkout' component={Checkout} history={history}/>
                <Route path='/payment' component={Payment} history={history}/>
                <Route path='/options' component={Options} history={history}/>
                <Route path='/about' component={About} history={history}/>
                <Route path='/faq' component={Faq} history={history}/>
                <Footer/>
            </div>
        );
    }
}

export default App;