package com.br.codewars.java.eightkyu.countOfPositivesSumOfNegatives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] input2 = new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};

        System.out.println(Arrays.toString(countPositivesSumNegatives(input)));
        System.out.println(Arrays.toString(countPositivesSumNegatives(input2)));


    }

    public static int[] countPositivesSumNegatives(int[] input) {
        List<Integer> lista = new ArrayList<>(input.length);
        int[] resultado = new int[2];

        for(int elemento : input){
            lista.add(elemento);
            if(elemento == 0){
                lista.remove(Integer.valueOf(elemento));
            }
        }
        resultado[0] = contarPositivos(input);
        resultado[1] = soamrNegativos(input);

        return resultado;
    }

    public static int contarPositivos(int[] input){
        int positivo = 0;
        for(int elemento : input){
            if (elemento > 0){
                positivo++;
            }
        }

        return positivo;
    }


    public static int soamrNegativos(int[] input){
        int soma = 0;
        for(int elemento : input){
            if(elemento < 0){
                soma += elemento;
            }
        }
        return soma;
    }
}
