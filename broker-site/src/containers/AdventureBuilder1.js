import React, { Component } from 'react';
import './App.css';
import RoomShelf from '../components/shelf/RoomShelf'

class AdventureBuilder1 extends Component {
    constructor(props){
        console.log("nope");
        super(props);
        this.state = { 
                       rooms: []
                     };

        this.process = this.process.bind(this);
    } 

     process(i3) {

        var i1 = "B100";
        var i2 = "B1001";

       fetch('http://localhost:8083/rest/brokers/processPart?param1=' + i1 + '&param2=' + i2 + '&param3=' + i3)
            .then(response => {
            return response.text();
        })
        .then(body => {
            console.log(JSON.parse(body));
        });
        
    }


    componentWillMount() {

        
        fetch('http://localhost:8085/rest/hotels/rooms')
            .then(response => {
                return response.text();
            })
            .then(body => {
                console.log(JSON.parse(body));

                const response = JSON.parse(body);
                console.log(response);

                this.setState({rooms: response});
                console.log(this.state);
            });

        
    } 

    render() {

        return (<div>
                    <h3>Room Picker</h3>
                     <RoomShelf
                        process = {i3 => this.process(i3)}
                        rooms = {this.state.rooms}
                    />
                </div>
                );
    }
}

export default AdventureBuilder1;

