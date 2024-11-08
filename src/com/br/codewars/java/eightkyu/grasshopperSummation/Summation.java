package com.br.codewars.java.eightkyu.grasshopperSummation;

public class Summation {

    public static void main(String[] args) {
        System.out.println(summation(8));

    }

    public static int summation(int n){

        int sum = 0;
        for (int i = 1; i <= n;i++){

            sum += i;
        }
        return sum;
    }
}
