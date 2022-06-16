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
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getXyz <em>Xyz</em>}</li>
 *   <li>{@link kinematicsgraph.impl.PoseImpl#getRpy <em>Rpy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseImpl extends MinimalEObjectImpl.Container implements Pose {
   /**
    * The default value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getXyz()
    * @generated
    * @ordered
    */
   protected static final String XYZ_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getXyz()
    * @generated
    * @ordered
    */
   protected String xyz = XYZ_EDEFAULT;

   /**
    * The default value of the '{@link #getRpy() <em>Rpy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRpy()
    * @generated
    * @ordered
    */
   protected static final String RPY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getRpy() <em>Rpy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRpy()
    * @generated
    * @ordered
    */
   protected String rpy = RPY_EDEFAULT;

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
   public String getXyz() {
      return xyz;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setXyz(String newXyz) {
      String oldXyz = xyz;
      xyz = newXyz;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__XYZ, oldXyz, xyz));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getRpy() {
      return rpy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRpy(String newRpy) {
      String oldRpy = rpy;
      rpy = newRpy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, KinematicsgraphPackage.POSE__RPY, oldRpy, rpy));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case KinematicsgraphPackage.POSE__XYZ:
            return getXyz();
         case KinematicsgraphPackage.POSE__RPY:
            return getRpy();
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
         case KinematicsgraphPackage.POSE__XYZ:
            setXyz((String)newValue);
            return;
         case KinematicsgraphPackage.POSE__RPY:
            setRpy((String)newValue);
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
         case KinematicsgraphPackage.POSE__XYZ:
            setXyz(XYZ_EDEFAULT);
            return;
         case KinematicsgraphPackage.POSE__RPY:
            setRpy(RPY_EDEFAULT);
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
         case KinematicsgraphPackage.POSE__XYZ:
            return XYZ_EDEFAULT == null ? xyz != null : !XYZ_EDEFAULT.equals(xyz);
         case KinematicsgraphPackage.POSE__RPY:
            return RPY_EDEFAULT == null ? rpy != null : !RPY_EDEFAULT.equals(rpy);
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
      result.append(" (xyz: ");
      result.append(xyz);
      result.append(", rpy: ");
      result.append(rpy);
      result.append(')');
      return result.toString();
   }

} //PoseImpl
