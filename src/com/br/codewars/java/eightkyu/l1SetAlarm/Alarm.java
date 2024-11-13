package com.br.codewars.java.eightkyu.l1SetAlarm;

public class Alarm {

    public static void main(String[] args) {
        System.out.println(setAlarm(true,true));
        System.out.println(setAlarm(true,false));
        System.out.println(setAlarm(false,true));
        System.out.println(setAlarm(false,false));
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !(vacation);
    }


}
