import React, { Component } from 'react';
import Activity from "./Activity";
import Room from "./Room";
import Vehicle from "./Vehicle";

class ConfirmShelf extends Component {
    constructor(props){
        super(props);

        this.state = {
            price: 0,
            alert : false
        };

        this.createPackage = this.createPackage.bind(this);
        this.addToCart = this.addToCart.bind(this);
        this.getPrice = this.getPrice.bind(this);
    }


    async getPrice() {
        try {
            var i1 = "B100";
            var i2 = this.props.advId;
            var i3 = "999999999";

            await fetch('http://localhost:8083/rest/brokers/getAdventurePrice?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
                .then(response => {
                    return response.text();
                })
                .then(body => {
                    this.setState({
                        price: JSON.parse(body).price
                    });
                });

            let adv = this.createPackage();

            this.props.addCart(adv);

        } catch (e) {
            this.props.changeLoading(false);
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later.";
        }
    }

    createPackage() {
        let adv = Object.assign(this.props.advParts[0], {"id": this.props.advId, "price": this.state.price, "hasRoom": this.props.hasRoom,
            "hasVehicle": this.props.hasVehicle});
        if (this.props.hasRoom)
            adv = Object.assign(adv, this.props.advParts[1]);
        if (this.props.hasVehicle)
            adv = Object.assign(adv, this.props.advParts[2]);

        return adv;
    }

    async process(advId, id){

        try {
            let link = 'http://localhost:8083/rest/brokers/processPart?param1=B100&param2=' + advId;
            var size = id.length;

            for(let i = 0; i < size; i++) {
                link = link + '&param=' + id[i];
            }

            await fetch(link)
                .then(response => {
                    return response.text();
                });
            this.getPrice();
            this.props.changeLoading(false);

        } catch (e) {
            this.props.changeLoading(false);
            this.setState({alert: true});
            document.getElementById("alert").setAttribute("class", "alert alert-warning");
            document.getElementById("alert-icon").className = "glyphicon glyphicon-warning-sign";
            document.getElementById("alert-text").innerHTML = "&nbsp;Something went wrong... Try again later.";
        }

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
        let advPartsArray = [];

        advPartsArray.push(
            <div className="shelf-item">
                <div className="shelf-item__main_info">
                    <b><p className="shelf-item__title"> Period: </p></b>
                    <p> <span className="glyphicon glyphicon-calendar" style={{fontSize: '25px'}}></span> <b>Begin Date:</b></p>
                    <p>{this.props.begin}</p>

                    <br/>

                    <p> <span className="glyphicon glyphicon-calendar" style={{fontSize: '25px'}}></span> <b>End Date:</b></p>
                    <p> {this.props.end}</p>
                </div>
            </div>
        );

        advPartsArray.push(<Activity noAddCart={1} activity = {this.props.advParts[0]} key = {this.props.advParts[0].id} />);

        if(this.props.hasRoom)
            advPartsArray.push(<Room noAddCart={1} room = {this.props.advParts[1]} key = {this.props.advParts[1].number} />);

        if(this.props.hasRoom && this.props.hasVehicle)
            advPartsArray.push(<Vehicle noAddCart={1} vehicle = {this.props.advParts[2]} key = {this.props.advParts[2].plate} />);

        if(!this.props.hasRoom && this.props.hasVehicle)
            advPartsArray.push(<Vehicle noAddCart={1} vehicle = {this.props.advParts[1]} key = {this.props.advParts[1].plate} />);

        return (
            <div>
                {this.state.alert ?
                    <div id="alert" className="alert alert-info alert-dismissable">
                        <a className="panel-close close" onClick={this.handleAlertDismiss}>×</a>
                        <span id="alert-icon" className=""></span>
                        <div id="alert-text" style={{display: "inline"}}></div>
                    </div> : <div>
                        {this.props.getLoading() ? null :
                            <div>
                                <h3 style={{textAlign: 'center', marginRight: '130px'}}>Your Selections:</h3>
                                <React.Fragment>
                                    <div className="shelf-container-confirm-shelf">
                                        {advPartsArray}
                                        <div className="confirm-buy-btn" onClick={() => this.addToCart()}>
                                            <span>Add to cart</span>
                                        </div>
                                    </div>
                                </React.Fragment>
                            </div>
                        } </div>}
            </div>
        );
    }
}

export default ConfirmShelf;
