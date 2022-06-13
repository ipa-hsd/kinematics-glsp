/**
 */
package graph;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GArgumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GArgumentable#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGArgumentable()
 * @model
 * @generated
 */
public interface GArgumentable extends EObject {
   /**
    * Returns the value of the '<em><b>Args</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link java.lang.Object},
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Args</em>' map.
    * @see graph.GraphPackage#getGArgumentable_Args()
    * @model mapType="graph.StringToObjectMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
    * @generated
    */
   EMap<String, Object> getArgs();

} // GArgumentable
