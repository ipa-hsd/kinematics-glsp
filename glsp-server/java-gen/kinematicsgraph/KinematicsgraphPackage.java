/**
 */
package kinematicsgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kinematicsgraph.KinematicsgraphFactory
 * @model kind="package"
 * @generated
 */
public interface KinematicsgraphPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "kinematicsgraph";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://de.fraunhofer.ipa/kinematics/graph";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "kinematicsgraph";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   KinematicsgraphPackage eINSTANCE = kinematicsgraph.impl.KinematicsgraphPackageImpl.init();

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.JointEdgeImpl <em>Joint Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.JointEdgeImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getJointEdge()
    * @generated
    */
   int JOINT_EDGE = 0;

   /**
    * The feature id for the '<em><b>Args</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__ARGS = GraphPackage.GEDGE__ARGS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__ID = GraphPackage.GEDGE__ID;

   /**
    * The feature id for the '<em><b>Css Classes</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__CSS_CLASSES = GraphPackage.GEDGE__CSS_CLASSES;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__CHILDREN = GraphPackage.GEDGE__CHILDREN;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__PARENT = GraphPackage.GEDGE__PARENT;

   /**
    * The feature id for the '<em><b>Trace</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__TRACE = GraphPackage.GEDGE__TRACE;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__TYPE = GraphPackage.GEDGE__TYPE;

   /**
    * The feature id for the '<em><b>Routing Points</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__ROUTING_POINTS = GraphPackage.GEDGE__ROUTING_POINTS;

   /**
    * The feature id for the '<em><b>Source Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__SOURCE_ID = GraphPackage.GEDGE__SOURCE_ID;

   /**
    * The feature id for the '<em><b>Target Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__TARGET_ID = GraphPackage.GEDGE__TARGET_ID;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__SOURCE = GraphPackage.GEDGE__SOURCE;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__TARGET = GraphPackage.GEDGE__TARGET;

   /**
    * The feature id for the '<em><b>Router Kind</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__ROUTER_KIND = GraphPackage.GEDGE__ROUTER_KIND;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE__ORIGIN = GraphPackage.GEDGE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE_FEATURE_COUNT = GraphPackage.GEDGE_FEATURE_COUNT + 1;

   /**
    * The number of operations of the '<em>Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_EDGE_OPERATION_COUNT = GraphPackage.GEDGE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.PoseImpl <em>Pose</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.PoseImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getPose()
    * @generated
    */
   int POSE = 1;

   /**
    * The feature id for the '<em><b>Xyz</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__XYZ = 0;

   /**
    * The feature id for the '<em><b>Rpy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__RPY = 1;

   /**
    * The number of structural features of the '<em>Pose</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>Pose</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE_OPERATION_COUNT = 0;


   /**
    * Returns the meta object for class '{@link kinematicsgraph.JointEdge <em>Joint Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Joint Edge</em>'.
    * @see kinematicsgraph.JointEdge
    * @generated
    */
   EClass getJointEdge();

   /**
    * Returns the meta object for the reference '{@link kinematicsgraph.JointEdge#getOrigin <em>Origin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Origin</em>'.
    * @see kinematicsgraph.JointEdge#getOrigin()
    * @see #getJointEdge()
    * @generated
    */
   EReference getJointEdge_Origin();

   /**
    * Returns the meta object for class '{@link kinematicsgraph.Pose <em>Pose</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pose</em>'.
    * @see kinematicsgraph.Pose
    * @generated
    */
   EClass getPose();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getXyz <em>Xyz</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Xyz</em>'.
    * @see kinematicsgraph.Pose#getXyz()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Xyz();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getRpy <em>Rpy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Rpy</em>'.
    * @see kinematicsgraph.Pose#getRpy()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Rpy();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   KinematicsgraphFactory getKinematicsgraphFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each operation of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals {
      /**
       * The meta object literal for the '{@link kinematicsgraph.impl.JointEdgeImpl <em>Joint Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.JointEdgeImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getJointEdge()
       * @generated
       */
      EClass JOINT_EDGE = eINSTANCE.getJointEdge();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOINT_EDGE__ORIGIN = eINSTANCE.getJointEdge_Origin();

      /**
       * The meta object literal for the '{@link kinematicsgraph.impl.PoseImpl <em>Pose</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.PoseImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getPose()
       * @generated
       */
      EClass POSE = eINSTANCE.getPose();

      /**
       * The meta object literal for the '<em><b>Xyz</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__XYZ = eINSTANCE.getPose_Xyz();

      /**
       * The meta object literal for the '<em><b>Rpy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__RPY = eINSTANCE.getPose_Rpy();

   }

} //KinematicsgraphPackage
