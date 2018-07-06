import React from 'react'
import Header from '../components/Header'
import Main from './Main'

class App extends React.Component {
    constructor(props){
        super(props);
    }
    render() {
        return (
            <div>
                <Header/>
                <Main/>
            </div>
        );
    }
}

export default App;