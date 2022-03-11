package com.myapp.belajar.oop.bPholymorphism;

public class HeroMarksman extends Hero {
    String type = "Marksman";

    public HeroMarksman(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}
