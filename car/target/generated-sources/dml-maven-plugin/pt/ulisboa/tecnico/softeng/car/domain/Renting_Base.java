package pt.ulisboa.tecnico.softeng.car.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Renting_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Vehicle> role$$vehicle = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Vehicle>() {
        @Override
        public pt.ulisboa.tecnico.softeng.car.domain.Vehicle getValue(pt.ulisboa.tecnico.softeng.car.domain.Renting o1) {
            return ((Renting_Base.DO_State)o1.get$obj$state(false)).vehicle;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.car.domain.Renting o1, pt.ulisboa.tecnico.softeng.car.domain.Vehicle o2) {
            ((Renting_Base.DO_State)o1.get$obj$state(true)).vehicle = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.Vehicle.role$$renting;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor> role$$processor = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor>() {
        @Override
        public pt.ulisboa.tecnico.softeng.car.domain.Processor getValue(pt.ulisboa.tecnico.softeng.car.domain.Renting o1) {
            return ((Renting_Base.DO_State)o1.get$obj$state(false)).processor;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.car.domain.Renting o1, pt.ulisboa.tecnico.softeng.car.domain.Processor o2) {
            ((Renting_Base.DO_State)o1.get$obj$state(true)).processor = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.Processor,pt.ulisboa.tecnico.softeng.car.domain.Renting> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.Processor.role$$renting;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.Vehicle,pt.ulisboa.tecnico.softeng.car.domain.Renting> getRelationVehicleHasRentings() {
        return pt.ulisboa.tecnico.softeng.car.domain.Vehicle.getRelationVehicleHasRentings();
    }
    
    private final static class ProcessorManagesRentings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor>(role$$processor, "ProcessorManagesRentings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.car.domain.Renting,pt.ulisboa.tecnico.softeng.car.domain.Processor> getRelationProcessorManagesRentings() {
        return ProcessorManagesRentings.relation;
    }
    
    static {
        ProcessorManagesRentings.relation.setRelationName("pt.ulisboa.tecnico.softeng.car.domain.Renting.ProcessorManagesRentings");
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
    protected  Renting_Base() {
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
    
    public java.lang.String getCancellationReference() {
        return ((DO_State)this.get$obj$state(false)).cancellationReference;
    }
    
    public void setCancellationReference(java.lang.String cancellationReference) {
        ((DO_State)this.get$obj$state(true)).cancellationReference = cancellationReference;
    }
    
    private java.lang.String get$cancellationReference() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).cancellationReference;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$cancellationReference(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).cancellationReference = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getDrivingLicense() {
        return ((DO_State)this.get$obj$state(false)).drivingLicense;
    }
    
    public void setDrivingLicense(java.lang.String drivingLicense) {
        ((DO_State)this.get$obj$state(true)).drivingLicense = drivingLicense;
    }
    
    private java.lang.String get$drivingLicense() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).drivingLicense;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$drivingLicense(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).drivingLicense = (java.lang.String)((value == null) ? null : value);
    }
    
    public org.joda.time.LocalDate getBegin() {
        return ((DO_State)this.get$obj$state(false)).begin;
    }
    
    public void setBegin(org.joda.time.LocalDate begin) {
        ((DO_State)this.get$obj$state(true)).begin = begin;
    }
    
    private java.lang.String get$begin() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).begin;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$begin(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).begin = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public org.joda.time.LocalDate getEnd() {
        return ((DO_State)this.get$obj$state(false)).end;
    }
    
    public void setEnd(org.joda.time.LocalDate end) {
        ((DO_State)this.get$obj$state(true)).end = end;
    }
    
    private java.lang.String get$end() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).end;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$end(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).end = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public int getKilometers() {
        return ((DO_State)this.get$obj$state(false)).kilometers;
    }
    
    public void setKilometers(int kilometers) {
        ((DO_State)this.get$obj$state(true)).kilometers = kilometers;
    }
    
    private int get$kilometers() {
        int value = ((DO_State)this.get$obj$state(false)).kilometers;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$kilometers(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).kilometers = (int)(value);
    }
    
    public java.lang.String getClientNif() {
        return ((DO_State)this.get$obj$state(false)).clientNif;
    }
    
    public void setClientNif(java.lang.String clientNif) {
        ((DO_State)this.get$obj$state(true)).clientNif = clientNif;
    }
    
    private java.lang.String get$clientNif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).clientNif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$clientNif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).clientNif = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getClientIban() {
        return ((DO_State)this.get$obj$state(false)).clientIban;
    }
    
    public void setClientIban(java.lang.String clientIban) {
        ((DO_State)this.get$obj$state(true)).clientIban = clientIban;
    }
    
    private java.lang.String get$clientIban() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).clientIban;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$clientIban(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).clientIban = (java.lang.String)((value == null) ? null : value);
    }
    
    public double getPrice() {
        return ((DO_State)this.get$obj$state(false)).price;
    }
    
    public void setPrice(double price) {
        ((DO_State)this.get$obj$state(true)).price = price;
    }
    
    private double get$price() {
        double value = ((DO_State)this.get$obj$state(false)).price;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$price(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).price = (double)(value);
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
    
    public pt.ulisboa.tecnico.softeng.car.domain.Vehicle getVehicle() {
        return ((DO_State)this.get$obj$state(false)).vehicle;
    }
    
    public void setVehicle(pt.ulisboa.tecnico.softeng.car.domain.Vehicle vehicle) {
        getRelationVehicleHasRentings().add(vehicle, (pt.ulisboa.tecnico.softeng.car.domain.Renting)this);
    }
    
    private java.lang.Long get$oidVehicle() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).vehicle;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfVehicle() {
        if (getVehicle() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.car.domain.Processor getProcessor() {
        return ((DO_State)this.get$obj$state(false)).processor;
    }
    
    public void setProcessor(pt.ulisboa.tecnico.softeng.car.domain.Processor processor) {
        getRelationProcessorManagesRentings().add((pt.ulisboa.tecnico.softeng.car.domain.Renting)this, processor);
    }
    
    private java.lang.Long get$oidProcessor() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).processor;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.vehicle != null) handleAttemptToDeleteConnectedObject("Vehicle");
        if (castedState.processor != null) handleAttemptToDeleteConnectedObject("Processor");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$reference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "REFERENCE"), state);
        set$cancellationReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLATION_REFERENCE"), state);
        set$drivingLicense(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DRIVING_LICENSE"), state);
        set$begin(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "BEGIN"), state);
        set$end(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "END"), state);
        set$kilometers(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "KILOMETERS"), state);
        set$clientNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CLIENT_NIF"), state);
        set$clientIban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CLIENT_IBAN"), state);
        set$price(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "PRICE"), state);
        set$paymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PAYMENT_REFERENCE"), state);
        set$invoiceReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "INVOICE_REFERENCE"), state);
        set$cancellationDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "CANCELLATION_DATE"), state);
        set$cancelledInvoice(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "CANCELLED_INVOICE"), state);
        set$cancelledPaymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLED_PAYMENT_REFERENCE"), state);
        set$adventureId(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ADVENTURE_ID"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        castedState.vehicle = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_VEHICLE");
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
        private java.lang.String cancellationReference;
        private java.lang.String drivingLicense;
        private org.joda.time.LocalDate begin;
        private org.joda.time.LocalDate end;
        private int kilometers;
        private java.lang.String clientNif;
        private java.lang.String clientIban;
        private double price;
        private java.lang.String paymentReference;
        private java.lang.String invoiceReference;
        private org.joda.time.LocalDate cancellationDate;
        private boolean cancelledInvoice;
        private java.lang.String cancelledPaymentReference;
        private java.lang.String adventureId;
        private org.joda.time.DateTime time;
        private pt.ulisboa.tecnico.softeng.car.domain.Vehicle vehicle;
        private pt.ulisboa.tecnico.softeng.car.domain.Processor processor;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.reference = this.reference;
            newCasted.cancellationReference = this.cancellationReference;
            newCasted.drivingLicense = this.drivingLicense;
            newCasted.begin = this.begin;
            newCasted.end = this.end;
            newCasted.kilometers = this.kilometers;
            newCasted.clientNif = this.clientNif;
            newCasted.clientIban = this.clientIban;
            newCasted.price = this.price;
            newCasted.paymentReference = this.paymentReference;
            newCasted.invoiceReference = this.invoiceReference;
            newCasted.cancellationDate = this.cancellationDate;
            newCasted.cancelledInvoice = this.cancelledInvoice;
            newCasted.cancelledPaymentReference = this.cancelledPaymentReference;
            newCasted.adventureId = this.adventureId;
            newCasted.time = this.time;
            newCasted.vehicle = this.vehicle;
            newCasted.processor = this.processor;
            
        }
        
    }
    
}
