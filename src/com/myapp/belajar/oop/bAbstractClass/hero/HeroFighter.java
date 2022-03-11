package com.myapp.belajar.oop.bAbstractClass.hero;

public class HeroFighter extends Hero {

    public HeroFighter(String name) {
        super(name);
    }

    @Override
    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
    }
}
