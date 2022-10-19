/**
 */
package kinematics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Limit#getEffort <em>Effort</em>}</li>
 *   <li>{@link kinematics.Limit#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link kinematics.Limit#getLower <em>Lower</em>}</li>
 *   <li>{@link kinematics.Limit#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getLimit()
 * @model
 * @generated
 */
public interface Limit extends EObject {
   /**
    * Returns the value of the '<em><b>Effort</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Effort</em>' attribute.
    * @see #setEffort(double)
    * @see kinematics.KinematicsPackage#getLimit_Effort()
    * @model required="true"
    * @generated
    */
   double getEffort();

   /**
    * Sets the value of the '{@link kinematics.Limit#getEffort <em>Effort</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Effort</em>' attribute.
    * @see #getEffort()
    * @generated
    */
   void setEffort(double value);

   /**
    * Returns the value of the '<em><b>Velocity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Velocity</em>' attribute.
    * @see #setVelocity(double)
    * @see kinematics.KinematicsPackage#getLimit_Velocity()
    * @model required="true"
    * @generated
    */
   double getVelocity();

   /**
    * Sets the value of the '{@link kinematics.Limit#getVelocity <em>Velocity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Velocity</em>' attribute.
    * @see #getVelocity()
    * @generated
    */
   void setVelocity(double value);

   /**
    * Returns the value of the '<em><b>Lower</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Lower</em>' attribute.
    * @see #setLower(double)
    * @see kinematics.KinematicsPackage#getLimit_Lower()
    * @model
    * @generated
    */
   double getLower();

   /**
    * Sets the value of the '{@link kinematics.Limit#getLower <em>Lower</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Lower</em>' attribute.
    * @see #getLower()
    * @generated
    */
   void setLower(double value);

   /**
    * Returns the value of the '<em><b>Upper</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Upper</em>' attribute.
    * @see #setUpper(double)
    * @see kinematics.KinematicsPackage#getLimit_Upper()
    * @model
    * @generated
    */
   double getUpper();

   /**
    * Sets the value of the '{@link kinematics.Limit#getUpper <em>Upper</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Upper</em>' attribute.
    * @see #getUpper()
    * @generated
    */
   void setUpper(double value);

} // Limit
