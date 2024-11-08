package com.br.codewars.java.eightkyu.reversedSequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedSequence {

    public static void main(String[] args) {

        int number = 5;
        int[] reverse = reverse(number);
        for (int numero : reverse){
            System.out.print(numero + " ");
        }
    }

    public static int[] reverse(int n){
        int[] resultedoReverso = new int[n];
        for (int i = n; i >  0; i--){
            resultedoReverso[n - i] = i;
        }


        return resultedoReverso;
    }

}
