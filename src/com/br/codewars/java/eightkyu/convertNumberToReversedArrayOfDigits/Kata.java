package com.br.codewars.java.eightkyu.convertNumberToReversedArrayOfDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitize(0)));
    }

    public static int[] digitize(long n) {

        String numeroStr = String.valueOf(n);
        List<String> digitos = Arrays.asList(numeroStr.split(""));
        Collections.reverse(digitos);

        return digitos.stream()
                .mapToInt(Integer::parseInt)
                .toArray();

    }

}
