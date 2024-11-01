package com.br.codewars.java.eightkyu.sumarrays;

public class SumArrays {

    public static void main(String[] args) {
        double[] testeNumeros = new double[]{1, 5.2, 4, 0, -1};
        double[] testeNumeros2 = new double[]{-2.398};
        double[] testeNumeros3 = new double[]{};

        System.out.println(sum(testeNumeros));
        System.out.println(sum(testeNumeros2));
        System.out.println(sum(testeNumeros3));
    }

    public static double sum(double[] numbers) {
        double sum = 0.0;
        if(numbers == null){
            return 0;
        }

        for(double somas: numbers){
            sum += somas;
        }

        return sum;
    }

}
