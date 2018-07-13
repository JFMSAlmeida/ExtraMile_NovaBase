import React, { Component } from 'react';
import Vehicle from './Vehicle';

class VehicleShelf extends Component {

	constructor(props) {
        super(props);
    }


	render() {
		const vehicle = this.props.vehicles;
		console.log(vehicle);

		const vehicleArray = vehicle.map(vehicle => {
			return(
				<Vehicle
					process = {this.props.process}
					vehicle = {vehicle}
					key = {vehicle.rentACarCode}
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