/**
 */
package graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GAlignable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GAlignable#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGAlignable()
 * @model
 * @generated
 */
public interface GAlignable extends EObject {
   /**
    * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Alignment</em>' containment reference.
    * @see #setAlignment(GPoint)
    * @see graph.GraphPackage#getGAlignable_Alignment()
    * @model containment="true"
    * @generated
    */
   GPoint getAlignment();

   /**
    * Sets the value of the '{@link graph.GAlignable#getAlignment <em>Alignment</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Alignment</em>' containment reference.
    * @see #getAlignment()
    * @generated
    */
   void setAlignment(GPoint value);

} // GAlignable
