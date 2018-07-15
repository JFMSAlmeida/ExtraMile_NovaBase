import React, { Component } from 'react';
import Vehicle from './Vehicle';

class VehicleShelf extends Component {


	render() {
		const vehicle = this.props.vehicles;
		console.log(vehicle);

		const vehicleArray = vehicle.map((v,index) => {
			return(
				<Vehicle
					process = {this.props.process}
					vehicle = {v}
					key = {index}
					room = {this.props.room}
				/>
			);
		});



        return (
            <React.Fragment>
                <div className="shelf-container">
                    {vehicleArray}
                </div>
            </React.Fragment>
        );


	}
}


export default VehicleShelf;