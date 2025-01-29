package com.br.Beecrowd.java.String.bee1278;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            int n = input.nextInt();
            input.nextLine();

            if(n == 0) break;

            ArrayList<String> textos = new ArrayList<>();

            int maiorPalavra = 0;
            for(int i = 0; i < n;i++){
                String linha = input.nextLine().trim();
                textos.add(linha);
                String[] palavras = linha.split("\\s");
                for (String palavra: palavras){
                    maiorPalavra = Math.max(maiorPalavra, palavra.length());
                }
            }

            for (String linha : textos){
                System.out.println(String.format("%" + maiorPalavra + "s", linha));
            }
            System.out.println();
        }
    }


}
