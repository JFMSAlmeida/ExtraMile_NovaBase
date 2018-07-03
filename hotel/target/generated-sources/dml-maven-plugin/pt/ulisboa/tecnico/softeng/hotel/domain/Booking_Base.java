package pt.ulisboa.tecnico.softeng.hotel.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Booking_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Room> role$$room = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Room>() {
        @Override
        public pt.ulisboa.tecnico.softeng.hotel.domain.Room getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Booking o1) {
            return ((Booking_Base.DO_State)o1.get$obj$state(false)).room;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Booking o1, pt.ulisboa.tecnico.softeng.hotel.domain.Room o2) {
            ((Booking_Base.DO_State)o1.get$obj$state(true)).room = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Room.role$$booking;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Processor> role$$processor = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.hotel.domain.Booking,pt.ulisboa.tecnico.softeng.hotel.domain.Processor>() {
        @Override
        public pt.ulisboa.tecnico.softeng.hotel.domain.Processor getValue(pt.ulisboa.tecnico.softeng.hotel.domain.Booking o1) {
            return ((Booking_Base.DO_State)o1.get$obj$state(false)).processor;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.hotel.domain.Booking o1, pt.ulisboa.tecnico.softeng.hotel.domain.Processor o2) {
            ((Booking_Base.DO_State)o1.get$obj$state(true)).processor = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.hotel.domain.Processor.role$$booking;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Room,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getRelationRoomHasBookings() {
        return pt.ulisboa.tecnico.softeng.hotel.domain.Room.getRelationRoomHasBookings();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.hotel.domain.Processor,pt.ulisboa.tecnico.softeng.hotel.domain.Booking> getRelationProcessorManagesHotelBookings() {
        return pt.ulisboa.tecnico.softeng.hotel.domain.Processor.getRelationProcessorManagesHotelBookings();
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
    
    public org.joda.time.LocalDate getArrival() {
        return ((DO_State)this.get$obj$state(false)).arrival;
    }
    
    public void setArrival(org.joda.time.LocalDate arrival) {
        ((DO_State)this.get$obj$state(true)).arrival = arrival;
    }
    
    private java.lang.String get$arrival() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).arrival;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$arrival(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).arrival = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    public org.joda.time.LocalDate getDeparture() {
        return ((DO_State)this.get$obj$state(false)).departure;
    }
    
    public void setDeparture(org.joda.time.LocalDate departure) {
        ((DO_State)this.get$obj$state(true)).departure = departure;
    }
    
    private java.lang.String get$departure() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).departure;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$departure(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).departure = (org.joda.time.LocalDate)((value == null) ? null : value);
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
    
    public java.lang.String getBuyerIban() {
        return ((DO_State)this.get$obj$state(false)).buyerIban;
    }
    
    public void setBuyerIban(java.lang.String buyerIban) {
        ((DO_State)this.get$obj$state(true)).buyerIban = buyerIban;
    }
    
    private java.lang.String get$buyerIban() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).buyerIban;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$buyerIban(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).buyerIban = (java.lang.String)((value == null) ? null : value);
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
    
    public java.lang.String getBulkId() {
        return ((DO_State)this.get$obj$state(false)).bulkId;
    }
    
    public void setBulkId(java.lang.String bulkId) {
        ((DO_State)this.get$obj$state(true)).bulkId = bulkId;
    }
    
    private java.lang.String get$bulkId() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).bulkId;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$bulkId(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).bulkId = (java.lang.String)((value == null) ? null : value);
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
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Room getRoom() {
        return ((DO_State)this.get$obj$state(false)).room;
    }
    
    public void setRoom(pt.ulisboa.tecnico.softeng.hotel.domain.Room room) {
        getRelationRoomHasBookings().add(room, (pt.ulisboa.tecnico.softeng.hotel.domain.Booking)this);
    }
    
    private java.lang.Long get$oidRoom() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).room;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRoom() {
        if (getRoom() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.hotel.domain.Processor getProcessor() {
        return ((DO_State)this.get$obj$state(false)).processor;
    }
    
    public void setProcessor(pt.ulisboa.tecnico.softeng.hotel.domain.Processor processor) {
        getRelationProcessorManagesHotelBookings().add(processor, (pt.ulisboa.tecnico.softeng.hotel.domain.Booking)this);
    }
    
    private java.lang.Long get$oidProcessor() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).processor;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.room != null) handleAttemptToDeleteConnectedObject("Room");
        if (castedState.processor != null) handleAttemptToDeleteConnectedObject("Processor");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$reference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "REFERENCE"), state);
        set$cancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLATION"), state);
        set$cancellationDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "CANCELLATION_DATE"), state);
        set$arrival(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "ARRIVAL"), state);
        set$departure(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "DEPARTURE"), state);
        set$price(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "PRICE"), state);
        set$buyerNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BUYER_NIF"), state);
        set$buyerIban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BUYER_IBAN"), state);
        set$providerNif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PROVIDER_NIF"), state);
        set$paymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PAYMENT_REFERENCE"), state);
        set$invoiceReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "INVOICE_REFERENCE"), state);
        set$cancelledInvoice(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "CANCELLED_INVOICE"), state);
        set$cancelledPaymentReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CANCELLED_PAYMENT_REFERENCE"), state);
        set$adventureId(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ADVENTURE_ID"), state);
        set$bulkId(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "BULK_ID"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        castedState.room = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOM");
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
        private java.lang.String cancellation;
        private org.joda.time.LocalDate cancellationDate;
        private org.joda.time.LocalDate arrival;
        private org.joda.time.LocalDate departure;
        private double price;
        private java.lang.String buyerNif;
        private java.lang.String buyerIban;
        private java.lang.String providerNif;
        private java.lang.String paymentReference;
        private java.lang.String invoiceReference;
        private boolean cancelledInvoice;
        private java.lang.String cancelledPaymentReference;
        private java.lang.String adventureId;
        private java.lang.String bulkId;
        private org.joda.time.DateTime time;
        private pt.ulisboa.tecnico.softeng.hotel.domain.Room room;
        private pt.ulisboa.tecnico.softeng.hotel.domain.Processor processor;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.reference = this.reference;
            newCasted.cancellation = this.cancellation;
            newCasted.cancellationDate = this.cancellationDate;
            newCasted.arrival = this.arrival;
            newCasted.departure = this.departure;
            newCasted.price = this.price;
            newCasted.buyerNif = this.buyerNif;
            newCasted.buyerIban = this.buyerIban;
            newCasted.providerNif = this.providerNif;
            newCasted.paymentReference = this.paymentReference;
            newCasted.invoiceReference = this.invoiceReference;
            newCasted.cancelledInvoice = this.cancelledInvoice;
            newCasted.cancelledPaymentReference = this.cancelledPaymentReference;
            newCasted.adventureId = this.adventureId;
            newCasted.bulkId = this.bulkId;
            newCasted.time = this.time;
            newCasted.room = this.room;
            newCasted.processor = this.processor;
            
        }
        
    }
    
}
