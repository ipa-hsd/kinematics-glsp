/**
 */
package graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GModel Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GModelRoot#getCanvasBounds <em>Canvas Bounds</em>}</li>
 *   <li>{@link graph.GModelRoot#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGModelRoot()
 * @model
 * @generated
 */
public interface GModelRoot extends GModelElement {
   /**
    * Returns the value of the '<em><b>Canvas Bounds</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Canvas Bounds</em>' containment reference.
    * @see #setCanvasBounds(GBounds)
    * @see graph.GraphPackage#getGModelRoot_CanvasBounds()
    * @model containment="true"
    * @generated
    */
   GBounds getCanvasBounds();

   /**
    * Sets the value of the '{@link graph.GModelRoot#getCanvasBounds <em>Canvas Bounds</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Canvas Bounds</em>' containment reference.
    * @see #getCanvasBounds()
    * @generated
    */
   void setCanvasBounds(GBounds value);

   /**
    * Returns the value of the '<em><b>Revision</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Revision</em>' attribute.
    * @see #setRevision(int)
    * @see graph.GraphPackage#getGModelRoot_Revision()
    * @model
    * @generated
    */
   int getRevision();

   /**
    * Sets the value of the '{@link graph.GModelRoot#getRevision <em>Revision</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Revision</em>' attribute.
    * @see #getRevision()
    * @generated
    */
   void setRevision(int value);

} // GModelRoot
