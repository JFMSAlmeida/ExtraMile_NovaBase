import React, {Component} from 'react';
import Checkbox from './Checkbox'

class Filter extends Component {

    constructor(props){
        super(props);

        this.createCheckboxes = this.createCheckboxes.bind(this);
    }

    createCheckbox = (label) => {
        return(
            <Checkbox
                label = {label}
                filterFunction = {() => this.props.filterFunction(label)}
            />
        )
    }


    createCheckboxes = () => {
        return this.props.availableFilters.map(this.createCheckbox);
    }

    render() {
        return (
            <div className="filters">
                <h4 className="title"><b>Filter:</b></h4>
                <div className="checkboxes">
                    {this.createCheckboxes()}
                </div>
            </div>
        );
    }
}

export default Filter;