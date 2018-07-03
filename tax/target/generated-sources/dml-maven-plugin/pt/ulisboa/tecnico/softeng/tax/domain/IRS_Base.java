package pt.ulisboa.tecnico.softeng.tax.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class IRS_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> role$$taxPayer = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> getSet(pt.ulisboa.tecnico.softeng.tax.domain.IRS o1) {
            return ((IRS_Base)o1).get$rl$taxPayer();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer.role$$irs;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> role$$invoice = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getSet(pt.ulisboa.tecnico.softeng.tax.domain.IRS o1) {
            return ((IRS_Base)o1).get$rl$invoice();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.Invoice.role$$irs;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.softeng.tax.domain.IRS o1) {
            return ((IRS_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.IRS o1, pt.ist.fenixframework.DomainRoot o2) {
            ((IRS_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$irs;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> role$$itemType = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.ItemType>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.tax.domain.ItemType> getSet(pt.ulisboa.tecnico.softeng.tax.domain.IRS o1) {
            return ((IRS_Base)o1).get$rl$itemType();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.ItemType.role$$irs;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getRelationIRSHasTaxPayers() {
        return pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer.getRelationIRSHasTaxPayers();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> keyFunction$$taxPayer = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class IRSHasInvoices {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>(role$$invoice, "IRSHasInvoices");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getRelationIRSHasInvoices() {
        return IRSHasInvoices.relation;
    }
    
    static {
        IRSHasInvoices.relation.setRelationName("pt.ulisboa.tecnico.softeng.tax.domain.IRS.IRSHasInvoices");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> keyFunction$$invoice = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.tax.domain.Invoice value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getRelationDomainRootHasIRSApplication() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootHasIRSApplication();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.IRS> getRelationIRSHasItemTypes() {
        return pt.ulisboa.tecnico.softeng.tax.domain.ItemType.getRelationIRSHasItemTypes();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> keyFunction$$itemType = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.ItemType>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.tax.domain.ItemType value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> get$rl$taxPayer() {
        return get$$relationList("taxPayer", getRelationIRSHasTaxPayers().getInverseRelation());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> get$rl$invoice() {
        return get$$relationList("invoice", getRelationIRSHasInvoices());
        
    }
    private RelationList<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> get$rl$itemType() {
        return get$$relationList("itemType", getRelationIRSHasItemTypes().getInverseRelation());
        
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
    protected  IRS_Base() {
        super();
    }
    
    // Getters and Setters
    
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
    
    public void addTaxPayer(pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer taxPayer) {
        getRelationIRSHasTaxPayers().add(taxPayer, (pt.ulisboa.tecnico.softeng.tax.domain.IRS)this);
    }
    
    public void removeTaxPayer(pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer taxPayer) {
        getRelationIRSHasTaxPayers().remove(taxPayer, (pt.ulisboa.tecnico.softeng.tax.domain.IRS)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> getTaxPayerSet() {
        return get$rl$taxPayer();
    }
    
    public void set$taxPayer(OJBFunctionalSetWrapper taxPayer) {
        get$rl$taxPayer().setFromOJB(this, "taxPayer", taxPayer);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer> getTaxPayer() {
        return getTaxPayerSet();
    }
    
    @Deprecated
    public int getTaxPayerCount() {
        return getTaxPayerSet().size();
    }
    
    public void addInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationIRSHasInvoices().add((pt.ulisboa.tecnico.softeng.tax.domain.IRS)this, invoice);
    }
    
    public void removeInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationIRSHasInvoices().remove((pt.ulisboa.tecnico.softeng.tax.domain.IRS)this, invoice);
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
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootHasIRSApplication().add(root, (pt.ulisboa.tecnico.softeng.tax.domain.IRS)this);
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
    
    public void addItemType(pt.ulisboa.tecnico.softeng.tax.domain.ItemType itemType) {
        getRelationIRSHasItemTypes().add(itemType, (pt.ulisboa.tecnico.softeng.tax.domain.IRS)this);
    }
    
    public void removeItemType(pt.ulisboa.tecnico.softeng.tax.domain.ItemType itemType) {
        getRelationIRSHasItemTypes().remove(itemType, (pt.ulisboa.tecnico.softeng.tax.domain.IRS)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.ItemType> getItemTypeSet() {
        return get$rl$itemType();
    }
    
    public void set$itemType(OJBFunctionalSetWrapper itemType) {
        get$rl$itemType().setFromOJB(this, "itemType", itemType);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.tax.domain.ItemType> getItemType() {
        return getItemTypeSet();
    }
    
    @Deprecated
    public int getItemTypeCount() {
        return getItemTypeSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$taxPayer().size() > 0) handleAttemptToDeleteConnectedObject("TaxPayer");
        if (get$rl$invoice().size() > 0) handleAttemptToDeleteConnectedObject("Invoice");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        if (get$rl$itemType().size() > 0) handleAttemptToDeleteConnectedObject("ItemType");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$counter(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "COUNTER"), state);
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("taxPayer")) return getRelationIRSHasTaxPayers().getInverseRelation();
        if (attrName.equals("invoice")) return getRelationIRSHasInvoices();
        if (attrName.equals("itemType")) return getRelationIRSHasItemTypes().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("taxPayer", getRelationIRSHasTaxPayers().getInverseRelation());
        get$$relationList("invoice", getRelationIRSHasInvoices());
        get$$relationList("itemType", getRelationIRSHasItemTypes().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private int counter;
        private pt.ist.fenixframework.DomainRoot root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.counter = this.counter;
            newCasted.root = this.root;
            
        }
        
    }
    
}
