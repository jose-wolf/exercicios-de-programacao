package com.br.HackerRank.java.easy.JavaStringTokens;

public class Solution {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";
        if(s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] arrayString = s.split("[^a-zA-Z]+");
        System.out.println(arrayString.length);
        for (String text : arrayString){
            System.out.println(text);
        }
    }

}
