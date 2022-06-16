/**
 */
package kinematics.impl;

import kinematics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KinematicsFactoryImpl extends EFactoryImpl implements KinematicsFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static KinematicsFactory init() {
      try {
         KinematicsFactory theKinematicsFactory = (KinematicsFactory)EPackage.Registry.INSTANCE.getEFactory(KinematicsPackage.eNS_URI);
         if (theKinematicsFactory != null) {
            return theKinematicsFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new KinematicsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case KinematicsPackage.LINK: return createLink();
         case KinematicsPackage.JOINT: return createJoint();
         case KinematicsPackage.ROBOT: return createRobot();
         case KinematicsPackage.POSE: return createPose();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Link createLink() {
      LinkImpl link = new LinkImpl();
      return link;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Joint createJoint() {
      JointImpl joint = new JointImpl();
      return joint;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Robot createRobot() {
      RobotImpl robot = new RobotImpl();
      return robot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pose createPose() {
      PoseImpl pose = new PoseImpl();
      return pose;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsPackage getKinematicsPackage() {
      return (KinematicsPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static KinematicsPackage getPackage() {
      return KinematicsPackage.eINSTANCE;
   }

} //KinematicsFactoryImpl
