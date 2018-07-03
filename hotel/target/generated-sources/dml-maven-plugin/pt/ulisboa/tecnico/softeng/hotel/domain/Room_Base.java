package pt.ulisboa.tecnico.softeng.hotel.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Room_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> role$$hotel = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel>() {
        @Override
        public pt.ulisboa.tecnico.softeng.hotel.domain.Hotel getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Room o1) {
            return ((Room_Base.DO_State)o1.get$obj$state(false)).hotel;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Room o1, pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o2) {
            ((Room_Base.DO_State)o1.get$obj$state(true)).hotel = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Room> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Hotel.role$$room;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> role$$booking = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getSet(pt.ulisboa.tecnico.softeng.hotel.domain.Room o1) {
            return ((Room_Base)o1).get$rl$booking();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Room> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Booking.role$$room;
        }
        
    };
    
    private final static class HotelHasRooms {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel>(role$$hotel, "HotelHasRooms");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getRelationHotelHasRooms() {
        return HotelHasRooms.relation;
    }
    
    static {
        HotelHasRooms.relation.setRelationName("pt.ulisboa.tecnico.softeng.hotel.domain.Room.HotelHasRooms");
    }
    
    private final static class RoomHasBookings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>(role$$booking, "RoomHasBookings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getRelationRoomHasBookings() {
        return RoomHasBookings.relation;
    }
    
    static {
        RoomHasBookings.relation.setRelationName("pt.ulisboa.tecnico.softeng.hotel.domain.Room.RoomHasBookings");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> keyFunction$$booking = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Booking>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.hotel.domain.Booking value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> get$rl$booking() {
        return get$$relationList("booking", getRelationRoomHasBookings());
        
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
    protected  Room_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getNumber() {
        return ((DO_State)this.get$obj$state(false)).number;
    }
    
    public void setNumber(java.lang.String number) {
        ((DO_State)this.get$obj$state(true)).number = number;
    }
    
    private java.lang.String get$number() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).number;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$number(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).number = (java.lang.String)((value == null) ? null : value);
    }
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type getType() {
        return ((DO_State)this.get$obj$state(false)).type;
    }
    
    public void setType(pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type type) {
        ((DO_State)this.get$obj$state(true)).type = type;
    }
    
    private java.lang.String get$type() {
        pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type value = ((DO_State)this.get$obj$state(false)).type;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForEnum(value);
    }
    
    private final void set$type(pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).type = (pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Hotel getHotel() {
        return ((DO_State)this.get$obj$state(false)).hotel;
    }
    
    public void setHotel(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel hotel) {
        getRelationHotelHasRooms().add((pt.ulisboa.tecnico.softeng.hotel.domain.Room)this, hotel);
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
        getRelationRoomHasBookings().add((pt.ulisboa.tecnico.softeng.hotel.domain.Room)this, booking);
    }
    
    public void removeBooking(pt.ulisboa.tecnico.softeng.hotel.domain.Booking booking) {
        getRelationRoomHasBookings().remove((pt.ulisboa.tecnico.softeng.hotel.domain.Room)this, booking);
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
        set$number(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NUMBER"), state);
        set$type(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readEnum(pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type.class, rs, "TYPE"), state);
        castedState.hotel = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_HOTEL");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("booking")) return getRelationRoomHasBookings();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("booking", getRelationRoomHasBookings());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String number;
        private pt.ulisboa.tecnico.softeng.hotel.domain.Room.Type type;
        private pt.ulisboa.tecnico.softeng.hotel.domain.Hotel hotel;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.number = this.number;
            newCasted.type = this.type;
            newCasted.hotel = this.hotel;
            
        }
        
    }
    
}
