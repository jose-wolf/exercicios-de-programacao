package com.br.codewars.java.sevenkyu.findTheSumOfTheRootsOfAQuadraticEquation;

import java.util.OptionalDouble;

public class Solution {

    public static void main(String[] args) {
        System.out.println((roots(1,-35,-23)));
        System.out.println((roots(6,0,-24)));
        System.out.println((roots(-5,21,0)));
        System.out.println();
        System.out.println((roots(1,3,15)));
        System.out.println((roots(2,2,9)));
        System.out.println((roots(6,4,8)));
    }

    public static OptionalDouble roots(double a, double  b, double c){
        if(b == 0){
            return oneEquationType(a,c);
        }else if (c == 0){
            return secondEquationType(a,b);
        } else if(a != 0 && b != 0 && c != 0){
            return bhaskara(a,b,c);
        }
        if(a == 0) return OptionalDouble.empty();

        return OptionalDouble.empty();
    }

    public static OptionalDouble oneEquationType(double a, double c){
        double resultadoDaEquacao = -c / a;
        double x1 = 0.0;
        double x2 = 0.0;
        double soma = 0;
        if(resultadoDaEquacao < 0){
            return OptionalDouble.empty();
        }else{
            x1 = Math.sqrt(resultadoDaEquacao);
            x2 = -x1;
            soma = x1 +x2;
            return OptionalDouble.of(Double.parseDouble(String.format("%.2f",soma).replace(",",".")));
        }
    }

    public static OptionalDouble secondEquationType(double a, double b){
        double resultadoDaEquacao = -b / a;
        double x1 = 0.0;
        double x2 = 0.0;
        double soma = 0;
        if(a == 0){
            return OptionalDouble.empty();
        }else{
            x2 = -b / a;
            soma = x1 + x2;
            return OptionalDouble.of(Double.parseDouble(String.format("%.2f",soma).replace(",",".")));
        }
    }

    public static OptionalDouble bhaskara(double a,double b, double c){
        if(a == 0 && b == 0 && c == 0){
            return OptionalDouble.empty();
        }
        double delta = (b * b) - 4 * (a * c);
        if (delta < 0) return OptionalDouble.empty();

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        double soma = x1 + x2;
        return OptionalDouble.of(Double.parseDouble(String.format("%.2f",soma).replace(",",".")));
    }
}
