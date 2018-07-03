package pt.ulisboa.tecnico.softeng.activity.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class ActivityProvider_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o1) {
            return ((ActivityProvider_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o1, pt.ist.fenixframework.DomainRoot o2) {
            ((ActivityProvider_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$activityProvider;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> role$$activity = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.activity.domain.Activity> getSet(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o1) {
            return ((ActivityProvider_Base)o1).get$rl$activity();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Activity,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Activity.role$$activityProvider;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Processor> role$$processor = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Processor>() {
        @Override
        public pt.ulisboa.tecnico.softeng.activity.domain.Processor getValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o1) {
            return ((ActivityProvider_Base.DO_State)o1.get$obj$state(false)).processor;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider o1, pt.ulisboa.tecnico.softeng.activity.domain.Processor o2) {
            ((ActivityProvider_Base.DO_State)o1.get$obj$state(true)).processor = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.activity.domain.Processor.role$$activityProvider;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getRelationDomainRootHasActivityProviders() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootHasActivityProviders();
    }
    
    private final static class ActivityProviderHasActivities {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity>(role$$activity, "ActivityProviderHasActivities");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> getRelationActivityProviderHasActivities() {
        return ActivityProviderHasActivities.relation;
    }
    
    static {
        ActivityProviderHasActivities.relation.setRelationName("pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider.ActivityProviderHasActivities");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Activity> keyFunction$$activity = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.activity.domain.Activity>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.activity.domain.Activity value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.activity.domain.Processor,pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider> getRelationActivityProviderHasProcessor() {
        return pt.ulisboa.tecnico.softeng.activity.domain.Processor.getRelationActivityProviderHasProcessor();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider,pt.ulisboa.tecnico.softeng.activity.domain.Activity> get$rl$activity() {
        return get$$relationList("activity", getRelationActivityProviderHasActivities());
        
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
    protected  ActivityProvider_Base() {
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
    
    public java.lang.String getNif() {
        return ((DO_State)this.get$obj$state(false)).nif;
    }
    
    public void setNif(java.lang.String nif) {
        ((DO_State)this.get$obj$state(true)).nif = nif;
    }
    
    private java.lang.String get$nif() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).nif;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$nif(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).nif = (java.lang.String)((value == null) ? null : value);
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
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootHasActivityProviders().add(root, (pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider)this);
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
    
    public void addActivity(pt.ulisboa.tecnico.softeng.activity.domain.Activity activity) {
        getRelationActivityProviderHasActivities().add((pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider)this, activity);
    }
    
    public void removeActivity(pt.ulisboa.tecnico.softeng.activity.domain.Activity activity) {
        getRelationActivityProviderHasActivities().remove((pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider)this, activity);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.Activity> getActivitySet() {
        return get$rl$activity();
    }
    
    public void set$activity(OJBFunctionalSetWrapper activity) {
        get$rl$activity().setFromOJB(this, "activity", activity);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.activity.domain.Activity> getActivity() {
        return getActivitySet();
    }
    
    @Deprecated
    public int getActivityCount() {
        return getActivitySet().size();
    }
    
    public pt.ulisboa.tecnico.softeng.activity.domain.Processor getProcessor() {
        return ((DO_State)this.get$obj$state(false)).processor;
    }
    
    public void setProcessor(pt.ulisboa.tecnico.softeng.activity.domain.Processor processor) {
        getRelationActivityProviderHasProcessor().add(processor, (pt.ulisboa.tecnico.softeng.activity.domain.ActivityProvider)this);
    }
    
    private java.lang.Long get$oidProcessor() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).processor;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfProcessor() {
        if (getProcessor() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        if (get$rl$activity().size() > 0) handleAttemptToDeleteConnectedObject("Activity");
        if (castedState.processor != null) handleAttemptToDeleteConnectedObject("Processor");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$code(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CODE"), state);
        set$nif(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NIF"), state);
        set$iban(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "IBAN"), state);
        set$counter(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "COUNTER"), state);
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
        castedState.processor = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PROCESSOR");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("activity")) return getRelationActivityProviderHasActivities();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("activity", getRelationActivityProviderHasActivities());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private java.lang.String code;
        private java.lang.String nif;
        private java.lang.String iban;
        private int counter;
        private pt.ist.fenixframework.DomainRoot root;
        private pt.ulisboa.tecnico.softeng.activity.domain.Processor processor;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.code = this.code;
            newCasted.nif = this.nif;
            newCasted.iban = this.iban;
            newCasted.counter = this.counter;
            newCasted.root = this.root;
            newCasted.processor = this.processor;
            
        }
        
    }
    
}
