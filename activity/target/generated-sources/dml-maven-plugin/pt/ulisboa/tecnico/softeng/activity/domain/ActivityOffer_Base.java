package pt.ulisboa.tecnico.softeng.activity.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class ActivityOffer_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity> role$$activity = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.Activity getValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer o1) {
            return ((ActivityOffer_Base.DO_State)o1.get$obj$state(false)).activity;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer o1, pt.ulisboa.tecnico.softeng.activity.domain.Activity o2) {
            ((ActivityOffer_Base.DO_State)o1.get$obj$state(true)).activity = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Activity.role$$activityOffer;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Booking> role$$booking = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Booking>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.activity.domain.Booking> getSet(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer o1) {
            return ((ActivityOffer_Base)o1).get$rl$booking();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Booking.role$$activityOffer;
        }
        
    };
    
    private final static class ActivityHasActivityOffers {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity>(role$$activity, "ActivityHasActivityOffers");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getRelationActivityHasActivityOffers() {
        return ActivityHasActivityOffers.relation;
    }
    
    static {
        ActivityHasActivityOffers.relation.setRelationName("pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer.ActivityHasActivityOffers");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getRelationActivityOfferHasBookings() {
        return pt.ulisboa.tecnico.softeng.activity.domain.Booking.getRelationActivityOfferHasBookings();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Booking> keyFunction$$booking = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Booking>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.activity.domain.Booking value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Booking> get$rl$booking() {
        return get$$relationList("booking", getRelationActivityOfferHasBookings().getInverseRelation());
        
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
    protected  ActivityOffer_Base() {
        super();
    }
    
    // Getters and Setters
    
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
    
    public int getCapacity() {
        return ((DO_State)this.get$obj$state(false)).capacity;
    }
    
    public void setCapacity(int capacity) {
        ((DO_State)this.get$obj$state(true)).capacity = capacity;
    }
    
    private int get$capacity() {
        int value = ((DO_State)this.get$obj$state(false)).capacity;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$capacity(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).capacity = (int)(value);
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
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.activity.domain.Activity getActivity() {
        return ((DO_State)this.get$obj$state(false)).activity;
    }
    
    public void setActivity(pt.ulisboa.tecnico.softeng.activity.domain.Activity activity) {
        getRelationActivityHasActivityOffers().add((pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer)this, activity);
    }
    
    private java.lang.Long get$oidActivity() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).activity;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfActivity() {
        if (getActivity() == null) return false;
        return true;
    }
    
    public void addBooking(pt.ulisboa.tecnico.softeng.activity.domain.Booking booking) {
        getRelationActivityOfferHasBookings().add(booking, (pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer)this);
    }
    
    public void removeBooking(pt.ulisboa.tecnico.softeng.activity.domain.Booking booking) {
        getRelationActivityOfferHasBookings().remove(booking, (pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.Booking> getBookingSet() {
        return get$rl$booking();
    }
    
    public void set$booking(OJBFunctionalSetWrapper booking) {
        get$rl$booking().setFromOJB(this, "booking", booking);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.Booking> getBooking() {
        return getBookingSet();
    }
    
    @Deprecated
    public int getBookingCount() {
        return getBookingSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.activity != null) handleAttemptToDeleteConnectedObject("Activity");
        if (get$rl$booking().size() > 0) handleAttemptToDeleteConnectedObject("Booking");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$begin(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "BEGIN"), state);
        set$end(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "END"), state);
        set$capacity(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "CAPACITY"), state);
        set$amount(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readdouble(rs, "AMOUNT"), state);
        castedState.activity = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ACTIVITY");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("booking")) return getRelationActivityOfferHasBookings().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("booking", getRelationActivityOfferHasBookings().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.joda.time.LocalDate begin;
        private org.joda.time.LocalDate end;
        private int capacity;
        private double amount;
        private pt.ulisboa.tecnico.softeng.activity.domain.Activity activity;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.begin = this.begin;
            newCasted.end = this.end;
            newCasted.capacity = this.capacity;
            newCasted.amount = this.amount;
            newCasted.activity = this.activity;
            
        }
        
    }
    
}
