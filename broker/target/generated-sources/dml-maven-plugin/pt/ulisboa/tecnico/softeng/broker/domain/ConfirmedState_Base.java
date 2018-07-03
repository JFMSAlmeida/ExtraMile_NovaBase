package pt.ulisboa.tecnico.softeng.broker.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class ConfirmedState_Base extends pt.ulisboa.tecnico.softeng.broker.domain.AdventureState {
    // Static Slots
    
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
    protected  ConfirmedState_Base() {
        super();
    }
    
    // Getters and Setters
    
    public int getNumberOfBankExceptions() {
        return ((DO_State)this.get$obj$state(false)).numberOfBankExceptions;
    }
    
    public void setNumberOfBankExceptions(int numberOfBankExceptions) {
        ((DO_State)this.get$obj$state(true)).numberOfBankExceptions = numberOfBankExceptions;
    }
    
    private int get$numberOfBankExceptions() {
        int value = ((DO_State)this.get$obj$state(false)).numberOfBankExceptions;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$numberOfBankExceptions(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numberOfBankExceptions = (int)(value);
    }
    
    // Role Methods
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        set$numberOfBankExceptions(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUMBER_OF_BANK_EXCEPTIONS"), state);
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
    protected static class DO_State extends pt.ulisboa.tecnico.softeng.broker.domain.AdventureState.DO_State {
        private int numberOfBankExceptions;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.numberOfBankExceptions = this.numberOfBankExceptions;
            
        }
        
    }
    
}
