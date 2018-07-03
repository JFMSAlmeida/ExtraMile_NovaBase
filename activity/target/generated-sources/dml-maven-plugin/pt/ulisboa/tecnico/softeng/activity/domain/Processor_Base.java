package pt.ulisboa.tecnico.softeng.activity.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Processor_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> role$$activityProvider = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider getValue(pt.ulisboa.tecnico.softeng.activity.domain.Processor o1) {
            return ((Processor_Base.DO_State)o1.get$obj$state(false)).activityProvider;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.Processor o1, pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o2) {
            ((Processor_Base.DO_State)o1.get$obj$state(true)).activityProvider = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider.role$$processor;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> role$$booking = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.activity.domain.Booking> getSet(pt.ulisboa.tecnico.softeng.activity.domain.Processor o1) {
            return ((Processor_Base)o1).get$rl$booking();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Booking,pt.ulisboa.tecnico.softeng.activity.domain.Processor> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Booking.role$$processor;
        }
        
    };
    
    private final static class ActivityProviderHasProcessor {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider>(role$$activityProvider, "ActivityProviderHasProcessor");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getRelationActivityProviderHasProcessor() {
        return ActivityProviderHasProcessor.relation;
    }
    
    static {
        ActivityProviderHasProcessor.relation.setRelationName("pt.ulisboa.tecnico.softeng.activity.domain.Processor.ActivityProviderHasProcessor");
    }
    
    private final static class ProcessorManagesActivityBookings {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking>(role$$booking, "ProcessorManagesActivityBookings");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> getRelationProcessorManagesActivityBookings() {
        return ProcessorManagesActivityBookings.relation;
    }
    
    static {
        ProcessorManagesActivityBookings.relation.setRelationName("pt.ulisboa.tecnico.softeng.activity.domain.Processor.ProcessorManagesActivityBookings");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Booking> keyFunction$$booking = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Booking>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.activity.domain.Booking value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.Booking> get$rl$booking() {
        return get$$relationList("booking", getRelationProcessorManagesActivityBookings());
        
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
    protected  Processor_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider getActivityProvider() {
        return ((DO_State)this.get$obj$state(false)).activityProvider;
    }
    
    public void setActivityProvider(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider activityProvider) {
        getRelationActivityProviderHasProcessor().add((pt.ulisboa.tecnico.softeng.activity.domain.Processor)this, activityProvider);
    }
    
    private java.lang.Long get$oidActivityProvider() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).activityProvider;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfActivityProvider() {
        if (getActivityProvider() == null) return false;
        return true;
    }
    
    public void addBooking(pt.ulisboa.tecnico.softeng.activity.domain.Booking booking) {
        getRelationProcessorManagesActivityBookings().add((pt.ulisboa.tecnico.softeng.activity.domain.Processor)this, booking);
    }
    
    public void removeBooking(pt.ulisboa.tecnico.softeng.activity.domain.Booking booking) {
        getRelationProcessorManagesActivityBookings().remove((pt.ulisboa.tecnico.softeng.activity.domain.Processor)this, booking);
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
        if (castedState.activityProvider != null) handleAttemptToDeleteConnectedObject("ActivityProvider");
        if (get$rl$booking().size() > 0) handleAttemptToDeleteConnectedObject("Booking");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.activityProvider = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ACTIVITY_PROVIDER");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("booking")) return getRelationProcessorManagesActivityBookings();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("booking", getRelationProcessorManagesActivityBookings());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider activityProvider;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.activityProvider = this.activityProvider;
            
        }
        
    }
    
}
