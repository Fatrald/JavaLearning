package com.myapp.belajar.oop.bAbstractClass.hero;

//abstract
public abstract class Hero {
    private String name;
    private Integer level;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public abstract void levelUp();

    public void display(){
        System.out.println("aku " + this.name);
        System.out.println("level\t: " + this.level);
    }


}
