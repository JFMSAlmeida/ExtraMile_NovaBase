import React, { Component } from 'react';
import Room from './Room';

class RoomShelf extends Component {


	render() {
		const room = this.props.rooms;

		const roomArray = room.map((r,index) => {
			return(
				<Room
					room = {r}
					key = {index}
                    updateRoom={() => this.props.updateRoom(r)}
				/>
			);
		});


        return (
            <div>
                {room.length === 0 && this.props.getLoading() == false ?
                    <div style={{textAlign: 'center'}}>
                        <br/><br/><br/>
                        <h3>
                            No Rooms available in this period.
                            Please select another period.
                        </h3>
                    </div>
                    :
                    <React.Fragment>
						<div className="shelf-container">
							{roomArray}
						</div>
                    </React.Fragment>
                }
            </div>
        );


	}
}


export default RoomShelf;