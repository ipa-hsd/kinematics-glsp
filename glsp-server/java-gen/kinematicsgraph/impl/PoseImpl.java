/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.KinematicsgraphPackage;
import kinematicsgraph.Pose;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getX <em>X</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getY <em>Y</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getZ <em>Z</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getYaw <em>Yaw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseImpl extends MinimalEObjectImpl.Container implements Pose {
   /**
    * The default value of the '{@link #getX() <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getX()
    * @generated
    * @ordered
    */
   protected static final double X_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getX() <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getX()
    * @generated
    * @ordered
    */
   protected double x = X_EDEFAULT;

   /**
    * The default value of the '{@link #getY() <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getY()
    * @generated
    * @ordered
    */
   protected static final double Y_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getY()
    * @generated
    * @ordered
    */
   protected double y = Y_EDEFAULT;

   /**
    * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getZ()
    * @generated
    * @ordered
    */
   protected static final double Z_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getZ()
    * @generated
    * @ordered
    */
   protected double z = Z_EDEFAULT;

   /**
    * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRoll()
    * @generated
    * @ordered
    */
   protected static final double ROLL_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRoll()
    * @generated
    * @ordered
    */
   protected double roll = ROLL_EDEFAULT;

   /**
    * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPitch()
    * @generated
    * @ordered
    */
   protected static final double PITCH_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPitch()
    * @generated
    * @ordered
    */
   protected double pitch = PITCH_EDEFAULT;

   /**
    * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getYaw()
    * @generated
    * @ordered
    */
   protected static final double YAW_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getYaw()
    * @generated
    * @ordered
    */
   protected double yaw = YAW_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected PoseImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.POSE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getX() {
      return x;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setX(double newX) {
      double oldX = x;
      x = newX;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__X, oldX, x));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getY() {
      return y;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setY(double newY) {
      double oldY = y;
      y = newY;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__Y, oldY, y));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getZ() {
      return z;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setZ(double newZ) {
      double oldZ = z;
      z = newZ;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__Z, oldZ, z));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getRoll() {
      return roll;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRoll(double newRoll) {
      double oldRoll = roll;
      roll = newRoll;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__ROLL, oldRoll, roll));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getPitch() {
      return pitch;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPitch(double newPitch) {
      double oldPitch = pitch;
      pitch = newPitch;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__PITCH, oldPitch, pitch));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getYaw() {
      return yaw;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setYaw(double newYaw) {
      double oldYaw = yaw;
      yaw = newYaw;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__YAW, oldYaw, yaw));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.POSE__X:
            return getX();
         case KinematicsgraphPackage.POSE__Y:
            return getY();
         case KinematicsgraphPackage.POSE__Z:
            return getZ();
         case KinematicsgraphPackage.POSE__ROLL:
            return getRoll();
         case KinematicsgraphPackage.POSE__PITCH:
            return getPitch();
         case KinematicsgraphPackage.POSE__YAW:
            return getYaw();
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
         case KinematicsgraphPackage.POSE__X:
            setX((Double)newValue);
            return;
         case KinematicsgraphPackage.POSE__Y:
            setY((Double)newValue);
            return;
         case KinematicsgraphPackage.POSE__Z:
            setZ((Double)newValue);
            return;
         case KinematicsgraphPackage.POSE__ROLL:
            setRoll((Double)newValue);
            return;
         case KinematicsgraphPackage.POSE__PITCH:
            setPitch((Double)newValue);
            return;
         case KinematicsgraphPackage.POSE__YAW:
            setYaw((Double)newValue);
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
         case KinematicsgraphPackage.POSE__X:
            setX(X_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__Y:
            setY(Y_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__Z:
            setZ(Z_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__ROLL:
            setRoll(ROLL_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__PITCH:
            setPitch(PITCH_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__YAW:
            setYaw(YAW_EDEFAULT);
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
         case KinematicsgraphPackage.POSE__X:
            return x != X_EDEFAULT;
         case KinematicsgraphPackage.POSE__Y:
            return y != Y_EDEFAULT;
         case KinematicsgraphPackage.POSE__Z:
            return z != Z_EDEFAULT;
         case KinematicsgraphPackage.POSE__ROLL:
            return roll != ROLL_EDEFAULT;
         case KinematicsgraphPackage.POSE__PITCH:
            return pitch != PITCH_EDEFAULT;
         case KinematicsgraphPackage.POSE__YAW:
            return yaw != YAW_EDEFAULT;
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
      result.append(" (x: ");
      result.append(x);
      result.append(", y: ");
      result.append(y);
      result.append(", z: ");
      result.append(z);
      result.append(", roll: ");
      result.append(roll);
      result.append(", pitch: ");
      result.append(pitch);
      result.append(", yaw: ");
      result.append(yaw);
      result.append(')');
      return result.toString();
   }

} //PoseImpl
