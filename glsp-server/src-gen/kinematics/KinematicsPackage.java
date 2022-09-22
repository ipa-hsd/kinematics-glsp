/**
 */
package kinematics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see kinematics.KinematicsFactory
 * @model kind="package"
 * @generated
 */
public interface KinematicsPackage extends EPackage {
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "kinematics";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "http://de.fraunhofer.ipa/kinematics";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "kinematics";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   KinematicsPackage eINSTANCE = kinematics.impl.KinematicsPackageImpl.init();

   /**
    * The meta object id for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematics.impl.LinkImpl
    * @see kinematics.impl.KinematicsPackageImpl#getLink()
    * @generated
    */
   int LINK = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK__NAME = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK__ID = 1;

   /**
    * The number of structural features of the '<em>Link</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>Link</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LINK_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link kinematics.impl.JointImpl <em>Joint</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematics.impl.JointImpl
    * @see kinematics.impl.KinematicsPackageImpl#getJoint()
    * @generated
    */
   int JOINT = 1;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__NAME = 0;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__ID = 1;

   /**
    * The feature id for the '<em><b>Parent</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__PARENT = 2;

   /**
    * The feature id for the '<em><b>Child</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__CHILD = 3;

   /**
    * The feature id for the '<em><b>Origin</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__ORIGIN = 4;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
	int JOINT__TYPE = 5;

			/**
    * The feature id for the '<em><b>Limit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT__LIMIT = 6;

         /**
    * The number of structural features of the '<em>Joint</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_FEATURE_COUNT = 7;

   /**
    * The number of operations of the '<em>Joint</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link kinematics.impl.RobotImpl <em>Robot</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematics.impl.RobotImpl
    * @see kinematics.impl.KinematicsPackageImpl#getRobot()
    * @generated
    */
   int ROBOT = 2;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT__ID = 0;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT__NAME = 1;

   /**
    * The feature id for the '<em><b>Links</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT__LINKS = 2;

   /**
    * The feature id for the '<em><b>Joints</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT__JOINTS = 3;

   /**
    * The number of structural features of the '<em>Robot</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT_FEATURE_COUNT = 4;

   /**
    * The number of operations of the '<em>Robot</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ROBOT_OPERATION_COUNT = 0;


   /**
    * The meta object id for the '{@link kinematics.impl.PoseImpl <em>Pose</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematics.impl.PoseImpl
    * @see kinematics.impl.KinematicsPackageImpl#getPose()
    * @generated
    */
   int POSE = 3;

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
    * The meta object id for the '{@link kinematics.impl.LimitImpl <em>Limit</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see kinematics.impl.LimitImpl
    * @see kinematics.impl.KinematicsPackageImpl#getLimit()
    * @generated
    */
   int LIMIT = 4;

   /**
    * The feature id for the '<em><b>Effort</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__EFFORT = 0;

   /**
    * The feature id for the '<em><b>Velocity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__VELOCITY = 1;

   /**
    * The feature id for the '<em><b>Lower</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__LOWER = 2;

   /**
    * The feature id for the '<em><b>Upper</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LIMIT__UPPER = 3;

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
    * The meta object id for the '{@link kinematics.JointType <em>Joint Type</em>}' enum.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see kinematics.JointType
    * @see kinematics.impl.KinematicsPackageImpl#getJointType()
    * @generated
    */
	int JOINT_TYPE = 5;


			/**
    * Returns the meta object for class '{@link kinematics.Link <em>Link</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Link</em>'.
    * @see kinematics.Link
    * @generated
    */
   EClass getLink();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Link#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see kinematics.Link#getName()
    * @see #getLink()
    * @generated
    */
   EAttribute getLink_Name();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Link#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see kinematics.Link#getId()
    * @see #getLink()
    * @generated
    */
   EAttribute getLink_Id();

   /**
    * Returns the meta object for class '{@link kinematics.Joint <em>Joint</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Joint</em>'.
    * @see kinematics.Joint
    * @generated
    */
   EClass getJoint();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Joint#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see kinematics.Joint#getName()
    * @see #getJoint()
    * @generated
    */
   EAttribute getJoint_Name();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Joint#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see kinematics.Joint#getId()
    * @see #getJoint()
    * @generated
    */
   EAttribute getJoint_Id();

   /**
    * Returns the meta object for the reference '{@link kinematics.Joint#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Parent</em>'.
    * @see kinematics.Joint#getParent()
    * @see #getJoint()
    * @generated
    */
   EReference getJoint_Parent();

   /**
    * Returns the meta object for the reference '{@link kinematics.Joint#getChild <em>Child</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Child</em>'.
    * @see kinematics.Joint#getChild()
    * @see #getJoint()
    * @generated
    */
   EReference getJoint_Child();

   /**
    * Returns the meta object for the containment reference '{@link kinematics.Joint#getOrigin <em>Origin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Origin</em>'.
    * @see kinematics.Joint#getOrigin()
    * @see #getJoint()
    * @generated
    */
   EReference getJoint_Origin();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Joint#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see kinematics.Joint#getType()
    * @see #getJoint()
    * @generated
    */
	EAttribute getJoint_Type();

			/**
    * Returns the meta object for the containment reference '{@link kinematics.Joint#getLimit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Limit</em>'.
    * @see kinematics.Joint#getLimit()
    * @see #getJoint()
    * @generated
    */
   EReference getJoint_Limit();

         /**
    * Returns the meta object for class '{@link kinematics.Robot <em>Robot</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Robot</em>'.
    * @see kinematics.Robot
    * @generated
    */
   EClass getRobot();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Robot#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see kinematics.Robot#getId()
    * @see #getRobot()
    * @generated
    */
   EAttribute getRobot_Id();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Robot#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see kinematics.Robot#getName()
    * @see #getRobot()
    * @generated
    */
   EAttribute getRobot_Name();

   /**
    * Returns the meta object for the containment reference list '{@link kinematics.Robot#getLinks <em>Links</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Links</em>'.
    * @see kinematics.Robot#getLinks()
    * @see #getRobot()
    * @generated
    */
   EReference getRobot_Links();

   /**
    * Returns the meta object for the containment reference list '{@link kinematics.Robot#getJoints <em>Joints</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Joints</em>'.
    * @see kinematics.Robot#getJoints()
    * @see #getRobot()
    * @generated
    */
   EReference getRobot_Joints();

   /**
    * Returns the meta object for class '{@link kinematics.Pose <em>Pose</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pose</em>'.
    * @see kinematics.Pose
    * @generated
    */
   EClass getPose();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Pose#getXyz <em>Xyz</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Xyz</em>'.
    * @see kinematics.Pose#getXyz()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Xyz();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Pose#getRpy <em>Rpy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Rpy</em>'.
    * @see kinematics.Pose#getRpy()
    * @see #getPose()
    * @generated
    */
   EAttribute getPose_Rpy();

   /**
    * Returns the meta object for class '{@link kinematics.Limit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Limit</em>'.
    * @see kinematics.Limit
    * @generated
    */
   EClass getLimit();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Limit#getEffort <em>Effort</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Effort</em>'.
    * @see kinematics.Limit#getEffort()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Effort();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Limit#getVelocity <em>Velocity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Velocity</em>'.
    * @see kinematics.Limit#getVelocity()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Velocity();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Limit#getLower <em>Lower</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Lower</em>'.
    * @see kinematics.Limit#getLower()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Lower();

   /**
    * Returns the meta object for the attribute '{@link kinematics.Limit#getUpper <em>Upper</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Upper</em>'.
    * @see kinematics.Limit#getUpper()
    * @see #getLimit()
    * @generated
    */
   EAttribute getLimit_Upper();

   /**
    * Returns the meta object for enum '{@link kinematics.JointType <em>Joint Type</em>}'.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Joint Type</em>'.
    * @see kinematics.JointType
    * @generated
    */
	EEnum getJointType();

			/**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   KinematicsFactory getKinematicsFactory();

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
       * The meta object literal for the '{@link kinematics.impl.LinkImpl <em>Link</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematics.impl.LinkImpl
       * @see kinematics.impl.KinematicsPackageImpl#getLink()
       * @generated
       */
      EClass LINK = eINSTANCE.getLink();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LINK__NAME = eINSTANCE.getLink_Name();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LINK__ID = eINSTANCE.getLink_Id();

      /**
       * The meta object literal for the '{@link kinematics.impl.JointImpl <em>Joint</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematics.impl.JointImpl
       * @see kinematics.impl.KinematicsPackageImpl#getJoint()
       * @generated
       */
      EClass JOINT = eINSTANCE.getJoint();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute JOINT__NAME = eINSTANCE.getJoint_Name();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute JOINT__ID = eINSTANCE.getJoint_Id();

      /**
       * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOINT__PARENT = eINSTANCE.getJoint_Parent();

      /**
       * The meta object literal for the '<em><b>Child</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOINT__CHILD = eINSTANCE.getJoint_Child();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOINT__ORIGIN = eINSTANCE.getJoint_Origin();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @generated
       */
		EAttribute JOINT__TYPE = eINSTANCE.getJoint_Type();

						/**
       * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOINT__LIMIT = eINSTANCE.getJoint_Limit();

                  /**
       * The meta object literal for the '{@link kinematics.impl.RobotImpl <em>Robot</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematics.impl.RobotImpl
       * @see kinematics.impl.KinematicsPackageImpl#getRobot()
       * @generated
       */
      EClass ROBOT = eINSTANCE.getRobot();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ROBOT__ID = eINSTANCE.getRobot_Id();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

      /**
       * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ROBOT__LINKS = eINSTANCE.getRobot_Links();

      /**
       * The meta object literal for the '<em><b>Joints</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ROBOT__JOINTS = eINSTANCE.getRobot_Joints();

      /**
       * The meta object literal for the '{@link kinematics.impl.PoseImpl <em>Pose</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematics.impl.PoseImpl
       * @see kinematics.impl.KinematicsPackageImpl#getPose()
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

						/**
       * The meta object literal for the '{@link kinematics.impl.LimitImpl <em>Limit</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see kinematics.impl.LimitImpl
       * @see kinematics.impl.KinematicsPackageImpl#getLimit()
       * @generated
       */
      EClass LIMIT = eINSTANCE.getLimit();

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
       * The meta object literal for the '{@link kinematics.JointType <em>Joint Type</em>}' enum.
       * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
       * @see kinematics.JointType
       * @see kinematics.impl.KinematicsPackageImpl#getJointType()
       * @generated
       */
		EEnum JOINT_TYPE = eINSTANCE.getJointType();

   }

} //KinematicsPackage
