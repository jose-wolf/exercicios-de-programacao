package com.br.Beecrowd.java.String.bee2157;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testes = input.nextInt();

        int entrada = input.nextInt();
        int parada = input.nextInt();

       // for(int i = 0; i < testes; i++){


            for(int j = entrada; j <= parada; j++){
                System.out.print(j);
            }

            for(int j = parada -1 ; j >= parada; j--){
                System.out.print(j);
            }
        System.out.println();
        //}


    }
}
