package pt.ulisboa.tecnico.softeng.bank.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Operation_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank> role$$bank = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank>() {
        @Override
        public pt.ulisboa.tecnico.softeng.bank.domain.Bank getValue(pt.ulisboa.tecnico.softeng.bank.domain.Operation o1) {
            return ((Operation_Base.DO_State)o1.get$obj$state(false)).bank;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Operation o1, pt.ulisboa.tecnico.softeng.bank.domain.Bank o2) {
            ((Operation_Base.DO_State)o1.get$obj$state(true)).bank = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Bank,pt.ulisboa.tecnico.softeng.bank.domain.Operation> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Bank.role$$operation;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account> role$$account = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account>() {
        @Override
        public pt.ulisboa.tecnico.softeng.bank.domain.Account getValue(pt.ulisboa.tecnico.softeng.bank.domain.Operation o1) {
            return ((Operation_Base.DO_State)o1.get$obj$state(false)).account;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.bank.domain.Operation o1, pt.ulisboa.tecnico.softeng.bank.domain.Account o2) {
            ((Operation_Base.DO_State)o1.get$obj$state(true)).account = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.bank.domain.Account,pt.ulisboa.tecnico.softeng.bank.domain.Operation> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.bank.domain.Account.role$$operation;
        }
        
    };
    
    private final static class BankHasOperation {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank>(role$$bank, "BankHasOperation");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Bank> getRelationBankHasOperation() {
        return BankHasOperation.relation;
    }
    
    static {
        BankHasOperation.relation.setRelationName("pt.ulisboa.tecnico.softeng.bank.domain.Operation.BankHasOperation");
    }
    
    private final static class AccountHasOperation {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account>(role$$account, "AccountHasOperation");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.bank.domain.Operation,pt.ulisboa.tecnico.softeng.bank.domain.Account> getRelationAccountHasOperation() {
        return AccountHasOperation.relation;
    }
    
    static {
        AccountHasOperation.relation.setRelationName("pt.ulisboa.tecnico.softeng.bank.domain.Operation.AccountHasOperation");
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
    protected  Operation_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getReference() {
        return ((DO_State)this.get$obj$state(false)).reference;
    }
    
    public void setReference(java.lang.String reference) {
        ((DO_State)this.get$obj$state(true)).reference = reference;
    }
    
    private java.lang.String get$reference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).reference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$reference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).reference = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getCancellation() {
        return ((DO_State)this.get$obj$state(false)).cancellation;
    }
    
    public void setCancellation(java.lang.String cancellation) {
        ((DO_State)this.get$obj$state(true)).cancellation = cancellation;
    }
    
    private java.lang.String get$cancellation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).cancellation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$cancellation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancellation = (java.lang.String)((value == null) ? null : value);
    }
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type getType() {
        return ((DO_State)this.get$obj$state(false)).type;
    }
    
    public void setType(pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type type) {
        ((DO_State)this.get$obj$state(true)).type = type;
    }
    
    private java.lang.String get$type() {
        pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type value = ((DO_State)this.get$obj$state(false)).type;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForEnum(value);
    }
    
    private final void set$type(pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).type = (pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type)((value == null) ? null : value);
    }
    
    public double getValue() {
        return ((DO_State)this.get$obj$state(false)).value;
    }
    
    public void setValue(double value) {
        ((DO_State)this.get$obj$state(true)).value = value;
    }
    
    private double get$value() {
        double value = ((DO_State)this.get$obj$state(false)).value;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$value(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).value = (double)(value);
    }
    
    public org.joda.time.DateTime getTime() {
        return ((DO_State)this.get$obj$state(false)).time;
    }
    
    public void setTime(org.joda.time.DateTime time) {
        ((DO_State)this.get$obj$state(true)).time = time;
    }
    
    private java.sql.Timestamp get$time() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).time;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$time(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).time = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public java.lang.String getTransactionSource() {
        return ((DO_State)this.get$obj$state(false)).transactionSource;
    }
    
    public void setTransactionSource(java.lang.String transactionSource) {
        ((DO_State)this.get$obj$state(true)).transactionSource = transactionSource;
    }
    
    private java.lang.String get$transactionSource() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).transactionSource;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$transactionSource(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).transactionSource = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getTransactionReference() {
        return ((DO_State)this.get$obj$state(false)).transactionReference;
    }
    
    public void setTransactionReference(java.lang.String transactionReference) {
        ((DO_State)this.get$obj$state(true)).transactionReference = transactionReference;
    }
    
    private java.lang.String get$transactionReference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).transactionReference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$transactionReference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).transactionReference = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Bank getBank() {
        return ((DO_State)this.get$obj$state(false)).bank;
    }
    
    public void setBank(pt.ulisboa.tecnico.softeng.bank.domain.Bank bank) {
        getRelationBankHasOperation().add((pt.ulisboa.tecnico.softeng.bank.domain.Operation)this, bank);
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
    
    public pt.ulisboa.tecnico.softeng.bank.domain.Account getAccount() {
        return ((DO_State)this.get$obj$state(false)).account;
    }
    
    public void setAccount(pt.ulisboa.tecnico.softeng.bank.domain.Account account) {
        getRelationAccountHasOperation().add((pt.ulisboa.tecnico.softeng.bank.domain.Operation)this, account);
    }
    
    private java.lang.Long get$oidAccount() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).account;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfAccount() {
        if (getAccount() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.bank != null) handleAttemptToDeleteConnectedObject("Bank");
        if (castedState.account != null) handleAttemptToDeleteConnectedObject("Account");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$reference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "REFERENCE"), state);
        set$cancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLATION"), state);
        set$type(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readEnum(pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type.class, rs, "TYPE"), state);
        set$value(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "VALUE"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        set$transactionSource(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "TRANSACTION_SOURCE"), state);
        set$transactionReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "TRANSACTION_REFERENCE"), state);
        castedState.bank = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BANK");
        castedState.account = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ACCOUNT");
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
        private java.lang.String reference;
        private java.lang.String cancellation;
        private pt.ulisboa.tecnico.softeng.bank.domain.Operation.Type type;
        private double value;
        private org.joda.time.DateTime time;
        private java.lang.String transactionSource;
        private java.lang.String transactionReference;
        private pt.ulisboa.tecnico.softeng.bank.domain.Bank bank;
        private pt.ulisboa.tecnico.softeng.bank.domain.Account account;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.reference = this.reference;
            newCasted.cancellation = this.cancellation;
            newCasted.type = this.type;
            newCasted.value = this.value;
            newCasted.time = this.time;
            newCasted.transactionSource = this.transactionSource;
            newCasted.transactionReference = this.transactionReference;
            newCasted.bank = this.bank;
            newCasted.account = this.account;
            
        }
        
    }
    
}
