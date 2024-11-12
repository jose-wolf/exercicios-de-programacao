package com.br.codewars.java.eightkyu.calculateBMI;

public class Calculate {

    public static void main(String[] args) {
        double weight = 80;
        double height = 1.80;

        System.out.println(bmi(weight,height));
    }

    public static String bmi(double weight, double height) {
        double resultado = weight/ (height * height);
        if(resultado <= 18.5){
            return "Underweight";
        }else if(resultado <= 25.0){
            return "Normal";
        } else if (resultado <= 30.0) {
            return "Overweight";
        }else if (resultado > 30){
            return "Obese";
        }
        return String.format("%.2f",resultado);
    }
}
