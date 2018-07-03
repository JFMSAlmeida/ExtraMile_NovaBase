package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Client_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank> role$$bank = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank>() {
        @Override
        public pt.ulisboa.tecnico.softeng.bank.domain.Bank getValue(pt.ulisboa.tecnico.softeng.bank.domain.Client o1) {
            return ((Client_Base.DO_State)o1.get$obj$state(false)).bank;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Client o1, pt.ulisboa.tecnico.softeng.bank.domain.Bank o2) {
            ((Client_Base.DO_State)o1.get$obj$state(true)).bank = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Client> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Bank.role$$client;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> role$$account = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.bank.domain.Account> getSet(pt.ulisboa.tecnico.softeng.bank.domain.Client o1) {
            return ((Client_Base)o1).get$rl$account();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Client> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Account.role$$client;
        }
        
    };
    
    private final static class BankHasClients {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank>(role$$bank, "BankHasClients");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getRelationBankHasClients() {
        return BankHasClients.relation;
    }
    
    static {
        BankHasClients.relation.setRelationName("pt.ulisboa.tecnico.softeng.bank.domain.Client.BankHasClients");
    }
    
    private final static class ClientHasAccounts {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account>(role$$account, "ClientHasAccounts");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationClientHasAccounts() {
        return ClientHasAccounts.relation;
    }
    
    static {
        ClientHasAccounts.relation.setRelationName("pt.ulisboa.tecnico.softeng.bank.domain.Client.ClientHasAccounts");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Account> keyFunction$$account = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Account>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.bank.domain.Account value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> get$rl$account() {
        return get$$relationList("account", getRelationClientHasAccounts());
        
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
    
    public java.lang.String getID() {
        return ((DO_State)this.get$obj$state(false)).ID;
    }
    
    public void setID(java.lang.String ID) {
        ((DO_State)this.get$obj$state(true)).ID = ID;
    }
    
    private java.lang.String get$ID() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).ID;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$ID(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).ID = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Bank getBank() {
        return ((DO_State)this.get$obj$state(false)).bank;
    }
    
    public void setBank(pt.ulisboa.tecnico.softeng.bank.domain.Bank bank) {
        getRelationBankHasClients().add((pt.ulisboa.tecnico.softeng.bank.domain.Client)this, bank);
    }
    
    private java.lang.Long get$oidBank() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bank;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBank() {
        if (getBank() == null) return false;
        return true;
    }
    
    public void addAccount(pt.ulisboa.tecnico.softeng.bank.domain.Account account) {
        getRelationClientHasAccounts().add((pt.ulisboa.tecnico.softeng.bank.domain.Client)this, account);
    }
    
    public void removeAccount(pt.ulisboa.tecnico.softeng.bank.domain.Account account) {
        getRelationClientHasAccounts().remove((pt.ulisboa.tecnico.softeng.bank.domain.Client)this, account);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Account> getAccountSet() {
        return get$rl$account();
    }
    
    public void set$account(OJBFunctionalSetWrapper account) {
        get$rl$account().setFromOJB(this, "account", account);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Account> getAccount() {
        return getAccountSet();
    }
    
    @Deprecated
    public int getAccountCount() {
        return getAccountSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.bank != null) handleAttemptToDeleteConnectedObject("Bank");
        if (get$rl$account().size() > 0) handleAttemptToDeleteConnectedObject("Account");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$ID(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "I_D"), state);
        castedState.bank = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BANK");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("account")) return getRelationClientHasAccounts();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("account", getRelationClientHasAccounts());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private java.lang.String ID;
        private pt.ulisboa.tecnico.softeng.bank.domain.Bank bank;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.ID = this.ID;
            newCasted.bank = this.bank;
            
        }
        
    }
    
}
