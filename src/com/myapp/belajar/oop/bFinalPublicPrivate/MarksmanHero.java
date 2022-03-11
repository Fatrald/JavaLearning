package com.myapp.belajar.oop.bFinalPublicPrivate;

public class MarksmanHero extends Hero {
    public MarksmanHero(String name, Double health) {
        super(name, health);
    }

    @Override
    //public method tetapi harus ditulis public
    public Double getHealth() {
        return super.getHealth();
    }

    //final method
//    //tidak bisa di override
//    @Override
//    final void display(){
//        System.out.println(this.name + " mempunyai " + this.health + " health");
//    }

    //private


}
