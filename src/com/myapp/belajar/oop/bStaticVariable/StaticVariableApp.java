package com.myapp.belajar.oop.bStaticVariable;

class Display {
    String name;
    static String type = "led";

    public Display(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("nama\t: " + name);
        System.out.println("tipe\t: " + type);
    }
}

public class StaticVariableApp {
    public static void main(String[] args) {
        //untuk semua object (class variable)
        Display.type = "layar kaca";

        Display display1 = new Display("monitor");
        display1.show();

        Display display2 = new Display("televisi");
        display2.show();

        Display display3 = new Display("laptop");
        display3.show();
    }
}
