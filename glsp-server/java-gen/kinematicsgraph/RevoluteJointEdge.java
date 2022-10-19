/**
 */
package kinematicsgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revolute Joint Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.RevoluteJointEdge#getLimit <em>Limit</em>}</li>
 *   <li>{@link kinematicsgraph.RevoluteJointEdge#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getRevoluteJointEdge()
 * @model
 * @generated
 */
public interface RevoluteJointEdge extends JointEdge {
   /**
    * Returns the value of the '<em><b>Limit</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Limit</em>' reference.
    * @see #setLimit(Limit)
    * @see kinematicsgraph.KinematicsgraphPackage#getRevoluteJointEdge_Limit()
    * @model required="true"
    * @generated
    */
   Limit getLimit();

   /**
    * Sets the value of the '{@link kinematicsgraph.RevoluteJointEdge#getLimit <em>Limit</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Limit</em>' reference.
    * @see #getLimit()
    * @generated
    */
   void setLimit(Limit value);

   /**
    * Returns the value of the '<em><b>Axis</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Axis</em>' reference.
    * @see #setAxis(Axis)
    * @see kinematicsgraph.KinematicsgraphPackage#getRevoluteJointEdge_Axis()
    * @model required="true"
    * @generated
    */
   Axis getAxis();

   /**
    * Sets the value of the '{@link kinematicsgraph.RevoluteJointEdge#getAxis <em>Axis</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Axis</em>' reference.
    * @see #getAxis()
    * @generated
    */
   void setAxis(Axis value);

} // RevoluteJointEdge
