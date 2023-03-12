

import java.io.IOException;
import java.nio.file.Path;

public class Crea_Proceso {

    public static void main(String[] args) throws InterruptedException, IOException {
        String classPath = Path.of(System.getProperty("user.dir"), "out", "production", "2.SumaConcurrente").toString();

        ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", classPath, Adder.class.getName(), "proceso 1", "1000", "2000").inheritIO();
        Process process1 = processBuilder.start();

        processBuilder = new ProcessBuilder("java", "-cp", classPath, Adder.class.getName(), "proceso 2", "2000", "3000").inheritIO();
        Process process2 = processBuilder.start();

        process1.waitFor();
        process2.waitFor();

        System.out.println("Finished both processes");
    }
}
