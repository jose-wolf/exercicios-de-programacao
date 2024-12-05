package com.br.codewars.java.eightkyu.returnNegative;

public class Kata {

    public static void main(String[] args) {
        System.out.println(makeNegative(42));
    }

    public static int makeNegative(final int x) {

        return -Math.abs(x);
    }
}
