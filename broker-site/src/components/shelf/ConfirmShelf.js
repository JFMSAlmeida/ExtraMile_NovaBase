import React, { Component } from 'react';
import Activity from "./Activity";
import Room from "./Room";
import Vehicle from "./Vehicle";

class ConfirmShelf extends Component {
    constructor(props){
        super(props);

        this.createPackage = this.createPackage.bind(this);
        this.addToCart = this.addToCart.bind(this)
    }

    createPackage() {
        console.log("BODAID: " + this.props.advId);
        let adv = Object.assign(this.props.advParts[0], {"idBODA": this.props.advId});
        if (this.props.hasRoom)
            adv = Object.assign(adv, this.props.advParts[1]);
        if (this.props.hasVehicle)
            adv = Object.assign(adv, this.props.advParts[2]);

        console.log(adv);
        return adv;
    }

    async process(advId, id){
        let link = 'http://localhost:8083/rest/brokers/processPart?param1=B100';
        var size = id.length;

        for(let i = 0; i < size; i++) {
            link = link + '&param=' + id[i];
        }

        try {
            await fetch(link)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    console.log(JSON.parse(body));
                });
        } catch (e) {
            console.log("error");
        }
    }

    async addToCart(){
        let adv = this.createPackage();

        var id = [];
        var advId = this.props.advId;

        var activity = this.props.advParts[0];
        var actId = activity.providerCode + ";" + activity.activityCode + ";" + activity.capacity;

        id.push(actId);

        if (this.props.hasRoom) {
            var room = this.props.advParts[1];
            var roomId = room.hotelCode + ";" + room.roomNumber;
            id.push(roomId)
        }

        if (this.props.hasVehicle) {
            var vehicle = this.props.advParts[2];
            var vehId = vehicle.plate + ";" + vehicle.type;
            id.push(vehId);
        }

        await this.process(advId, id);

        this.props.addCart(adv);
    }

    render(){
		console.log(this.props.advParts);
		let advPartsArray = [];
        advPartsArray.push(<Activity noAddCart={1} activity = {this.props.advParts[0]} key = {this.props.advParts[0].id} />);

        if(this.props.hasRoom)
            advPartsArray.push(<Room noAddCart={1} room = {this.props.advParts[1]} key = {this.props.advParts[1].number} />);

        if(this.props.hasVehicle)
            advPartsArray.push(<Vehicle noAddCart={1} vehicle = {this.props.advParts[2]} key = {this.props.advParts[2].plate} />);

        return (
            <React.Fragment>
                <div className="shelf-container">
                    {advPartsArray}
                </div>
                <button onClick={()=> this.addToCart()}>
                    <div className="back-btn2">
                        <span>Add to Cart</span>
                    </div>
                </button>
            </React.Fragment>
        );


	}
}


export default ConfirmShelf;