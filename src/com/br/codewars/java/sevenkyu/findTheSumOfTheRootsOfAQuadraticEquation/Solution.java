package com.br.codewars.java.sevenkyu.findTheSumOfTheRootsOfAQuadraticEquation;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Solution {

    public static void main(String[] args) {
        System.out.println((oneEquationType(6,-24)));
        System.out.println((secondEquationType(-5,21)));
        System.out.println((bhaskara(1,-35,-23)));
    }

    public static OptionalDouble roots(double a, double  b, double c){

        return OptionalDouble.empty();
    }

    public static double oneEquationType(double a, double c){
        double resultadoDaEquacao = -c / a;
        double x1 = 0.0;
        double x2 = 0.0;
        if(resultadoDaEquacao < 0){
            return 0;
        }else{
            x1 = Math.sqrt(resultadoDaEquacao);
            x2 = -x1;

            return x1 + x2;
        }
    }

    public static double secondEquationType(double a, double b){
        double resultadoDaEquacao = -b / a;
        double x1 = 0.0;
        double x2 = 0.0;
        if(a == 0){
            return 0;
        }else{
            x2 = -b / a;
            return x1 + x2;
        }
    }

    
}
