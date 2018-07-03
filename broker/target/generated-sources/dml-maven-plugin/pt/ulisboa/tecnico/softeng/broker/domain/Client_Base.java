package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Client_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker> role$$broker = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.Broker getValue(pt.ulisboa.tecnico.softeng.broker.domain.Client o1) {
            return ((Client_Base.DO_State)o1.get$obj$state(false)).broker;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Client o1, pt.ulisboa.tecnico.softeng.broker.domain.Broker o2) {
            ((Client_Base.DO_State)o1.get$obj$state(true)).broker = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Client> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Broker.role$$client;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> role$$adventure = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getSet(pt.ulisboa.tecnico.softeng.broker.domain.Client o1) {
            return ((Client_Base)o1).get$rl$adventure();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Client> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Adventure.role$$client;
        }
        
    };
    
    private final static class BrokerHasClients {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker>(role$$broker, "BrokerHasClients");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Broker> getRelationBrokerHasClients() {
        return BrokerHasClients.relation;
    }
    
    static {
        BrokerHasClients.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.Client.BrokerHasClients");
    }
    
    private final static class AdventureHasClient {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>(role$$adventure, "AdventureHasClient");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationAdventureHasClient() {
        return AdventureHasClient.relation;
    }
    
    static {
        AdventureHasClient.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.Client.AdventureHasClient");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> keyFunction$$adventure = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.broker.domain.Adventure value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> get$rl$adventure() {
        return get$$relationList("adventure", getRelationAdventureHasClient());
        
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
    protected  Client_Base() {
        super();
    }
    
    // Getters and Setters
    
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
    
    public java.lang.String getDrivingLicense() {
        return ((DO_State)this.get$obj$state(false)).drivingLicense;
    }
    
    public void setDrivingLicense(java.lang.String drivingLicense) {
        ((DO_State)this.get$obj$state(true)).drivingLicense = drivingLicense;
    }
    
    private java.lang.String get$drivingLicense() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).drivingLicense;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$drivingLicense(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).drivingLicense = (java.lang.String)((value == null) ? null : value);
    }
    
    public int getAge() {
        return ((DO_State)this.get$obj$state(false)).age;
    }
    
    public void setAge(int age) {
        ((DO_State)this.get$obj$state(true)).age = age;
    }
    
    private int get$age() {
        int value = ((DO_State)this.get$obj$state(false)).age;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$age(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).age = (int)(value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.broker.domain.Broker getBroker() {
        return ((DO_State)this.get$obj$state(false)).broker;
    }
    
    public void setBroker(pt.ulisboa.tecnico.softeng.broker.domain.Broker broker) {
        getRelationBrokerHasClients().add((pt.ulisboa.tecnico.softeng.broker.domain.Client)this, broker);
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
    
    public void addAdventure(pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure) {
        getRelationAdventureHasClient().add((pt.ulisboa.tecnico.softeng.broker.domain.Client)this, adventure);
    }
    
    public void removeAdventure(pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure) {
        getRelationAdventureHasClient().remove((pt.ulisboa.tecnico.softeng.broker.domain.Client)this, adventure);
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
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.broker != null) handleAttemptToDeleteConnectedObject("Broker");
        if (get$rl$adventure().size() > 0) handleAttemptToDeleteConnectedObject("Adventure");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$iban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "IBAN"), state);
        set$nif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF"), state);
        set$drivingLicense(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DRIVING_LICENSE"), state);
        set$age(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "AGE"), state);
        castedState.broker = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BROKER");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("adventure")) return getRelationAdventureHasClient();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("adventure", getRelationAdventureHasClient());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String iban;
        private java.lang.String nif;
        private java.lang.String drivingLicense;
        private int age;
        private pt.ulisboa.tecnico.softeng.broker.domain.Broker broker;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.iban = this.iban;
            newCasted.nif = this.nif;
            newCasted.drivingLicense = this.drivingLicense;
            newCasted.age = this.age;
            newCasted.broker = this.broker;
            
        }
        
    }
    
}
