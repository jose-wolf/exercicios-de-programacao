package com.br.codewars.java.sevenkyu.triangularTreasure;

public class Triangular {

    public static void main(String[] args) {
        System.out.println(triangular(2));
        System.out.println(triangular(4));
        System.out.println(triangular(1275));
        System.out.println(triangular(0));
        System.out.println(triangular(-1));
    }

    public static long triangular(long n) {
        if(n <= 0){
            return 0;
        }else{
            return (n * (n + 1)) / 2;
        }
    }

}
