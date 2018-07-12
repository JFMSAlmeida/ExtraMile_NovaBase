import React from 'react';

const Room = (props) => {

	const room = props.room;
	console.log("hey");
	console.log(room);


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
           	<p className="shelf-item__buy-btn" /*onClick={props.addCart}*/> Add to adventure </p>
		</div>
	);
}

export default Room;