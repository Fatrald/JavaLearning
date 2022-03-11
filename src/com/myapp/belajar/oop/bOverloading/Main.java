package com.myapp.belajar.oop.bOverloading;

public class Main {
    public static void main(String[] args) {
        //overloading constructor
        Player player1 = new Player("aldino");
        Player player2 = new Player();
        Player player3 = new Player();

        System.out.println("name : " + player1.getName());
        System.out.println("name : " + player2.getName());
        System.out.println("name : " + player3.getName());

        //overloading methods
        Integer a = Matematika.tambah(5,10);
        Double b = Matematika.tambah(10,90.0);
        System.out.println(a);
        System.out.println(b);
    }
}
