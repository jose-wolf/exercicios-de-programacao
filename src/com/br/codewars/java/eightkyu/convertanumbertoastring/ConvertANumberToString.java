package com.br.codewars.java.eightkyu.convertanumbertoastring;

import java.util.Scanner;

public class ConvertANumberToString {

    public static void main(String[] args) {
        int numero = 67;
        int numero2 = 123;
        int numero3 = 999;

        if (numberToString(numero).equals("67"))
            System.out.println("Convertido");

        if ("123".equals(numberToString(123)))
            System.out.println("Convertido");

        if ("999".equals(numberToString(999)))
            System.out.println("Convertido");

    }

    public static String numberToString(int num){
        return Integer.toString(num);
    }

}
