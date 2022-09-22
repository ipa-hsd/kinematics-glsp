/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Limit;
import kinematicsgraph.RevoluteJointEdge;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revolute Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.RevoluteJointEdgeImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevoluteJointEdgeImpl extends JointEdgeImpl implements RevoluteJointEdge {
   /**
    * The cached value of the '{@link #getLimit() <em>Limit</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLimit()
    * @generated
    * @ordered
    */
   protected Limit limit;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RevoluteJointEdgeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.REVOLUTE_JOINT_EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Limit getLimit() {
      if (limit != null && limit.eIsProxy()) {
         InternalEObject oldLimit = (InternalEObject)limit;
         limit = (Limit)eResolveProxy(oldLimit);
         if (limit != oldLimit) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT, oldLimit, limit));
         }
      }
      return limit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Limit basicGetLimit() {
      return limit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLimit(Limit newLimit) {
      Limit oldLimit = limit;
      limit = newLimit;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT, oldLimit, limit));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT:
            if (resolve) return getLimit();
            return basicGetLimit();
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
         case KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT:
            setLimit((Limit)newValue);
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
         case KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT:
            setLimit((Limit)null);
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
         case KinematicsgraphPackage.REVOLUTE_JOINT_EDGE__LIMIT:
            return limit != null;
      }
      return super.eIsSet(featureID);
   }

} //RevoluteJointEdgeImpl
