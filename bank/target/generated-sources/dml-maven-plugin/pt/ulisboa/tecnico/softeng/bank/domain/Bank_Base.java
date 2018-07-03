package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Bank_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Client> role$$client = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Client>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.bank.domain.Client> getSet(pt.ulisboa.tecnico.softeng.bank.domain.Bank o1) {
            return ((Bank_Base)o1).get$rl$client();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Client.role$$bank;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.softeng.bank.domain.Bank o1) {
            return ((Bank_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Bank o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Bank_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$bank;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Operation> role$$operation = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Operation>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.bank.domain.Operation> getSet(pt.ulisboa.tecnico.softeng.bank.domain.Bank o1) {
            return ((Bank_Base)o1).get$rl$operation();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Operation.role$$bank;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> role$$account = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.bank.domain.Account> getSet(pt.ulisboa.tecnico.softeng.bank.domain.Bank o1) {
            return ((Bank_Base)o1).get$rl$account();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Account.role$$bank;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getRelationBankHasClients() {
        return pt.ulisboa.tecnico.softeng.bank.domain.Client.getRelationBankHasClients();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Client> keyFunction$$client = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Client>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.bank.domain.Client value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getRelationDomainRootHasBankApplication() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootHasBankApplication();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getRelationBankHasOperation() {
        return pt.ulisboa.tecnico.softeng.bank.domain.Operation.getRelationBankHasOperation();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Operation> keyFunction$$operation = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Operation>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.bank.domain.Operation value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BankHasAccounts {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account>(role$$account, "BankHasAccounts");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationBankHasAccounts() {
        return BankHasAccounts.relation;
    }
    
    static {
        BankHasAccounts.relation.setRelationName("pt.ulisboa.tecnico.softeng.bank.domain.Bank.BankHasAccounts");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Account> keyFunction$$account = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Account>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.bank.domain.Account value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Client> get$rl$client() {
        return get$$relationList("client", getRelationBankHasClients().getInverseRelation());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Operation> get$rl$operation() {
        return get$$relationList("operation", getRelationBankHasOperation().getInverseRelation());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> get$rl$account() {
        return get$$relationList("account", getRelationBankHasAccounts());
        
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
    protected  Bank_Base() {
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
    
    public void addClient(pt.ulisboa.tecnico.softeng.bank.domain.Client client) {
        getRelationBankHasClients().add(client, (pt.ulisboa.tecnico.softeng.bank.domain.Bank)this);
    }
    
    public void removeClient(pt.ulisboa.tecnico.softeng.bank.domain.Client client) {
        getRelationBankHasClients().remove(client, (pt.ulisboa.tecnico.softeng.bank.domain.Bank)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Client> getClientSet() {
        return get$rl$client();
    }
    
    public void set$client(OJBFunctionalSetWrapper client) {
        get$rl$client().setFromOJB(this, "client", client);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Client> getClient() {
        return getClientSet();
    }
    
    @Deprecated
    public int getClientCount() {
        return getClientSet().size();
    }
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootHasBankApplication().add(root, (pt.ulisboa.tecnico.softeng.bank.domain.Bank)this);
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
    
    public void addOperation(pt.ulisboa.tecnico.softeng.bank.domain.Operation operation) {
        getRelationBankHasOperation().add(operation, (pt.ulisboa.tecnico.softeng.bank.domain.Bank)this);
    }
    
    public void removeOperation(pt.ulisboa.tecnico.softeng.bank.domain.Operation operation) {
        getRelationBankHasOperation().remove(operation, (pt.ulisboa.tecnico.softeng.bank.domain.Bank)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Operation> getOperationSet() {
        return get$rl$operation();
    }
    
    public void set$operation(OJBFunctionalSetWrapper operation) {
        get$rl$operation().setFromOJB(this, "operation", operation);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.bank.domain.Operation> getOperation() {
        return getOperationSet();
    }
    
    @Deprecated
    public int getOperationCount() {
        return getOperationSet().size();
    }
    
    public void addAccount(pt.ulisboa.tecnico.softeng.bank.domain.Account account) {
        getRelationBankHasAccounts().add((pt.ulisboa.tecnico.softeng.bank.domain.Bank)this, account);
    }
    
    public void removeAccount(pt.ulisboa.tecnico.softeng.bank.domain.Account account) {
        getRelationBankHasAccounts().remove((pt.ulisboa.tecnico.softeng.bank.domain.Bank)this, account);
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
        if (get$rl$client().size() > 0) handleAttemptToDeleteConnectedObject("Client");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        if (get$rl$operation().size() > 0) handleAttemptToDeleteConnectedObject("Operation");
        if (get$rl$account().size() > 0) handleAttemptToDeleteConnectedObject("Account");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$code(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CODE"), state);
        set$counter(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "COUNTER"), state);
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("client")) return getRelationBankHasClients().getInverseRelation();
        if (attrName.equals("operation")) return getRelationBankHasOperation().getInverseRelation();
        if (attrName.equals("account")) return getRelationBankHasAccounts();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("client", getRelationBankHasClients().getInverseRelation());
        get$$relationList("operation", getRelationBankHasOperation().getInverseRelation());
        get$$relationList("account", getRelationBankHasAccounts());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private java.lang.String code;
        private int counter;
        private pt.ist.fenixframework.DomainRoot root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.code = this.code;
            newCasted.counter = this.counter;
            newCasted.root = this.root;
            
        }
        
    }
    
}
