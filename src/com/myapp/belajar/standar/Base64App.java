package com.myapp.belajar.classess;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "M. Fidyan Fatra Aldino";
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        byte[] decoded = Base64.getDecoder().decode(encoded);
        String result = new String(decoded);

        System.out.println(decoded);
        System.out.println(result);
    }
}
