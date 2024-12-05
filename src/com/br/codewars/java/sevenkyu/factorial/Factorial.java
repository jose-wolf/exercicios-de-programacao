package com.br.codewars.java.sevenkyu.factorial;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static long factorial(int n) {

        if(n < 0){
            throw new IllegalArgumentException("O fatorial tem que ser maior que 0");
        }else if(n == 0 || n ==1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
