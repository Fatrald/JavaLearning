package com.myapp.belajar.oop.bPublicPrivate;

class Player {
    String name; // default : bisa dibaca atau ditulis
    public Integer exp; // public, bisa dibaca atau ditulis
    private Boolean isLife; // private, hanya bisa dibaca dan ditulis didalam class
    public Player(String name, Integer exp, Boolean isLife) {
        this.name = name;
        this.exp = exp;
        this.isLife = isLife;
    }

    //default modifier access
    void display(){
        addExp(100);
        System.out.println("\nName\t: " + this.name);
        System.out.println("EXP\t: " + this.exp);
        System.out.println("isLife\t: " + this.isLife);
    }

    public void ubahNama(String namaBaru){
        this.name = namaBaru;
    }

    private void addExp(Integer total){
        this.exp += total;
    }
}

public class PublicPrivateApp {
    public static void main(String[] args) {

        //default
        Player player1 = new Player("Andi",0,true);
        System.out.println(player1.name); //membaca data
        player1.name = "Bandi"; //menulis data
        System.out.println(player1.name); //membaca data

        //public
        System.out.println(player1.exp); //membaca
        player1.exp = 100; //menulis
        System.out.println(player1.exp); //membaca

        //private (tidak bisa baca tulis)
        // System.out.println(player1.isLife); //membaca
        // player1.isLife = false; //menulis
        // System.out.println(player1.exp); //membaca

        //default method in class
        player1.display();

        //public method in class
        player1.ubahNama("Surti");
        player1.display();

        //private method in class (tidak bisa diakses)
        // player1.addExp(100);

        player1.display();

    }
}
