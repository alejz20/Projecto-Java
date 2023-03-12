package com.agui.juan.psp;

public class Child {
    public static void main(String[] args) {
        String string = args[0];
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }
}
