/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.Axis;
import kinematicsgraph.FixedJointEdge;
import kinematicsgraph.JointEdge;
import kinematicsgraph.KinematicsgraphFactory;
import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Limit;
import kinematicsgraph.Pose;
import kinematicsgraph.PrismaticJointEdge;
import kinematicsgraph.RevoluteJointEdge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.glsp.graph.GraphPackage;

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
   private EClass limitEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass poseEClass = null;

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
   private EClass fixedJointEdgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass revoluteJointEdgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass prismaticJointEdgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass axisEClass = null;

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

      // Initialize simple dependencies
      GraphPackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theKinematicsgraphPackage.createPackageContents();

      // Initialize created meta-data
      theKinematicsgraphPackage.initializePackageContents();

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
   public EClass getLimit() {
      return limitEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLimit_Lower() {
      return (EAttribute)limitEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLimit_Upper() {
      return (EAttribute)limitEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLimit_Effort() {
      return (EAttribute)limitEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getLimit_Velocity() {
      return (EAttribute)limitEClass.getEStructuralFeatures().get(3);
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
   public EAttribute getPose_X() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Y() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Z() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Roll() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Pitch() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getPose_Yaw() {
      return (EAttribute)poseEClass.getEStructuralFeatures().get(5);
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
   public EClass getFixedJointEdge() {
      return fixedJointEdgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getRevoluteJointEdge() {
      return revoluteJointEdgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRevoluteJointEdge_Limit() {
      return (EReference)revoluteJointEdgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getRevoluteJointEdge_Axis() {
      return (EReference)revoluteJointEdgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getPrismaticJointEdge() {
      return prismaticJointEdgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPrismaticJointEdge_Limit() {
      return (EReference)prismaticJointEdgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getPrismaticJointEdge_Axis() {
      return (EReference)prismaticJointEdgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getAxis() {
      return axisEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAxis_X() {
      return (EAttribute)axisEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAxis_Y() {
      return (EAttribute)axisEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getAxis_Z() {
      return (EAttribute)axisEClass.getEStructuralFeatures().get(2);
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
      limitEClass = createEClass(LIMIT);
      createEAttribute(limitEClass, LIMIT__LOWER);
      createEAttribute(limitEClass, LIMIT__UPPER);
      createEAttribute(limitEClass, LIMIT__EFFORT);
      createEAttribute(limitEClass, LIMIT__VELOCITY);

      poseEClass = createEClass(POSE);
      createEAttribute(poseEClass, POSE__X);
      createEAttribute(poseEClass, POSE__Y);
      createEAttribute(poseEClass, POSE__Z);
      createEAttribute(poseEClass, POSE__ROLL);
      createEAttribute(poseEClass, POSE__PITCH);
      createEAttribute(poseEClass, POSE__YAW);

      jointEdgeEClass = createEClass(JOINT_EDGE);
      createEReference(jointEdgeEClass, JOINT_EDGE__ORIGIN);

      fixedJointEdgeEClass = createEClass(FIXED_JOINT_EDGE);

      revoluteJointEdgeEClass = createEClass(REVOLUTE_JOINT_EDGE);
      createEReference(revoluteJointEdgeEClass, REVOLUTE_JOINT_EDGE__LIMIT);
      createEReference(revoluteJointEdgeEClass, REVOLUTE_JOINT_EDGE__AXIS);

      prismaticJointEdgeEClass = createEClass(PRISMATIC_JOINT_EDGE);
      createEReference(prismaticJointEdgeEClass, PRISMATIC_JOINT_EDGE__LIMIT);
      createEReference(prismaticJointEdgeEClass, PRISMATIC_JOINT_EDGE__AXIS);

      axisEClass = createEClass(AXIS);
      createEAttribute(axisEClass, AXIS__X);
      createEAttribute(axisEClass, AXIS__Y);
      createEAttribute(axisEClass, AXIS__Z);
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
      fixedJointEdgeEClass.getESuperTypes().add(this.getJointEdge());
      revoluteJointEdgeEClass.getESuperTypes().add(this.getJointEdge());
      prismaticJointEdgeEClass.getESuperTypes().add(this.getJointEdge());

      // Initialize classes, features, and operations; add parameters
      initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getLimit_Lower(), ecorePackage.getEDouble(), "lower", null, 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getLimit_Upper(), ecorePackage.getEDouble(), "upper", null, 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getLimit_Effort(), ecorePackage.getEDouble(), "effort", null, 1, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getLimit_Velocity(), ecorePackage.getEDouble(), "velocity", null, 1, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(poseEClass, Pose.class, "Pose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getPose_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Z(), ecorePackage.getEDouble(), "z", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Roll(), ecorePackage.getEDouble(), "roll", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Pitch(), ecorePackage.getEDouble(), "pitch", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getPose_Yaw(), ecorePackage.getEDouble(), "yaw", null, 1, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(jointEdgeEClass, JointEdge.class, "JointEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getJointEdge_Origin(), this.getPose(), null, "origin", null, 1, 1, JointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(fixedJointEdgeEClass, FixedJointEdge.class, "FixedJointEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      initEClass(revoluteJointEdgeEClass, RevoluteJointEdge.class, "RevoluteJointEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getRevoluteJointEdge_Limit(), this.getLimit(), null, "limit", null, 1, 1, RevoluteJointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getRevoluteJointEdge_Axis(), this.getAxis(), null, "axis", null, 1, 1, RevoluteJointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(prismaticJointEdgeEClass, PrismaticJointEdge.class, "PrismaticJointEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getPrismaticJointEdge_Limit(), this.getLimit(), null, "limit", null, 1, 1, PrismaticJointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getPrismaticJointEdge_Axis(), this.getAxis(), null, "axis", null, 1, 1, PrismaticJointEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getAxis_X(), ecorePackage.getEDouble(), "x", null, 1, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAxis_Y(), ecorePackage.getEDouble(), "y", null, 1, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAxis_Z(), ecorePackage.getEDouble(), "z", null, 1, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} //KinematicsgraphPackageImpl
