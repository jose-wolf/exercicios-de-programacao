package com.br.HackerRank.JavaEOF;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1;

        while(sc.hasNext()){
            String text = sc.nextLine();
            System.out.println(n + " " + text);
            n++;
        }
        sc.close();
    }

}
