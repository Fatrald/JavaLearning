package com.myapp.belajar.oop.bCasting;

public class Hero {
    private String name;
    private Double health;

    //constructor
    public Hero(String name, Double health) {
        this.name = name;
        this.health = health;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    //reguler method
    public void display(){
        System.out.println(this.name + " is a reguler method");
    }
}
