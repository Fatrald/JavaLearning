package com.myapp.belajar.oop.bConstructor;
class NilaiIPA {
    Integer fisika;
    Integer kimia;
    Integer biologi;

    //constructor dipanggil saat object pertama kali dipanggil

    NilaiIPA(){
        System.out.println("nilai mata pelajaran IPA");
    }

    NilaiIPA(Integer fisika){
        System.out.println("nilai fisika adalah : " + fisika);
    }
}
public class ConstructorApp {
    public static void main(String[] args) {
        NilaiIPA fisika1 = new NilaiIPA();
        NilaiIPA fisika2 = new NilaiIPA(100);
    }
}
