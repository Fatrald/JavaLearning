package com.myapp.belajar.oop.bCasting;

public class Main {
    public static void main(String[] args) {
        //object hero marksman
        HeroMarksman wanwan = new HeroMarksman("wanwan",100.0);
        wanwan.display();

        Hero wanwanHero = (Hero) wanwan;
        wanwanHero.display();

        //field methos sesuai dengan hasil casting

        HeroFighter wanwanFighter = (HeroFighter) wanwanHero;
    }
}
