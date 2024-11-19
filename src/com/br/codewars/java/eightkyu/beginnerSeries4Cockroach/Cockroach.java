package com.br.codewars.java.eightkyu.beginnerSeries4Cockroach;

public class Cockroach {

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
        System.out.println(cockroachSpeed(1.09));
        System.out.println(cockroachSpeed(0));
    }

    public static int cockroachSpeed(double x){
        int cm = (int) Math.round(x * 100000);
        int s  = 3600;
        int resultado = cm / s;
        return resultado;
    }

}
