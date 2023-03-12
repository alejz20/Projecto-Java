import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

  /*      ProcessBuilder path = new ProcessBuilder();
        Process pb = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"
        ).start();

    System.out.printf("El codigo de proceso es: " + pb.pid());
    System.out.println(" ");
    pb.waitFor();
    System.out.printf("EL PID de salida es: " + pb.pid() + pb.exitValue());

    } */


            String path = "C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe";
            ProcessBuilder processBuilder = new ProcessBuilder(path);
            Process process = processBuilder.start();
            System.out.printf("Lanzado el proceso con PID %d%n", process.pid());
            process.waitFor();
            System.out.printf("El proceso con PID %d terminó con estado %d%n", process.pid(), process.exitValue());
        }


}