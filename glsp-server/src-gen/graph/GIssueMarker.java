/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GIssue Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GIssueMarker#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGIssueMarker()
 * @model
 * @generated
 */
public interface GIssueMarker extends GShapeElement {
   /**
    * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
    * The list contents are of type {@link graph.GIssue}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Issues</em>' containment reference list.
    * @see graph.GraphPackage#getGIssueMarker_Issues()
    * @model containment="true"
    * @generated
    */
   EList<GIssue> getIssues();

} // GIssueMarker
