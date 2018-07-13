import React from 'react';
import AdventureBuilder1 from '../../containers/AdventureBuilder1'
import {Route} from 'react-router-dom'
import {Link} from 'react-router-dom'



const Activity = (props) => {

	const activity = props.activity;

	const i3 = activity.providerCode + ";" + activity.activityCode


	return (
		<div className="shelf-item" data-sku={activity.providerCode}>
			<div className="shelf-item__main_info">
				<p className="shelf-item__title"> {activity.name} </p>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {activity.price}</b><small>€</small>
                    </div>
           		</div>
           		<p> Provider: {activity.providerName} </p>
           		<p> Minimum Age: {activity.minAge} </p>
           		<p> Maximum Age: {activity.maxAge} </p>
           		<p> Capacity: {activity.capacity} </p>
                <p> Begin Date: {activity.begin[2]}/{activity.begin[1]}/{activity.begin[0]}</p>
                <p> End Date: {activity.end[2]}/{activity.end[1]}/{activity.end[0]}</p>
           	</div>
           	<li><Link to='/adventurebuilder1' className="shelf-item__buy-btn" onClick={props.process.bind(this,i3)} >Add to adventure</Link></li>
			
		</div>
	);
}

export default Activity;

/*	<p className="shelf-item__buy-btn" onClick={props.process.bind(this,i3)}> Add to adventure </p>
*/