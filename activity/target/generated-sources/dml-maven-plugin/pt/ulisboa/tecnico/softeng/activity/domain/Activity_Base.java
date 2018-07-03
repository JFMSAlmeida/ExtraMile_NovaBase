package pt.ulisboa.tecnico.softeng.activity.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Activity_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> role$$activityOffer = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getSet(pt.ulisboa.tecnico.softeng.activity.domain.Activity o1) {
            return ((Activity_Base)o1).get$rl$activityOffer();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer.role$$activity;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> role$$activityProvider = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider getValue(pt.ulisboa.tecnico.softeng.activity.domain.Activity o1) {
            return ((Activity_Base.DO_State)o1.get$obj$state(false)).activityProvider;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.Activity o1, pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o2) {
            ((Activity_Base.DO_State)o1.get$obj$state(true)).activityProvider = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider.role$$activity;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getRelationActivityHasActivityOffers() {
        return pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer.getRelationActivityHasActivityOffers();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> keyFunction$$activityOffer = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getRelationActivityProviderHasActivities() {
        return pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider.getRelationActivityProviderHasActivities();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> get$rl$activityOffer() {
        return get$$relationList("activityOffer", getRelationActivityHasActivityOffers().getInverseRelation());
        
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
    protected  Activity_Base() {
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
    
    public java.lang.String getCode() {
        return ((DO_State)this.get$obj$state(false)).code;
    }
    
    public void setCode(java.lang.String code) {
        ((DO_State)this.get$obj$state(true)).code = code;
    }
    
    private java.lang.String get$code() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).code;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$code(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).code = (java.lang.String)((value == null) ? null : value);
    }
    
    public int getMinAge() {
        return ((DO_State)this.get$obj$state(false)).minAge;
    }
    
    public void setMinAge(int minAge) {
        ((DO_State)this.get$obj$state(true)).minAge = minAge;
    }
    
    private int get$minAge() {
        int value = ((DO_State)this.get$obj$state(false)).minAge;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$minAge(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).minAge = (int)(value);
    }
    
    public int getMaxAge() {
        return ((DO_State)this.get$obj$state(false)).maxAge;
    }
    
    public void setMaxAge(int maxAge) {
        ((DO_State)this.get$obj$state(true)).maxAge = maxAge;
    }
    
    private int get$maxAge() {
        int value = ((DO_State)this.get$obj$state(false)).maxAge;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$maxAge(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).maxAge = (int)(value);
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
    
    // Role Methods
    
    public void addActivityOffer(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer activityOffer) {
        getRelationActivityHasActivityOffers().add(activityOffer, (pt.ulisboa.tecnico.softeng.activity.domain.Activity)this);
    }
    
    public void removeActivityOffer(pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer activityOffer) {
        getRelationActivityHasActivityOffers().remove(activityOffer, (pt.ulisboa.tecnico.softeng.activity.domain.Activity)this);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getActivityOfferSet() {
        return get$rl$activityOffer();
    }
    
    public void set$activityOffer(OJBFunctionalSetWrapper activityOffer) {
        get$rl$activityOffer().setFromOJB(this, "activityOffer", activityOffer);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.ActivityOffer> getActivityOffer() {
        return getActivityOfferSet();
    }
    
    @Deprecated
    public int getActivityOfferCount() {
        return getActivityOfferSet().size();
    }
    
    public pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider getActivityProvider() {
        return ((DO_State)this.get$obj$state(false)).activityProvider;
    }
    
    public void setActivityProvider(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider activityProvider) {
        getRelationActivityProviderHasActivities().add(activityProvider, (pt.ulisboa.tecnico.softeng.activity.domain.Activity)this);
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
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$activityOffer().size() > 0) handleAttemptToDeleteConnectedObject("ActivityOffer");
        if (castedState.activityProvider != null) handleAttemptToDeleteConnectedObject("ActivityProvider");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$code(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CODE"), state);
        set$minAge(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "MIN_AGE"), state);
        set$maxAge(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "MAX_AGE"), state);
        set$capacity(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "CAPACITY"), state);
        castedState.activityProvider = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ACTIVITY_PROVIDER");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("activityOffer")) return getRelationActivityHasActivityOffers().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("activityOffer", getRelationActivityHasActivityOffers().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private java.lang.String code;
        private int minAge;
        private int maxAge;
        private int capacity;
        private pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider activityProvider;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.code = this.code;
            newCasted.minAge = this.minAge;
            newCasted.maxAge = this.maxAge;
            newCasted.capacity = this.capacity;
            newCasted.activityProvider = this.activityProvider;
            
        }
        
    }
    
}
