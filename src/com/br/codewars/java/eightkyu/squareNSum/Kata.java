package com.br.codewars.java.eightkyu.squareNSum;

public class Kata {

    public static void main(String[] args) {
        int[] example1 = new int[]{1,2,2};
        int[] example2 = new int[]{1,2};
        int[] example3 = new int[]{5,-3,4};
        int[] example4 = new int[]{};

        System.out.println(squareSum(example1));
        System.out.println(squareSum(example2));
        System.out.println(squareSum(example3));
        System.out.println(squareSum(example4));
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += Math.pow(n[i],2);
        }
        return sum;
    }
}
