package com.br.Beecrowd.java.easy.bee1014;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distancia = Double.parseDouble(sc.next());
        double combustivelGasto =  Double.parseDouble(sc.next());

        double percursso = distancia / combustivelGasto;

        System.out.printf("%.3f km/l\n",percursso);

        sc.close();


    }

}
