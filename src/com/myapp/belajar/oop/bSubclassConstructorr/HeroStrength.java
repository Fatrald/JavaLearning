package com.myapp.belajar.oop.bSubclassConstructorr;

//subclass
public class HeroStrength extends Hero {
    //constructor
    public HeroStrength(String name, Double def) {
        super(name,def);
    }

    public HeroStrength(String name) {
        super(name);
    }
}
