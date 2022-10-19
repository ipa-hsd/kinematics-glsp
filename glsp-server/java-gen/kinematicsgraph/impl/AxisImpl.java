/**
 */
package kinematicsgraph.impl;

import kinematicsgraph.Axis;
import kinematicsgraph.KinematicsgraphPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.impl.AxisImpl#getX <em>X</em>}</li>
 *   <li>{@link kinematicsgraph.impl.AxisImpl#getY <em>Y</em>}</li>
 *   <li>{@link kinematicsgraph.impl.AxisImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisImpl extends MinimalEObjectImpl.Container implements Axis {
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AxisImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return KinematicsgraphPackage.Literals.AXIS;
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
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.AXIS__X, oldX, x));
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
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.AXIS__Y, oldY, y));
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
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.AXIS__Z, oldZ, z));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.AXIS__X:
            return getX();
         case KinematicsgraphPackage.AXIS__Y:
            return getY();
         case KinematicsgraphPackage.AXIS__Z:
            return getZ();
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
         case KinematicsgraphPackage.AXIS__X:
            setX((Double)newValue);
            return;
         case KinematicsgraphPackage.AXIS__Y:
            setY((Double)newValue);
            return;
         case KinematicsgraphPackage.AXIS__Z:
            setZ((Double)newValue);
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
         case KinematicsgraphPackage.AXIS__X:
            setX(X_EDEFAULT);
            return;
         case KinematicsgraphPackage.AXIS__Y:
            setY(Y_EDEFAULT);
            return;
         case KinematicsgraphPackage.AXIS__Z:
            setZ(Z_EDEFAULT);
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
         case KinematicsgraphPackage.AXIS__X:
            return x != X_EDEFAULT;
         case KinematicsgraphPackage.AXIS__Y:
            return y != Y_EDEFAULT;
         case KinematicsgraphPackage.AXIS__Z:
            return z != Z_EDEFAULT;
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
      result.append(')');
      return result.toString();
   }

} //AxisImpl
