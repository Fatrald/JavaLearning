package com.myapp.belajar.oop.bPholymorphism;

public class HeroFighter extends Hero {
    String type = "Fighter";

    public HeroFighter(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}
