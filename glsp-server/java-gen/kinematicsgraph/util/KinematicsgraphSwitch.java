/**
 */
package kinematicsgraph.util;

import kinematicsgraph.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.glsp.graph.GArgumentable;
import org.eclipse.glsp.graph.GEdge;
import org.eclipse.glsp.graph.GModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see kinematicsgraph.KinematicsgraphPackage
 * @generated
 */
public class KinematicsgraphSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static KinematicsgraphPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public KinematicsgraphSwitch() {
      if (modelPackage == null) {
         modelPackage = KinematicsgraphPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case KinematicsgraphPackage.LIMIT: {
            Limit limit = (Limit)theEObject;
            T result = caseLimit(limit);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.POSE: {
            Pose pose = (Pose)theEObject;
            T result = casePose(pose);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.JOINT_EDGE: {
            JointEdge jointEdge = (JointEdge)theEObject;
            T result = caseJointEdge(jointEdge);
            if (result == null) result = caseGEdge(jointEdge);
            if (result == null) result = caseGModelElement(jointEdge);
            if (result == null) result = caseGArgumentable(jointEdge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.FIXED_JOINT_EDGE: {
            FixedJointEdge fixedJointEdge = (FixedJointEdge)theEObject;
            T result = caseFixedJointEdge(fixedJointEdge);
            if (result == null) result = caseJointEdge(fixedJointEdge);
            if (result == null) result = caseGEdge(fixedJointEdge);
            if (result == null) result = caseGModelElement(fixedJointEdge);
            if (result == null) result = caseGArgumentable(fixedJointEdge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.REVOLUTE_JOINT_EDGE: {
            RevoluteJointEdge revoluteJointEdge = (RevoluteJointEdge)theEObject;
            T result = caseRevoluteJointEdge(revoluteJointEdge);
            if (result == null) result = caseJointEdge(revoluteJointEdge);
            if (result == null) result = caseGEdge(revoluteJointEdge);
            if (result == null) result = caseGModelElement(revoluteJointEdge);
            if (result == null) result = caseGArgumentable(revoluteJointEdge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE: {
            PrismaticJointEdge prismaticJointEdge = (PrismaticJointEdge)theEObject;
            T result = casePrismaticJointEdge(prismaticJointEdge);
            if (result == null) result = caseJointEdge(prismaticJointEdge);
            if (result == null) result = caseGEdge(prismaticJointEdge);
            if (result == null) result = caseGModelElement(prismaticJointEdge);
            if (result == null) result = caseGArgumentable(prismaticJointEdge);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case KinematicsgraphPackage.AXIS: {
            Axis axis = (Axis)theEObject;
            T result = caseAxis(axis);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLimit(Limit object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pose</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pose</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePose(Pose object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Joint Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJointEdge(JointEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Fixed Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Fixed Joint Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFixedJointEdge(FixedJointEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Revolute Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Revolute Joint Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRevoluteJointEdge(RevoluteJointEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Prismatic Joint Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Prismatic Joint Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePrismaticJointEdge(PrismaticJointEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAxis(Axis object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>GArgumentable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>GArgumentable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGArgumentable(GArgumentable object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>GModel Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>GModel Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGModelElement(GModelElement object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>GEdge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>GEdge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGEdge(GEdge object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //KinematicsgraphSwitch
