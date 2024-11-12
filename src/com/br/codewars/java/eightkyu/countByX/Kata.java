package com.br.codewars.java.eightkyu.countByX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args) {
        int x = 1;
        int n = 10;
        System.out.println(Arrays.toString(countBy(x,n)));
    }

    public static int[] countBy(int x, int n){
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++){
            resultado[i] = (i + 1) * x;
        }
        return resultado;
    }

}
