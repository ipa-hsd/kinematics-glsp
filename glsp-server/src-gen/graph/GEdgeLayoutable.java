/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEdge Layoutable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GEdgeLayoutable#getEdgePlacement <em>Edge Placement</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGEdgeLayoutable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEdgeLayoutable extends EObject {
   /**
    * Returns the value of the '<em><b>Edge Placement</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Edge Placement</em>' containment reference.
    * @see #setEdgePlacement(GEdgePlacement)
    * @see graph.GraphPackage#getGEdgeLayoutable_EdgePlacement()
    * @model containment="true"
    * @generated
    */
   GEdgePlacement getEdgePlacement();

   /**
    * Sets the value of the '{@link graph.GEdgeLayoutable#getEdgePlacement <em>Edge Placement</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Edge Placement</em>' containment reference.
    * @see #getEdgePlacement()
    * @generated
    */
   void setEdgePlacement(GEdgePlacement value);

} // GEdgeLayoutable
