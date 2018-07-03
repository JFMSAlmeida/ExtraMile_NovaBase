package pt.ulisboa.tecnico.softeng.car.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Vehicle_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> role$$renting = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.car.domain.Renting> getSet(pt.ulisboa.tecnico.softeng.car.domain.Vehicle o1) {
            return ((Vehicle_Base)o1).get$rl$renting();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Vehicle> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.Renting.role$$vehicle;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.RentACar> role$$rentACar = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.RentACar>() {
        @Override
        public pt.ulisboa.tecnico.softeng.car.domain.RentACar getValue(pt.ulisboa.tecnico.softeng.car.domain.Vehicle o1) {
            return ((Vehicle_Base.DO_State)o1.get$obj$state(false)).rentACar;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.car.domain.Vehicle o1, pt.ulisboa.tecnico.softeng.car.domain.RentACar o2) {
            ((Vehicle_Base.DO_State)o1.get$obj$state(true)).rentACar = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.RentACar,pt.ulisboa.tecnico.softeng.car.domain.Vehicle> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.RentACar.role$$vehicle;
        }
        
    };
    
    private final static class VehicleHasRentings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting>(role$$renting, "VehicleHasRentings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> getRelationVehicleHasRentings() {
        return VehicleHasRentings.relation;
    }
    
    static {
        VehicleHasRentings.relation.setRelationName("pt.ulisboa.tecnico.softeng.car.domain.Vehicle.VehicleHasRentings");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.Renting> keyFunction$$renting = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.Renting>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.car.domain.Renting value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class RentACarHasVehicles {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.RentACar> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.RentACar>(role$$rentACar, "RentACarHasVehicles");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.RentACar> getRelationRentACarHasVehicles() {
        return RentACarHasVehicles.relation;
    }
    
    static {
        RentACarHasVehicles.relation.setRelationName("pt.ulisboa.tecnico.softeng.car.domain.Vehicle.RentACarHasVehicles");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> get$rl$renting() {
        return get$$relationList("renting", getRelationVehicleHasRentings());
        
    }
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  Vehicle_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getPlate() {
        return ((DO_State)this.get$obj$state(false)).plate;
    }
    
    public void setPlate(java.lang.String plate) {
        ((DO_State)this.get$obj$state(true)).plate = plate;
    }
    
    private java.lang.String get$plate() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).plate;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$plate(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).plate = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.Integer getKilometers() {
        return ((DO_State)this.get$obj$state(false)).kilometers;
    }
    
    public void setKilometers(java.lang.Integer kilometers) {
        ((DO_State)this.get$obj$state(true)).kilometers = kilometers;
    }
    
    private java.lang.Integer get$kilometers() {
        java.lang.Integer value = ((DO_State)this.get$obj$state(false)).kilometers;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForInteger(value);
    }
    
    private final void set$kilometers(java.lang.Integer value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).kilometers = (java.lang.Integer)((value == null) ? null : value);
    }
    
    public double getPrice() {
        return ((DO_State)this.get$obj$state(false)).price;
    }
    
    public void setPrice(double price) {
        ((DO_State)this.get$obj$state(true)).price = price;
    }
    
    private double get$price() {
        double value = ((DO_State)this.get$obj$state(false)).price;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$price(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).price = (double)(value);
    }
    
    // Role Methods
    
    public void addRenting(pt.ulisboa.tecnico.softeng.car.domain.Renting renting) {
        getRelationVehicleHasRentings().add((pt.ulisboa.tecnico.softeng.car.domain.Vehicle)this, renting);
    }
    
    public void removeRenting(pt.ulisboa.tecnico.softeng.car.domain.Renting renting) {
        getRelationVehicleHasRentings().remove((pt.ulisboa.tecnico.softeng.car.domain.Vehicle)this, renting);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.car.domain.Renting> getRentingSet() {
        return get$rl$renting();
    }
    
    public void set$renting(OJBFunctionalSetWrapper renting) {
        get$rl$renting().setFromOJB(this, "renting", renting);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.car.domain.Renting> getRenting() {
        return getRentingSet();
    }
    
    @Deprecated
    public int getRentingCount() {
        return getRentingSet().size();
    }
    
    public pt.ulisboa.tecnico.softeng.car.domain.RentACar getRentACar() {
        return ((DO_State)this.get$obj$state(false)).rentACar;
    }
    
    public void setRentACar(pt.ulisboa.tecnico.softeng.car.domain.RentACar rentACar) {
        getRelationRentACarHasVehicles().add((pt.ulisboa.tecnico.softeng.car.domain.Vehicle)this, rentACar);
    }
    
    private java.lang.Long get$oidRentACar() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).rentACar;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRentACar() {
        if (getRentACar() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$renting().size() > 0) handleAttemptToDeleteConnectedObject("Renting");
        if (castedState.rentACar != null) handleAttemptToDeleteConnectedObject("RentACar");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$plate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PLATE"), state);
        set$kilometers(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readInteger(rs, "KILOMETERS"), state);
        set$price(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "PRICE"), state);
        castedState.rentACar = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_RENT_A_CAR");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("renting")) return getRelationVehicleHasRentings();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("renting", getRelationVehicleHasRentings());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String plate;
        private java.lang.Integer kilometers;
        private double price;
        private pt.ulisboa.tecnico.softeng.car.domain.RentACar rentACar;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.plate = this.plate;
            newCasted.kilometers = this.kilometers;
            newCasted.price = this.price;
            newCasted.rentACar = this.rentACar;
            
        }
        
    }
    
}
