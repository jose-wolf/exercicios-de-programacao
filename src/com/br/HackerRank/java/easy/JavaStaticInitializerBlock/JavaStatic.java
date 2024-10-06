package com.br.HackerRank.java.easy.JavaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStatic {

    static boolean validacao;
    static int B, H;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();


        if(B > 0 && H > 0){
            validacao = true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }

    public static void main(String[] args) {

        if (validacao){
            int area = B * H;
            System.out.println(area);
        }

    }

}
