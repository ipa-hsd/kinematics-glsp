/**
 */
package kinematicsgraph.util;

import kinematicsgraph.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.glsp.graph.GArgumentable;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kinematicsgraph.KinematicsgraphPackage
 * @generated
 */
public class KinematicsgraphAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static KinematicsgraphPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsgraphAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = KinematicsgraphPackage.eINSTANCE;
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
   protected KinematicsgraphSwitch<Adapter> modelSwitch =
      new KinematicsgraphSwitch<Adapter>() {
         @Override
         public Adapter caseJointEdge(JointEdge object) {
            return createJointEdgeAdapter();
         }
         @Override
         public Adapter casePose(Pose object) {
            return createPoseAdapter();
         }
         @Override
         public Adapter caseGArgumentable(GArgumentable object) {
            return createGArgumentableAdapter();
         }
         @Override
         public Adapter caseGModelElement(GModelElement object) {
            return createGModelElementAdapter();
         }
         @Override
         public Adapter caseGEdge(GEdge object) {
            return createGEdgeAdapter();
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
    * Creates a new adapter for an object of class '{@link kinematicsgraph.JointEdge <em>Joint Edge</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematicsgraph.JointEdge
    * @generated
    */
   public Adapter createJointEdgeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link kinematicsgraph.Pose <em>Pose</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see kinematicsgraph.Pose
    * @generated
    */
   public Adapter createPoseAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.glsp.graph.GArgumentable <em>GArgumentable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.glsp.graph.GArgumentable
    * @generated
    */
   public Adapter createGArgumentableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.glsp.graph.GModelElement <em>GModel Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.glsp.graph.GModelElement
    * @generated
    */
   public Adapter createGModelElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.eclipse.glsp.graph.GEdge <em>GEdge</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see org.eclipse.glsp.graph.GEdge
    * @generated
    */
   public Adapter createGEdgeAdapter() {
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

} //KinematicsgraphAdapterFactory
