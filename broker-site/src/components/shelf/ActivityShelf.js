import React, { Component } from 'react';
import Activity from './Activity';



class ActivityShelf extends Component {

	constructor(props) {
        super(props);
    }


	render() {
		const act = this.props.activities;
		console.log(act);

		const actArray = act.map(act => {
				return(
					<Activity
						process = {this.props.process}
						activity = {act}
						key = {act.providerCode}
					/>
				);
		});

        return (
            <React.Fragment>
                <div className="shelf-container">
                    {actArray}
                </div>
            </React.Fragment>
        );


	}
}


export default ActivityShelf;