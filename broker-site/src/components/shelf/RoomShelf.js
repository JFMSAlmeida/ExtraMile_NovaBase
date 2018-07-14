import React, { Component } from 'react';
import Room from './Room';

class RoomShelf extends Component {


	render() {
		const room = this.props.rooms;
		console.log(room);

		const roomArray = room.map((r,index) => {
			return(
				<Room
					process = {this.props.process}
					room = {r}
					key = {index}
					activity = {this.props.activity}
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