package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Adventure_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Client> role$$client = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Client>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.Client getValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1) {
            return ((Adventure_Base.DO_State)o1.get$obj$state(false)).client;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1, pt.ulisboa.tecnico.softeng.broker.domain.Client o2) {
            ((Adventure_Base.DO_State)o1.get$obj$state(true)).client = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Client.role$$adventure;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Broker> role$$broker = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.Broker>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.Broker getValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1) {
            return ((Adventure_Base.DO_State)o1.get$obj$state(false)).broker;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1, pt.ulisboa.tecnico.softeng.broker.domain.Broker o2) {
            ((Adventure_Base.DO_State)o1.get$obj$state(true)).broker = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Broker.role$$adventure;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.AdventureState> role$$state = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.AdventureState>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.AdventureState getValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1) {
            return ((Adventure_Base.DO_State)o1.get$obj$state(false)).state;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.Adventure o1, pt.ulisboa.tecnico.softeng.broker.domain.AdventureState o2) {
            ((Adventure_Base.DO_State)o1.get$obj$state(true)).state = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.AdventureState.role$$adventure;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Client,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationAdventureHasClient() {
        return pt.ulisboa.tecnico.softeng.broker.domain.Client.getRelationAdventureHasClient();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.Broker,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationBrokerHasAdventures() {
        return pt.ulisboa.tecnico.softeng.broker.domain.Broker.getRelationBrokerHasAdventures();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationAdventureHasState() {
        return pt.ulisboa.tecnico.softeng.broker.domain.AdventureState.getRelationAdventureHasState();
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
    protected  Adventure_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getID() {
        return ((DO_State)this.get$obj$state(false)).ID;
    }
    
    public void setID(java.lang.String ID) {
        ((DO_State)this.get$obj$state(true)).ID = ID;
    }
    
    private java.lang.String get$ID() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).ID;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$ID(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).ID = (java.lang.String)((value == null) ? null : value);
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
    
    public java.lang.String getPaymentConfirmation() {
        return ((DO_State)this.get$obj$state(false)).paymentConfirmation;
    }
    
    public void setPaymentConfirmation(java.lang.String paymentConfirmation) {
        ((DO_State)this.get$obj$state(true)).paymentConfirmation = paymentConfirmation;
    }
    
    private java.lang.String get$paymentConfirmation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).paymentConfirmation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$paymentConfirmation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).paymentConfirmation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getPaymentCancellation() {
        return ((DO_State)this.get$obj$state(false)).paymentCancellation;
    }
    
    public void setPaymentCancellation(java.lang.String paymentCancellation) {
        ((DO_State)this.get$obj$state(true)).paymentCancellation = paymentCancellation;
    }
    
    private java.lang.String get$paymentCancellation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).paymentCancellation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$paymentCancellation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).paymentCancellation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getRoomConfirmation() {
        return ((DO_State)this.get$obj$state(false)).roomConfirmation;
    }
    
    public void setRoomConfirmation(java.lang.String roomConfirmation) {
        ((DO_State)this.get$obj$state(true)).roomConfirmation = roomConfirmation;
    }
    
    private java.lang.String get$roomConfirmation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).roomConfirmation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$roomConfirmation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).roomConfirmation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getRoomCancellation() {
        return ((DO_State)this.get$obj$state(false)).roomCancellation;
    }
    
    public void setRoomCancellation(java.lang.String roomCancellation) {
        ((DO_State)this.get$obj$state(true)).roomCancellation = roomCancellation;
    }
    
    private java.lang.String get$roomCancellation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).roomCancellation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$roomCancellation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).roomCancellation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getActivityConfirmation() {
        return ((DO_State)this.get$obj$state(false)).activityConfirmation;
    }
    
    public void setActivityConfirmation(java.lang.String activityConfirmation) {
        ((DO_State)this.get$obj$state(true)).activityConfirmation = activityConfirmation;
    }
    
    private java.lang.String get$activityConfirmation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).activityConfirmation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$activityConfirmation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).activityConfirmation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getActivityCancellation() {
        return ((DO_State)this.get$obj$state(false)).activityCancellation;
    }
    
    public void setActivityCancellation(java.lang.String activityCancellation) {
        ((DO_State)this.get$obj$state(true)).activityCancellation = activityCancellation;
    }
    
    private java.lang.String get$activityCancellation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).activityCancellation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$activityCancellation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).activityCancellation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getRentingConfirmation() {
        return ((DO_State)this.get$obj$state(false)).rentingConfirmation;
    }
    
    public void setRentingConfirmation(java.lang.String rentingConfirmation) {
        ((DO_State)this.get$obj$state(true)).rentingConfirmation = rentingConfirmation;
    }
    
    private java.lang.String get$rentingConfirmation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).rentingConfirmation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$rentingConfirmation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).rentingConfirmation = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getRentingCancellation() {
        return ((DO_State)this.get$obj$state(false)).rentingCancellation;
    }
    
    public void setRentingCancellation(java.lang.String rentingCancellation) {
        ((DO_State)this.get$obj$state(true)).rentingCancellation = rentingCancellation;
    }
    
    private java.lang.String get$rentingCancellation() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).rentingCancellation;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$rentingCancellation(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).rentingCancellation = (java.lang.String)((value == null) ? null : value);
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
    
    public boolean getInvoiceCancelled() {
        return ((DO_State)this.get$obj$state(false)).invoiceCancelled;
    }
    
    public void setInvoiceCancelled(boolean invoiceCancelled) {
        ((DO_State)this.get$obj$state(true)).invoiceCancelled = invoiceCancelled;
    }
    
    private boolean get$invoiceCancelled() {
        boolean value = ((DO_State)this.get$obj$state(false)).invoiceCancelled;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForboolean(value);
    }
    
    private final void set$invoiceCancelled(boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).invoiceCancelled = (boolean)(value);
    }
    
    public boolean getRentVehicle() {
        return ((DO_State)this.get$obj$state(false)).rentVehicle;
    }
    
    public void setRentVehicle(boolean rentVehicle) {
        ((DO_State)this.get$obj$state(true)).rentVehicle = rentVehicle;
    }
    
    private boolean get$rentVehicle() {
        boolean value = ((DO_State)this.get$obj$state(false)).rentVehicle;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForboolean(value);
    }
    
    private final void set$rentVehicle(boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).rentVehicle = (boolean)(value);
    }
    
    public double getMargin() {
        return ((DO_State)this.get$obj$state(false)).margin;
    }
    
    public void setMargin(double margin) {
        ((DO_State)this.get$obj$state(true)).margin = margin;
    }
    
    private double get$margin() {
        double value = ((DO_State)this.get$obj$state(false)).margin;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$margin(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).margin = (double)(value);
    }
    
    public double getCurrentAmount() {
        return ((DO_State)this.get$obj$state(false)).currentAmount;
    }
    
    public void setCurrentAmount(double currentAmount) {
        ((DO_State)this.get$obj$state(true)).currentAmount = currentAmount;
    }
    
    private double get$currentAmount() {
        double value = ((DO_State)this.get$obj$state(false)).currentAmount;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueFordouble(value);
    }
    
    private final void set$currentAmount(double value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).currentAmount = (double)(value);
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
    
    public pt.ulisboa.tecnico.softeng.broker.domain.Client getClient() {
        return ((DO_State)this.get$obj$state(false)).client;
    }
    
    public void setClient(pt.ulisboa.tecnico.softeng.broker.domain.Client client) {
        getRelationAdventureHasClient().add(client, (pt.ulisboa.tecnico.softeng.broker.domain.Adventure)this);
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
    
    public pt.ulisboa.tecnico.softeng.broker.domain.Broker getBroker() {
        return ((DO_State)this.get$obj$state(false)).broker;
    }
    
    public void setBroker(pt.ulisboa.tecnico.softeng.broker.domain.Broker broker) {
        getRelationBrokerHasAdventures().add(broker, (pt.ulisboa.tecnico.softeng.broker.domain.Adventure)this);
    }
    
    private java.lang.Long get$oidBroker() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).broker;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBroker() {
        if (getBroker() == null) return false;
        return true;
    }
    
    public pt.ulisboa.tecnico.softeng.broker.domain.AdventureState getState() {
        return ((DO_State)this.get$obj$state(false)).state;
    }
    
    public void setState(pt.ulisboa.tecnico.softeng.broker.domain.AdventureState state) {
        getRelationAdventureHasState().add(state, (pt.ulisboa.tecnico.softeng.broker.domain.Adventure)this);
    }
    
    private java.lang.Long get$oidState() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).state;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfState() {
        if (getState() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.client != null) handleAttemptToDeleteConnectedObject("Client");
        if (castedState.broker != null) handleAttemptToDeleteConnectedObject("Broker");
        if (castedState.state != null) handleAttemptToDeleteConnectedObject("State");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$ID(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "I_D"), state);
        set$begin(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "BEGIN"), state);
        set$end(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "END"), state);
        set$paymentConfirmation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PAYMENT_CONFIRMATION"), state);
        set$paymentCancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PAYMENT_CANCELLATION"), state);
        set$roomConfirmation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ROOM_CONFIRMATION"), state);
        set$roomCancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ROOM_CANCELLATION"), state);
        set$activityConfirmation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ACTIVITY_CONFIRMATION"), state);
        set$activityCancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ACTIVITY_CANCELLATION"), state);
        set$rentingConfirmation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "RENTING_CONFIRMATION"), state);
        set$rentingCancellation(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "RENTING_CANCELLATION"), state);
        set$invoiceReference(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "INVOICE_REFERENCE"), state);
        set$invoiceCancelled(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "INVOICE_CANCELLED"), state);
        set$rentVehicle(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readboolean(rs, "RENT_VEHICLE"), state);
        set$margin(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "MARGIN"), state);
        set$currentAmount(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "CURRENT_AMOUNT"), state);
        set$time(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "TIME"), state);
        castedState.client = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CLIENT");
        castedState.broker = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BROKER");
        castedState.state = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_STATE");
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
        private java.lang.String ID;
        private org.joda.time.LocalDate begin;
        private org.joda.time.LocalDate end;
        private java.lang.String paymentConfirmation;
        private java.lang.String paymentCancellation;
        private java.lang.String roomConfirmation;
        private java.lang.String roomCancellation;
        private java.lang.String activityConfirmation;
        private java.lang.String activityCancellation;
        private java.lang.String rentingConfirmation;
        private java.lang.String rentingCancellation;
        private java.lang.String invoiceReference;
        private boolean invoiceCancelled;
        private boolean rentVehicle;
        private double margin;
        private double currentAmount;
        private org.joda.time.DateTime time;
        private pt.ulisboa.tecnico.softeng.broker.domain.Client client;
        private pt.ulisboa.tecnico.softeng.broker.domain.Broker broker;
        private pt.ulisboa.tecnico.softeng.broker.domain.AdventureState state;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.ID = this.ID;
            newCasted.begin = this.begin;
            newCasted.end = this.end;
            newCasted.paymentConfirmation = this.paymentConfirmation;
            newCasted.paymentCancellation = this.paymentCancellation;
            newCasted.roomConfirmation = this.roomConfirmation;
            newCasted.roomCancellation = this.roomCancellation;
            newCasted.activityConfirmation = this.activityConfirmation;
            newCasted.activityCancellation = this.activityCancellation;
            newCasted.rentingConfirmation = this.rentingConfirmation;
            newCasted.rentingCancellation = this.rentingCancellation;
            newCasted.invoiceReference = this.invoiceReference;
            newCasted.invoiceCancelled = this.invoiceCancelled;
            newCasted.rentVehicle = this.rentVehicle;
            newCasted.margin = this.margin;
            newCasted.currentAmount = this.currentAmount;
            newCasted.time = this.time;
            newCasted.client = this.client;
            newCasted.broker = this.broker;
            newCasted.state = this.state;
            
        }
        
    }
    
}
