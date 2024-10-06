package com.br.HackerRank.java.easy.JavIntToString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        try {
            String s = Integer.toString(n);
            System.out.println("Good job");
        }catch(InputMismatchException e){
            System.out.println("Wrong answer");
        }

        }

}
