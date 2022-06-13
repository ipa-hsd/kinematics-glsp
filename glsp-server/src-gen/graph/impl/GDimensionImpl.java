/**
 */
package graph.impl;

import graph.GDimension;
import graph.GraphPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GDimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.GDimensionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link graph.impl.GDimensionImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDimensionImpl extends MinimalEObjectImpl.Container implements GDimension {
   /**
    * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWidth()
    * @generated
    * @ordered
    */
   protected static final double WIDTH_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getWidth()
    * @generated
    * @ordered
    */
   protected double width = WIDTH_EDEFAULT;

   /**
    * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getHeight()
    * @generated
    * @ordered
    */
   protected static final double HEIGHT_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getHeight()
    * @generated
    * @ordered
    */
   protected double height = HEIGHT_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GDimensionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GDIMENSION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getWidth() {
      return width;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setWidth(double newWidth) {
      double oldWidth = width;
      width = newWidth;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GDIMENSION__WIDTH, oldWidth, width));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public double getHeight() {
      return height;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setHeight(double newHeight) {
      double oldHeight = height;
      height = newHeight;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GDIMENSION__HEIGHT, oldHeight, height));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GDIMENSION__WIDTH:
            return getWidth();
         case GraphPackage.GDIMENSION__HEIGHT:
            return getHeight();
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
         case GraphPackage.GDIMENSION__WIDTH:
            setWidth((Double)newValue);
            return;
         case GraphPackage.GDIMENSION__HEIGHT:
            setHeight((Double)newValue);
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
         case GraphPackage.GDIMENSION__WIDTH:
            setWidth(WIDTH_EDEFAULT);
            return;
         case GraphPackage.GDIMENSION__HEIGHT:
            setHeight(HEIGHT_EDEFAULT);
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
         case GraphPackage.GDIMENSION__WIDTH:
            return width != WIDTH_EDEFAULT;
         case GraphPackage.GDIMENSION__HEIGHT:
            return height != HEIGHT_EDEFAULT;
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
      result.append(" (width: ");
      result.append(width);
      result.append(", height: ");
      result.append(height);
      result.append(')');
      return result.toString();
   }

} //GDimensionImpl
