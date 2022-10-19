/**
 */
package kinematicsgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.Pose#getX <em>X</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getY <em>Y</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getZ <em>Z</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getRoll <em>Roll</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getPitch <em>Pitch</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getYaw <em>Yaw</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getPose()
 * @model
 * @generated
 */
public interface Pose extends EObject {
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_X()
    * @model required="true"
    * @generated
    */
   double getX();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getX <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>X</em>' attribute.
    * @see #getX()
    * @generated
    */
   void setX(double value);

   /**
    * Returns the value of the '<em><b>Y</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Y</em>' attribute.
    * @see #setY(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Y()
    * @model required="true"
    * @generated
    */
   double getY();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(double value);

   /**
    * Returns the value of the '<em><b>Z</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Z</em>' attribute.
    * @see #setZ(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Z()
    * @model required="true"
    * @generated
    */
   double getZ();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getZ <em>Z</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Z</em>' attribute.
    * @see #getZ()
    * @generated
    */
   void setZ(double value);

   /**
    * Returns the value of the '<em><b>Roll</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Roll</em>' attribute.
    * @see #setRoll(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Roll()
    * @model required="true"
    * @generated
    */
   double getRoll();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getRoll <em>Roll</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Roll</em>' attribute.
    * @see #getRoll()
    * @generated
    */
   void setRoll(double value);

   /**
    * Returns the value of the '<em><b>Pitch</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pitch</em>' attribute.
    * @see #setPitch(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Pitch()
    * @model required="true"
    * @generated
    */
   double getPitch();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getPitch <em>Pitch</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pitch</em>' attribute.
    * @see #getPitch()
    * @generated
    */
   void setPitch(double value);

   /**
    * Returns the value of the '<em><b>Yaw</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Yaw</em>' attribute.
    * @see #setYaw(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Yaw()
    * @model required="true"
    * @generated
    */
   double getYaw();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getYaw <em>Yaw</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Yaw</em>' attribute.
    * @see #getYaw()
    * @generated
    */
   void setYaw(double value);

} // Pose
