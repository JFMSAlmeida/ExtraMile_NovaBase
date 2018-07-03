package pt.ulisboa.tecnico.softeng.tax.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Buyer_Base extends pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.Buyer,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> role$$invoice = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.tax.domain.Buyer,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getSet(pt.ulisboa.tecnico.softeng.tax.domain.Buyer o1) {
            return ((Buyer_Base)o1).get$rl$invoice();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.Invoice.role$$buyer;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer> getRelationBuyerHasInvoices() {
        return pt.ulisboa.tecnico.softeng.tax.domain.Invoice.getRelationBuyerHasInvoices();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> keyFunction$$invoice = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.tax.domain.Invoice>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.tax.domain.Invoice value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.tax.domain.Buyer,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> get$rl$invoice() {
        return get$$relationList("invoice", getRelationBuyerHasInvoices().getInverseRelation());
        
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
    protected  Buyer_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationBuyerHasInvoices().add(invoice, (pt.ulisboa.tecnico.softeng.tax.domain.Buyer)this);
    }
    
    public void removeInvoice(pt.ulisboa.tecnico.softeng.tax.domain.Invoice invoice) {
        getRelationBuyerHasInvoices().remove(invoice, (pt.ulisboa.tecnico.softeng.tax.domain.Buyer)this);
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
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$invoice().size() > 0) handleAttemptToDeleteConnectedObject("Invoice");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("invoice")) return getRelationBuyerHasInvoices().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("invoice", getRelationBuyerHasInvoices().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ulisboa.tecnico.softeng.tax.domain.TaxPayer.DO_State {
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            
        }
        
    }
    
}
