package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class BulkRoomBooking_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Reference> role$$reference = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Reference>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.broker.domain.Reference> getSet(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking o1) {
            return ((BulkRoomBooking_Base)o1).get$rl$reference();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Reference.role$$bulkRoomBooking;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker> role$$broker = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.Broker getValue(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking o1) {
            return ((BulkRoomBooking_Base.DO_State)o1.get$obj$state(false)).broker;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking o1, pt.ulisboa.tecnico.softeng.broker.domain.Broker o2) {
            ((BulkRoomBooking_Base.DO_State)o1.get$obj$state(true)).broker = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Broker.role$$roomBulkBooking;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Reference,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getRelationBulkRoomBookingHasReferences() {
        return pt.ulisboa.tecnico.softeng.broker.domain.Reference.getRelationBulkRoomBookingHasReferences();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Reference> keyFunction$$reference = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Reference>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.broker.domain.Reference value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BrokerHasBulkRoomBookings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker>(role$$broker, "BrokerHasBulkRoomBookings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getRelationBrokerHasBulkRoomBookings() {
        return BrokerHasBulkRoomBookings.relation;
    }
    
    static {
        BrokerHasBulkRoomBookings.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking.BrokerHasBulkRoomBookings");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Reference> get$rl$reference() {
        return get$$relationList("reference", getRelationBulkRoomBookingHasReferences().getInverseRelation());
        
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
    protected  BulkRoomBooking_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getId() {
        return ((DO_State)this.get$obj$state(false)).id;
    }
    
    public void setId(java.lang.String id) {
        ((DO_State)this.get$obj$state(true)).id = id;
    }
    
    private java.lang.String get$id() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).id;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$id(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).id = (java.lang.String)((value == null) ? null : value);
    }
    
    public int getNumber() {
        return ((DO_State)this.get$obj$state(false)).number;
    }
    
    public void setNumber(int number) {
        ((DO_State)this.get$obj$state(true)).number = number;
    }
    
    private int get$number() {
        int value = ((DO_State)this.get$obj$state(false)).number;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$number(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).number = (int)(value);
    }
    
    public org.joda.time.LocalDate getArrival() {
        return ((DO_State)this.get$obj$state(false)).arrival;
    }
    
    public void setArrival(org.joda.time.LocalDate arrival) {
        ((DO_State)this.get$obj$state(true)).arrival = arrival;
    }
    
    private java.lang.String get$arrival() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).arrival;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$arrival(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).arrival = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public org.joda.time.LocalDate getDeparture() {
        return ((DO_State)this.get$obj$state(false)).departure;
    }
    
    public void setDeparture(org.joda.time.LocalDate departure) {
        ((DO_State)this.get$obj$state(true)).departure = departure;
    }
    
    private java.lang.String get$departure() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).departure;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$departure(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).departure = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public boolean getCancelled() {
        return ((DO_State)this.get$obj$state(false)).cancelled;
    }
    
    public void setCancelled(boolean cancelled) {
        ((DO_State)this.get$obj$state(true)).cancelled = cancelled;
    }
    
    private boolean get$cancelled() {
        boolean value = ((DO_State)this.get$obj$state(false)).cancelled;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForboolean(value);
    }
    
    private final void set$cancelled(boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancelled = (boolean)(value);
    }
    
    public int getNumberOfHotelExceptions() {
        return ((DO_State)this.get$obj$state(false)).numberOfHotelExceptions;
    }
    
    public void setNumberOfHotelExceptions(int numberOfHotelExceptions) {
        ((DO_State)this.get$obj$state(true)).numberOfHotelExceptions = numberOfHotelExceptions;
    }
    
    private int get$numberOfHotelExceptions() {
        int value = ((DO_State)this.get$obj$state(false)).numberOfHotelExceptions;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$numberOfHotelExceptions(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numberOfHotelExceptions = (int)(value);
    }
    
    public int getNumberOfRemoteErrors() {
        return ((DO_State)this.get$obj$state(false)).numberOfRemoteErrors;
    }
    
    public void setNumberOfRemoteErrors(int numberOfRemoteErrors) {
        ((DO_State)this.get$obj$state(true)).numberOfRemoteErrors = numberOfRemoteErrors;
    }
    
    private int get$numberOfRemoteErrors() {
        int value = ((DO_State)this.get$obj$state(false)).numberOfRemoteErrors;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$numberOfRemoteErrors(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numberOfRemoteErrors = (int)(value);
    }
    
    public java.lang.String getBuyerNif() {
        return ((DO_State)this.get$obj$state(false)).buyerNif;
    }
    
    public void setBuyerNif(java.lang.String buyerNif) {
        ((DO_State)this.get$obj$state(true)).buyerNif = buyerNif;
    }
    
    private java.lang.String get$buyerNif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).buyerNif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$buyerNif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).buyerNif = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getBuyerIban() {
        return ((DO_State)this.get$obj$state(false)).buyerIban;
    }
    
    public void setBuyerIban(java.lang.String buyerIban) {
        ((DO_State)this.get$obj$state(true)).buyerIban = buyerIban;
    }
    
    private java.lang.String get$buyerIban() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).buyerIban;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$buyerIban(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).buyerIban = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public void addReference(pt.ulisboa.tecnico.softeng.broker.domain.Reference reference) {
        getRelationBulkRoomBookingHasReferences().add(reference, (pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking)this);
    }
    
    public void removeReference(pt.ulisboa.tecnico.softeng.broker.domain.Reference reference) {
        getRelationBulkRoomBookingHasReferences().remove(reference, (pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Reference> getReferenceSet() {
        return get$rl$reference();
    }
    
    public void set$reference(OJBFunctionalSetWrapper reference) {
        get$rl$reference().setFromOJB(this, "reference", reference);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Reference> getReference() {
        return getReferenceSet();
    }
    
    @Deprecated
    public int getReferenceCount() {
        return getReferenceSet().size();
    }
    
    public pt.ulisboa.tecnico.softeng.broker.domain.Broker getBroker() {
        return ((DO_State)this.get$obj$state(false)).broker;
    }
    
    public void setBroker(pt.ulisboa.tecnico.softeng.broker.domain.Broker broker) {
        getRelationBrokerHasBulkRoomBookings().add((pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking)this, broker);
    }
    
    private java.lang.Long get$oidBroker() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).broker;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBroker() {
        if (getBroker() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$reference().size() > 0) handleAttemptToDeleteConnectedObject("Reference");
        if (castedState.broker != null) handleAttemptToDeleteConnectedObject("Broker");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$id(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ID"), state);
        set$number(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUMBER"), state);
        set$arrival(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "ARRIVAL"), state);
        set$departure(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "DEPARTURE"), state);
        set$cancelled(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "CANCELLED"), state);
        set$numberOfHotelExceptions(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUMBER_OF_HOTEL_EXCEPTIONS"), state);
        set$numberOfRemoteErrors(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUMBER_OF_REMOTE_ERRORS"), state);
        set$buyerNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BUYER_NIF"), state);
        set$buyerIban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BUYER_IBAN"), state);
        castedState.broker = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BROKER");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("reference")) return getRelationBulkRoomBookingHasReferences().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("reference", getRelationBulkRoomBookingHasReferences().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String id;
        private int number;
        private org.joda.time.LocalDate arrival;
        private org.joda.time.LocalDate departure;
        private boolean cancelled;
        private int numberOfHotelExceptions;
        private int numberOfRemoteErrors;
        private java.lang.String buyerNif;
        private java.lang.String buyerIban;
        private pt.ulisboa.tecnico.softeng.broker.domain.Broker broker;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.id = this.id;
            newCasted.number = this.number;
            newCasted.arrival = this.arrival;
            newCasted.departure = this.departure;
            newCasted.cancelled = this.cancelled;
            newCasted.numberOfHotelExceptions = this.numberOfHotelExceptions;
            newCasted.numberOfRemoteErrors = this.numberOfRemoteErrors;
            newCasted.buyerNif = this.buyerNif;
            newCasted.buyerIban = this.buyerIban;
            newCasted.broker = this.broker;
            
        }
        
    }
    
}
