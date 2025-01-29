package com.br.Beecrowd.java.easy.bee1013;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] numeros = new Integer[3];

        for(int i = 0; i < 3; i++){
            numeros[i] = sc.nextInt();
        }

        int maior = Collections.max(Arrays.asList(numeros));
        System.out.println(maior + " eh o maior");

    }

}
