import React from 'react';
import { Link } from 'react-router-dom'

const Room = (props) => {

	const room = props.room;
	//console.log(room);

	const i3 = room.hotelCode + ";" + room.number + ";" + room.type; 

	/*const info = {
		pathname:'/adventurebuilder2',
		activityName: props.activity.activityName,
		begin: props.activity.begin,
		end: props.activity.end,
		age: props.activity.age,
		hasRoom: true,
		hotelName: room.hotelName,
		roomNumber: room.number,
		roomType: room.type,
		addCart: props.activity.addCart
	};

	console.log(info);*/

	return (
		<div className="shelf-item" data-sku={room.hotelCode}>
			<div className="shelf-item__main_info">
				<p className="shelf-item__title"> {room.roomType} </p>
                <img className="shelf-item__image" src={require(`./B1001.jpg`)} alt={room.hotelCode}/>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {room.roomPrice}</b><small>€</small> </div>
           		</div>
           		<p> Hotel: {room.hotelName} </p>
           		<p> Number: {room.number} </p>
           	</div>
			{!props.noAddCart && <p className="shelf-item__buy-btn" onClick={props.updateRoom}> Add Room </p>}
		</div>
	);
}

export default Room;