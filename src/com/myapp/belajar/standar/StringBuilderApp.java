package com.myapp.belajar.classess;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("fatra");
        builder.append(" ");
        builder.append("aldino");

        String name = builder.toString();
        System.out.println(name);
    }
}
