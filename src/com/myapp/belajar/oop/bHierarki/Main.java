package com.myapp.belajar.oop.bHierarki;

//import class console
import com.myapp.belajar.oop.bHierarki.console.Console;

//import static method dari console
import static com.myapp.belajar.oop.bHierarki.console.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("aldino");

        System.out.println(player1.getName() + ": using player class"); //dalam 1 package
        Console.log(player1.getName() + ": using console class"); //beda package harus import terlebih dahulu | keyword class console to public
        log(player1.getName() + ": using import static method"); //hanya import static method
    }
}
