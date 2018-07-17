import React from 'react';
import { Link } from 'react-router-dom'


const Vehicle = (props) => {

	const vehicle = props.vehicle;
	const i3 = vehicle.plate + ";" + vehicle.rentACarCode;
	console.log("VEHICLE " + props.addCart);
	/*const info = {
		pathname:'/adventurebuilder3',
		activityName: props.room.activityName,
		begin: props.room.begin,
		end: props.room.end,
		age: props.room.age,
		hasRoom: props.room.hasRoom,
		hotelName: props.room.hotelName,
		roomNumber: props.room.roomNumber,
		roomType: props.room.roomType,
		hasVehicle: true,
		vehicleType: vehicle.type,
		kilometers: vehicle.kilometers,
		addCart: props.room.addCart
	};

	console.log(info);*/

	return (
		<div className="shelf-item" data-sku={vehicle.rentACarCode}>
			<div className="shelf-item__main_info">
				<p className="shelf-item__title"> {vehicle.type}: {vehicle.plate} </p>
                <img className="shelf-item__image" src={require(`./B1001.jpg`)} alt={vehicle.rentACarCode}/>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {vehicle.price}</b><small>€</small>
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
