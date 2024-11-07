package com.br.HackerRank.java.easy.Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        boolean ret = isAnagram(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams");

        sc.close();
    }


    public static boolean isAnagram(String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        String aSorted = new String(aArray);
            String bSorted = new String(bArray);

        return aSorted.equals(bSorted);
    }
}