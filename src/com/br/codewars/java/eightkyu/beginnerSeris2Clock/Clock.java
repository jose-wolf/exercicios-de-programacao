package com.br.codewars.java.eightkyu.beginnerSeris2Clock;

import java.time.LocalTime;

public class Clock {

    public static void main(String[] args) {
        System.out.println(past(0,1,1));
    }

    public static int past(int h,int m, int s){
        LocalTime localTime = LocalTime.of(h,m,s);
        long tempoEmNanos = localTime.toNanoOfDay();
        long tempoEmMilles = tempoEmNanos / 1000000;
        Integer resultado = (int) tempoEmMilles;
        return resultado;
    }
}
