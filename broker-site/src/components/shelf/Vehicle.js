import React from 'react';
import { Link } from 'react-router-dom'


const Vehicle = (props) => {

	const vehicle = props.vehicle;

	return (
		<div id = {vehicle.plate} className="shelf-item" data-sku={vehicle.rentACarCode}>
			<div className="shelf-item__main_info">
            	<b><p className="shelf-item__title"> {vehicle.vehicleType}: {vehicle.plate} </p></b>
                <img className="shelf-item__image" src={require(`./B1001.jpg`)} alt={vehicle.rentACarCode}/>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {vehicle.vehiclePrice}</b><small>€/Day</small>
                    </div>
           		</div>
           		<p> RentACar: {vehicle.rentACarName} </p>
           		<p> Kilometers: {vehicle.kilometers} </p>
           	</div>
			{!props.noAddCart && <p className="shelf-item__buy-btn" onClick={props.updateVehicle}> Add Vehicle </p>}
		</div>
	);
}

export default Vehicle;
