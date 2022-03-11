package com.myapp.belajar.oop.bOverriding;

public class Main {
    public static void main(String[] args) {
        Hero wanwan = new Hero("wanwan",10,100);
        wanwan.display();
        System.out.println();
        HeroStrength nana = new HeroStrength("nana",5,100);
        nana.display();

        wanwan.attack(nana);
        nana.display();

        nana.attack(wanwan);
        wanwan.display();
    }
}
