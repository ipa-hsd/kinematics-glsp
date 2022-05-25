import java.io.IOException;

import org.apache.commons.cli.ParseException;
import org.eclipse.glsp.server.di.ServerModule;
import org.eclipse.glsp.server.launch.DefaultCLIParser;
import org.eclipse.glsp.server.launch.GLSPServerLauncher;
import org.eclipse.glsp.server.launch.SocketGLSPServerLauncher;
import org.eclipse.glsp.server.utils.LaunchUtil;

public final class MyGLSPServerLauncher {
    private MyGLSPServerLauncher() {}

    @SuppressWarnings("uncommentedmain")
    public static void main(final String[] args) {
        try {
            DefaultCLIParser cliParser = new DefaultCLIParser(args, "My GLSP server");
            LaunchUtil.configure(cliParser);
            int port = cliParser.parsePort();

            ServerModule serverModule = new ServerModule().configureDiagramModule(new MyGLSPDiagramModule());
            GLSPServerLauncher launcher = new SocketGLSPServerLauncher(serverModule);
            launcher.start("localhost", port);
            System.out.println("server started");
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}
