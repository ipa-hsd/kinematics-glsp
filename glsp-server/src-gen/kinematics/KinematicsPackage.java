/**
 */
package kinematics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
    * The number of structural features of the '<em>Joint</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOINT_FEATURE_COUNT = 4;

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

   }

} //KinematicsPackage
