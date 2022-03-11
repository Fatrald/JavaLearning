package com.myapp.belajar.oop.bSuper;

public class HeroStrength extends Hero {
    String name = "name of Strength class";

    void display(){
        System.out.println("this is " + super.name);
    }
}
