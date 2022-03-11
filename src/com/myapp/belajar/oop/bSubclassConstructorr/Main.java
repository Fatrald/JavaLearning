package com.myapp.belajar.oop.bSubclassConstructorr;

public class Main {
    public static void main(String[] args) {
        Hero esmeralda = new Hero("esmeralda",Double.valueOf(10)); //constructor super class
        esmeralda.display();

        HeroStrength badang = new HeroStrength("badang", Double.valueOf(20)); //constructor sub class
        badang.display();

        HeroStrength nana = new HeroStrength("nana");
        nana.display();
    }
}
