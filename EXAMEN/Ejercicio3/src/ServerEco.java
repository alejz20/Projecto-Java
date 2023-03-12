

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerEco {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);
        try (ServerSocket echoSocket = new ServerSocket(portNumber)) {
            while (true) {

                Socket clientSocket = echoSocket.accept();
               new Thread(() -> {
                   try (

                           PrintWriter socketOut = new PrintWriter(clientSocket.getOutputStream(), true);
                           BufferedReader socketIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                   ) {


                       String inputLine;
                       while ((inputLine = socketIn.readLine()) != null) {
                           System.out.println("ClienteEco" + clientSocket + inputLine);
                           socketOut.println(inputLine);
                       }
                   }
                   catch (SocketException SE) {
                       System.out.println("Cliente vivo");
                   } catch (IOException e) {
                       throw new RuntimeException(e);
                   } finally {
                       try{
                           clientSocket.close();
                       } catch (IOException e) {
                           throw new RuntimeException(e);
                       }

                   }

               }).start();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
