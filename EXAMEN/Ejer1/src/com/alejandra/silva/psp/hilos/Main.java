package com.alejandra.silva.psp.hilos;

import java.io .*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class Main {

    private static final int TAMANO = 2048;

    public static void main(String[] args) {
// Creamos un array y dentro ponemos las URLs que cogemos de Internet o lo que nos dará el profe.
// // Que luego(descargaremos en nuestro ordenador)
        String[] urls = {
                "https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html",
                "https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/OutputStream.html",
                "https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Flushable.html",
                "https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Closeable.html"
        };
//
        List<Thread> hilos = new ArrayList<>();

        for (String url : urls) {
            hilos.add(new Thread(new Runnable() {
                @Override
// Dentro del metodo run, ponemos dentro lo q queremos q haga el hilo
                public void run() {
                    try {
                        URL origen = new URL(url);

                Path destino = Path.of( System.getProperty("user.home"),
                                "downloads",
                                url.substring(url.lastIndexOf("/" ))
                        );

                        InputStream streamIn = origen.openStream();
                        FileOutputStream streamOut = new FileOutputStream(destino.toString());

                        byte[] buffer = new byte[TAMANO];
                        int bytes;

                        while ((bytes = streamIn.read(buffer, 0, TAMANO)) != -1) {
                            streamOut.write(buffer, 0, bytes);
                        }

                        streamOut.close();
                        streamIn.close();
                    } catch (MalformedURLException e) {
                        System.err.println("Error el URL mal formado");
                    } catch (IOException e) {
                        System.err.println("Error de I/O");
                    }
                }
            }));
        }
// Aqui iniciamos el hilo
        for (Thread hilo : hilos) {
            hilo.start();
        }
// Esperamos a q el hilo secundario terminé
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.err.println("Error en join");
            }
        }
    }

}


