package com.myapp.belajar.classess;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String value = "100.00";

//        Integer valueInt = Integer.valueOf(value);
//        System.out.println(valueInt);

        Double valueDoub = Double.valueOf(value);
        System.out.println(valueDoub);
    }
}
