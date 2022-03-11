package com.myapp.belajar.oop.bFinalPublicPrivate;

public class Hero {
    public String name;
    private Double health;

    //public --> bisa diakses, bisa di override.
    //final --> bisa diakses, tidak bisa di override.
    //private --> tidak bisa diakses, tidak bisa di override.


    public Hero(String name, Double health) {
        this.name = name;
        this.health = health;
    }

    //public method
    public Double getHealth() {
        return health;
    }

    //final method
    final void display(){
        System.out.println(this.name + " mempunyai " + this.health + " health");
    }

    //tidak bisa diakses
    final void setHealth(String status){
        if(status.equals("reset")){
            this.health = 100.0;
        }
    }
}
