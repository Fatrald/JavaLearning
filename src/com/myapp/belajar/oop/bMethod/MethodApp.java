package com.myapp.belajar.oop.bMethod;

class User {
    //data member
    String username;
    String password;

    //constructor
    User(String user, String pass){
        this.username = user;
        this.password = pass;
    }

    //method tanpa return
    void show(){
        System.out.println("username anda : " + this.username);
        System.out.println("password anda : " + this.password);
    }

    //method tanpa return dengan parameter
    void setNama(String user){
        this.username = user;
        System.out.println("username : " + this.username);
    }

    //method dengan return tanpa parameter
    String getUsername(){
        return this.username;
    }

    String getPassword(){
        return this.password;
    }

    //method dengan return dengan parameter
    String loginMessage(String message){
        return "Login " + message + " with Username " + this.username + " and password " + this.password;
    }
}

public class MethodApp {
    public static void main(String[] args) {
        User user1 = new User("Aldino","p@ssw0rd");

        user1.show();
        user1.setNama("Fatrald");

        System.out.println(user1.getUsername());
        System.out.println(user1.getPassword());

        System.out.println(user1.loginMessage("Success"));
    }
}
