import React, { Component } from 'react';
import Product from './Product';
import Filter from './Filter'
import Order from './Order'

const availableFilters = [
    'With Hotel',
    'With Vehicle',
];

const sortBy = [
    { value: '',           label: 'Select'  },
    { value: 'lowestprice', label: 'Lowest to highest Price' },
    { value: 'highestprice', label: 'Highest to lowest Price' },
    { value: 'alphabetical', label: 'Alphabetical'}
]

class Shelf extends Component {

    constructor(props){
        super(props);

        this.state = {
            adventures : this.props.adventures,
            filteredAdventures : this.props.adventures,
            value : ""
        }

        this.selectedFilters = new Set();

        this.filterAdventures = this.filterAdventures.bind(this);
        this.orderAdventures = this.orderAdventures.bind(this);

    }

    componentWillReceiveProps() {
        this.setState({
            adventures : this.props.adventures,
            filteredAdventures : this.props.adventures
        })
    }

    filterAdventures(label){
        if (this.selectedFilters.has(label)) {
            this.selectedFilters.delete(label);
        } else {
            this.selectedFilters.add(label);
        }
        var filteredAdventures = this.state.adventures.slice(0);

        this.selectedFilters.forEach(function(value){
            for(let i = filteredAdventures.length-1; i >= 0; i--) {
                if (value === "With Vehicle")
                    if (!filteredAdventures[i].hasVehicle)
                        filteredAdventures.splice(i, 1);

                if (value === "With Hotel")
                    if (!filteredAdventures[i].hasRoom)
                        filteredAdventures.splice(i, 1);
            }
        }, this);

        this.setState({filteredAdventures : filteredAdventures}, () => {this.orderAdventures(this.state.value)});
    }

    orderAdventures(value){
        this.setState({ value : value});

        var orderedAdventures =  this.state.filteredAdventures.slice(0);
        if(value === 'lowestprice'){
            orderedAdventures.sort(function(a, b) {
                return a.price - b.price;
            });
        }

        if(value === 'highestprice'){
            orderedAdventures.sort(function(a, b) {
                return b.price - a.price;
            });
        }

        if(value === 'alphabetical'){
            orderedAdventures.sort(function(a, b) {
                if (a.activityName < b.activityName) {
                    return -1;
                }
                if (a.activityName > b.activityName) {
                    return 1;
                }
                return 0;
            });

        }
        this.setState({
            filteredAdventures : orderedAdventures
        });
    }

    render(){
        var adv;
        var advArray;
        if(this.state.filteredAdventures.length > 0){
            adv = this.state.filteredAdventures;

            advArray = adv.map(adv => {
                return (
                    <Product
                        product={adv}
                        addCart={() => this.props.addCart(adv)}
                        key={adv.id}
                    />
                );
            });
        }

        return (
            <React.Fragment>
                <div>

                    {!this.props.loading ? 
                        <div className="filtersFinder">
                            <Filter
                            availableFilters = {availableFilters}
                            filterFunction = {label => this.filterAdventures(label)}
                        /> </div> : null } 

                    {!this.props.loading ? <Order
                        options = {sortBy}
                        handleOnChange = {this.orderAdventures}
                    /> : null }
                    <div className="shelf-container">
                        {advArray}
                    </div>
                </div>
            </React.Fragment>
        )

    }
}

export default Shelf;
