package com.myapp.belajar.oop.bMultifile;

import com.myapp.belajar.oop.bMultifile.terminal.Console;

public class MultiFilePackage {
    public static void main(String[] args) {
        Player player1 = new Player("Aldino");
        Player player2 = new Player("Fatra");
        Player player3 = new Player("saitama");

        player1.show();
        player2.show();
        player3.show();

        Console.log("Suriah");
    }
}
