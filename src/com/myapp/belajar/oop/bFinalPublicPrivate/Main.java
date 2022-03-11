package com.myapp.belajar.oop.bFinalPublicPrivate;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("saitama",100.0);
        MarksmanHero hero2 = new MarksmanHero("wanwan",50.0);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero2.setHealth("reset");
        hero2.display();

    }
}
