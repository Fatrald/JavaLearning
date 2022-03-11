package com.myapp.belajar.oop.bClass;
//class java
class Mahasiswa {
    String nama;
    String NPM;
    String jurusan;
}

public class ClassApp {
    public static void main(String[] args) {
        Mahasiswa aldino = new Mahasiswa();
        aldino.nama = "M. Fidyan Fatra Aldino";
        aldino.NPM = "30721091";
        aldino.jurusan = "Manajemen Informatika";
        System.out.println(aldino.nama);
        System.out.println(aldino.NPM);
        System.out.println(aldino.jurusan);

    }
}
