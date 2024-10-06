package com.br.HackerRank.java.easy.JavaDateAndTime;

import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate ldt = LocalDate.of(year,month,day);
        String str = ldt.getDayOfWeek().toString().toUpperCase();
        return str;
    }

}

public class JavaDateAndTime {
    public static void main(String[] args){

        int month = 8;
        int day = 5;
        int year = 2015;

        String resultado = Result.findDay(month,day,year);
        System.out.println(resultado);
    }
}