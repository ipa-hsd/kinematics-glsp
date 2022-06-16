/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.JointEdge;
import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Pose;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.glsp.graph.impl.GEdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.JointEdgeImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointEdgeImpl extends GEdgeImpl implements JointEdge {
   /**
    * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getOrigin()
    * @generated
    * @ordered
    */
   protected Pose origin;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected JointEdgeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.JOINT_EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pose getOrigin() {
      if (origin != null && origin.eIsProxy()) {
         InternalEObject oldOrigin = (InternalEObject)origin;
         origin = (Pose)eResolveProxy(oldOrigin);
         if (origin != oldOrigin) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsgraphPackage.JOINT_EDGE__ORIGIN, oldOrigin, origin));
         }
      }
      return origin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Pose basicGetOrigin() {
      return origin;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOrigin(Pose newOrigin) {
      Pose oldOrigin = origin;
      origin = newOrigin;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.JOINT_EDGE__ORIGIN, oldOrigin, origin));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.JOINT_EDGE__ORIGIN:
            if (resolve) return getOrigin();
            return basicGetOrigin();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case KinematicsgraphPackage.JOINT_EDGE__ORIGIN:
            setOrigin((Pose)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case KinematicsgraphPackage.JOINT_EDGE__ORIGIN:
            setOrigin((Pose)null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case KinematicsgraphPackage.JOINT_EDGE__ORIGIN:
            return origin != null;
      }
      return super.eIsSet(featureID);
   }

} //JointEdgeImpl
