package com.agui.juan.psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Parent {
    public static void main(String[] args) throws IOException, InterruptedException {

        String string1 = "Sed eu cursus sem, id vehicula odio.";
        String string2 = "Mauris sagittis non elit sed bibendum.";
        String string3 = "Fusce finibus sollicitudin vestibulum.";
        String classPath = Path.of(System.getProperty("user.dir"), "out", "production", "tipo1").toString();
        ProcessBuilder processBuilder1 = new ProcessBuilder("java", "-cp", classPath, Child.class.getName(), string1);
        ProcessBuilder processBuilder2 = new ProcessBuilder("java", "-cp", classPath, Child.class.getName(), string2);
        ProcessBuilder processBuilder3 = new ProcessBuilder("java", "-cp", classPath, Child.class.getName(), string3);
        Process process1 = processBuilder1.start();
        Process process2 = processBuilder2.start();
        Process process3 = processBuilder3.start();
        process1.waitFor();
        process2.waitFor();
        process3.waitFor();
        try (BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()))) {
            System.out.println(bufferedReader1.readLine());
        }
        try (BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process2.getInputStream()))) {
            System.out.println(bufferedReader2.readLine());
        }
        try (BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(process3.getInputStream()))) {
            System.out.println(bufferedReader3.readLine());
        }
        System.out.printf("El proceso 1 terminó con estado %d%n", process1.exitValue());
        System.out.printf("El proceso 2 terminó con estado %d%n", process2.exitValue());
        System.out.printf("El proceso 3 terminó con estado %d%n", process3.exitValue());
    }
}
