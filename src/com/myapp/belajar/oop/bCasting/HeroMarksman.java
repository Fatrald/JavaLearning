package com.myapp.belajar.oop.bCasting;

public class HeroMarksman extends Hero {
    String type;

    public HeroMarksman(String name, Double health) {
        super(name, health);
        this.type = "Marksman";
    }

    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero");
    }
}
