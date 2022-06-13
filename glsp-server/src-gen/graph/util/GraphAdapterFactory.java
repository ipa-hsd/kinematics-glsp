/**
 */
package graph.util;

import graph.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see graph.GraphPackage
 * @generated
 */
public class GraphAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static GraphPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GraphAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = GraphPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GraphSwitch<Adapter> modelSwitch =
      new GraphSwitch<Adapter>() {
         @Override
         public Adapter caseGModelElement(GModelElement object) {
            return createGModelElementAdapter();
         }
         @Override
         public Adapter caseGShapeElement(GShapeElement object) {
            return createGShapeElementAdapter();
         }
         @Override
         public Adapter caseGGraph(GGraph object) {
            return createGGraphAdapter();
         }
         @Override
         public Adapter caseGModelRoot(GModelRoot object) {
            return createGModelRootAdapter();
         }
         @Override
         public Adapter caseGNode(GNode object) {
            return createGNodeAdapter();
         }
         @Override
         public Adapter caseGEdge(GEdge object) {
            return createGEdgeAdapter();
         }
         @Override
         public Adapter caseGCompartment(GCompartment object) {
            return createGCompartmentAdapter();
         }
         @Override
         public Adapter caseGLabel(GLabel object) {
            return createGLabelAdapter();
         }
         @Override
         public Adapter caseGIssueMarker(GIssueMarker object) {
            return createGIssueMarkerAdapter();
         }
         @Override
         public Adapter caseGPort(GPort object) {
            return createGPortAdapter();
         }
         @Override
         public Adapter caseGButton(GButton object) {
            return createGButtonAdapter();
         }
         @Override
         public Adapter caseGBoundsAware(GBoundsAware object) {
            return createGBoundsAwareAdapter();
         }
         @Override
         public Adapter caseGPoint(GPoint object) {
            return createGPointAdapter();
         }
         @Override
         public Adapter caseGDimension(GDimension object) {
            return createGDimensionAdapter();
         }
         @Override
         public Adapter caseGEdgeLayoutable(GEdgeLayoutable object) {
            return createGEdgeLayoutableAdapter();
         }
         @Override
         public Adapter caseGEdgePlacement(GEdgePlacement object) {
            return createGEdgePlacementAdapter();
         }
         @Override
         public Adapter caseGLayouting(GLayouting object) {
            return createGLayoutingAdapter();
         }
         @Override
         public Adapter caseGBounds(GBounds object) {
            return createGBoundsAdapter();
         }
         @Override
         public Adapter caseGAlignable(GAlignable object) {
            return createGAlignableAdapter();
         }
         @Override
         public Adapter caseGArgumentable(GArgumentable object) {
            return createGArgumentableAdapter();
         }
         @Override
         public Adapter caseGIssue(GIssue object) {
            return createGIssueAdapter();
         }
         @Override
         public Adapter caseGHtmlRoot(GHtmlRoot object) {
            return createGHtmlRootAdapter();
         }
         @Override
         public Adapter caseGPreRenderedElement(GPreRenderedElement object) {
            return createGPreRenderedElementAdapter();
         }
         @Override
         public Adapter caseStringToObjectMapEntry(Map.Entry<String, Object> object) {
            return createStringToObjectMapEntryAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link graph.GModelElement <em>GModel Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GModelElement
    * @generated
    */
   public Adapter createGModelElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GShapeElement <em>GShape Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GShapeElement
    * @generated
    */
   public Adapter createGShapeElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GGraph <em>GGraph</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GGraph
    * @generated
    */
   public Adapter createGGraphAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GModelRoot <em>GModel Root</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GModelRoot
    * @generated
    */
   public Adapter createGModelRootAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GNode <em>GNode</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GNode
    * @generated
    */
   public Adapter createGNodeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GEdge <em>GEdge</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GEdge
    * @generated
    */
   public Adapter createGEdgeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GCompartment <em>GCompartment</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GCompartment
    * @generated
    */
   public Adapter createGCompartmentAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GLabel <em>GLabel</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GLabel
    * @generated
    */
   public Adapter createGLabelAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GIssueMarker <em>GIssue Marker</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GIssueMarker
    * @generated
    */
   public Adapter createGIssueMarkerAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GPort <em>GPort</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GPort
    * @generated
    */
   public Adapter createGPortAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GButton <em>GButton</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GButton
    * @generated
    */
   public Adapter createGButtonAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GBoundsAware <em>GBounds Aware</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GBoundsAware
    * @generated
    */
   public Adapter createGBoundsAwareAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GPoint <em>GPoint</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GPoint
    * @generated
    */
   public Adapter createGPointAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GDimension <em>GDimension</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GDimension
    * @generated
    */
   public Adapter createGDimensionAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GEdgeLayoutable <em>GEdge Layoutable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GEdgeLayoutable
    * @generated
    */
   public Adapter createGEdgeLayoutableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GEdgePlacement <em>GEdge Placement</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GEdgePlacement
    * @generated
    */
   public Adapter createGEdgePlacementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GLayouting <em>GLayouting</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GLayouting
    * @generated
    */
   public Adapter createGLayoutingAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GBounds <em>GBounds</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GBounds
    * @generated
    */
   public Adapter createGBoundsAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GAlignable <em>GAlignable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GAlignable
    * @generated
    */
   public Adapter createGAlignableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GArgumentable <em>GArgumentable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GArgumentable
    * @generated
    */
   public Adapter createGArgumentableAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GIssue <em>GIssue</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GIssue
    * @generated
    */
   public Adapter createGIssueAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GHtmlRoot <em>GHtml Root</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GHtmlRoot
    * @generated
    */
   public Adapter createGHtmlRootAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link graph.GPreRenderedElement <em>GPre Rendered Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see graph.GPreRenderedElement
    * @generated
    */
   public Adapter createGPreRenderedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Object Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see java.util.Map.Entry
    * @generated
    */
   public Adapter createStringToObjectMapEntryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //GraphAdapterFactory
