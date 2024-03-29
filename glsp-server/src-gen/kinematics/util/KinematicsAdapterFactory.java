/**
 */
package kinematics.util;

import kinematics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kinematics.KinematicsPackage
 * @generated
 */
public class KinematicsAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static KinematicsPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = KinematicsPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected KinematicsSwitch<Adapter> modelSwitch =
      new KinematicsSwitch<Adapter>() {
         @Override
         public Adapter caseLink(Link object) {
            return createLinkAdapter();
         }
         @Override
         public Adapter caseJoint(Joint object) {
            return createJointAdapter();
         }
         @Override
         public Adapter caseRobot(Robot object) {
            return createRobotAdapter();
         }
         @Override
         public Adapter casePose(Pose object) {
            return createPoseAdapter();
         }
         @Override
         public Adapter caseLimit(Limit object) {
            return createLimitAdapter();
         }
         @Override
         public Adapter caseAxis(Axis object) {
            return createAxisAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link kinematics.Link <em>Link</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Link
    * @generated
    */
   public Adapter createLinkAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematics.Joint <em>Joint</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Joint
    * @generated
    */
   public Adapter createJointAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematics.Robot <em>Robot</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Robot
    * @generated
    */
   public Adapter createRobotAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematics.Pose <em>Pose</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Pose
    * @generated
    */
   public Adapter createPoseAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematics.Limit <em>Limit</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Limit
    * @generated
    */
   public Adapter createLimitAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematics.Axis <em>Axis</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematics.Axis
    * @generated
    */
   public Adapter createAxisAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //KinematicsAdapterFactory
