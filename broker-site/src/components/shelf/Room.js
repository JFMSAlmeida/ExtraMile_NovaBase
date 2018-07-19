import React from 'react';
import { Link } from 'react-router-dom'

const Room = (props) => {

	const room = props.room;

	return (
		<div id = {room.hotelCode + room.number} className="shelf-item" data-sku={room.hotelCode}>
			<div className="shelf-item__main_info">
				<b><p className="shelf-item__title"> {room.roomType} </p></b>
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