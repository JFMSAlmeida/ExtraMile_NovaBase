package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Reference_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> role$$bulkRoomBooking = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking getValue(pt.ulisboa.tecnico.softeng.broker.domain.Reference o1) {
            return ((Reference_Base.DO_State)o1.get$obj$state(false)).bulkRoomBooking;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Reference o1, pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking o2) {
            ((Reference_Base.DO_State)o1.get$obj$state(true)).bulkRoomBooking = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Reference> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking.role$$reference;
        }
        
    };
    
    private final static class BulkRoomBookingHasReferences {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking>(role$$bulkRoomBooking, "BulkRoomBookingHasReferences");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getRelationBulkRoomBookingHasReferences() {
        return BulkRoomBookingHasReferences.relation;
    }
    
    static {
        BulkRoomBookingHasReferences.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.Reference.BulkRoomBookingHasReferences");
    }
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  Reference_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getValue() {
        return ((DO_State)this.get$obj$state(false)).value;
    }
    
    public void setValue(java.lang.String value) {
        ((DO_State)this.get$obj$state(true)).value = value;
    }
    
    private java.lang.String get$value() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).value;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$value(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).value = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking getBulkRoomBooking() {
        return ((DO_State)this.get$obj$state(false)).bulkRoomBooking;
    }
    
    public void setBulkRoomBooking(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking bulkRoomBooking) {
        getRelationBulkRoomBookingHasReferences().add((pt.ulisboa.tecnico.softeng.broker.domain.Reference)this, bulkRoomBooking);
    }
    
    private java.lang.Long get$oidBulkRoomBooking() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bulkRoomBooking;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBulkRoomBooking() {
        if (getBulkRoomBooking() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.bulkRoomBooking != null) handleAttemptToDeleteConnectedObject("BulkRoomBooking");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$value(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "VALUE"), state);
        castedState.bulkRoomBooking = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BULK_ROOM_BOOKING");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String value;
        private pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking bulkRoomBooking;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.value = this.value;
            newCasted.bulkRoomBooking = this.bulkRoomBooking;
            
        }
        
    }
    
}
