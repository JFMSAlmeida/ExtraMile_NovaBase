import React from 'react';
import {Link} from 'react-router-dom'



const Activity = (props) => {

	const activity = props.activity;

	const i3 = activity.providerCode + ";" + activity.activityCode

	const info = {
		pathname:'/adventurebuilder1',
		activityName: activity.name,
		begin: activity.begin,
		end: activity.end,
		age: activity.minAge,
		addCart: props.addCart

	};

	console.log(info);

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
           	<li><Link to={info} className="shelf-item__buy-btn" onClick={props.process.bind(this,i3)} >Add to adventure</Link></li>
			
		</div>
	);
}

export default Activity;

/*


<Link to={{pathname:'/options', handleInfoChange: this.handleInfoChange, state:{info: this.state}}}>
<span className="glyphicon glyphicon-cog"></span>&nbsp; Preferences</Link>

*/