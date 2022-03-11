package com.myapp.belajar.classess;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","{","}");

        joiner.add("fatra");
        joiner.add("aldino");

        String value = joiner.toString();
        System.out.println(value);
    }
}
