package com.myapp.belajar.oop.bCasting;

public class HeroFighter extends Hero {
    String type;

    public HeroFighter(String name, Double health) {
        super(name, health);
        this.type = "Fighter";
    }

    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero");
    }
}
