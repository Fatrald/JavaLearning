package com.myapp.belajar.oop2.application;

import com.myapp.belajar.oop2.data.Car;
import com.myapp.belajar.oop2.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        if (car.isMaintenance()){
            System.out.println("the car is maintenance");
        } else {
            System.out.println("the car has not maintenanced");
        }
    }
}
