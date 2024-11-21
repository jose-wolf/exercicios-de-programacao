package com.br.codewars.java.eightkyu.convertAStringToAnArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Eae meu truta")));
    }

    public static String[] stringToArray(String s) {
        String[] novaString = s.split(" ");
        return novaString;
    }

}
