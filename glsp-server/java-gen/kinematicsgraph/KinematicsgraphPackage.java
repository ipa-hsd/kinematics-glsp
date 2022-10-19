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
    * The meta object id for the '{@link kinematicsgraph.impl.LimitImpl <em>Limit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.LimitImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getLimit()
    * @generated
    */
   int LIMIT = 0;

   /**
    * The feature id for the '<em><b>Lower</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__LOWER = 0;

   /**
    * The feature id for the '<em><b>Upper</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__UPPER = 1;

   /**
    * The feature id for the '<em><b>Effort</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__EFFORT = 2;

   /**
    * The feature id for the '<em><b>Velocity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__VELOCITY = 3;

   /**
    * The number of structural features of the '<em>Limit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Limit</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT_OPERATION_COUNT = 0;

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
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__X = 0;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__Y = 1;

   /**
    * The feature id for the '<em><b>Z</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__Z = 2;

   /**
    * The feature id for the '<em><b>Roll</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__ROLL = 3;

   /**
    * The feature id for the '<em><b>Pitch</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__PITCH = 4;

   /**
    * The feature id for the '<em><b>Yaw</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE__YAW = 5;

   /**
    * The number of structural features of the '<em>Pose</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE_FEATURE_COUNT = 6;

   /**
    * The number of operations of the '<em>Pose</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int POSE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.JointEdgeImpl <em>Joint Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.JointEdgeImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getJointEdge()
    * @generated
    */
   int JOINT_EDGE = 2;

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
    * The meta object id for the '{@link kinematicsgraph.impl.FixedJointEdgeImpl <em>Fixed Joint Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.FixedJointEdgeImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getFixedJointEdge()
    * @generated
    */
   int FIXED_JOINT_EDGE = 3;

   /**
    * The feature id for the '<em><b>Args</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__ARGS = JOINT_EDGE__ARGS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__ID = JOINT_EDGE__ID;

   /**
    * The feature id for the '<em><b>Css Classes</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__CSS_CLASSES = JOINT_EDGE__CSS_CLASSES;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__CHILDREN = JOINT_EDGE__CHILDREN;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__PARENT = JOINT_EDGE__PARENT;

   /**
    * The feature id for the '<em><b>Trace</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__TRACE = JOINT_EDGE__TRACE;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__TYPE = JOINT_EDGE__TYPE;

   /**
    * The feature id for the '<em><b>Routing Points</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__ROUTING_POINTS = JOINT_EDGE__ROUTING_POINTS;

   /**
    * The feature id for the '<em><b>Source Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__SOURCE_ID = JOINT_EDGE__SOURCE_ID;

   /**
    * The feature id for the '<em><b>Target Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__TARGET_ID = JOINT_EDGE__TARGET_ID;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__SOURCE = JOINT_EDGE__SOURCE;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__TARGET = JOINT_EDGE__TARGET;

   /**
    * The feature id for the '<em><b>Router Kind</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__ROUTER_KIND = JOINT_EDGE__ROUTER_KIND;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE__ORIGIN = JOINT_EDGE__ORIGIN;

   /**
    * The number of structural features of the '<em>Fixed Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE_FEATURE_COUNT = JOINT_EDGE_FEATURE_COUNT + 0;

   /**
    * The number of operations of the '<em>Fixed Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FIXED_JOINT_EDGE_OPERATION_COUNT = JOINT_EDGE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.RevoluteJointEdgeImpl <em>Revolute Joint Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.RevoluteJointEdgeImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getRevoluteJointEdge()
    * @generated
    */
   int REVOLUTE_JOINT_EDGE = 4;

   /**
    * The feature id for the '<em><b>Args</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__ARGS = JOINT_EDGE__ARGS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__ID = JOINT_EDGE__ID;

   /**
    * The feature id for the '<em><b>Css Classes</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__CSS_CLASSES = JOINT_EDGE__CSS_CLASSES;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__CHILDREN = JOINT_EDGE__CHILDREN;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__PARENT = JOINT_EDGE__PARENT;

   /**
    * The feature id for the '<em><b>Trace</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__TRACE = JOINT_EDGE__TRACE;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__TYPE = JOINT_EDGE__TYPE;

   /**
    * The feature id for the '<em><b>Routing Points</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__ROUTING_POINTS = JOINT_EDGE__ROUTING_POINTS;

   /**
    * The feature id for the '<em><b>Source Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__SOURCE_ID = JOINT_EDGE__SOURCE_ID;

   /**
    * The feature id for the '<em><b>Target Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__TARGET_ID = JOINT_EDGE__TARGET_ID;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__SOURCE = JOINT_EDGE__SOURCE;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__TARGET = JOINT_EDGE__TARGET;

   /**
    * The feature id for the '<em><b>Router Kind</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__ROUTER_KIND = JOINT_EDGE__ROUTER_KIND;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__ORIGIN = JOINT_EDGE__ORIGIN;

   /**
    * The feature id for the '<em><b>Limit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__LIMIT = JOINT_EDGE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Axis</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE__AXIS = JOINT_EDGE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Revolute Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE_FEATURE_COUNT = JOINT_EDGE_FEATURE_COUNT + 2;

   /**
    * The number of operations of the '<em>Revolute Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REVOLUTE_JOINT_EDGE_OPERATION_COUNT = JOINT_EDGE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.PrismaticJointEdgeImpl <em>Prismatic Joint Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.PrismaticJointEdgeImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getPrismaticJointEdge()
    * @generated
    */
   int PRISMATIC_JOINT_EDGE = 5;

   /**
    * The feature id for the '<em><b>Args</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__ARGS = JOINT_EDGE__ARGS;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__ID = JOINT_EDGE__ID;

   /**
    * The feature id for the '<em><b>Css Classes</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__CSS_CLASSES = JOINT_EDGE__CSS_CLASSES;

   /**
    * The feature id for the '<em><b>Children</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__CHILDREN = JOINT_EDGE__CHILDREN;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__PARENT = JOINT_EDGE__PARENT;

   /**
    * The feature id for the '<em><b>Trace</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__TRACE = JOINT_EDGE__TRACE;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__TYPE = JOINT_EDGE__TYPE;

   /**
    * The feature id for the '<em><b>Routing Points</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__ROUTING_POINTS = JOINT_EDGE__ROUTING_POINTS;

   /**
    * The feature id for the '<em><b>Source Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__SOURCE_ID = JOINT_EDGE__SOURCE_ID;

   /**
    * The feature id for the '<em><b>Target Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__TARGET_ID = JOINT_EDGE__TARGET_ID;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__SOURCE = JOINT_EDGE__SOURCE;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__TARGET = JOINT_EDGE__TARGET;

   /**
    * The feature id for the '<em><b>Router Kind</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__ROUTER_KIND = JOINT_EDGE__ROUTER_KIND;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__ORIGIN = JOINT_EDGE__ORIGIN;

   /**
    * The feature id for the '<em><b>Limit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__LIMIT = JOINT_EDGE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Axis</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE__AXIS = JOINT_EDGE_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Prismatic Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE_FEATURE_COUNT = JOINT_EDGE_FEATURE_COUNT + 2;

   /**
    * The number of operations of the '<em>Prismatic Joint Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PRISMATIC_JOINT_EDGE_OPERATION_COUNT = JOINT_EDGE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link kinematicsgraph.impl.AxisImpl <em>Axis</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematicsgraph.impl.AxisImpl
    * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getAxis()
    * @generated
    */
   int AXIS = 6;

   /**
    * The feature id for the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int AXIS__X = 0;

   /**
    * The feature id for the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int AXIS__Y = 1;

   /**
    * The feature id for the '<em><b>Z</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int AXIS__Z = 2;

   /**
    * The number of structural features of the '<em>Axis</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int AXIS_FEATURE_COUNT = 3;

   /**
    * The number of operations of the '<em>Axis</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int AXIS_OPERATION_COUNT = 0;


   /**
    * Returns the meta object for class '{@link kinematicsgraph.Limit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Limit</em>'.
    * @see kinematicsgraph.Limit
    * @generated
    */
   EClass getLimit();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Limit#getLower <em>Lower</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Lower</em>'.
    * @see kinematicsgraph.Limit#getLower()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Lower();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Limit#getUpper <em>Upper</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Upper</em>'.
    * @see kinematicsgraph.Limit#getUpper()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Upper();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Limit#getEffort <em>Effort</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Effort</em>'.
    * @see kinematicsgraph.Limit#getEffort()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Effort();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Limit#getVelocity <em>Velocity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Velocity</em>'.
    * @see kinematicsgraph.Limit#getVelocity()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Velocity();

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
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getX <em>X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>X</em>'.
    * @see kinematicsgraph.Pose#getX()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_X();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getY <em>Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Y</em>'.
    * @see kinematicsgraph.Pose#getY()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Y();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getZ <em>Z</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Z</em>'.
    * @see kinematicsgraph.Pose#getZ()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Z();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getRoll <em>Roll</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Roll</em>'.
    * @see kinematicsgraph.Pose#getRoll()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Roll();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getPitch <em>Pitch</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Pitch</em>'.
    * @see kinematicsgraph.Pose#getPitch()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Pitch();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Pose#getYaw <em>Yaw</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Yaw</em>'.
    * @see kinematicsgraph.Pose#getYaw()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Yaw();

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
    * Returns the meta object for class '{@link kinematicsgraph.FixedJointEdge <em>Fixed Joint Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Fixed Joint Edge</em>'.
    * @see kinematicsgraph.FixedJointEdge
    * @generated
    */
   EClass getFixedJointEdge();

   /**
    * Returns the meta object for class '{@link kinematicsgraph.RevoluteJointEdge <em>Revolute Joint Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Revolute Joint Edge</em>'.
    * @see kinematicsgraph.RevoluteJointEdge
    * @generated
    */
   EClass getRevoluteJointEdge();

   /**
    * Returns the meta object for the reference '{@link kinematicsgraph.RevoluteJointEdge#getLimit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Limit</em>'.
    * @see kinematicsgraph.RevoluteJointEdge#getLimit()
    * @see #getRevoluteJointEdge()
    * @generated
    */
   EReference getRevoluteJointEdge_Limit();

   /**
    * Returns the meta object for the reference '{@link kinematicsgraph.RevoluteJointEdge#getAxis <em>Axis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Axis</em>'.
    * @see kinematicsgraph.RevoluteJointEdge#getAxis()
    * @see #getRevoluteJointEdge()
    * @generated
    */
   EReference getRevoluteJointEdge_Axis();

   /**
    * Returns the meta object for class '{@link kinematicsgraph.PrismaticJointEdge <em>Prismatic Joint Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Prismatic Joint Edge</em>'.
    * @see kinematicsgraph.PrismaticJointEdge
    * @generated
    */
   EClass getPrismaticJointEdge();

   /**
    * Returns the meta object for the containment reference '{@link kinematicsgraph.PrismaticJointEdge#getLimit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Limit</em>'.
    * @see kinematicsgraph.PrismaticJointEdge#getLimit()
    * @see #getPrismaticJointEdge()
    * @generated
    */
   EReference getPrismaticJointEdge_Limit();

   /**
    * Returns the meta object for the containment reference '{@link kinematicsgraph.PrismaticJointEdge#getAxis <em>Axis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Axis</em>'.
    * @see kinematicsgraph.PrismaticJointEdge#getAxis()
    * @see #getPrismaticJointEdge()
    * @generated
    */
   EReference getPrismaticJointEdge_Axis();

   /**
    * Returns the meta object for class '{@link kinematicsgraph.Axis <em>Axis</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Axis</em>'.
    * @see kinematicsgraph.Axis
    * @generated
    */
   EClass getAxis();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Axis#getX <em>X</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>X</em>'.
    * @see kinematicsgraph.Axis#getX()
    * @see #getAxis()
    * @generated
    */
   EAttribute getAxis_X();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Axis#getY <em>Y</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Y</em>'.
    * @see kinematicsgraph.Axis#getY()
    * @see #getAxis()
    * @generated
    */
   EAttribute getAxis_Y();

   /**
    * Returns the meta object for the attribute '{@link kinematicsgraph.Axis#getZ <em>Z</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Z</em>'.
    * @see kinematicsgraph.Axis#getZ()
    * @see #getAxis()
    * @generated
    */
   EAttribute getAxis_Z();

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
       * The meta object literal for the '{@link kinematicsgraph.impl.LimitImpl <em>Limit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.LimitImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getLimit()
       * @generated
       */
      EClass LIMIT = eINSTANCE.getLimit();

      /**
       * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LIMIT__LOWER = eINSTANCE.getLimit_Lower();

      /**
       * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LIMIT__UPPER = eINSTANCE.getLimit_Upper();

      /**
       * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LIMIT__EFFORT = eINSTANCE.getLimit_Effort();

      /**
       * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LIMIT__VELOCITY = eINSTANCE.getLimit_Velocity();

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
       * The meta object literal for the '<em><b>X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__X = eINSTANCE.getPose_X();

      /**
       * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__Y = eINSTANCE.getPose_Y();

      /**
       * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__Z = eINSTANCE.getPose_Z();

      /**
       * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__ROLL = eINSTANCE.getPose_Roll();

      /**
       * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__PITCH = eINSTANCE.getPose_Pitch();

      /**
       * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute POSE__YAW = eINSTANCE.getPose_Yaw();

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
       * The meta object literal for the '{@link kinematicsgraph.impl.FixedJointEdgeImpl <em>Fixed Joint Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.FixedJointEdgeImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getFixedJointEdge()
       * @generated
       */
      EClass FIXED_JOINT_EDGE = eINSTANCE.getFixedJointEdge();

      /**
       * The meta object literal for the '{@link kinematicsgraph.impl.RevoluteJointEdgeImpl <em>Revolute Joint Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.RevoluteJointEdgeImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getRevoluteJointEdge()
       * @generated
       */
      EClass REVOLUTE_JOINT_EDGE = eINSTANCE.getRevoluteJointEdge();

      /**
       * The meta object literal for the '<em><b>Limit</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REVOLUTE_JOINT_EDGE__LIMIT = eINSTANCE.getRevoluteJointEdge_Limit();

      /**
       * The meta object literal for the '<em><b>Axis</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REVOLUTE_JOINT_EDGE__AXIS = eINSTANCE.getRevoluteJointEdge_Axis();

      /**
       * The meta object literal for the '{@link kinematicsgraph.impl.PrismaticJointEdgeImpl <em>Prismatic Joint Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.PrismaticJointEdgeImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getPrismaticJointEdge()
       * @generated
       */
      EClass PRISMATIC_JOINT_EDGE = eINSTANCE.getPrismaticJointEdge();

      /**
       * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PRISMATIC_JOINT_EDGE__LIMIT = eINSTANCE.getPrismaticJointEdge_Limit();

      /**
       * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PRISMATIC_JOINT_EDGE__AXIS = eINSTANCE.getPrismaticJointEdge_Axis();

      /**
       * The meta object literal for the '{@link kinematicsgraph.impl.AxisImpl <em>Axis</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematicsgraph.impl.AxisImpl
       * @see kinematicsgraph.impl.KinematicsgraphPackageImpl#getAxis()
       * @generated
       */
      EClass AXIS = eINSTANCE.getAxis();

      /**
       * The meta object literal for the '<em><b>X</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute AXIS__X = eINSTANCE.getAxis_X();

      /**
       * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute AXIS__Y = eINSTANCE.getAxis_Y();

      /**
       * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute AXIS__Z = eINSTANCE.getAxis_Z();

   }

} //KinematicsgraphPackage
