/**
 */
package kinematicsgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prismatic Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.PrismaticJointEdge#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getPrismaticJointEdge()
 * @model
 * @generated
 */
public interface PrismaticJointEdge extends JointEdge {
   /**
    * Returns the value of the '<em><b>Limit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Limit</em>' containment reference.
    * @see #setLimit(Limit)
    * @see kinematicsgraph.KinematicsgraphPackage#getPrismaticJointEdge_Limit()
    * @model containment="true" required="true"
    * @generated
    */
   Limit getLimit();

   /**
    * Sets the value of the '{@link kinematicsgraph.PrismaticJointEdge#getLimit <em>Limit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Limit</em>' containment reference.
    * @see #getLimit()
    * @generated
    */
   void setLimit(Limit value);

} // PrismaticJointEdge
