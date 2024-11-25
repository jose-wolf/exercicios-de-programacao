package com.br.codewars.java.sevenkyu.recursion101;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(6,19)));
        System.out.println(Arrays.toString(solve(2,1)));
        System.out.println(Arrays.toString(solve(22,5)));
        System.out.println(Arrays.toString(solve(2,10)));
        System.out.println(Arrays.toString(solve(8796203,7556)));
        System.out.println(Arrays.toString(solve(19394,19394)));
    }

    public static int [] solve(int a, int b){
        if((a == 0) || (b == 0)){
            return new int[] {a,b};
        } else if (a >= (2*b)) {
            a -= 2*b;
            return solve(a,b);
        } else if (b >= (2*a)) {
            b -= 2*a;
            return solve(a,b);
        }else{
            return new int[]{a,b};
        }
    }

}
