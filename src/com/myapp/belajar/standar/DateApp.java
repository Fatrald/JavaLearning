package com.myapp.belajar.classess;

import java.util.Calendar;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {

        Date tanggal = new Date();

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1997);
        calendar.set(Calendar.MONTH,6);
        calendar.set(Calendar.HOUR_OF_DAY,10);

        Date result = calendar.getTime();
        System.out.println(result);

    }

}