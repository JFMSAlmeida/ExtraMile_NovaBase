import React from 'react';
import {Link} from 'react-router-dom'

const Room = (props) => {

	const room = props.room;
	console.log(room);

	const i3 = room.hotelCode + ";" + room.number + ";" + room.type; 

	return (
		<div className="shelf-item" data-sku={room.hotelCode}>
			<div className="shelf-item__main_info">
				<p className="shelf-item__title"> {room.type} </p>
				<div className="shelf-item__price">
                    <div className="val"><b>Price: {room.price}</b><small>€</small> </div>
           		</div>
           		<p> Hotel: {room.hotelName} </p>
           		<p> Number: {room.number} </p>
           	</div>
           	<li><Link to='/adventurebuilder2' className="shelf-item__buy-btn" onClick={props.process.bind(this,i3)} >Add to adventure</Link></li>
		</div>
	);
}

export default Room;