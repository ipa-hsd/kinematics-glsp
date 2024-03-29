/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Limit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.LimitImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link kinematicsgraph.impl.LimitImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link kinematicsgraph.impl.LimitImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link kinematicsgraph.impl.LimitImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends MinimalEObjectImpl.Container implements Limit {
   /**
    * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLower()
    * @generated
    * @ordered
    */
   protected static final double LOWER_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLower()
    * @generated
    * @ordered
    */
   protected double lower = LOWER_EDEFAULT;

   /**
    * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUpper()
    * @generated
    * @ordered
    */
   protected static final double UPPER_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUpper()
    * @generated
    * @ordered
    */
   protected double upper = UPPER_EDEFAULT;

   /**
    * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEffort()
    * @generated
    * @ordered
    */
   protected static final double EFFORT_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEffort()
    * @generated
    * @ordered
    */
   protected double effort = EFFORT_EDEFAULT;

   /**
    * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVelocity()
    * @generated
    * @ordered
    */
   protected static final double VELOCITY_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVelocity()
    * @generated
    * @ordered
    */
   protected double velocity = VELOCITY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LimitImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.LIMIT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getLower() {
      return lower;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLower(double newLower) {
      double oldLower = lower;
      lower = newLower;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.LIMIT__LOWER, oldLower, lower));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getUpper() {
      return upper;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUpper(double newUpper) {
      double oldUpper = upper;
      upper = newUpper;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.LIMIT__UPPER, oldUpper, upper));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getEffort() {
      return effort;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setEffort(double newEffort) {
      double oldEffort = effort;
      effort = newEffort;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.LIMIT__EFFORT, oldEffort, effort));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getVelocity() {
      return velocity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setVelocity(double newVelocity) {
      double oldVelocity = velocity;
      velocity = newVelocity;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.LIMIT__VELOCITY, oldVelocity, velocity));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.LIMIT__LOWER:
            return getLower();
         case KinematicsgraphPackage.LIMIT__UPPER:
            return getUpper();
         case KinematicsgraphPackage.LIMIT__EFFORT:
            return getEffort();
         case KinematicsgraphPackage.LIMIT__VELOCITY:
            return getVelocity();
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
         case KinematicsgraphPackage.LIMIT__LOWER:
            setLower((Double)newValue);
            return;
         case KinematicsgraphPackage.LIMIT__UPPER:
            setUpper((Double)newValue);
            return;
         case KinematicsgraphPackage.LIMIT__EFFORT:
            setEffort((Double)newValue);
            return;
         case KinematicsgraphPackage.LIMIT__VELOCITY:
            setVelocity((Double)newValue);
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
         case KinematicsgraphPackage.LIMIT__LOWER:
            setLower(LOWER_EDEFAULT);
            return;
         case KinematicsgraphPackage.LIMIT__UPPER:
            setUpper(UPPER_EDEFAULT);
            return;
         case KinematicsgraphPackage.LIMIT__EFFORT:
            setEffort(EFFORT_EDEFAULT);
            return;
         case KinematicsgraphPackage.LIMIT__VELOCITY:
            setVelocity(VELOCITY_EDEFAULT);
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
         case KinematicsgraphPackage.LIMIT__LOWER:
            return lower != LOWER_EDEFAULT;
         case KinematicsgraphPackage.LIMIT__UPPER:
            return upper != UPPER_EDEFAULT;
         case KinematicsgraphPackage.LIMIT__EFFORT:
            return effort != EFFORT_EDEFAULT;
         case KinematicsgraphPackage.LIMIT__VELOCITY:
            return velocity != VELOCITY_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (lower: ");
      result.append(lower);
      result.append(", upper: ");
      result.append(upper);
      result.append(", effort: ");
      result.append(effort);
      result.append(", velocity: ");
      result.append(velocity);
      result.append(')');
      return result.toString();
   }

} //LimitImpl
