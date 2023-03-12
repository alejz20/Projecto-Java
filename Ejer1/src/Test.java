import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String [] urls ={
                "https://docs.oracle.com/javase/tutorial/networking/urls/index.html",
                "https://github-media-downloads.s3.amazonaws.com/Octocats.zip"
        };

        List<Thread> hilos = new ArrayList<>();

        for (String url : urls){
            hilos.add(new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }));
        }
    }
}
