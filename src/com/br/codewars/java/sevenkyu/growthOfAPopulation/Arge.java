package com.br.codewars.java.sevenkyu.growthOfAPopulation;

public class Arge {

    public static void main(String[] args) {
        int p0 = 1000;
        double percent = 2;
        int aug = 50;
        int p = 1200;

        System.out.println(nbYear(p0,percent,aug,p));
    }


    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        double newPercent = percent /100;
        int population = p0;
        while(population < p){
            population += population * newPercent + aug;
            year++;
        }
        return year;
    }
}
