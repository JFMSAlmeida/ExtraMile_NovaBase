package pt.ist.fenixframework;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class DomainRoot_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData> role$$installationData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData>() {
        @Override
        public pt.ist.fenixframework.data.InstallationData getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).installationData;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.data.InstallationData o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).installationData = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.data.InstallationData.role$$domainRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar> role$$rentACar = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.softeng.car.domain.RentACar> getSet(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base)o1).get$rl$rentACar();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.softeng.car.domain.RentACar,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ulisboa.tecnico.softeng.car.domain.RentACar.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> role$$domainFenixFrameworkRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>() {
        @Override
        public pt.ist.fenixframework.DomainFenixFrameworkRoot getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).domainFenixFrameworkRoot;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.DomainFenixFrameworkRoot o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).domainFenixFrameworkRoot = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.DomainFenixFrameworkRoot.role$$domainRoot;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return pt.ist.fenixframework.data.InstallationData.getRelationDomainRootHasInstallationData();
    }
    
    private final static class DomainRootHasRentACarApplication {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar>(role$$rentACar, "DomainRootHasRentACarApplication");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar> getRelationDomainRootHasRentACarApplication() {
        return DomainRootHasRentACarApplication.relation;
    }
    
    static {
        DomainRootHasRentACarApplication.relation.setRelationName("pt.ist.fenixframework.DomainRoot.DomainRootHasRentACarApplication");
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.RentACar> keyFunction$$rentACar = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.softeng.car.domain.RentACar>() { public Comparable<?> getKey(pt.ulisboa.tecnico.softeng.car.domain.RentACar value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class DomainRootDomainFenixFrameworkRoot {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>(role$$domainFenixFrameworkRoot, "DomainRootDomainFenixFrameworkRoot");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return DomainRootDomainFenixFrameworkRoot.relation;
    }
    
    static {
        DomainRootDomainFenixFrameworkRoot.relation.setRelationName("pt.ist.fenixframework.DomainRoot.DomainRootDomainFenixFrameworkRoot");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.softeng.car.domain.RentACar> get$rl$rentACar() {
        return get$$relationList("rentACar", getRelationDomainRootHasRentACarApplication());
        
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
    protected  DomainRoot_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.data.InstallationData getInstallationData() {
        return ((DO_State)this.get$obj$state(false)).installationData;
    }
    
    public void setInstallationData(pt.ist.fenixframework.data.InstallationData installationData) {
        getRelationDomainRootHasInstallationData().add(installationData, (pt.ist.fenixframework.DomainRoot)this);
    }
    
    private java.lang.Long get$oidInstallationData() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).installationData;
        return (value == null) ? null : value.getOid();
    }
    
    public void addRentACar(pt.ulisboa.tecnico.softeng.car.domain.RentACar rentACar) {
        getRelationDomainRootHasRentACarApplication().add((pt.ist.fenixframework.DomainRoot)this, rentACar);
    }
    
    public void removeRentACar(pt.ulisboa.tecnico.softeng.car.domain.RentACar rentACar) {
        getRelationDomainRootHasRentACarApplication().remove((pt.ist.fenixframework.DomainRoot)this, rentACar);
    }
    
    public java.util.Set<pt.ulisboa.tecnico.softeng.car.domain.RentACar> getRentACarSet() {
        return get$rl$rentACar();
    }
    
    public void set$rentACar(OJBFunctionalSetWrapper rentACar) {
        get$rl$rentACar().setFromOJB(this, "rentACar", rentACar);
    }
    
    @Deprecated
    public java.util.Set<pt.ulisboa.tecnico.softeng.car.domain.RentACar> getRentACar() {
        return getRentACarSet();
    }
    
    @Deprecated
    public int getRentACarCount() {
        return getRentACarSet().size();
    }
    
    public pt.ist.fenixframework.DomainFenixFrameworkRoot getDomainFenixFrameworkRoot() {
        return ((DO_State)this.get$obj$state(false)).domainFenixFrameworkRoot;
    }
    
    public void setDomainFenixFrameworkRoot(pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot) {
        getRelationDomainRootDomainFenixFrameworkRoot().add((pt.ist.fenixframework.DomainRoot)this, domainFenixFrameworkRoot);
    }
    
    private java.lang.Long get$oidDomainFenixFrameworkRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).domainFenixFrameworkRoot;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.installationData != null) handleAttemptToDeleteConnectedObject("InstallationData");
        if (get$rl$rentACar().size() > 0) handleAttemptToDeleteConnectedObject("RentACar");
        if (castedState.domainFenixFrameworkRoot != null) handleAttemptToDeleteConnectedObject("DomainFenixFrameworkRoot");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.installationData = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_INSTALLATION_DATA");
        castedState.domainFenixFrameworkRoot = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_DOMAIN_FENIX_FRAMEWORK_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("rentACar")) return getRelationDomainRootHasRentACarApplication();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("rentACar", getRelationDomainRootHasRentACarApplication());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private pt.ist.fenixframework.data.InstallationData installationData;
        private pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.installationData = this.installationData;
            newCasted.domainFenixFrameworkRoot = this.domainFenixFrameworkRoot;
            
        }
        
    }
    
}
