package com.br.HackerRank.java.easy.StringReverse;

public class StringReverse {

    public static void main(String[] args) {
        String input = "java";

        if (comparaStrings(input) == false){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }


    public static boolean comparaStrings(String str){

        str = str.replaceAll("[\\W]", "");

        if(str.length() > 50){
            return false;
        }

        String stb = new StringBuilder(str).reverse().toString();

        return str.equals(stb);
    }

}
