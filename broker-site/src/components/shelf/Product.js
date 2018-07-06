import React from 'react';

const Product = (props) => {
    const product = props.product;

    return (
        <div className="shelf-item" data-sku={product.id}>
            <div className="shelf-item__main_info">
                <p className="shelf-item__title"> Package {product.id}</p>
                <img className="shelf-item__image" src={require(`./${product.id}.jpg`)} alt={product.id}/>
                <div className="shelf-item__price">
                    <div className="val"><b>Price: {product.price}</b><small>€</small>
                    </div>
                </div>
                <p> Minimum Age: {product.age}</p>
                <p> Begin Date: {product.begin[2]}/{product.begin[1]}/{product.begin[0]}</p>
                <p> End Date: {product.end[2]}/{product.end[1]}/{product.end[0]}</p>
            </div>
            <div className="shelf-item__activity">
                <b>ACTIVITY</b>
                <p className="shelf-item__activity-name">Name: {product.activityName}</p>
            </div>
            {product.hasRoom && <div className="shelf-item__hotel">
                <b>HOTEL</b>
                <p className="shelf-item__hotel-hotel-name"> Name: {product.hotelName} </p>
                <p className="shelf-item__hotel-room-number"> Room Number: {product.roomNumber} </p>
                <p className="shelf-item__hotel-room-type"> Room Type: {product.roomType} </p>
            </div>}
            {product.hasVehicle && <div className="shelf-item__rental">
                <b>CAR</b>
                <p className="shelf-item__rental-vehicleType"> Vehicle Type: {product.vehicleType} </p>
                <p className="shelf-item__rental-kilometers"> Vehicle kilometers: {product.kilometers} </p>
            </div>}
            <p className="shelf-item__buy-btn"> Add to cart</p>
        </div>
    );
}

export default Product;