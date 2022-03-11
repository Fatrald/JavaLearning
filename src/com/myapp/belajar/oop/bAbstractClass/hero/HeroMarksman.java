package com.myapp.belajar.oop.bAbstractClass.hero;

//inheritance
public class HeroMarksman extends Hero {

    public HeroMarksman(String name) {
        super(name);
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
    }
}
