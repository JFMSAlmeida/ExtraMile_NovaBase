package pt.ulisboa.tecnico.softeng.car.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Processor_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.Renting> role$$renting = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.Renting>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.car.domain.Renting> getSet(pt.ulisboa.tecnico.softeng.car.domain.Processor o1) {
            return ((Processor_Base)o1).get$rl$renting();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.Renting.role$$processor;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.RentACar> role$$rentACar = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.RentACar>() {
        @Override
        public pt.ulisboa.tecnico.softeng.car.domain.RentACar getValue(pt.ulisboa.tecnico.softeng.car.domain.Processor o1) {
            return ((Processor_Base.DO_State)o1.get$obj$state(false)).rentACar;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.car.domain.Processor o1, pt.ulisboa.tecnico.softeng.car.domain.RentACar o2) {
            ((Processor_Base.DO_State)o1.get$obj$state(true)).rentACar = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.RentACar,pt.ulisboa.tecnico.softeng.car.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.RentACar.role$$processor;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor> getRelationProcessorManagesRentings() {
        return pt.ulisboa.tecnico.softeng.car.domain.Renting.getRelationProcessorManagesRentings();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.Renting> keyFunction$$renting = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.Renting>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.car.domain.Renting value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.RentACar,pt.ulisboa.tecnico.softeng.car.domain.Processor> getRelationRentACarHasProcessor() {
        return pt.ulisboa.tecnico.softeng.car.domain.RentACar.getRelationRentACarHasProcessor();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.Renting> get$rl$renting() {
        return get$$relationList("renting", getRelationProcessorManagesRentings().getInverseRelation());
        
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
    protected  Processor_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addRenting(pt.ulisboa.tecnico.softeng.car.domain.Renting renting) {
        getRelationProcessorManagesRentings().add(renting, (pt.ulisboa.tecnico.softeng.car.domain.Processor)this);
    }
    
    public void removeRenting(pt.ulisboa.tecnico.softeng.car.domain.Renting renting) {
        getRelationProcessorManagesRentings().remove(renting, (pt.ulisboa.tecnico.softeng.car.domain.Processor)this);
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
        getRelationRentACarHasProcessor().add(rentACar, (pt.ulisboa.tecnico.softeng.car.domain.Processor)this);
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
        castedState.rentACar = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_RENT_A_CAR");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("renting")) return getRelationProcessorManagesRentings().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("renting", getRelationProcessorManagesRentings().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private pt.ulisboa.tecnico.softeng.car.domain.RentACar rentACar;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.rentACar = this.rentACar;
            
        }
        
    }
    
}
