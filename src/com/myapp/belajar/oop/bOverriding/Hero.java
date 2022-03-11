package com.myapp.belajar.oop.bOverriding;

public class Hero {
    String name;
    Integer atk, health;
    String type = null;

    public Hero(String name, Integer atk, Integer health) {
        this.name = name;
        this.atk = atk;
        this.health = health;
    }

    void display(){
        System.out.println("name\t: " + this.name);
        System.out.println("health\t: " + this.health);
        System.out.println("atk\t\t: " + this.atk);
    }

    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.atk);
    }

    void takeDamage(Integer damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health -= damage;
    }
}
