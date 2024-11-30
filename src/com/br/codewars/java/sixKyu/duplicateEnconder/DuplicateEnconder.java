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

    public static String encode(String word){
        StringBuilder resultado = new StringBuilder();
        word = word.toLowerCase();
        for (char caractere : word.toCharArray()){
            if (contarCaracteres(word).containsKey(caractere) && contarCaracteres(word).get(caractere) == 1){
                resultado.append("(");
            } else if (contarCaracteres(word).containsKey(caractere) && contarCaracteres(word).get(caractere) >= 2) {
                resultado.append(")");
            }
        }
        return resultado.toString();
    }

    public static Map<Character, Integer> contarCaracteres(String texto) {
        Map<Character, Integer> contagemCaracteres = new HashMap<>();
        for (char caractere : texto.toCharArray()) {
            contagemCaracteres.put(caractere, contagemCaracteres.getOrDefault(caractere, 0) + 1);
        }
        return contagemCaracteres;
    }
}
