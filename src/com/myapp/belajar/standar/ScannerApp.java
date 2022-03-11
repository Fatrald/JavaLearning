package com.myapp.belajar.classess;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama\t: ");
        String nama = scanner.nextLine();

        System.out.print("Umur\t: ");
        Integer umur = scanner.nextInt();

        System.out.println("Hello " + nama + "," + "umur anda " + umur);
    }
}
