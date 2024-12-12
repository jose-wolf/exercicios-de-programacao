package com.br.codewars.java.eightkyu.doubleChar;

public class Solution {

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }


    public static String doubleChar(String s){
        StringBuilder resultado = new StringBuilder();

        for(char caractere : s.toCharArray()){
            resultado.append(caractere).append(caractere);
        }
        return resultado.toString();
    }

}
