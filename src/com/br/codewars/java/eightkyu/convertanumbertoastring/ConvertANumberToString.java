package com.br.codewars.java.eightkyu.convertanumbertoastring;

import java.util.Scanner;

public class ConvertANumberToString {

    public static void main(String[] args) {
        int numero = 67;
        int numero2 = 123;
        int numero3 = 999;

        numberToString(numero);
        numberToString(numero2);
        numberToString(numero3);

    }

    public static String numberToString(int num){
        return Integer.toString(num);
    }

}
