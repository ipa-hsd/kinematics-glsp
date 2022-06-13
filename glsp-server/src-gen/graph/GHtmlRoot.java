/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GHtml Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GHtmlRoot#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGHtmlRoot()
 * @model
 * @generated
 */
public interface GHtmlRoot extends GModelRoot {
   /**
    * Returns the value of the '<em><b>Classes</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Classes</em>' attribute list.
    * @see graph.GraphPackage#getGHtmlRoot_Classes()
    * @model
    * @generated
    */
   EList<String> getClasses();

} // GHtmlRoot
