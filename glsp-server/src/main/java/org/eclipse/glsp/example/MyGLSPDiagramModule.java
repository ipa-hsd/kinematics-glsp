package org.eclipse.glsp.example;

import org.eclipse.glsp.example.model.MyGLSPGModelFactory;
import org.eclipse.glsp.example.model.MyGLSPSourceModelStorage;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.emf.EMFIdGenerator;
import org.eclipse.glsp.server.emf.EMFSourceModelStorage;
import org.eclipse.glsp.server.emf.idgen.AttributeIdGenerator;
import org.eclipse.glsp.server.emf.notation.EMFNotationDiagramModule;
import org.eclipse.glsp.server.features.core.model.GModelFactory;

public class MyGLSPDiagramModule extends EMFNotationDiagramModule {

   @Override
   protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
      return MyGLSPDiagramConfiguration.class;
   }

   @Override
   protected Class<? extends EMFSourceModelStorage> bindSourceModelStorage() {
      // ensure our custom package is registered when loading our models
      return MyGLSPSourceModelStorage.class;
   }

   @Override
   public String getDiagramType() { return "my-glsp-diagram"; }

@Override
protected Class<? extends EMFIdGenerator> bindEMFIdGenerator() {
	// TODO Auto-generated method stub
	return AttributeIdGenerator.class;
}

@Override
protected Class<? extends GModelFactory> bindGModelFactory() {
	// TODO Auto-generated method stub
	return MyGLSPGModelFactory.class;
}

}