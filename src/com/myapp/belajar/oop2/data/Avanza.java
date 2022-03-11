package com.myapp.belajar.oop2.data;

public class Avanza implements Car {
    @Override
    public void drive() {
        System.out.println("this is avanza");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
