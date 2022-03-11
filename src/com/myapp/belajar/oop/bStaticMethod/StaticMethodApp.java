package com.myapp.belajar.oop.bStaticMethod;

import java.util.ArrayList;

class PlayerStaticMethod {
    //variable
    private String name;
    private static Integer numberOfPlayer = 0;
    private static ArrayList<String> playerList = new ArrayList<String>();

    //constructor player
    public PlayerStaticMethod(String name) {
        this.name = name;
        PlayerStaticMethod.playerList.add(this.name);
        PlayerStaticMethod.numberOfPlayer++;
    }

    //show the player
    void show(){
        showNumberOfPlayer();
        System.out.println("player name : " + this.name);
    }

    //static method
    static void showNumberOfPlayer(){
        System.out.println("Player " + PlayerStaticMethod.numberOfPlayer);
    }

    static ArrayList<String> getPlayerList() {
        return playerList;
    }
}

public class StaticMethodApp {
    public static void main(String[] args) {
        PlayerStaticMethod player1 = new PlayerStaticMethod("Fidyan");
        player1.show();
        PlayerStaticMethod player2 = new PlayerStaticMethod("Fatra");
        player2.show();
        PlayerStaticMethod player3 = new PlayerStaticMethod("Aldino");
        player3.show();

        System.out.println(PlayerStaticMethod.getPlayerList());

    }
}
