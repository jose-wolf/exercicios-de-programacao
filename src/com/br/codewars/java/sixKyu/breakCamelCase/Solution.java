package com.br.codewars.java.sixKyu.breakCamelCase;

public class Solution {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("camelcasingtest"));
        System.out.println(camelCase(""));
    }

    public static String camelCase(String input) {
        if(input.isEmpty()){
            return "";
        }
        StringBuilder resultado = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)){
                resultado.append(" ");
            }
            resultado.append(c);
        }
        return resultado.toString();
    }

}
