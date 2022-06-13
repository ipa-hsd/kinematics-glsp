/**
 */
package graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GButton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GButton#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGButton()
 * @model
 * @generated
 */
public interface GButton extends GShapeElement {
   /**
    * Returns the value of the '<em><b>Enabled</b></em>' attribute.
    * The default value is <code>"true"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Enabled</em>' attribute.
    * @see #setEnabled(boolean)
    * @see graph.GraphPackage#getGButton_Enabled()
    * @model default="true" required="true"
    * @generated
    */
   boolean isEnabled();

   /**
    * Sets the value of the '{@link graph.GButton#isEnabled <em>Enabled</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Enabled</em>' attribute.
    * @see #isEnabled()
    * @generated
    */
   void setEnabled(boolean value);

} // GButton
