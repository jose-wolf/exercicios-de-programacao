package com.br.codewars.java.sevenkyu.isograms;

import java.util.HashSet;
import java.util.Set;

public class isogram {

    public static void main(String[] args) {
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram(""));
    }

    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        Set<Character> caracteresEncontrados = new HashSet<>();

        for (char letra : str.toCharArray()){
            if(!caracteresEncontrados.add(letra)){
                return false;
            }
        }
        return true;
    }
}

