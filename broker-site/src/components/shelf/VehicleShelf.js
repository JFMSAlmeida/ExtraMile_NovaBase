import React, { Component } from 'react';
import Vehicle from './Vehicle';

class VehicleShelf extends Component {


	render() {
		const vehicle = this.props.vehicles;

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
            <div>
                {vehicle.length === 0 && this.props.getLoading() == false ?
                    <div style={{textAlign: 'center'}}>
                        <br/><br/><br/>
                        <h3>
                            No Vehicles available.
                        </h3>
                    </div>
					:
					<React.Fragment>
						<div className="shelf-container">
							{vehicleArray}
						</div>
					</React.Fragment>}
			</div>

        );


	}
}


export default VehicleShelf;