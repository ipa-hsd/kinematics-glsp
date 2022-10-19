/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.Axis;
import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Limit;
import kinematicsgraph.PrismaticJointEdge;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prismatic Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.PrismaticJointEdgeImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PrismaticJointEdgeImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrismaticJointEdgeImpl extends JointEdgeImpl implements PrismaticJointEdge {
   /**
    * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLimit()
    * @generated
    * @ordered
    */
   protected Limit limit;

   /**
    * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getAxis()
    * @generated
    * @ordered
    */
   protected Axis axis;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PrismaticJointEdgeImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.PRISMATIC_JOINT_EDGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Limit getLimit() {
      return limit;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetLimit(Limit newLimit, NotificationChain msgs) {
      Limit oldLimit = limit;
      limit = newLimit;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT, oldLimit, newLimit);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLimit(Limit newLimit) {
      if (newLimit != limit) {
         NotificationChain msgs = null;
         if (limit != null)
            msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT, null, msgs);
         if (newLimit != null)
            msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT, null, msgs);
         msgs = basicSetLimit(newLimit, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT, newLimit, newLimit));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Axis getAxis() {
      return axis;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetAxis(Axis newAxis, NotificationChain msgs) {
      Axis oldAxis = axis;
      axis = newAxis;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS, oldAxis, newAxis);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setAxis(Axis newAxis) {
      if (newAxis != axis) {
         NotificationChain msgs = null;
         if (axis != null)
            msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS, null, msgs);
         if (newAxis != null)
            msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS, null, msgs);
         msgs = basicSetAxis(newAxis, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS, newAxis, newAxis));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT:
            return basicSetLimit(null, msgs);
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS:
            return basicSetAxis(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT:
            return getLimit();
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS:
            return getAxis();
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
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT:
            setLimit((Limit)newValue);
            return;
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS:
            setAxis((Axis)newValue);
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
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT:
            setLimit((Limit)null);
            return;
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS:
            setAxis((Axis)null);
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
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__LIMIT:
            return limit != null;
         case KinematicsgraphPackage.PRISMATIC_JOINT_EDGE__AXIS:
            return axis != null;
      }
      return super.eIsSet(featureID);
   }

} //PrismaticJointEdgeImpl
