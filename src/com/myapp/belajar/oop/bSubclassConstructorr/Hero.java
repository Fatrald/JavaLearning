package com.myapp.belajar.oop.bSubclassConstructorr;

//class
public class Hero {
    String name;
    Double def;

    //constructor
    public Hero(String name, Double def) {
        this.name = name;
        this.def = def;
    }

    public Hero(String name) {
        this.name = name;
    }

    //method
    void display() {
        System.out.println("name\t: " + this.name);
        System.out.println("def\t\t: " + this.def + "\n");
    }
}
