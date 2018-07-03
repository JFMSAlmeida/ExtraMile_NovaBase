package pt.ulisboa.tecnico.softeng.activity.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Booking_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> role$$activityOffer = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer getValue(pt.ulisboa.tecnico.softeng.activity.domain.Booking o1) {
            return ((Booking_Base.DO_State)o1.get$obj$state(false)).activityOffer;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.Booking o1, pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer o2) {
            ((Booking_Base.DO_State)o1.get$obj$state(true)).activityOffer = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Booking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer.role$$booking;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.Processor> role$$processor = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.Processor>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.Processor getValue(pt.ulisboa.tecnico.softeng.activity.domain.Booking o1) {
            return ((Booking_Base.DO_State)o1.get$obj$state(false)).processor;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.Booking o1, pt.ulisboa.tecnico.softeng.activity.domain.Processor o2) {
            ((Booking_Base.DO_State)o1.get$obj$state(true)).processor = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Processor.role$$booking;
        }
        
    };
    
    private final static class ActivityOfferHasBookings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer>(role$$activityOffer, "ActivityOfferHasBookings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getRelationActivityOfferHasBookings() {
        return ActivityOfferHasBookings.relation;
    }
    
    static {
        ActivityOfferHasBookings.relation.setRelationName("pt.ulisboa.tecnico.softeng.activity.domain.Booking.ActivityOfferHasBookings");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> getRelationProcessorManagesActivityBookings() {
        return pt.ulisboa.tecnico.softeng.activity.domain.Processor.getRelationProcessorManagesActivityBookings();
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
    protected  Booking_Base() {
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
    
    public java.lang.String getType() {
        return ((DO_State)this.get$obj$state(false)).Type;
    }
    
    public void setType(java.lang.String Type) {
        ((DO_State)this.get$obj$state(true)).Type = Type;
    }
    
    private java.lang.String get$Type() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).Type;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$Type(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).Type = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getProviderNif() {
        return ((DO_State)this.get$obj$state(false)).providerNif;
    }
    
    public void setProviderNif(java.lang.String providerNif) {
        ((DO_State)this.get$obj$state(true)).providerNif = providerNif;
    }
    
    private java.lang.String get$providerNif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).providerNif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$providerNif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).providerNif = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getBuyerNif() {
        return ((DO_State)this.get$obj$state(false)).buyerNif;
    }
    
    public void setBuyerNif(java.lang.String buyerNif) {
        ((DO_State)this.get$obj$state(true)).buyerNif = buyerNif;
    }
    
    private java.lang.String get$buyerNif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).buyerNif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$buyerNif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).buyerNif = (java.lang.String)((value == null) ? null : value);
    }
    
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
    
    public double getAmount() {
        return ((DO_State)this.get$obj$state(false)).amount;
    }
    
    public void setAmount(double amount) {
        ((DO_State)this.get$obj$state(true)).amount = amount;
    }
    
    private double get$amount() {
        double value = ((DO_State)this.get$obj$state(false)).amount;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$amount(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).amount = (double)(value);
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
    
    public java.lang.String getPaymentReference() {
        return ((DO_State)this.get$obj$state(false)).paymentReference;
    }
    
    public void setPaymentReference(java.lang.String paymentReference) {
        ((DO_State)this.get$obj$state(true)).paymentReference = paymentReference;
    }
    
    private java.lang.String get$paymentReference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).paymentReference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$paymentReference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).paymentReference = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getInvoiceReference() {
        return ((DO_State)this.get$obj$state(false)).invoiceReference;
    }
    
    public void setInvoiceReference(java.lang.String invoiceReference) {
        ((DO_State)this.get$obj$state(true)).invoiceReference = invoiceReference;
    }
    
    private java.lang.String get$invoiceReference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).invoiceReference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$invoiceReference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).invoiceReference = (java.lang.String)((value == null) ? null : value);
    }
    
    public boolean getCancelledInvoice() {
        return ((DO_State)this.get$obj$state(false)).cancelledInvoice;
    }
    
    public void setCancelledInvoice(boolean cancelledInvoice) {
        ((DO_State)this.get$obj$state(true)).cancelledInvoice = cancelledInvoice;
    }
    
    private boolean get$cancelledInvoice() {
        boolean value = ((DO_State)this.get$obj$state(false)).cancelledInvoice;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForboolean(value);
    }
    
    private final void set$cancelledInvoice(boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancelledInvoice = (boolean)(value);
    }
    
    public java.lang.String getCancel() {
        return ((DO_State)this.get$obj$state(false)).cancel;
    }
    
    public void setCancel(java.lang.String cancel) {
        ((DO_State)this.get$obj$state(true)).cancel = cancel;
    }
    
    private java.lang.String get$cancel() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).cancel;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$cancel(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancel = (java.lang.String)((value == null) ? null : value);
    }
    
    public org.joda.time.LocalDate getCancellationDate() {
        return ((DO_State)this.get$obj$state(false)).cancellationDate;
    }
    
    public void setCancellationDate(org.joda.time.LocalDate cancellationDate) {
        ((DO_State)this.get$obj$state(true)).cancellationDate = cancellationDate;
    }
    
    private java.lang.String get$cancellationDate() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).cancellationDate;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$cancellationDate(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancellationDate = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public java.lang.String getCancelledPaymentReference() {
        return ((DO_State)this.get$obj$state(false)).cancelledPaymentReference;
    }
    
    public void setCancelledPaymentReference(java.lang.String cancelledPaymentReference) {
        ((DO_State)this.get$obj$state(true)).cancelledPaymentReference = cancelledPaymentReference;
    }
    
    private java.lang.String get$cancelledPaymentReference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).cancelledPaymentReference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$cancelledPaymentReference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancelledPaymentReference = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getAdventureId() {
        return ((DO_State)this.get$obj$state(false)).adventureId;
    }
    
    public void setAdventureId(java.lang.String adventureId) {
        ((DO_State)this.get$obj$state(true)).adventureId = adventureId;
    }
    
    private java.lang.String get$adventureId() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).adventureId;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$adventureId(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).adventureId = (java.lang.String)((value == null) ? null : value);
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
    
    public pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer getActivityOffer() {
        return ((DO_State)this.get$obj$state(false)).activityOffer;
    }
    
    public void setActivityOffer(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer activityOffer) {
        getRelationActivityOfferHasBookings().add((pt.ulisboa.tecnico.softeng.activity.domain.Booking)this, activityOffer);
    }
    
    private java.lang.Long get$oidActivityOffer() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).activityOffer;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfActivityOffer() {
        if (getActivityOffer() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.activity.domain.Processor getProcessor() {
        return ((DO_State)this.get$obj$state(false)).processor;
    }
    
    public void setProcessor(pt.ulisboa.tecnico.softeng.activity.domain.Processor processor) {
        getRelationProcessorManagesActivityBookings().add(processor, (pt.ulisboa.tecnico.softeng.activity.domain.Booking)this);
    }
    
    private java.lang.Long get$oidProcessor() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).processor;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.activityOffer != null) handleAttemptToDeleteConnectedObject("ActivityOffer");
        if (castedState.processor != null) handleAttemptToDeleteConnectedObject("Processor");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$reference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "REFERENCE"), state);
        set$Type(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "TYPE"), state);
        set$providerNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PROVIDER_NIF"), state);
        set$buyerNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BUYER_NIF"), state);
        set$iban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "IBAN"), state);
        set$age(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "AGE"), state);
        set$amount(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "AMOUNT"), state);
        set$date(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "DATE"), state);
        set$paymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PAYMENT_REFERENCE"), state);
        set$invoiceReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "INVOICE_REFERENCE"), state);
        set$cancelledInvoice(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "CANCELLED_INVOICE"), state);
        set$cancel(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCEL"), state);
        set$cancellationDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "CANCELLATION_DATE"), state);
        set$cancelledPaymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLED_PAYMENT_REFERENCE"), state);
        set$adventureId(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ADVENTURE_ID"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        castedState.activityOffer = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ACTIVITY_OFFER");
        castedState.processor = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PROCESSOR");
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
        private java.lang.String Type;
        private java.lang.String providerNif;
        private java.lang.String buyerNif;
        private java.lang.String iban;
        private int age;
        private double amount;
        private org.joda.time.LocalDate date;
        private java.lang.String paymentReference;
        private java.lang.String invoiceReference;
        private boolean cancelledInvoice;
        private java.lang.String cancel;
        private org.joda.time.LocalDate cancellationDate;
        private java.lang.String cancelledPaymentReference;
        private java.lang.String adventureId;
        private org.joda.time.DateTime time;
        private pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer activityOffer;
        private pt.ulisboa.tecnico.softeng.activity.domain.Processor processor;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.reference = this.reference;
            newCasted.Type = this.Type;
            newCasted.providerNif = this.providerNif;
            newCasted.buyerNif = this.buyerNif;
            newCasted.iban = this.iban;
            newCasted.age = this.age;
            newCasted.amount = this.amount;
            newCasted.date = this.date;
            newCasted.paymentReference = this.paymentReference;
            newCasted.invoiceReference = this.invoiceReference;
            newCasted.cancelledInvoice = this.cancelledInvoice;
            newCasted.cancel = this.cancel;
            newCasted.cancellationDate = this.cancellationDate;
            newCasted.cancelledPaymentReference = this.cancelledPaymentReference;
            newCasted.adventureId = this.adventureId;
            newCasted.time = this.time;
            newCasted.activityOffer = this.activityOffer;
            newCasted.processor = this.processor;
            
        }
        
    }
    
}
