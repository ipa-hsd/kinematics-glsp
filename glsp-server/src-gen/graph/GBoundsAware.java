/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBounds Aware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GBoundsAware#getPosition <em>Position</em>}</li>
 *   <li>{@link graph.GBoundsAware#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGBoundsAware()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GBoundsAware extends EObject {
   /**
    * Returns the value of the '<em><b>Position</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Position</em>' containment reference.
    * @see #setPosition(GPoint)
    * @see graph.GraphPackage#getGBoundsAware_Position()
    * @model containment="true"
    * @generated
    */
   GPoint getPosition();

   /**
    * Sets the value of the '{@link graph.GBoundsAware#getPosition <em>Position</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Position</em>' containment reference.
    * @see #getPosition()
    * @generated
    */
   void setPosition(GPoint value);

   /**
    * Returns the value of the '<em><b>Size</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Visual bounds of the node
    * <!-- end-model-doc -->
    * @return the value of the '<em>Size</em>' containment reference.
    * @see #setSize(GDimension)
    * @see graph.GraphPackage#getGBoundsAware_Size()
    * @model containment="true"
    * @generated
    */
   GDimension getSize();

   /**
    * Sets the value of the '{@link graph.GBoundsAware#getSize <em>Size</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Size</em>' containment reference.
    * @see #getSize()
    * @generated
    */
   void setSize(GDimension value);

} // GBoundsAware
