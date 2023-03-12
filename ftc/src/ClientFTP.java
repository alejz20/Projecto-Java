import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import java.io.IOException;

public class ClientFTP  {

     final String USER = "Alejandra";
     final String Password = "";

     FTPClient clientFTP = new FTPClient();





//3.Comprobar si la conexión es correcta
        try {
        try {
            clientFTP.connect("localhost");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        clientFTP.enterLocalPassiveMode();
            int respuesta = clientFTP.getReplyCode();
            if (!FTPReply.isPositiveCompletion(respuesta)) {
                System.out.println("Algo a salido mal: " + respuesta);
                System.out.println(clientFTP.getReplyString());
            }

            } catch (Exception e) {
        System.out.println("Eroor: " + e.getMessage());
        }



//4. Cambiar a modo pasivo

        /* MODO*/
// 4. Cambia a modo Pasivo



// 5. Logearte

        boolean loginSatisfactory = clientFTP.login(USER,Password);

        if(!loginSatisfactory){
            System.out.println("Hemos fallado en el inicio de sesion");
        }


//6. Imprime el nombre de directorio actual
/*    private static String directorioActual() throws IOException {
       String directory = clientFTP.printWorkingDirectory();
        System.out.printf("Tu directorio Actual es: " , directorioActual());
        System.out.println("Probando q imprima mi directorio actual");
//        System.out.println(clientFTP.listDirectories());
    }
*/
    public static void main(String[] args) throws IOException {

    System.out.println("HOls");
    }

}