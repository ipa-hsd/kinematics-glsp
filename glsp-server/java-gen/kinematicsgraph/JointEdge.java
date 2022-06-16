/**
 */
package kinematicsgraph;

import org.eclipse.glsp.graph.GEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.JointEdge#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getJointEdge()
 * @model
 * @generated
 */
public interface JointEdge extends GEdge {
   /**
    * Returns the value of the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Origin</em>' reference.
    * @see #setOrigin(Pose)
    * @see kinematicsgraph.KinematicsgraphPackage#getJointEdge_Origin()
    * @model required="true"
    * @generated
    */
   Pose getOrigin();

   /**
    * Sets the value of the '{@link kinematicsgraph.JointEdge#getOrigin <em>Origin</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Origin</em>' reference.
    * @see #getOrigin()
    * @generated
    */
   void setOrigin(Pose value);

} // JointEdge
