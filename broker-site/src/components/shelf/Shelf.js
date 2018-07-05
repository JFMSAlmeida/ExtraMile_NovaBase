import React, { Component } from 'react';
import Product from './Product';


class Shelf extends Component {
    constructor(props){
        super(props);
        this.state = {adventures: []};
    }

    componentWillMount() {
        fetch('http://localhost:8083/rest/brokers/showAdventures?param1=B100&param2=111111115')
            .then(response => {
                console.log(response);
                return response.text();
            })
            .then(body => {
                console.log(body);
                this.setState({adventures: JSON.parse(body)});
                console.log(this.state);
            });
    }

    render(){
        const adventures = this.state;
        const {adv} = adventures;
        console.log(adventures);
        console.log(adv);

        const advArray = adv.map(adv => {
            return <Product product={adv} key={adv.id}/> ;
        });

        return (
            <React.Fragment>
                <div className="shelf-container">
                    {advArray}
                </div>
            </React.Fragment>
        )

    }
}

export default Shelf;