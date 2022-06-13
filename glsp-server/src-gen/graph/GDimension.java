/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GDimension#getWidth <em>Width</em>}</li>
 *   <li>{@link graph.GDimension#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGDimension()
 * @model
 * @generated
 */
public interface GDimension extends EObject {
   /**
    * Returns the value of the '<em><b>Width</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Width</em>' attribute.
    * @see #setWidth(double)
    * @see graph.GraphPackage#getGDimension_Width()
    * @model default="0" required="true"
    * @generated
    */
   double getWidth();

   /**
    * Sets the value of the '{@link graph.GDimension#getWidth <em>Width</em>}' attribute.
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
    * @see graph.GraphPackage#getGDimension_Height()
    * @model default="0" required="true"
    * @generated
    */
   double getHeight();

   /**
    * Sets the value of the '{@link graph.GDimension#getHeight <em>Height</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Height</em>' attribute.
    * @see #getHeight()
    * @generated
    */
   void setHeight(double value);

} // GDimension
