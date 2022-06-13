/**
 */
package kinematicsgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kinematicsgraph.KinematicsgraphPackage
 * @generated
 */
public interface KinematicsgraphFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   KinematicsgraphFactory eINSTANCE = kinematicsgraph.impl.KinematicsgraphFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Joint Edge</em>'.
    * @generated
    */
   JointEdge createJointEdge();

   /**
    * Returns a new object of class '<em>Pose</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pose</em>'.
    * @generated
    */
   Pose createPose();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   KinematicsgraphPackage getKinematicsgraphPackage();

} //KinematicsgraphFactory
