import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static java.nio.file.Files.isDirectory;
import static java.nio.file.Files.newDirectoryStream;

public class Directorio {
    public static void main(String[] args) throws IOException {

// Directorio donde se encuentra el trabajo
        String DirectorioActual = System.getProperty("user.dir");
        System.out.println("Tu Directorio Actual es: " + DirectorioActual);

// LISTA LOS CONTENIDOS DEL DIRECTORIO ACTUAL DEL TRABAJO.

        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name: dirs) {
            System.err.println(name);
        }
// Iterar: recorre el codigo y en caso de que sea falso termina.
        String texto = "C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR\\The Dunwhich horror by H.P Lovecraft";
        Process pb = new ProcessBuilder(texto).start();







    }
}
