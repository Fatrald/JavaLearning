package com.myapp.belajar.classess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

            properties.put("name.first","fatra");
            properties.put("name.last","aldino");
            properties.store(new FileOutputStream("name.properties"),"");



        } catch (FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        } catch (IOException exception){
            System.out.println("gagal load data dari file");
        }
    }
}
