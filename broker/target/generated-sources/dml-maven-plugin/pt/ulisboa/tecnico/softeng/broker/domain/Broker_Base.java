package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Broker_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Client> role$$client = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Client>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.broker.domain.Client> getSet(pt.ulisboa.tecnico.softeng.broker.domain.Broker o1) {
            return ((Broker_Base)o1).get$rl$client();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Client.role$$broker;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> role$$adventure = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getSet(pt.ulisboa.tecnico.softeng.broker.domain.Broker o1) {
            return ((Broker_Base)o1).get$rl$adventure();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Adventure.role$$broker;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> role$$roomBulkBooking = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getSet(pt.ulisboa.tecnico.softeng.broker.domain.Broker o1) {
            return ((Broker_Base)o1).get$rl$roomBulkBooking();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking.role$$broker;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.softeng.broker.domain.Broker o1) {
            return ((Broker_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Broker o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Broker_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$broker;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getRelationBrokerHasClients() {
        return pt.ulisboa.tecnico.softeng.broker.domain.Client.getRelationBrokerHasClients();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Client> keyFunction$$client = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Client>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.broker.domain.Client value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BrokerHasAdventures {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>(role$$adventure, "BrokerHasAdventures");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationBrokerHasAdventures() {
        return BrokerHasAdventures.relation;
    }
    
    static {
        BrokerHasAdventures.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.Broker.BrokerHasAdventures");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> keyFunction$$adventure = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.broker.domain.Adventure value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getRelationBrokerHasBulkRoomBookings() {
        return pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking.getRelationBrokerHasBulkRoomBookings();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> keyFunction$$roomBulkBooking = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getRelationDomainRootHasBrokerApplication() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootHasBrokerApplication();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Client> get$rl$client() {
        return get$$relationList("client", getRelationBrokerHasClients().getInverseRelation());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> get$rl$adventure() {
        return get$$relationList("adventure", getRelationBrokerHasAdventures());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> get$rl$roomBulkBooking() {
        return get$$relationList("roomBulkBooking", getRelationBrokerHasBulkRoomBookings().getInverseRelation());
        
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
    protected  Broker_Base() {
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
    
    public java.lang.String getNifAsSeller() {
        return ((DO_State)this.get$obj$state(false)).nifAsSeller;
    }
    
    public void setNifAsSeller(java.lang.String nifAsSeller) {
        ((DO_State)this.get$obj$state(true)).nifAsSeller = nifAsSeller;
    }
    
    private java.lang.String get$nifAsSeller() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).nifAsSeller;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$nifAsSeller(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).nifAsSeller = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getNifAsBuyer() {
        return ((DO_State)this.get$obj$state(false)).nifAsBuyer;
    }
    
    public void setNifAsBuyer(java.lang.String nifAsBuyer) {
        ((DO_State)this.get$obj$state(true)).nifAsBuyer = nifAsBuyer;
    }
    
    private java.lang.String get$nifAsBuyer() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).nifAsBuyer;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$nifAsBuyer(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).nifAsBuyer = (java.lang.String)((value == null) ? null : value);
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
    
    // Role Methods
    
    public void addClient(pt.ulisboa.tecnico.softeng.broker.domain.Client client) {
        getRelationBrokerHasClients().add(client, (pt.ulisboa.tecnico.softeng.broker.domain.Broker)this);
    }
    
    public void removeClient(pt.ulisboa.tecnico.softeng.broker.domain.Client client) {
        getRelationBrokerHasClients().remove(client, (pt.ulisboa.tecnico.softeng.broker.domain.Broker)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Client> getClientSet() {
        return get$rl$client();
    }
    
    public void set$client(OJBFunctionalSetWrapper client) {
        get$rl$client().setFromOJB(this, "client", client);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Client> getClient() {
        return getClientSet();
    }
    
    @Deprecated
    public int getClientCount() {
        return getClientSet().size();
    }
    
    public void addAdventure(pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure) {
        getRelationBrokerHasAdventures().add((pt.ulisboa.tecnico.softeng.broker.domain.Broker)this, adventure);
    }
    
    public void removeAdventure(pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure) {
        getRelationBrokerHasAdventures().remove((pt.ulisboa.tecnico.softeng.broker.domain.Broker)this, adventure);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getAdventureSet() {
        return get$rl$adventure();
    }
    
    public void set$adventure(OJBFunctionalSetWrapper adventure) {
        get$rl$adventure().setFromOJB(this, "adventure", adventure);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getAdventure() {
        return getAdventureSet();
    }
    
    @Deprecated
    public int getAdventureCount() {
        return getAdventureSet().size();
    }
    
    public void addRoomBulkBooking(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking roomBulkBooking) {
        getRelationBrokerHasBulkRoomBookings().add(roomBulkBooking, (pt.ulisboa.tecnico.softeng.broker.domain.Broker)this);
    }
    
    public void removeRoomBulkBooking(pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking roomBulkBooking) {
        getRelationBrokerHasBulkRoomBookings().remove(roomBulkBooking, (pt.ulisboa.tecnico.softeng.broker.domain.Broker)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getRoomBulkBookingSet() {
        return get$rl$roomBulkBooking();
    }
    
    public void set$roomBulkBooking(OJBFunctionalSetWrapper roomBulkBooking) {
        get$rl$roomBulkBooking().setFromOJB(this, "roomBulkBooking", roomBulkBooking);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.broker.domain.BulkRoomBooking> getRoomBulkBooking() {
        return getRoomBulkBookingSet();
    }
    
    @Deprecated
    public int getRoomBulkBookingCount() {
        return getRoomBulkBookingSet().size();
    }
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootHasBrokerApplication().add(root, (pt.ulisboa.tecnico.softeng.broker.domain.Broker)this);
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
        if (get$rl$client().size() > 0) handleAttemptToDeleteConnectedObject("Client");
        if (get$rl$adventure().size() > 0) handleAttemptToDeleteConnectedObject("Adventure");
        if (get$rl$roomBulkBooking().size() > 0) handleAttemptToDeleteConnectedObject("RoomBulkBooking");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$code(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CODE"), state);
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$nifAsSeller(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF_AS_SELLER"), state);
        set$nifAsBuyer(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF_AS_BUYER"), state);
        set$iban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "IBAN"), state);
        set$counter(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "COUNTER"), state);
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("client")) return getRelationBrokerHasClients().getInverseRelation();
        if (attrName.equals("adventure")) return getRelationBrokerHasAdventures();
        if (attrName.equals("roomBulkBooking")) return getRelationBrokerHasBulkRoomBookings().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("client", getRelationBrokerHasClients().getInverseRelation());
        get$$relationList("adventure", getRelationBrokerHasAdventures());
        get$$relationList("roomBulkBooking", getRelationBrokerHasBulkRoomBookings().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String code;
        private java.lang.String name;
        private java.lang.String nifAsSeller;
        private java.lang.String nifAsBuyer;
        private java.lang.String iban;
        private int counter;
        private pt.ist.fenixframework.DomainRoot root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.code = this.code;
            newCasted.name = this.name;
            newCasted.nifAsSeller = this.nifAsSeller;
            newCasted.nifAsBuyer = this.nifAsBuyer;
            newCasted.iban = this.iban;
            newCasted.counter = this.counter;
            newCasted.root = this.root;
            
        }
        
    }
    
}
