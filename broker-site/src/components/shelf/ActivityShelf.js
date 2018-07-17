import React, { Component } from 'react';
import Activity from './Activity';



class ActivityShelf extends Component {


	render() {
		const act = this.props.activities;
		console.log(act);

		const actArray = act.map((act, index) => {
				return(
					<Activity
						//process = {this.props.process}
						activity = {act}
						key = {index}
                        addCart={() => this.props.addCart(act)}

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