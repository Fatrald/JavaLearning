package com.myapp.belajar.classess;

public class StringApp {
    public static void main(String[] args) {
        String name = "M. Fidyan Fatra Aldino";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("M."));

        String[] names = name.split(" ");

        for (String value : names) {
            System.out.println(value);
        }

        System.out.println(name.charAt(1));
        System.out.println(name.hashCode());
    }
}
