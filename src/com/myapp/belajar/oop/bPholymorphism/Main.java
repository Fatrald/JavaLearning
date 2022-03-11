package com.myapp.belajar.oop.bPholymorphism;

public class Main {
    public static void main(String[] args) {
        //object biasa
        Hero hero1 = new Hero("Fatrald");

        //object pholymorphism
        Hero hero2 = new HeroMarksman("wanwan");
        Hero hero3 = new HeroFighter("yu zhong");
        Hero hero4 = new HeroMage("selena");

        //display method
        hero1.display();
        hero2.display();
        hero3.display();
        hero4.display();

        //Array list
        Hero[] listHero = new Hero[4];
        listHero[0] = hero1;
        listHero[1] = hero2;
        listHero[2] = hero3;
        listHero[3] = hero4;
        System.out.println();

        for (int i = 0; i < listHero.length; i++) {
            System.out.println("hero ke " + (i + 1));
            listHero[i].display();
            System.out.println();
        }

    }
}
