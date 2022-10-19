/**
 */
package kinematics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Joint#getName <em>Name</em>}</li>
 *   <li>{@link kinematics.Joint#getId <em>Id</em>}</li>
 *   <li>{@link kinematics.Joint#getParent <em>Parent</em>}</li>
 *   <li>{@link kinematics.Joint#getChild <em>Child</em>}</li>
 *   <li>{@link kinematics.Joint#getOrigin <em>Origin</em>}</li>
 *   <li>{@link kinematics.Joint#getType <em>Type</em>}</li>
 *   <li>{@link kinematics.Joint#getLimit <em>Limit</em>}</li>
 *   <li>{@link kinematics.Joint#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getJoint()
 * @model
 * @generated
 */
public interface Joint extends EObject {
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see kinematics.KinematicsPackage#getJoint_Name()
    * @model required="true"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link kinematics.Joint#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Id</em>' attribute.
    * @see #setId(String)
    * @see kinematics.KinematicsPackage#getJoint_Id()
    * @model id="true" required="true"
    * @generated
    */
   String getId();

   /**
    * Sets the value of the '{@link kinematics.Joint#getId <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Id</em>' attribute.
    * @see #getId()
    * @generated
    */
   void setId(String value);

   /**
    * Returns the value of the '<em><b>Parent</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent</em>' reference.
    * @see #setParent(Link)
    * @see kinematics.KinematicsPackage#getJoint_Parent()
    * @model required="true"
    * @generated
    */
   Link getParent();

   /**
    * Sets the value of the '{@link kinematics.Joint#getParent <em>Parent</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent</em>' reference.
    * @see #getParent()
    * @generated
    */
   void setParent(Link value);

   /**
    * Returns the value of the '<em><b>Child</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Child</em>' reference.
    * @see #setChild(Link)
    * @see kinematics.KinematicsPackage#getJoint_Child()
    * @model
    * @generated
    */
   Link getChild();

   /**
    * Sets the value of the '{@link kinematics.Joint#getChild <em>Child</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Child</em>' reference.
    * @see #getChild()
    * @generated
    */
   void setChild(Link value);

   /**
    * Returns the value of the '<em><b>Origin</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Origin</em>' containment reference.
    * @see #setOrigin(Pose)
    * @see kinematics.KinematicsPackage#getJoint_Origin()
    * @model containment="true" required="true"
    * @generated
    */
   Pose getOrigin();

   /**
    * Sets the value of the '{@link kinematics.Joint#getOrigin <em>Origin</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Origin</em>' containment reference.
    * @see #getOrigin()
    * @generated
    */
   void setOrigin(Pose value);

   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The literals are from the enumeration {@link kinematics.JointType}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' attribute.
    * @see kinematics.JointType
    * @see #setType(JointType)
    * @see kinematics.KinematicsPackage#getJoint_Type()
    * @model required="true"
    * @generated
    */
   JointType getType();

   /**
    * Sets the value of the '{@link kinematics.Joint#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see kinematics.JointType
    * @see #getType()
    * @generated
    */
   void setType(JointType value);

   /**
    * Returns the value of the '<em><b>Limit</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Limit</em>' containment reference.
    * @see #setLimit(Limit)
    * @see kinematics.KinematicsPackage#getJoint_Limit()
    * @model containment="true"
    * @generated
    */
   Limit getLimit();

   /**
    * Sets the value of the '{@link kinematics.Joint#getLimit <em>Limit</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Limit</em>' containment reference.
    * @see #getLimit()
    * @generated
    */
   void setLimit(Limit value);

   /**
    * Returns the value of the '<em><b>Axis</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Axis</em>' containment reference.
    * @see #setAxis(Axis)
    * @see kinematics.KinematicsPackage#getJoint_Axis()
    * @model containment="true"
    * @generated
    */
   Axis getAxis();

   /**
    * Sets the value of the '{@link kinematics.Joint#getAxis <em>Axis</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Axis</em>' containment reference.
    * @see #getAxis()
    * @generated
    */
   void setAxis(Axis value);

} // Joint
