/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.JointEdge;
import kinematicsgraph.KinematicsgraphFactory;
import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Pose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.glsp.graph.GraphPackage;

import org.eclipse.glsp.graph.impl.GraphPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KinematicsgraphPackageImpl extends EPackageImpl implements KinematicsgraphPackage {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass jointEdgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass poseEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see kinematicsgraph.KinematicsgraphPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private KinematicsgraphPackageImpl() {
      super(eNS_URI, KinematicsgraphFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    *
    * <p>This method is used to initialize {@link KinematicsgraphPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static KinematicsgraphPackage init() {
      if (isInited) return (KinematicsgraphPackage)EPackage.Registry.INSTANCE.getEPackage(KinematicsgraphPackage.eNS_URI);

      // Obtain or create and register package
      Object registeredKinematicsgraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
      KinematicsgraphPackageImpl theKinematicsgraphPackage = registeredKinematicsgraphPackage instanceof KinematicsgraphPackageImpl ? (KinematicsgraphPackageImpl)registeredKinematicsgraphPackage : new KinematicsgraphPackageImpl();

      isInited = true;

      // Obtain or create and register interdependencies
      Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
      GraphPackageImpl theGraphPackage = (GraphPackageImpl)(registeredPackage instanceof GraphPackageImpl ? registeredPackage : GraphPackage.eINSTANCE);

      // Create package meta-data objects
      theKinematicsgraphPackage.createPackageContents();
      theGraphPackage.createPackageContents();

      // Initialize created meta-data
      theKinematicsgraphPackage.initializePackageContents();
      theGraphPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theKinematicsgraphPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(KinematicsgraphPackage.eNS_URI, theKinematicsgraphPackage);
      return theKinematicsgraphPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getJointEdge() {
      return jointEdgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getJointEdge_Origin() {
      return (EReference)jointEdgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPose() {
      return poseEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Xyz() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Rpy() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsgraphFactory getKinematicsgraphFactory() {
      return (KinematicsgraphFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents() {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      jointEdgeEClass = createEClass(JOINT_EDGE);
      createEReference(jointEdgeEClass, JOINT_EDGE__ORIGIN);

      poseEClass = createEClass(POSE);
      createEAttribute(poseEClass, POSE__XYZ);
      createEAttribute(poseEClass, POSE__RPY);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents() {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      jointEdgeEClass.getESuperTypes().add(theGraphPackage.getGEdge());

      // Initialize classes, features, and operations; add parameters
      initEClass(jointEdgeEClass, JointEdge.class, "JointEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getJointEdge_Origin(), this.getPose(), null, "origin", null, 1, 1, JointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(poseEClass, Pose.class, "Pose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getPose_Xyz(), ecorePackage.getEString(), "xyz", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Rpy(), ecorePackage.getEString(), "rpy", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //KinematicsgraphPackageImpl
