package com.br.codewars.java.sevenkyu.youAreASquare;

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
    }

    public static boolean isSquare(int n) {
        if(n < 0) {
            return false;
        }

        int number = (int) Math.sqrt(n);
        int pow = (int) Math.pow(number,2);

        if(pow != n){
            return false;
        }

        return true;
    }
}
