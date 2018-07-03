package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class AdventureState_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> role$$adventure = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>() {
        @Override
        public pt.ulisboa.tecnico.softeng.broker.domain.Adventure getValue(pt.ulisboa.tecnico.softeng.broker.domain.AdventureState o1) {
            return ((AdventureState_Base.DO_State)o1.get$obj$state(false)).adventure;
        }
        @Override
        public void setValue(pt.ulisboa.tecnico.softeng.broker.domain.AdventureState o1, pt.ulisboa.tecnico.softeng.broker.domain.Adventure o2) {
            ((AdventureState_Base.DO_State)o1.get$obj$state(true)).adventure = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.broker.domain.Adventure,pt.ulisboa.tecnico.softeng.broker.domain.AdventureState> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.broker.domain.Adventure.role$$state;
        }
        
    };
    
    private final static class AdventureHasState {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure>(role$$adventure, "AdventureHasState");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.softeng.broker.domain.AdventureState,pt.ulisboa.tecnico.softeng.broker.domain.Adventure> getRelationAdventureHasState() {
        return AdventureHasState.relation;
    }
    
    static {
        AdventureHasState.relation.setRelationName("pt.ulisboa.tecnico.softeng.broker.domain.AdventureState.AdventureHasState");
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
    protected  AdventureState_Base() {
        super();
    }
    
    // Getters and Setters
    
    public int getNumOfRemoteErrors() {
        return ((DO_State)this.get$obj$state(false)).numOfRemoteErrors;
    }
    
    public void setNumOfRemoteErrors(int numOfRemoteErrors) {
        ((DO_State)this.get$obj$state(true)).numOfRemoteErrors = numOfRemoteErrors;
    }
    
    private int get$numOfRemoteErrors() {
        int value = ((DO_State)this.get$obj$state(false)).numOfRemoteErrors;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$numOfRemoteErrors(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numOfRemoteErrors = (int)(value);
    }
    
    // Role Methods
    
    public pt.ulisboa.tecnico.softeng.broker.domain.Adventure getAdventure() {
        return ((DO_State)this.get$obj$state(false)).adventure;
    }
    
    public void setAdventure(pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure) {
        getRelationAdventureHasState().add((pt.ulisboa.tecnico.softeng.broker.domain.AdventureState)this, adventure);
    }
    
    private java.lang.Long get$oidAdventure() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).adventure;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.adventure != null) handleAttemptToDeleteConnectedObject("Adventure");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$numOfRemoteErrors(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUM_OF_REMOTE_ERRORS"), state);
        castedState.adventure = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ADVENTURE");
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
        private int numOfRemoteErrors;
        private pt.ulisboa.tecnico.softeng.broker.domain.Adventure adventure;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.numOfRemoteErrors = this.numOfRemoteErrors;
            newCasted.adventure = this.adventure;
            
        }
        
    }
    
}
