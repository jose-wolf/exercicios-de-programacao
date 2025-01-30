package com.br.codewars.java.eightkyu.booleanToString;

public class BooleanToString {

    public static void main(String[] args) {
        System.out.println(convert(true));
    }

    public static String convert(boolean b){
        return Boolean.toString(b);
    }
}
