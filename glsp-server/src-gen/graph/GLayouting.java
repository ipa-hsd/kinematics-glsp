/**
 */
package graph;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GLayouting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GLayouting#getLayout <em>Layout</em>}</li>
 *   <li>{@link graph.GLayouting#getLayoutOptions <em>Layout Options</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGLayouting()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GLayouting extends EObject {
   /**
    * Returns the value of the '<em><b>Layout</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Layout</em>' attribute.
    * @see #setLayout(String)
    * @see graph.GraphPackage#getGLayouting_Layout()
    * @model
    * @generated
    */
   String getLayout();

   /**
    * Sets the value of the '{@link graph.GLayouting#getLayout <em>Layout</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Layout</em>' attribute.
    * @see #getLayout()
    * @generated
    */
   void setLayout(String value);

   /**
    * Returns the value of the '<em><b>Layout Options</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link java.lang.Object},
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Layout Options</em>' map.
    * @see graph.GraphPackage#getGLayouting_LayoutOptions()
    * @model mapType="graph.StringToObjectMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject&gt;"
    * @generated
    */
   EMap<String, Object> getLayoutOptions();

} // GLayouting
