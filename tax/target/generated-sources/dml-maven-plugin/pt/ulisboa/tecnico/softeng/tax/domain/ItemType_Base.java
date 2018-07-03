package pt.ulisboa.tecnico.softeng.tax.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class ItemType_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> role$$invoice = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getSet(pt.ulisboa.tecnico.softeng.tax.domain.ItemType o1) {
            return ((ItemType_Base)o1).get$rl$invoice();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.Invoice.role$$itemType;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS> role$$irs = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.IRS getValue(pt.ulisboa.tecnico.softeng.tax.domain.ItemType o1) {
            return ((ItemType_Base.DO_State)o1.get$obj$state(false)).irs;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.ItemType o1, pt.ulisboa.tecnico.softeng.tax.domain.IRS o2) {
            ((ItemType_Base.DO_State)o1.get$obj$state(true)).irs = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.IRS.role$$itemType;
        }
        
    };
    
    private final static class ItemTypeHasInvoices {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>(role$$invoice, "ItemTypeHasInvoices");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getRelationItemTypeHasInvoices() {
        return ItemTypeHasInvoices.relation;
    }
    
    static {
        ItemTypeHasInvoices.relation.setRelationName("pt.ulisboa.tecnico.softeng.tax.domain.ItemType.ItemTypeHasInvoices");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> keyFunction$$invoice = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.tax.domain.Invoice value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class IRSHasItemTypes {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS>(role$$irs, "IRSHasItemTypes");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getRelationIRSHasItemTypes() {
        return IRSHasItemTypes.relation;
    }
    
    static {
        IRSHasItemTypes.relation.setRelationName("pt.ulisboa.tecnico.softeng.tax.domain.ItemType.IRSHasItemTypes");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> get$rl$invoice() {
        return get$$relationList("invoice", getRelationItemTypeHasInvoices());
        
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
    protected  ItemType_Base() {
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
    
    public int getTax() {
        return ((DO_State)this.get$obj$state(false)).tax;
    }
    
    public void setTax(int tax) {
        ((DO_State)this.get$obj$state(true)).tax = tax;
    }
    
    private int get$tax() {
        int value = ((DO_State)this.get$obj$state(false)).tax;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$tax(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).tax = (int)(value);
    }
    
    // Role Methods
    
    public void addInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationItemTypeHasInvoices().add((pt.ulisboa.tecnico.softeng.tax.domain.ItemType)this, invoice);
    }
    
    public void removeInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationItemTypeHasInvoices().remove((pt.ulisboa.tecnico.softeng.tax.domain.ItemType)this, invoice);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInvoiceSet() {
        return get$rl$invoice();
    }
    
    public void set$invoice(OJBFunctionalSetWrapper invoice) {
        get$rl$invoice().setFromOJB(this, "invoice", invoice);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInvoice() {
        return getInvoiceSet();
    }
    
    @Deprecated
    public int getInvoiceCount() {
        return getInvoiceSet().size();
    }
    
    public pt.ulisboa.tecnico.softeng.tax.domain.IRS getIrs() {
        return ((DO_State)this.get$obj$state(false)).irs;
    }
    
    public void setIrs(pt.ulisboa.tecnico.softeng.tax.domain.IRS irs) {
        getRelationIRSHasItemTypes().add((pt.ulisboa.tecnico.softeng.tax.domain.ItemType)this, irs);
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
        if (get$rl$invoice().size() > 0) handleAttemptToDeleteConnectedObject("Invoice");
        if (castedState.irs != null) handleAttemptToDeleteConnectedObject("Irs");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$tax(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "TAX"), state);
        castedState.irs = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_IRS");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("invoice")) return getRelationItemTypeHasInvoices();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("invoice", getRelationItemTypeHasInvoices());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private int tax;
        private pt.ulisboa.tecnico.softeng.tax.domain.IRS irs;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.tax = this.tax;
            newCasted.irs = this.irs;
            
        }
        
    }
    
}
