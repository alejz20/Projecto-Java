import java.io.IOException;

public class CreacionProceso {

    public static void main(String[] args) throws IOException, InterruptedException {
        String path= "C:\\Users\\madrid\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe";
        String fl = "C:\\Users\\madrid\\Desktop\\HTML\\EJERCICIOS HTML\\ejemplos.html";
        Process pb = new ProcessBuilder(path, fl).start();

        System.out.printf("El Pid del proceso es: " + pb.pid());
        pb.waitFor();
        System.out.println(" ");
        System.out.printf("El Pid de salida del proceso es: " + pb.pid() + pb.exitValue());

    }
}
