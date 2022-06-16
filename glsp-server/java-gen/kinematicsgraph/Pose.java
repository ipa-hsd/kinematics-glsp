/**
 */
package kinematicsgraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kinematicsgraph.Pose#getXyz <em>Xyz</em>}</li>
 *   <li>{@link kinematicsgraph.Pose#getRpy <em>Rpy</em>}</li>
 * </ul>
 *
 * @see kinematicsgraph.KinematicsgraphPackage#getPose()
 * @model
 * @generated
 */
public interface Pose extends EObject {
   /**
    * Returns the value of the '<em><b>Xyz</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Xyz</em>' attribute.
    * @see #setXyz(String)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Xyz()
    * @model required="true"
    * @generated
    */
   String getXyz();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getXyz <em>Xyz</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Xyz</em>' attribute.
    * @see #getXyz()
    * @generated
    */
   void setXyz(String value);

   /**
    * Returns the value of the '<em><b>Rpy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Rpy</em>' attribute.
    * @see #setRpy(String)
    * @see kinematicsgraph.KinematicsgraphPackage#getPose_Rpy()
    * @model required="true"
    * @generated
    */
   String getRpy();

   /**
    * Sets the value of the '{@link kinematicsgraph.Pose#getRpy <em>Rpy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Rpy</em>' attribute.
    * @see #getRpy()
    * @generated
    */
   void setRpy(String value);

} // Pose
