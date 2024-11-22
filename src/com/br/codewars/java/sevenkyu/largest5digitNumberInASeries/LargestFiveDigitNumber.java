package com.br.codewars.java.sevenkyu.largest5digitNumberInASeries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestFiveDigitNumber {

    public static void main(String[] args) {
        System.out.println(solve("2839103"));
        System.out.println(solve("1234567890"));
        System.out.println(solve("731674765"));
    }

    public static int solve(final String digits) {
        List<Integer> numeros = new ArrayList<>();
        int digitosConsecutivos = 5;
        for(int i = 0; i <= digits.length() - digitosConsecutivos; i++){
            String sequencia = digits.substring(i,i + digitosConsecutivos);
            numeros.add(Integer.parseInt(sequencia));
        }
        return Collections.max(numeros);
    }
}
