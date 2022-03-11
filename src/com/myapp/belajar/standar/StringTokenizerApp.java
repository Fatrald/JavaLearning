package com.myapp.belajar.classess;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "M. Fidyan Fatra Aldino";

        StringTokenizer tokenizer = new StringTokenizer(name, " "); //split bertahap low memory

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
