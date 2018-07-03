package pt.ulisboa.tecnico.softeng.tax.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Invoice_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.IRS> role$$irs = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.IRS>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.IRS getValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1) {
            return ((Invoice_Base.DO_State)o1.get$obj$state(false)).irs;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1, pt.ulisboa.tecnico.softeng.tax.domain.IRS o2) {
            ((Invoice_Base.DO_State)o1.get$obj$state(true)).irs = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.IRS.role$$invoice;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.ItemType> role$$itemType = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.ItemType>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.ItemType getValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1) {
            return ((Invoice_Base.DO_State)o1.get$obj$state(false)).itemType;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1, pt.ulisboa.tecnico.softeng.tax.domain.ItemType o2) {
            ((Invoice_Base.DO_State)o1.get$obj$state(true)).itemType = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.ItemType.role$$invoice;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer> role$$buyer = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.Buyer getValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1) {
            return ((Invoice_Base.DO_State)o1.get$obj$state(false)).buyer;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1, pt.ulisboa.tecnico.softeng.tax.domain.Buyer o2) {
            ((Invoice_Base.DO_State)o1.get$obj$state(true)).buyer = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.Buyer,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.Buyer.role$$invoice;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Seller> role$$seller = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Seller>() {
        @Override
        public pt.ulisboa.tecnico.softeng.tax.domain.Seller getValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1) {
            return ((Invoice_Base.DO_State)o1.get$obj$state(false)).seller;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.tax.domain.Invoice o1, pt.ulisboa.tecnico.softeng.tax.domain.Seller o2) {
            ((Invoice_Base.DO_State)o1.get$obj$state(true)).seller = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.tax.domain.Seller,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.tax.domain.Seller.role$$invoice;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.IRS,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getRelationIRSHasInvoices() {
        return pt.ulisboa.tecnico.softeng.tax.domain.IRS.getRelationIRSHasInvoices();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.ItemType,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getRelationItemTypeHasInvoices() {
        return pt.ulisboa.tecnico.softeng.tax.domain.ItemType.getRelationItemTypeHasInvoices();
    }
    
    private final static class BuyerHasInvoices {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer>(role$$buyer, "BuyerHasInvoices");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.Invoice,pt.ulisboa.tecnico.softeng.tax.domain.Buyer> getRelationBuyerHasInvoices() {
        return BuyerHasInvoices.relation;
    }
    
    static {
        BuyerHasInvoices.relation.setRelationName("pt.ulisboa.tecnico.softeng.tax.domain.Invoice.BuyerHasInvoices");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.tax.domain.Seller,pt.ulisboa.tecnico.softeng.tax.domain.Invoice> getRelationSellerHasInvoices() {
        return pt.ulisboa.tecnico.softeng.tax.domain.Seller.getRelationSellerHasInvoices();
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
    protected  Invoice_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getId() {
        return ((DO_State)this.get$obj$state(false)).id;
    }
    
    public void setId(java.lang.String id) {
        ((DO_State)this.get$obj$state(true)).id = id;
    }
    
    private java.lang.String get$id() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).id;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$id(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).id = (java.lang.String)((value == null) ? null : value);
    }
    
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
    
    public double getIva() {
        return ((DO_State)this.get$obj$state(false)).iva;
    }
    
    public void setIva(double iva) {
        ((DO_State)this.get$obj$state(true)).iva = iva;
    }
    
    private double get$iva() {
        double value = ((DO_State)this.get$obj$state(false)).iva;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$iva(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).iva = (double)(value);
    }
    
    public org.joda.time.LocalDate getDate() {
        return ((DO_State)this.get$obj$state(false)).date;
    }
    
    public void setDate(org.joda.time.LocalDate date) {
        ((DO_State)this.get$obj$state(true)).date = date;
    }
    
    private java.lang.String get$date() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).date;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$date(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).date = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public boolean getCancelled() {
        return ((DO_State)this.get$obj$state(false)).cancelled;
    }
    
    public void setCancelled(boolean cancelled) {
        ((DO_State)this.get$obj$state(true)).cancelled = cancelled;
    }
    
    private boolean get$cancelled() {
        boolean value = ((DO_State)this.get$obj$state(false)).cancelled;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForboolean(value);
    }
    
    private final void set$cancelled(boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancelled = (boolean)(value);
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
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.tax.domain.IRS getIrs() {
        return ((DO_State)this.get$obj$state(false)).irs;
    }
    
    public void setIrs(pt.ulisboa.tecnico.softeng.tax.domain.IRS irs) {
        getRelationIRSHasInvoices().add(irs, (pt.ulisboa.tecnico.softeng.tax.domain.Invoice)this);
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
    
    public pt.ulisboa.tecnico.softeng.tax.domain.ItemType getItemType() {
        return ((DO_State)this.get$obj$state(false)).itemType;
    }
    
    public void setItemType(pt.ulisboa.tecnico.softeng.tax.domain.ItemType itemType) {
        getRelationItemTypeHasInvoices().add(itemType, (pt.ulisboa.tecnico.softeng.tax.domain.Invoice)this);
    }
    
    private java.lang.Long get$oidItemType() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).itemType;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfItemType() {
        if (getItemType() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.tax.domain.Buyer getBuyer() {
        return ((DO_State)this.get$obj$state(false)).buyer;
    }
    
    public void setBuyer(pt.ulisboa.tecnico.softeng.tax.domain.Buyer buyer) {
        getRelationBuyerHasInvoices().add((pt.ulisboa.tecnico.softeng.tax.domain.Invoice)this, buyer);
    }
    
    private java.lang.Long get$oidBuyer() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).buyer;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBuyer() {
        if (getBuyer() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.tax.domain.Seller getSeller() {
        return ((DO_State)this.get$obj$state(false)).seller;
    }
    
    public void setSeller(pt.ulisboa.tecnico.softeng.tax.domain.Seller seller) {
        getRelationSellerHasInvoices().add(seller, (pt.ulisboa.tecnico.softeng.tax.domain.Invoice)this);
    }
    
    private java.lang.Long get$oidSeller() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).seller;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfSeller() {
        if (getSeller() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.irs != null) handleAttemptToDeleteConnectedObject("Irs");
        if (castedState.itemType != null) handleAttemptToDeleteConnectedObject("ItemType");
        if (castedState.buyer != null) handleAttemptToDeleteConnectedObject("Buyer");
        if (castedState.seller != null) handleAttemptToDeleteConnectedObject("Seller");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$id(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ID"), state);
        set$reference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "REFERENCE"), state);
        set$value(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "VALUE"), state);
        set$iva(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "IVA"), state);
        set$date(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "DATE"), state);
        set$cancelled(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "CANCELLED"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        castedState.irs = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_IRS");
        castedState.itemType = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ITEM_TYPE");
        castedState.buyer = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BUYER");
        castedState.seller = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_SELLER");
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
        private java.lang.String id;
        private java.lang.String reference;
        private double value;
        private double iva;
        private org.joda.time.LocalDate date;
        private boolean cancelled;
        private org.joda.time.DateTime time;
        private pt.ulisboa.tecnico.softeng.tax.domain.IRS irs;
        private pt.ulisboa.tecnico.softeng.tax.domain.ItemType itemType;
        private pt.ulisboa.tecnico.softeng.tax.domain.Buyer buyer;
        private pt.ulisboa.tecnico.softeng.tax.domain.Seller seller;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.id = this.id;
            newCasted.reference = this.reference;
            newCasted.value = this.value;
            newCasted.iva = this.iva;
            newCasted.date = this.date;
            newCasted.cancelled = this.cancelled;
            newCasted.time = this.time;
            newCasted.irs = this.irs;
            newCasted.itemType = this.itemType;
            newCasted.buyer = this.buyer;
            newCasted.seller = this.seller;
            
        }
        
    }
    
}
