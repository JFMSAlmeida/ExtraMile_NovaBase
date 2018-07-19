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
            product: null,
            auth: false,
            broker: 'B100',
            nif: '',
            iban: '',
            age: '',
            drivinglicense: '',
            balance: '',
        };

        this.addProduct = this.addProduct.bind(this);
        this.setAuthState = this.setAuthState.bind(this);
        this.getAuthState = this.getAuthState.bind(this);
        this.calculateBalance = this.calculateBalance.bind(this);
    }

    addProduct(product){
        this.setState({
            product : product
        });
        console.log(product);
    }

    resetProduct() {
        console.log("E QUEM NÃO SALTA NÃO É DA MALTA");
        this.setState({
            product : null
        });

    setAuthState(auth, nif, iban, age, dl) {
        this.setState({
            auth: auth,
            nif: nif,
            iban: iban,
            age: age,
            drivinglicense: dl},() => { console.log('new state Auth = ', this.state); });
    }

    getAuthState() {
        return this.state;
    }


    calculateBalance() {
        console.log("handleBalance");
        this.setState({balance: 'Fetching...'});

        fetch('http://localhost:8082/rest/banks/balance?iban=' + this.getAuthState().iban)
            .then(response => {
                return response.text();
            })
            .then(body => {
                if (JSON.parse(body).success)
                    this.setState({balance: JSON.parse(body).balance});
                else {
                    this.setState({balance: "Invalid IBAN"});
                }
            })
            .catch(() => {
                this.setState({balance: "Error"});
            });
    }

    render() {
        return (
            <div>
                <Header
                    history={history}
                    product = {this.state.product}
                    resetProduct = {() => this.resetProduct()}
                    setAuthState = {this.setAuthState}
                    getAuthState = {this.getAuthState}
                    calculateBalance = {this.calculateBalance}
                />

                <Route exact path='/' component={Home} history={history}/>
                <Route path='/adventurebuilder' render={()=><AdventureBuilder addCart = {product => this.addProduct(product)} />}/>
                <Route path='/adventurebuilder0' component={AdventureBuilder0} />
                <Route path='/adventurebuilder1' component={AdventureBuilder1} />
                <Route path='/adventurebuilder2' component={AdventureBuilder2} />
                <Route path='/adventurebuilder3' component={AdventureBuilder3} />
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