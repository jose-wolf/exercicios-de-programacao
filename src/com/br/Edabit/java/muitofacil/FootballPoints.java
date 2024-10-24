package com.br.Edabit.java.muitofacil;

public class FootballPoints {

    public static void main(String[] args) {
        System.out.println(footballpoints(3,4,2));
        System.out.println(footballpoints(5,0,2));
        System.out.println(footballpoints(0,0,1));
    }

    public static int footballpoints(int wins, int draws, int loses){
            return (wins*3) + (draws*1) + (loses*0);
    }

}
