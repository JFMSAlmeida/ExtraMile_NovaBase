package pt.ulisboa.tecnico.softeng.tax.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class TaxPayer_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS> role$$irs = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.IRS getValue(pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer o1) {
            return ((TaxPayer_Base.DO_State)o1.get$obj$state(false)).irs;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer o1, pt.ulisboa.tecnico.softeng.tax.domain.IRS o2) {
            ((TaxPayer_Base.DO_State)o1.get$obj$state(true)).irs = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.IRS.role$$taxPayer;
        }
        
    };
    
    private final static class IRSHasTaxPayers {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS>(role$$irs, "IRSHasTaxPayers");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getRelationIRSHasTaxPayers() {
        return IRSHasTaxPayers.relation;
    }
    
    static {
        IRSHasTaxPayers.relation.setRelationName("pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer.IRSHasTaxPayers");
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
    protected  TaxPayer_Base() {
        super();
    }
    
    // Getters and Setters
    
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
    
    public java.lang.String getAddress() {
        return ((DO_State)this.get$obj$state(false)).address;
    }
    
    public void setAddress(java.lang.String address) {
        ((DO_State)this.get$obj$state(true)).address = address;
    }
    
    private java.lang.String get$address() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).address;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$address(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).address = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.tax.domain.IRS getIrs() {
        return ((DO_State)this.get$obj$state(false)).irs;
    }
    
    public void setIrs(pt.ulisboa.tecnico.softeng.tax.domain.IRS irs) {
        getRelationIRSHasTaxPayers().add((pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer)this, irs);
    }
    
    private java.lang.Long get$oidIrs() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).irs;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfIrs() {
        if (getIrs() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.irs != null) handleAttemptToDeleteConnectedObject("Irs");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$nif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF"), state);
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$address(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ADDRESS"), state);
        castedState.irs = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_IRS");
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
        private java.lang.String nif;
        private java.lang.String name;
        private java.lang.String address;
        private pt.ulisboa.tecnico.softeng.tax.domain.IRS irs;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.nif = this.nif;
            newCasted.name = this.name;
            newCasted.address = this.address;
            newCasted.irs = this.irs;
            
        }
        
    }
    
}
