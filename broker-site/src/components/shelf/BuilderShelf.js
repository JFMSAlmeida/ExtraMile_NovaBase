import React, { Component } from 'react';
import Activity from './Activity';
import Vehicle from './Vehicle';
import Room from './Room';

class BuilderShelf extends Component {

	constructor(props) {
        super(props);
    }


	render() {
		const act = this.props.activities;
		const room = this.props.rooms;
		const veh = this.props.vehicles;

		console.log(act);
		console.log(room);
		console.log(veh);

		const actArray = act.map(act => {
				return(
					<Activity
						process = {this.props.process}
						activity = {act}
						key = {act.providerCode}
					/>
				);
		});

		/*const roomArray = room.map(room => {
			return(
				<Room
					room = {room}
					key = {room.hotelCode}
				/>
			);
		});

		const vehArray = veh.map(veh => {
			return(
				<Vehicle
					vehicle = {veh}
					key = {veh.rentACarCode}
				/>
			);
		});

		const advArray = adv.map(adv => {
            return (
                <Product
                    product={adv}
                    addCart={() => this.props.addCart(adv)}
                    a = {this.props.a}
                    key={adv.id}
                 />
                );
        });*/

        return (
            <React.Fragment>
                <div className="shelf-container">
                    {actArray}
                </div>
            </React.Fragment>
        );


	}
}


export default BuilderShelf;