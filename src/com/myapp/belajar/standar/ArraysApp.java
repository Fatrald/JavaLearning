package com.myapp.belajar.classess;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,5,6,7,8,2,4,5,6,7,8,1,3,5,6,7
        };

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,8));

        int[] result = Arrays.copyOf(numbers,10);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,5,10);
        System.out.println(Arrays.toString(result2));
    }
}
