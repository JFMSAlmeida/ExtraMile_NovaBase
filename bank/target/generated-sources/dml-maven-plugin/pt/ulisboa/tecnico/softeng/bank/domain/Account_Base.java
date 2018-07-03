package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Account_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Client> role$$client = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Client>() {
        @Override
        public pt.ulisboa.tecnico.softeng.bank.domain.Client getValue(pt.ulisboa.tecnico.softeng.bank.domain.Account o1) {
            return ((Account_Base.DO_State)o1.get$obj$state(false)).client;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Account o1, pt.ulisboa.tecnico.softeng.bank.domain.Client o2) {
            ((Account_Base.DO_State)o1.get$obj$state(true)).client = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Client.role$$account;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Operation> role$$operation = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Operation>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.bank.domain.Operation> getSet(pt.ulisboa.tecnico.softeng.bank.domain.Account o1) {
            return ((Account_Base)o1).get$rl$operation();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Operation.role$$account;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Bank> role$$bank = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Bank>() {
        @Override
        public pt.ulisboa.tecnico.softeng.bank.domain.Bank getValue(pt.ulisboa.tecnico.softeng.bank.domain.Account o1) {
            return ((Account_Base.DO_State)o1.get$obj$state(false)).bank;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Account o1, pt.ulisboa.tecnico.softeng.bank.domain.Bank o2) {
            ((Account_Base.DO_State)o1.get$obj$state(true)).bank = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Bank.role$$account;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Client,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationClientHasAccounts() {
        return pt.ulisboa.tecnico.softeng.bank.domain.Client.getRelationClientHasAccounts();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationAccountHasOperation() {
        return pt.ulisboa.tecnico.softeng.bank.domain.Operation.getRelationAccountHasOperation();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Operation> keyFunction$$operation = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.bank.domain.Operation>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.bank.domain.Operation value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationBankHasAccounts() {
        return pt.ulisboa.tecnico.softeng.bank.domain.Bank.getRelationBankHasAccounts();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Operation> get$rl$operation() {
        return get$$relationList("operation", getRelationAccountHasOperation().getInverseRelation());
        
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
    protected  Account_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getIBAN() {
        return ((DO_State)this.get$obj$state(false)).IBAN;
    }
    
    public void setIBAN(java.lang.String IBAN) {
        ((DO_State)this.get$obj$state(true)).IBAN = IBAN;
    }
    
    private java.lang.String get$IBAN() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).IBAN;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$IBAN(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).IBAN = (java.lang.String)((value == null) ? null : value);
    }
    
    public double getBalance() {
        return ((DO_State)this.get$obj$state(false)).balance;
    }
    
    public void setBalance(double balance) {
        ((DO_State)this.get$obj$state(true)).balance = balance;
    }
    
    private double get$balance() {
        double value = ((DO_State)this.get$obj$state(false)).balance;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$balance(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).balance = (double)(value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Client getClient() {
        return ((DO_State)this.get$obj$state(false)).client;
    }
    
    public void setClient(pt.ulisboa.tecnico.softeng.bank.domain.Client client) {
        getRelationClientHasAccounts().add(client, (pt.ulisboa.tecnico.softeng.bank.domain.Account)this);
    }
    
    private java.lang.Long get$oidClient() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).client;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfClient() {
        if (getClient() == null) return false;
        return true;
    }
    
    public void addOperation(pt.ulisboa.tecnico.softeng.bank.domain.Operation operation) {
        getRelationAccountHasOperation().add(operation, (pt.ulisboa.tecnico.softeng.bank.domain.Account)this);
    }
    
    public void removeOperation(pt.ulisboa.tecnico.softeng.bank.domain.Operation operation) {
        getRelationAccountHasOperation().remove(operation, (pt.ulisboa.tecnico.softeng.bank.domain.Account)this);
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
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Bank getBank() {
        return ((DO_State)this.get$obj$state(false)).bank;
    }
    
    public void setBank(pt.ulisboa.tecnico.softeng.bank.domain.Bank bank) {
        getRelationBankHasAccounts().add(bank, (pt.ulisboa.tecnico.softeng.bank.domain.Account)this);
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
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.client != null) handleAttemptToDeleteConnectedObject("Client");
        if (get$rl$operation().size() > 0) handleAttemptToDeleteConnectedObject("Operation");
        if (castedState.bank != null) handleAttemptToDeleteConnectedObject("Bank");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$IBAN(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "I_B_A_N"), state);
        set$balance(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "BALANCE"), state);
        castedState.client = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CLIENT");
        castedState.bank = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BANK");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("operation")) return getRelationAccountHasOperation().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("operation", getRelationAccountHasOperation().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String IBAN;
        private double balance;
        private pt.ulisboa.tecnico.softeng.bank.domain.Client client;
        private pt.ulisboa.tecnico.softeng.bank.domain.Bank bank;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.IBAN = this.IBAN;
            newCasted.balance = this.balance;
            newCasted.client = this.client;
            newCasted.bank = this.bank;
            
        }
        
    }
    
}
