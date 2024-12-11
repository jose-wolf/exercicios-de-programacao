package com.br.codewars.java.sixKyu.arrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static void main(String[] args) {

        int[] testeA = new int[]{1,2,2};
        int[] testeA2 = new int[]{};
        int[] testeB = new int[]{2};
        int[] testeB2 = new int[]{};
        System.out.println(Arrays.toString(arrayDiff(testeA, testeB)));
        System.out.println(Arrays.toString(arrayDiff(testeA2, testeB2)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> lista = new ArrayList<>();
        for(int num : a){
            lista.add(num);
        }

        for (int numRemover : b){
            lista.removeAll(Arrays.asList(numRemover));
        }

        int[] resultado = new int[lista.size()];

        for(int i = 0; i < lista.size(); i++){
            resultado[i] = lista.get(i);
        }

        return resultado;
    }

}
