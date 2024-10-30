package com.br.Exercism.java.calculatorconundrum;

public class Teste {

    public static void main(String[] args) {

        CalculatorConundrum calculatorConundrum = new CalculatorConundrum();

        System.out.println(calculatorConundrum.calculate(16,51,"+"));
        System.out.println(calculatorConundrum.calculate(32,6,"*"));
        System.out.println(calculatorConundrum.calculate(512,4,"/"));

        System.out.println();

        System.out.println(calculatorConundrum.calculate(10,1,null));
        System.out.println(calculatorConundrum.calculate(10,1,""));
        System.out.println(calculatorConundrum.calculate(10,1,"-"));

        System.out.println();
        System.out.println(calculatorConundrum.calculate(33,0,"/"));
    }

}
