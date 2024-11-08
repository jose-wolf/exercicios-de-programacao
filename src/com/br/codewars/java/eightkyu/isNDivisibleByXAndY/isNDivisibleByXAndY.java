package com.br.codewars.java.eightkyu.isNDivisibleByXAndY;

public class isNDivisibleByXAndY {

    public static void main(String[] args) {
        System.out.println(isDivisible(12,3,4));
    }

    public static boolean isDivisible(long n, long x, long y) {
        if((n % x == 0) && (n % y == 0)){
            return true;
        }else {
            return false;
        }
    }
}
