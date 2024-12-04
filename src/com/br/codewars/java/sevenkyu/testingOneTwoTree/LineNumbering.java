package com.br.codewars.java.sevenkyu.testingOneTwoTree;

import java.util.*;

public class LineNumbering {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("a");
        list.add("das");
        list.add("");
        System.out.println(number(list));
    }

    public static List<String> number(List<String> lines) {
        List<String> resultado = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            resultado.add((i + 1) + ": " + lines.get(i));
        }
        return resultado;
    }
}

