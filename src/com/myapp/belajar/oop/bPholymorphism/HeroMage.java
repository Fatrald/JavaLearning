package com.myapp.belajar.oop.bPholymorphism;

public class HeroMage extends Hero{
    String type = "Mage";

    public HeroMage(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }
}
