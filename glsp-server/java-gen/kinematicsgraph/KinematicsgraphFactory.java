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
    * Returns a new object of class '<em>Limit</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Limit</em>'.
    * @generated
    */
   Limit createLimit();

   /**
    * Returns a new object of class '<em>Pose</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Pose</em>'.
    * @generated
    */
   Pose createPose();

   /**
    * Returns a new object of class '<em>Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Joint Edge</em>'.
    * @generated
    */
   JointEdge createJointEdge();

   /**
    * Returns a new object of class '<em>Fixed Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Fixed Joint Edge</em>'.
    * @generated
    */
   FixedJointEdge createFixedJointEdge();

   /**
    * Returns a new object of class '<em>Revolute Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Revolute Joint Edge</em>'.
    * @generated
    */
   RevoluteJointEdge createRevoluteJointEdge();

   /**
    * Returns a new object of class '<em>Prismatic Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Prismatic Joint Edge</em>'.
    * @generated
    */
   PrismaticJointEdge createPrismaticJointEdge();

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
   KinematicsgraphPackage getKinematicsgraphPackage();

} //KinematicsgraphFactory
