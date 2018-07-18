import React, { Component } from 'react';
import Activity from './Activity';



class ActivityShelf extends Component {

	render() {
		const act = this.props.activities;
		console.log(act);

		const actArray = act.map((act, index) => {
				return(
					<Activity
						activity = {act}
						key = {index}
                        updateActivity={() => this.props.updateActivity(act)}
					/>
				);
		});

        return (
        	<div>
				{act.length === 0 ?
					<div>
						No activities available in this period.
					</div>
					:
					<React.Fragment>
						<div className="shelf-container">
							{actArray}
						</div>
					</React.Fragment>}
            </div>
        );


	}
}


export default ActivityShelf;