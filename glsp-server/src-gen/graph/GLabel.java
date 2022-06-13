/**
 */
package graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GLabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GLabel#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGLabel()
 * @model
 * @generated
 */
public interface GLabel extends GAlignable, GEdgeLayoutable, GShapeElement {
   /**
    * Returns the value of the '<em><b>Text</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Text</em>' attribute.
    * @see #setText(String)
    * @see graph.GraphPackage#getGLabel_Text()
    * @model required="true"
    * @generated
    */
   String getText();

   /**
    * Sets the value of the '{@link graph.GLabel#getText <em>Text</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Text</em>' attribute.
    * @see #getText()
    * @generated
    */
   void setText(String value);

} // GLabel
