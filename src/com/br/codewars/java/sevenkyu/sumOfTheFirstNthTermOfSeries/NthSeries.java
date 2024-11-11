package com.br.codewars.java.sevenkyu.sumOfTheFirstNthTermOfSeries;

public class NthSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(seriesSum(n));
    }

    public static String seriesSum(int n) {
        if(!(n > 0)){
            return "0.00";
        }

        double sum = 1.0;
        double numerador = 1;
        double denominador = 4;

        for(int i = 1; i < n; i++){
            sum += numerador/denominador;
            denominador += 3;
        }
        return String.format("%.2f",sum);

    }
}
