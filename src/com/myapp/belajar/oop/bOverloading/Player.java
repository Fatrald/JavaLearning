package com.myapp.belajar.oop.bOverloading;

public class Player {
    private String name;
    private static Integer numberPlayer = 0;

    public static Integer getNumberPlayer() {
        return numberPlayer;
    }

    public static void setNumberPlayer(Integer numberPlayer) {
        Player.numberPlayer = numberPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Player(String name) {
        Player.setNumberPlayer(getNumberPlayer() + 1);
        this.name = name;
    }

    public Player (){
        Player.setNumberPlayer(getNumberPlayer() + 1);
        this.name = "Player " + Player.getNumberPlayer();
    }
}
