import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;

import static java.nio.file.FileSystems.getDefault;

public class WordCounter extends Thread{


    public static void main(String[] args) throws IOException {

        // Directorio donde se encuentra el trabajo

        File[] roots = File.listRoots();
        for (int i=0; i<roots.length; i++) {
            System.out.println( "Imrpime " + roots[i]);
        }

        public static DirectoryStream<Path> newDirectoryStream(Path dir){
            dir = "C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR";
        }




        /*

         File file =new File("C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR\\The Dunwhich horror by H.P Lovecraft");

        System.out.println("El libro tiene " + file.length() +  " palabras");

        File file2 =new File("C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR\\The empty house and other horror stories by Algernon Blackwood");

        System.out.println("El libro tiene " + file2.length() +  " palabras");

        File file3 =new File("C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR\\The Works of Edgar Allan Poe");

        System.out.println("El libro tiene " + file3.length() +  " palabras");

        File file4 =new File("C:\\Users\\madrid\\Desktop\\EJERCICIO1_CONTAR\\This Crowded Earth by Robert Bloch");

        System.out.println("El libro tiene " + file4.length() +  " palabras");

         */

    }

}
