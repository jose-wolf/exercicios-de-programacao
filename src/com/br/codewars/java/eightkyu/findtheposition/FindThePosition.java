package com.br.codewars.java.eightkyu.findtheposition;

public class FindThePosition {

    public static void main(String[] args) {
        System.out.println(position('j'));

    }

    public static String position(char alphabet){
        alphabet = Character.toLowerCase(alphabet);
        int position = (alphabet - 'a') + 1;
        return "Positon of alphabetic: " + position;
    }
}
