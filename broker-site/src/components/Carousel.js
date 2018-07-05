import React from "react";
import imageOne from './banner-sample.png';
import imageTwo from './banner-sample.png';
import imageThree from './banner-sample.png';


export default class Carousel extends React.Component {
    render() {
        return (
            <div className="sliderContainer">
                <div id="myCarousel" className="carousel slide" data-ride="carousel">
                    <ol className="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" className="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>

                    <div className="carousel-inner">

                        <div className="item active">
                            <img className="main-banner" src={imageOne}/>
                                <div className="carousel-caption">
                                    <h3>Adventure Finder</h3>
                                    <p>Procure a sua aventura de sonho entre os mais variados Brokers!</p>
                                </div>
                        </div>

                        <div className="item">
                            <img className="main-banner" src={imageTwo}/>
                                <div className="carousel-caption">
                                    <h3>Adventure Builder</h3>
                                    <p>Não encontra uma aventura ao seu gosto? Crie a sua própria aventura!</p>
                                </div>
                        </div>

                        <div className="item">
                            <img className="main-banner" src={imageThree}/>
                                <div className="carousel-caption">
                                    <h3>New York</h3>
                                    <p>We love the Big Apple!</p>
                                </div>
                        </div>

                    </div>

                    <a className="left carousel-control" href="#myCarousel" data-slide="prev">
                        <span className="glyphicon glyphicon-chevron-left"></span>
                        <span className="sr-only">Previous</span>
                    </a>
                    <a className="right carousel-control" href="#myCarousel" data-slide="next">
                        <span className="glyphicon glyphicon-chevron-right"></span>
                        <span className="sr-only">Next</span>
                    </a>
                </div>
            </div>
        );
    }
}
