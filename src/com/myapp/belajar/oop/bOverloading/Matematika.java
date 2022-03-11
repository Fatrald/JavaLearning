package com.myapp.belajar.oop.bOverloading;

public class Matematika {
    public static Integer tambah(Integer x, Integer y){
        return x + y;
    }

    public static Double tambah(Integer x, Double y){
        return Double.valueOf(x) + y;
    }
}
