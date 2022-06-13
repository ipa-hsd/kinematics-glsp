/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GBounds#getX <em>X</em>}</li>
 *   <li>{@link graph.GBounds#getY <em>Y</em>}</li>
 *   <li>{@link graph.GBounds#getWidth <em>Width</em>}</li>
 *   <li>{@link graph.GBounds#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGBounds()
 * @model
 * @generated
 */
public interface GBounds extends EObject {
   /**
    * Returns the value of the '<em><b>X</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>X</em>' attribute.
    * @see #setX(double)
    * @see graph.GraphPackage#getGBounds_X()
    * @model default="0" required="true"
    * @generated
    */
   double getX();

   /**
    * Sets the value of the '{@link graph.GBounds#getX <em>X</em>}' attribute.
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
    * @see graph.GraphPackage#getGBounds_Y()
    * @model default="0" required="true"
    * @generated
    */
   double getY();

   /**
    * Sets the value of the '{@link graph.GBounds#getY <em>Y</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Y</em>' attribute.
    * @see #getY()
    * @generated
    */
   void setY(double value);

   /**
    * Returns the value of the '<em><b>Width</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Width</em>' attribute.
    * @see #setWidth(double)
    * @see graph.GraphPackage#getGBounds_Width()
    * @model default="0" required="true"
    * @generated
    */
   double getWidth();

   /**
    * Sets the value of the '{@link graph.GBounds#getWidth <em>Width</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Width</em>' attribute.
    * @see #getWidth()
    * @generated
    */
   void setWidth(double value);

   /**
    * Returns the value of the '<em><b>Height</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Height</em>' attribute.
    * @see #setHeight(double)
    * @see graph.GraphPackage#getGBounds_Height()
    * @model default="0" required="true"
    * @generated
    */
   double getHeight();

   /**
    * Sets the value of the '{@link graph.GBounds#getHeight <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Height</em>' attribute.
    * @see #getHeight()
    * @generated
    */
   void setHeight(double value);

} // GBounds
