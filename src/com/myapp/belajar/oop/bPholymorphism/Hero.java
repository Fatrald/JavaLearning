package com.myapp.belajar.oop.bPholymorphism;

public class Hero {
    String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    void display(){
        System.out.println("Nama\t: " + this.nama);
    }
}
