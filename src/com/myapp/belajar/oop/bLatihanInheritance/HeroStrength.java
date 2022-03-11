package com.myapp.belajar.oop.bLatihanInheritance;

public class HeroStrength extends Hero {
    String type = "strength";

    public HeroStrength(String name, Integer atk, Integer health) {
        super(name, atk, health);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type\t: " + this.type);
    }

    @Override
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        this.atk *= 3;
        System.out.println("critical damage");
        enemy.takeDamage(this.atk);
    }
}
