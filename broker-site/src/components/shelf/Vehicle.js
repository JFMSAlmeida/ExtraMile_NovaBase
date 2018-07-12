import React from 'react';

const Vehicle = (props) => {

	const vehicle = props.vehicle;


	return (
		<div className="shelf-item" data-sku={vehicle.rentACarCode}>
			<div className="shelf-item__main_info">
				<p className="shelf-item__title"> {vehicle.plate} </p>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {vehicle.price}</b><small>€</small>
                    </div>
           		</div>
           		<p> RentACar: {vehicle.rentACarName} </p>
           		<p> Kilometers: {vehicle.kilometers} </p>
           	</div>
           	<p className="shelf-item__buy-btn" /*onClick={props.addCart}*/> Add to adventure </p>
		</div>
	);
}

export default Vehicle;
