package pt.ulisboa.tecnico.softeng.hotel.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Hotel_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Processor> role$$processor = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Processor>() {
        @Override
        public pt.ulisboa.tecnico.softeng.hotel.domain.Processor getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o1) {
            return ((Hotel_Base.DO_State)o1.get$obj$state(false)).processor;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o1, pt.ulisboa.tecnico.softeng.hotel.domain.Processor o2) {
            ((Hotel_Base.DO_State)o1.get$obj$state(true)).processor = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Processor.role$$hotel;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Room> role$$room = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Room>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.hotel.domain.Room> getSet(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o1) {
            return ((Hotel_Base)o1).get$rl$room();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Room.role$$hotel;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o1) {
            return ((Hotel_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Hotel o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Hotel_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$hotel;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getRelationHotelHasProcessor() {
        return pt.ulisboa.tecnico.softeng.hotel.domain.Processor.getRelationHotelHasProcessor();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getRelationHotelHasRooms() {
        return pt.ulisboa.tecnico.softeng.hotel.domain.Room.getRelationHotelHasRooms();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Room> keyFunction$$room = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.hotel.domain.Room>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.hotel.domain.Room value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.hotel.domain.Hotel> getRelationDomainRootHasHotels() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootHasHotels();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.hotel.domain.Hotel,pt.ulisboa.tecnico.softeng.hotel.domain.Room> get$rl$room() {
        return get$$relationList("room", getRelationHotelHasRooms().getInverseRelation());
        
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
    protected  Hotel_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getCode() {
        return ((DO_State)this.get$obj$state(false)).code;
    }
    
    public void setCode(java.lang.String code) {
        ((DO_State)this.get$obj$state(true)).code = code;
    }
    
    private java.lang.String get$code() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).code;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$code(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).code = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getName() {
        return ((DO_State)this.get$obj$state(false)).name;
    }
    
    public void setName(java.lang.String name) {
        ((DO_State)this.get$obj$state(true)).name = name;
    }
    
    private java.lang.String get$name() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).name;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$name(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).name = (java.lang.String)((value == null) ? null : value);
    }
    
    public int getCounter() {
        return ((DO_State)this.get$obj$state(false)).counter;
    }
    
    public void setCounter(int counter) {
        ((DO_State)this.get$obj$state(true)).counter = counter;
    }
    
    private int get$counter() {
        int value = ((DO_State)this.get$obj$state(false)).counter;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$counter(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).counter = (int)(value);
    }
    
    public java.lang.String getNif() {
        return ((DO_State)this.get$obj$state(false)).nif;
    }
    
    public void setNif(java.lang.String nif) {
        ((DO_State)this.get$obj$state(true)).nif = nif;
    }
    
    private java.lang.String get$nif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).nif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$nif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).nif = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getIban() {
        return ((DO_State)this.get$obj$state(false)).iban;
    }
    
    public void setIban(java.lang.String iban) {
        ((DO_State)this.get$obj$state(true)).iban = iban;
    }
    
    private java.lang.String get$iban() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).iban;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$iban(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).iban = (java.lang.String)((value == null) ? null : value);
    }
    
    public double getPriceSingle() {
        return ((DO_State)this.get$obj$state(false)).priceSingle;
    }
    
    public void setPriceSingle(double priceSingle) {
        ((DO_State)this.get$obj$state(true)).priceSingle = priceSingle;
    }
    
    private double get$priceSingle() {
        double value = ((DO_State)this.get$obj$state(false)).priceSingle;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$priceSingle(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).priceSingle = (double)(value);
    }
    
    public double getPriceDouble() {
        return ((DO_State)this.get$obj$state(false)).priceDouble;
    }
    
    public void setPriceDouble(double priceDouble) {
        ((DO_State)this.get$obj$state(true)).priceDouble = priceDouble;
    }
    
    private double get$priceDouble() {
        double value = ((DO_State)this.get$obj$state(false)).priceDouble;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$priceDouble(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).priceDouble = (double)(value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Processor getProcessor() {
        return ((DO_State)this.get$obj$state(false)).processor;
    }
    
    public void setProcessor(pt.ulisboa.tecnico.softeng.hotel.domain.Processor processor) {
        getRelationHotelHasProcessor().add(processor, (pt.ulisboa.tecnico.softeng.hotel.domain.Hotel)this);
    }
    
    private java.lang.Long get$oidProcessor() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).processor;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfProcessor() {
        if (getProcessor() == null) return false;
        return true;
    }
    
    public void addRoom(pt.ulisboa.tecnico.softeng.hotel.domain.Room room) {
        getRelationHotelHasRooms().add(room, (pt.ulisboa.tecnico.softeng.hotel.domain.Hotel)this);
    }
    
    public void removeRoom(pt.ulisboa.tecnico.softeng.hotel.domain.Room room) {
        getRelationHotelHasRooms().remove(room, (pt.ulisboa.tecnico.softeng.hotel.domain.Hotel)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.hotel.domain.Room> getRoomSet() {
        return get$rl$room();
    }
    
    public void set$room(OJBFunctionalSetWrapper room) {
        get$rl$room().setFromOJB(this, "room", room);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.hotel.domain.Room> getRoom() {
        return getRoomSet();
    }
    
    @Deprecated
    public int getRoomCount() {
        return getRoomSet().size();
    }
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootHasHotels().add(root, (pt.ulisboa.tecnico.softeng.hotel.domain.Hotel)this);
    }
    
    private java.lang.Long get$oidRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).root;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRoot() {
        if (getRoot() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.processor != null) handleAttemptToDeleteConnectedObject("Processor");
        if (get$rl$room().size() > 0) handleAttemptToDeleteConnectedObject("Room");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$code(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CODE"), state);
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$counter(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "COUNTER"), state);
        set$nif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF"), state);
        set$iban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "IBAN"), state);
        set$priceSingle(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "PRICE_SINGLE"), state);
        set$priceDouble(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "PRICE_DOUBLE"), state);
        castedState.processor = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PROCESSOR");
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("room")) return getRelationHotelHasRooms().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("room", getRelationHotelHasRooms().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String code;
        private java.lang.String name;
        private int counter;
        private java.lang.String nif;
        private java.lang.String iban;
        private double priceSingle;
        private double priceDouble;
        private pt.ulisboa.tecnico.softeng.hotel.domain.Processor processor;
        private pt.ist.fenixframework.DomainRoot root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.code = this.code;
            newCasted.name = this.name;
            newCasted.counter = this.counter;
            newCasted.nif = this.nif;
            newCasted.iban = this.iban;
            newCasted.priceSingle = this.priceSingle;
            newCasted.priceDouble = this.priceDouble;
            newCasted.processor = this.processor;
            newCasted.root = this.root;
            
        }
        
    }
    
}
