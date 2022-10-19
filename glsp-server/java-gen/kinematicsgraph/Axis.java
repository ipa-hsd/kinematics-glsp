/**
 */
package kinematicsgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.Axis#getX <em>X</em>}</li>
 *   <li>{@link kinematicsgraph.Axis#getY <em>Y</em>}</li>
 *   <li>{@link kinematicsgraph.Axis#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getAxis()
 * @model
 * @generated
 */
public interface Axis extends EObject {
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(double)
    * @see kinematicsgraph.KinematicsgraphPackage#getAxis_X()
    * @model required="true"
    * @generated
    */
   double getX();

   /**
    * Sets the value of the '{@link kinematicsgraph.Axis#getX <em>X</em>}' attribute.
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
    * @see kinematicsgraph.KinematicsgraphPackage#getAxis_Y()
    * @model required="true"
    * @generated
    */
   double getY();

   /**
    * Sets the value of the '{@link kinematicsgraph.Axis#getY <em>Y</em>}' attribute.
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
    * @see kinematicsgraph.KinematicsgraphPackage#getAxis_Z()
    * @model required="true"
    * @generated
    */
   double getZ();

   /**
    * Sets the value of the '{@link kinematicsgraph.Axis#getZ <em>Z</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Z</em>' attribute.
    * @see #getZ()
    * @generated
    */
   void setZ(double value);

} // Axis
