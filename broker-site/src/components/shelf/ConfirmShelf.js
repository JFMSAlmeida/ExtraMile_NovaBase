import React, { Component } from 'react';
import Activity from "./Activity";
import Room from "./Room";
import Vehicle from "./Vehicle";

class ConfirmShelf extends Component {
    constructor(props){
        super(props);

        this.state = {
                        price: 0
                    };

        this.createPackage = this.createPackage.bind(this);
        this.addToCart = this.addToCart.bind(this);
        this.getPrice = this.getPrice.bind(this);
    }


    async getPrice() {

        var i1 = "B100";
        var i2 = this.props.advId;
        var i3 = "999999999";

        console.log(i2);
        console.log(this.props.advId);

        await fetch('http://localhost:8083/rest/brokers/getAdventurePrice?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
            console.log(JSON.parse(body).price);
            this.setState({
                price: JSON.parse(body).price
            });
        });

        let adv = this.createPackage();

        this.props.addCart(adv);

    }



    createPackage() {
        console.log("BODAID: " + this.props.advId);
        let adv = Object.assign(this.props.advParts[0], {"id": this.props.advId, "price": this.state.price});
        if (this.props.hasRoom)
            adv = Object.assign(adv, this.props.advParts[1]);
        if (this.props.hasVehicle)
            adv = Object.assign(adv, this.props.advParts[2]);

        console.log(adv);
        return adv;
    }

    async process(advId, id){
        let link = 'http://localhost:8083/rest/brokers/processPart?param1=B100&param2=' + advId;
        var size = id.length;

        for(let i = 0; i < size; i++) {
            link = link + '&param=' + id[i];
        }


        await fetch(link)
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));
            });

        this.getPrice();
        this.props.changeLoading(false);
    }

    addToCart(){
        this.props.changeLoading(true);
        var id = [];
        var advId = this.props.advId;

        var activity = this.props.advParts[0];
        var actId = activity.providerCode + ";" + activity.activityCode + ";" + activity.capacity;

        id.push(actId);

        if (this.props.hasRoom) {
            var room = this.props.advParts[1];
            var roomId = room.hotelCode + ";" + room.number + ";" + room.roomType;
            id.push(roomId)
        }

        if (this.props.hasVehicle) {
            var vehicle = this.props.advParts[2];
            var vehId = vehicle.plate + ";" + vehicle.rentACarCode;
            id.push(vehId);
        }

        this.process(advId, id);
    }

    render(){
		console.log(this.props.advParts);
		let advPartsArray = [];
        advPartsArray.push(<Activity noAddCart={1} activity = {this.props.advParts[0]} key = {this.props.advParts[0].id} />);

        if(this.props.hasRoom)
            advPartsArray.push(<Room noAddCart={1} room = {this.props.advParts[1]} key = {this.props.advParts[1].number} />);

        if(this.props.hasRoom && this.props.hasVehicle)
            advPartsArray.push(<Vehicle noAddCart={1} vehicle = {this.props.advParts[2]} key = {this.props.advParts[2].plate} />);

        if(!this.props.hasRoom && this.props.hasVehicle)
            advPartsArray.push(<Vehicle noAddCart={1} vehicle = {this.props.advParts[1]} key = {this.props.advParts[1].plate} />);

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