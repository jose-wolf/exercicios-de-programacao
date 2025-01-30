package com.br.codewars.java.eightkyu.removeChars;

public class RemoverChars {

    public static void main(String[] args) {
        String caractere = "eloquent";
        String caractere2 = "place";
        System.out.println(remove(caractere));
        System.out.println(remove(caractere2));
    }

    public static String remove(String str) {
        StringBuilder stb = new StringBuilder();
        return stb.append(str).substring(1, str.length() -1);
    }
}