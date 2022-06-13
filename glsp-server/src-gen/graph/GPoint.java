/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GPoint#getX <em>X</em>}</li>
 *   <li>{@link graph.GPoint#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGPoint()
 * @model
 * @generated
 */
public interface GPoint extends EObject {
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(double)
    * @see graph.GraphPackage#getGPoint_X()
    * @model default="0" required="true"
    * @generated
    */
   double getX();

   /**
    * Sets the value of the '{@link graph.GPoint#getX <em>X</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>X</em>' attribute.
    * @see #getX()
    * @generated
    */
   void setX(double value);

   /**
    * Returns the value of the '<em><b>Y</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Y</em>' attribute.
    * @see #setY(double)
    * @see graph.GraphPackage#getGPoint_Y()
    * @model default="0" required="true"
    * @generated
    */
   double getY();

   /**
    * Sets the value of the '{@link graph.GPoint#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(double value);

} // GPoint
