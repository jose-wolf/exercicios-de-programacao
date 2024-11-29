package com.br.codewars.java.sevenkyu.sumOfCubes;

public class Solution {

    public static void main(String[] args) {

        System.out.println(sumCubes(1));
        System.out.println(sumCubes(2));
        System.out.println(sumCubes(3));
        System.out.println(sumCubes(4));
        System.out.println(sumCubes(10));
        System.out.println(sumCubes(123));

    }

    public static long sumCubes(long n) {
        long soma = 0;
        if(n < 0 ){
            return 0;
        }else{
            for(int i = 1; i <= n; i++){
                soma += (long) Math.pow(i,3);

            }
            return soma;
        }
    }

}
