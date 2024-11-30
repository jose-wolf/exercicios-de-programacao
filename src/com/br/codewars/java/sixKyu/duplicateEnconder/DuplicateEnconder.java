package com.br.codewars.java.sixKyu.duplicateEnconder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEnconder {

    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
        System.out.println(encode("   ()(   "));
        System.out.println(encode("Prespecialized"));
    }

    

    public static Map<Character, Integer> contarCaracteres(String texto) {
        Map<Character, Integer> contagemCaracteres = new HashMap<>();
        for (char caractere : texto.toCharArray()) {
            contagemCaracteres.put(caractere, contagemCaracteres.getOrDefault(caractere, 0) + 1);
        }
        return contagemCaracteres;
    }
}
