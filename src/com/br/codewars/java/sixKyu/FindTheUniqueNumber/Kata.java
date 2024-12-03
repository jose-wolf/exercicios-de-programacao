package com.br.codewars.java.sixKyu.FindTheUniqueNumber;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    public static void main(String[] args) {
        double[] teste = new double[]{ 0, 0, 0.55, 0, 0 };
        double[] teste2 = new double[]{ 1, 1, 1, 2, 1, 1 };
        double[] teste3 = new double[]{ 1 };

        System.out.println(findUniq(teste));
        System.out.println(findUniq(teste2));
        System.out.println(findUniq(teste3));
    }

    public static double findUniq(double arr[]) {
        if(arr == null || arr.length < 3){
            throw new IllegalArgumentException("Array deve conter pelo menos 3 números!");
        }

        Map<Double, Integer> contagem = new HashMap<>();
        for(double numero : arr){
            contagem.put(numero, contagem.getOrDefault(numero, 0) + 1);
        }
        for (Map.Entry<Double, Integer> numero : contagem.entrySet()){
            if(numero.getValue() == 1){
                return numero.getKey();
            }
        }
        return 0;
    }

}
