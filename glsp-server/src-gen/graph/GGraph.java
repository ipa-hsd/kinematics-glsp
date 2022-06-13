/**
 */
package graph;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GGraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GGraph#getLayoutOptions <em>Layout Options</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGGraph()
 * @model
 * @generated
 */
public interface GGraph extends GModelRoot, GBoundsAware {
   /**
    * Returns the value of the '<em><b>Layout Options</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link java.lang.Object},
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Layout Options</em>' map.
    * @see graph.GraphPackage#getGGraph_LayoutOptions()
    * @model mapType="graph.StringToObjectMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
    * @generated
    */
   EMap<String, Object> getLayoutOptions();

} // GGraph
