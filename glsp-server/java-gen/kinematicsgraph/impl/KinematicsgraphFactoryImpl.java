/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.*;

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
public class KinematicsgraphFactoryImpl extends EFactoryImpl implements KinematicsgraphFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static KinematicsgraphFactory init() {
      try {
         KinematicsgraphFactory theKinematicsgraphFactory = (KinematicsgraphFactory)EPackage.Registry.INSTANCE.getEFactory(KinematicsgraphPackage.eNS_URI);
         if (theKinematicsgraphFactory != null) {
            return theKinematicsgraphFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new KinematicsgraphFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsgraphFactoryImpl() {
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
         case KinematicsgraphPackage.JOINT_EDGE: return createJointEdge();
         case KinematicsgraphPackage.POSE: return createPose();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public JointEdge createJointEdge() {
      JointEdgeImpl jointEdge = new JointEdgeImpl();
      return jointEdge;
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
   public KinematicsgraphPackage getKinematicsgraphPackage() {
      return (KinematicsgraphPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static KinematicsgraphPackage getPackage() {
      return KinematicsgraphPackage.eINSTANCE;
   }

} //KinematicsgraphFactoryImpl
