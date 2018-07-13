import React, { Component } from 'react';
import Room from './Room';

class RoomShelf extends Component {

	constructor(props) {
        super(props);
    }


	render() {
		const room = this.props.rooms;
		console.log(room);

		const roomArray = room.map(room => {
			return(
				<Room
					process = {this.props.process}
					room = {room}
					key = {room.hotelCode}
				/>
			);
		});


        return (
            <React.Fragment>
                <div className="shelf-container">
                    {roomArray}
                </div>
            </React.Fragment>
        );


	}
}


export default RoomShelf;