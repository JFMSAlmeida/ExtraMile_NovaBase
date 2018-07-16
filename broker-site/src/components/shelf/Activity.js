import React from 'react';
import { Link } from 'react-router-dom'



const Activity = (props) => {

	const activity = props.activity;

	const i3 = activity.providerCode + ";" + activity.activityCode

	/*const info = {
		pathname:'/adventurebuilder1',
		activityName: activity.name,
		begin: activity.begin,
		end: activity.end,
		age: activity.minAge,
		addCart: props.addCart

	};

	console.log(info);*/

	return (
		<div className="shelf-item" data-sku={activity.providerCode}>
			<div className="shelf-item__main_info">
				<img className="shelf-item__image" src={require(`./B1001.jpg`)} alt={activity.providerCode}/>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {activity.price}€</b></div>
           		</div>
                <p> Activity Name: {activity.title} </p>
           		<p> Provider: {activity.providerName} </p>
           		<p> Minimum Age: {activity.minAge} </p>
           		<p> Maximum Age: {activity.maxAge} </p>
           		<p> Capacity: {activity.capacity} </p>
                <p> Begin Date: {activity.begin[2]}/{activity.begin[1]}/{activity.begin[0]}</p>
                <p> End Date: {activity.end[2]}/{activity.end[1]}/{activity.end[0]}</p>
           	</div>
            <p className="shelf-item__buy-btn" onClick={props.addCart}> Add to cart </p>
			
		</div>
	);
}

export default Activity;

/*


<Link to={{pathname:'/options', handleInfoChange: this.handleInfoChange, state:{info: this.state}}}>
<span className="glyphicon glyphicon-cog"></span>&nbsp; Preferences</Link>

*/