package com.br.codewars.java.eightkyu.sumarrays;

public class Teste {

    public static void main(String[] args) {
        double[] testeNumeros1 = new double[]{};
        double[] testeNumeros2 = new double[]{-2.398};
        double[] testeNumeros3 = new double[]{1,2,3};
        double[] testeNumeros4 = new double[]{1.1, 2.2, 3.3};
        double[] testeNumeros5 = new double[]{1, 5.2, 4, 0, -1};
        double[] testeNumeros6= new double[]{30, 89, 100, 101};

        System.out.println(sum(testeNumeros1));
        System.out.println(sum(testeNumeros2));
        System.out.println(sum(testeNumeros3));
        System.out.println(sum(testeNumeros4));
        System.out.println(sum(testeNumeros5));
        System.out.println(sum(testeNumeros6));
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
