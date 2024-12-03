package com.br.codewars.java.eightkyu.calculateAverage;

public class Kata {

    public static void main(String[] args) {
        int[] teste = new int[]{1,1,1};
        int[] teste2 = new int[]{1,2,3};

        System.out.println(find_average(teste));
        System.out.println(find_average(teste2));

    }

    public static double find_average(int[] array){
        if(array.length < 0) return 0;

        double soma = 0.0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma / array.length;
    }

}
