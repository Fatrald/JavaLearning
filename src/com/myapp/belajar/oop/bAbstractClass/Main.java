package com.myapp.belajar.oop.bAbstractClass;
import com.myapp.belajar.oop.bAbstractClass.hero.Hero;
import com.myapp.belajar.oop.bAbstractClass.hero.HeroFighter;
import com.myapp.belajar.oop.bAbstractClass.hero.HeroMarksman;

public class Main {
    public static void main(String[] args) {
        //membuat object dari kelas non abstract
        HeroMarksman hero1 = new HeroMarksman("wanwan");
        hero1.display();

        //membuat object dari abstract class tidak bisa
//        Hero hero2 = new Hero("yuzhong");

        HeroFighter hero2 = new HeroFighter("yuzhong");
        hero2.display();

        hero1.levelUp();
        hero1.display();
        hero1.levelUp();
        hero1.display();



    }
}
