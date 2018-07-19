import React, { Component } from 'react';
import Activity from './Activity';



class ActivityShelf extends Component {

	render() {
		const act = this.props.activities;

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
					<div style={{textAlign: 'center'}}>
                        <br/><br/><br/>
						<h3>
							No activities available in this period.
							Please select another period.
						</h3>
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