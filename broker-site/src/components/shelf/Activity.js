import React from 'react';

const Activity = (props) => {

	const activity = props.activity;

	return (
		<div className="shelf-item" data-sku={activity.providerCode}>
			<div className="shelf-item__main_info">
				<img className="shelf-item__image" src={require(`./B1001.jpg`)} alt={activity.providerCode}/>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {activity.activityPrice}€</b></div>
           		</div>
                <p> Activity Name: {activity.title} </p>
           		<p> Provider: {activity.providerName} </p>
           		<p> Minimum Age: {activity.minAge} </p>
           		<p> Maximum Age: {activity.maxAge} </p>
           		<p> Capacity: {activity.capacity} </p>
                <p> Begin Date: {activity.begin[2]}/{activity.begin[1]}/{activity.begin[0]}</p>
                <p> End Date: {activity.end[2]}/{activity.end[1]}/{activity.end[0]}</p>
           	</div>
            {!props.noAddCart && <p className="shelf-item__buy-btn" onClick={props.updateActivity}> Add Activity </p>}
			
		</div>
	);
}

export default Activity;
