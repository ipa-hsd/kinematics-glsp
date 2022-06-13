/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GIssue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link graph.GIssue#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGIssue()
 * @model
 * @generated
 */
public interface GIssue extends EObject {
   /**
    * Returns the value of the '<em><b>Severity</b></em>' attribute.
    * The default value is <code>"info"</code>.
    * The literals are from the enumeration {@link graph.GSeverity}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Severity</em>' attribute.
    * @see graph.GSeverity
    * @see #setSeverity(GSeverity)
    * @see graph.GraphPackage#getGIssue_Severity()
    * @model default="info" required="true"
    * @generated
    */
   GSeverity getSeverity();

   /**
    * Sets the value of the '{@link graph.GIssue#getSeverity <em>Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Severity</em>' attribute.
    * @see graph.GSeverity
    * @see #getSeverity()
    * @generated
    */
   void setSeverity(GSeverity value);

   /**
    * Returns the value of the '<em><b>Message</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Message</em>' attribute.
    * @see #setMessage(String)
    * @see graph.GraphPackage#getGIssue_Message()
    * @model
    * @generated
    */
   String getMessage();

   /**
    * Sets the value of the '{@link graph.GIssue#getMessage <em>Message</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Message</em>' attribute.
    * @see #getMessage()
    * @generated
    */
   void setMessage(String value);

} // GIssue
