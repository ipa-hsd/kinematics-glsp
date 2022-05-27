import handler.MyCreateNodeOperationHandler;

import org.eclipse.glsp.server.di.GModelJsonDiagramModule;
import org.eclipse.glsp.server.di.MultiBinding;
import org.eclipse.glsp.server.diagram.DiagramConfiguration;
import org.eclipse.glsp.server.features.core.model.JsonFileGModelLoader;
import org.eclipse.glsp.server.features.core.model.ModelSourceLoader;
import org.eclipse.glsp.server.operations.OperationHandler;
import org.eclipse.glsp.server.operations.gmodel.LayoutOperationHandler;

public class MyGLSPDiagramModule extends GModelJsonDiagramModule {

   @Override
   protected Class<? extends DiagramConfiguration> bindDiagramConfiguration() {
      return MyGLSPDiagramConfiguration.class;
   }

   @Override
   protected Class<? extends ModelSourceLoader> bindSourceModelLoader() {
      return JsonFileGModelLoader.class;
   }

   }

   @Override
   public String getDiagramType() { return "my-glsp-diagram"; }

}