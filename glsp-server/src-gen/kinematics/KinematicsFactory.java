/**
 */
package kinematics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kinematics.KinematicsPackage
 * @generated
 */
public interface KinematicsFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   KinematicsFactory eINSTANCE = kinematics.impl.KinematicsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Link</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Link</em>'.
    * @generated
    */
   Link createLink();

   /**
    * Returns a new object of class '<em>Joint</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Joint</em>'.
    * @generated
    */
   Joint createJoint();

   /**
    * Returns a new object of class '<em>Robot</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Robot</em>'.
    * @generated
    */
   Robot createRobot();

   /**
    * Returns a new object of class '<em>Pose</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pose</em>'.
    * @generated
    */
   Pose createPose();

   /**
    * Returns a new object of class '<em>Limit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Limit</em>'.
    * @generated
    */
   Limit createLimit();

   /**
    * Returns a new object of class '<em>Axis</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Axis</em>'.
    * @generated
    */
   Axis createAxis();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   KinematicsPackage getKinematicsPackage();

} //KinematicsFactory
