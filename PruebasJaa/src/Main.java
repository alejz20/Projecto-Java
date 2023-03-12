import java.nio.file.Path;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {


Path destino = Path.of(System.getProperty("user.home"),"Downloads");

    System.out.println(destino);

    }
}