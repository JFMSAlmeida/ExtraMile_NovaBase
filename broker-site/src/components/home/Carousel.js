import React from "react";
import imageOne from './adventureFinder.jpg';
import imageTwo from './adventureBuilder.jpg';
import imageThree from './banner-sample.png';
import {withRouter} from "react-router-dom";
import $ from 'jquery'

class Carousel extends React.Component {
    constructor(props) {
        super(props);
        this.handlePageChange = this.handlePageChange.bind(this);
    }

    handlePageChange(e, path) {
        e.preventDefault();
        this.props.history.push(path);
    }

    render() {
        $(document).ready(
            function() {
                // set slider size equivalent to window size
                adaptSlider();

                $(window).resize(function() {
                    adaptSlider();
                });
            });

        function adaptSlider() {
            var viewportWidth = $(window).width();
            var viewportHeight = $(window).height();
            $('.carousel-caption h3').css('font-size', viewportWidth * .018);
            $('.carousel-caption p').css('font-size', viewportWidth * .012);
            $('.carousel').css('height', viewportHeight*0.92);
            $('.carousel-inner').css('height', viewportHeight*0.92);
            $('.sliderContainer').css('height', viewportHeight*0.92);
            $('.main-banner').css('height', viewportHeight*0.92);
            $('.item').css('height', viewportHeight*0.92);
            $('.carousel-indicators li').css('width', viewportWidth * 0.01);
            $('.carousel-indicators li').css('height', viewportWidth * 0.01);
        }

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
                            <img className="main-banner" src={imageOne} onClick={(e) => this.handlePageChange(e, "/adventurefinder")}/>
                            <div className="carousel-caption" onClick={(e) => this.handlePageChange(e, "/adventurefinder")}>
                                <h3>Adventure Finder</h3>
                                <p>Procure a sua aventura de sonho!</p>
                            </div>
                        </div>

                        <div className="item">
                            <img className="main-banner" src={imageTwo} onClick={(e) => this.handlePageChange(e, "/adventurebuilder")}/>
                            <div className="carousel-caption" onClick={(e) => this.handlePageChange(e, "/adventurebuilder")}>
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

export default withRouter(Carousel);