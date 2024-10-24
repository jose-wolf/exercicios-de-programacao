package com.br.Edabit.java.muitofacil;

public class InchesToFeet {

    public static void main(String[] args) {

        System.out.println(inches_to_feet(324));
        System.out.println(inches_to_feet(12));
        System.out.println(inches_to_feet(36));
        
    }


    public static int inches_to_feet(int inches){
        if(inches < 12){
            return 0;
        }else{
            return inches/12;
        }
    }
}
