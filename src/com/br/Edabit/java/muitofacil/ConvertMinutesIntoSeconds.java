package com.br.Edabit.java.muitofacil;

public class ConvertMinutesIntoSeconds {

    public static void main(String[] args) {

        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));


    }


    public static int convert(int minutes){
        return minutes * 60;
    }

}
