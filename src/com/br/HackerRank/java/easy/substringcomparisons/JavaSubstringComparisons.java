package com.br.HackerRank.java.easy.substringcomparisons;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));

        sc.close();
    }

    public static String getSmallestAndLargest(String s, int k){

        String smallest = "";
        String largest = "";

        smallest = largest = s.substring(0,k);

        for(int i = 1; i <= s.length() - k; i++){
            String currentSubstring = s.substring(i,i + k);
            if(currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
            if(currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }
        }
        return smallest + "\n" + largest;
    }
}
