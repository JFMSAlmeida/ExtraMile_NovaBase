import React, { Component } from 'react';
import Vehicle from './Vehicle';

class VehicleShelf extends Component {


	render() {
		const vehicle = this.props.vehicles;
		console.log(vehicle);

		const vehicleArray = vehicle.map((v,index) => {
			return(
				<Vehicle
					vehicle = {v}
					key = {index}
					updateVehicle={() => this.props.updateVehicle(v)}
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