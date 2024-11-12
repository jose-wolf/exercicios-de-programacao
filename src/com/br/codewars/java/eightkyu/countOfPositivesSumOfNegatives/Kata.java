package com.br.codewars.java.eightkyu.countOfPositivesSumOfNegatives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] input2 = new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};

        System.out.println(Arrays.toString(soamrNegativos(input)));
        System.out.println(Arrays.toString(soamrNegativos(input2)));

    }



    public static int[] soamrNegativos(int[] input){
        int soma = 0;
        for(int elemento : input){
            if(elemento < 0){
                soma += elemento;
            }
        }
        int[] resultado = new int[1];
        resultado[0] = soma;
        return resultado;
    }
}
