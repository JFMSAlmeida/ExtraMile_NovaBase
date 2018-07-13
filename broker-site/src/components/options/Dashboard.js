import React, { Component } from 'react';


class Dashboard extends Component {
    render(){
        return (
            <div id="dashboard">
                <div className="col-md-9">
                    <div className="card">
                        <div className="card-body">
                            <div className="row">
                                <div className="col-md-12">
                                    <h4>Dashboard</h4>
                                    <hr className="home_hr"></hr>
                                </div>
                            </div>
                            <div className="row" style={{paddingLeft: "18px"}}>
                                <div className="col-md-12">
                                    <div className="form-group row">
                                        <label className="col-lg-3 control-label">NIF:</label>
                                        <div className="col-8">
                                            <div className="col-lg-8">
                                                <div className="fieldContainer">
                                                    <span>{this.props.fieldState.nif}</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                    <div className="form-group row">
                                        <label className="col-lg-3 control-label">IBAN:</label>
                                        <div className="col-8">
                                            <div className="col-lg-2">
                                                <div className="fieldContainer">
                                                    <input id="iban" className="form-control" disabled="true" type="text" defaultValue={this.props.fieldState.iban} onChange={this.props.handleIBANChange}></input>&nbsp;
                                                    <button className="btn btn-default go inline" id="iban-edit" onClick={(e) => this.props.handleEdit(e, "iban")} style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button className="btn btn-default go inline" id="iban-remove" onClick={(e) => this.props.handleRemove(e, "iban")} hidden="true" style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div className="form-group row">
                                        <label className="col-lg-3 control-label">Age:</label>
                                        <div className="col-8">
                                            <div className="col-lg-2">
                                                <div className="fieldContainer">
                                                    <input id="age" disabled="true" className="form-control" type="number" min="1" max="120" defaultValue={this.props.fieldState.age} onChange={this.props.handleAgeChange}></input>&nbsp;
                                                    <button className="btn btn-default go inline" id="age-edit" onClick={(e) => this.props.handleEdit(e, "age")} style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button className="btn btn-default go inline" id="age-remove" onClick={(e) => this.props.handleRemove(e, "age")} hidden="true" style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div className="form-group row">
                                        <label className="col-lg-3 control-label">Driving License:</label>
                                        <div className="col-8">
                                            <div className="col-lg-2">
                                                <div className="fieldContainer">
                                                    <input id="dl" disabled="true" className="form-control" type="text" defaultValue={this.props.fieldState.drivinglicense} onChange={this.props.handleDrivingLicenseChange}></input>&nbsp;
                                                    <button className="btn btn-default go inline" id="dl-edit" onClick={(e) => this.props.handleEdit(e, "dl")} style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-edit"></span></button>
                                                    <button className="btn btn-default go inline" id="dl-remove" onClick={(e) => this.props.handleRemove(e, "dl")} hidden="true" style={{marginTop: '-96px', marginLeft: '110px'}}><span className="glyphicon glyphicon-remove"></span></button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div className="form-group row">
                                        <div className="offset-4 col-8">
                                            <button name="submit" type="submit"
                                                    className="btn btn-primary" onClick={(e) => this.props.handleOk(e)}>Update My Profile
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        )

    }
}

export default Dashboard;