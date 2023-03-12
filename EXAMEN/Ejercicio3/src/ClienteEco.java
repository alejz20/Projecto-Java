
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClienteEco {
    LocalTime now = LocalTime.now();
    LocalDate fecha= LocalDate.now();

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java EchoClient <port number>");
            System.exit(1);
        }
        InetAddress inetAddress = InetAddress.getLocalHost();
        int portNumber = Integer.parseInt(args[0]);
        try {
                Socket socket = new Socket(inetAddress, portNumber);
                PrintWriter socketOut = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader socketIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader stdIn = new BufferedReader(new InputStreamReader());
        {
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                socketOut.println(userInput);
                System.out.println("echo: " + socketIn.readLine());
            }
        }
    }
}
