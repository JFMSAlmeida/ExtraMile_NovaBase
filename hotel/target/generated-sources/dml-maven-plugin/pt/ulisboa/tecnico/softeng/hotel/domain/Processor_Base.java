package pt.ulisboa.tecnico.softeng.hotel.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Processor_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> role$$hotel = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel>() {
        @Override
        public pt.ulisboa.tecnico.softeng.hotel.domain.Hotel getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Processor o1) {
            return ((Processor_Base.DO_State)o1.get$obj$state(false)).hotel;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Processor o1, pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o2) {
            ((Processor_Base.DO_State)o1.get$obj$state(true)).hotel = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Hotel.role$$processor;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> role$$booking = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getSet(pt.ulisboa.tecnico.softeng.hotel.domain.Processor o1) {
            return ((Processor_Base)o1).get$rl$booking();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Booking.role$$processor;
        }
        
    };
    
    private final static class HotelHasProcessor {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel>(role$$hotel, "HotelHasProcessor");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getRelationHotelHasProcessor() {
        return HotelHasProcessor.relation;
    }
    
    static {
        HotelHasProcessor.relation.setRelationName("pt.ulisboa.tecnico.softeng.hotel.domain.Processor.HotelHasProcessor");
    }
    
    private final static class ProcessorManagesHotelBookings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>(role$$booking, "ProcessorManagesHotelBookings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getRelationProcessorManagesHotelBookings() {
        return ProcessorManagesHotelBookings.relation;
    }
    
    static {
        ProcessorManagesHotelBookings.relation.setRelationName("pt.ulisboa.tecnico.softeng.hotel.domain.Processor.ProcessorManagesHotelBookings");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> keyFunction$$booking = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.hotel.domain.Booking value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> get$rl$booking() {
        return get$$relationList("booking", getRelationProcessorManagesHotelBookings());
        
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
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Hotel getHotel() {
        return ((DO_State)this.get$obj$state(false)).hotel;
    }
    
    public void setHotel(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel hotel) {
        getRelationHotelHasProcessor().add((pt.ulisboa.tecnico.softeng.hotel.domain.Processor)this, hotel);
    }
    
    private java.lang.Long get$oidHotel() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).hotel;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfHotel() {
        if (getHotel() == null) return false;
        return true;
    }
    
    public void addBooking(pt.ulisboa.tecnico.softeng.hotel.domain.Booking booking) {
        getRelationProcessorManagesHotelBookings().add((pt.ulisboa.tecnico.softeng.hotel.domain.Processor)this, booking);
    }
    
    public void removeBooking(pt.ulisboa.tecnico.softeng.hotel.domain.Booking booking) {
        getRelationProcessorManagesHotelBookings().remove((pt.ulisboa.tecnico.softeng.hotel.domain.Processor)this, booking);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getBookingSet() {
        return get$rl$booking();
    }
    
    public void set$booking(OJBFunctionalSetWrapper booking) {
        get$rl$booking().setFromOJB(this, "booking", booking);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getBooking() {
        return getBookingSet();
    }
    
    @Deprecated
    public int getBookingCount() {
        return getBookingSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.hotel != null) handleAttemptToDeleteConnectedObject("Hotel");
        if (get$rl$booking().size() > 0) handleAttemptToDeleteConnectedObject("Booking");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.hotel = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_HOTEL");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("booking")) return getRelationProcessorManagesHotelBookings();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("booking", getRelationProcessorManagesHotelBookings());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private pt.ulisboa.tecnico.softeng.hotel.domain.Hotel hotel;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.hotel = this.hotel;
            
        }
        
    }
    
}
