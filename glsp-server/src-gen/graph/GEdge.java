/**
 */
package graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GEdge#getRoutingPoints <em>Routing Points</em>}</li>
 *   <li>{@link graph.GEdge#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link graph.GEdge#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link graph.GEdge#getSource <em>Source</em>}</li>
 *   <li>{@link graph.GEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link graph.GEdge#getRouterKind <em>Router Kind</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGEdge()
 * @model
 * @generated
 */
public interface GEdge extends GModelElement {
   /**
    * Returns the value of the '<em><b>Routing Points</b></em>' containment reference list.
    * The list contents are of type {@link graph.GPoint}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Routing Points</em>' containment reference list.
    * @see graph.GraphPackage#getGEdge_RoutingPoints()
    * @model containment="true"
    * @generated
    */
   EList<GPoint> getRoutingPoints();

   /**
    * Returns the value of the '<em><b>Source Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Id</em>' attribute.
    * @see #setSourceId(String)
    * @see graph.GraphPackage#getGEdge_SourceId()
    * @model
    * @generated
    */
   String getSourceId();

   /**
    * Sets the value of the '{@link graph.GEdge#getSourceId <em>Source Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Id</em>' attribute.
    * @see #getSourceId()
    * @generated
    */
   void setSourceId(String value);

   /**
    * Returns the value of the '<em><b>Target Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target Id</em>' attribute.
    * @see #setTargetId(String)
    * @see graph.GraphPackage#getGEdge_TargetId()
    * @model
    * @generated
    */
   String getTargetId();

   /**
    * Sets the value of the '{@link graph.GEdge#getTargetId <em>Target Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target Id</em>' attribute.
    * @see #getTargetId()
    * @generated
    */
   void setTargetId(String value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(GModelElement)
    * @see graph.GraphPackage#getGEdge_Source()
    * @model transient="true" volatile="true"
    * @generated
    */
   GModelElement getSource();

   /**
    * Sets the value of the '{@link graph.GEdge#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource(GModelElement value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(GModelElement)
    * @see graph.GraphPackage#getGEdge_Target()
    * @model transient="true" volatile="true"
    * @generated
    */
   GModelElement getTarget();

   /**
    * Sets the value of the '{@link graph.GEdge#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(GModelElement value);

   /**
    * Returns the value of the '<em><b>Router Kind</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Router Kind</em>' attribute.
    * @see #setRouterKind(String)
    * @see graph.GraphPackage#getGEdge_RouterKind()
    * @model
    * @generated
    */
   String getRouterKind();

   /**
    * Sets the value of the '{@link graph.GEdge#getRouterKind <em>Router Kind</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Router Kind</em>' attribute.
    * @see #getRouterKind()
    * @generated
    */
   void setRouterKind(String value);

} // GEdge