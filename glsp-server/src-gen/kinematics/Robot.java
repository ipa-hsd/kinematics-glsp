/**
 */
package kinematics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematics.Robot#getId <em>Id</em>}</li>
 *   <li>{@link kinematics.Robot#getName <em>Name</em>}</li>
 *   <li>{@link kinematics.Robot#getLinks <em>Links</em>}</li>
 *   <li>{@link kinematics.Robot#getJoints <em>Joints</em>}</li>
 * </ul>
 *
 * @see kinematics.KinematicsPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
   /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see kinematics.KinematicsPackage#getRobot_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
   String getId();

   /**
	 * Sets the value of the '{@link kinematics.Robot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
   void setId(String value);

   /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kinematics.KinematicsPackage#getRobot_Name()
	 * @model required="true"
	 * @generated
	 */
   String getName();

   /**
	 * Sets the value of the '{@link kinematics.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
   void setName(String value);

   /**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link kinematics.Link}.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see kinematics.KinematicsPackage#getRobot_Links()
	 * @model containment="true"
	 * @generated
	 */
   EList<Link> getLinks();

   /**
	 * Returns the value of the '<em><b>Joints</b></em>' containment reference list.
	 * The list contents are of type {@link kinematics.Joint}.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return the value of the '<em>Joints</em>' containment reference list.
	 * @see kinematics.KinematicsPackage#getRobot_Joints()
	 * @model containment="true"
	 * @generated
	 */
   EList<Joint> getJoints();

} // Robot
