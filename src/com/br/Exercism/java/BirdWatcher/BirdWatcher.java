package com.br.Exercism.java.BirdWatcher;

import java.util.Arrays;

public class BirdWatcher {

    public final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public int[] getLastWeek(){
        return birdsPerDay;
    }

    public int getToday(){
        if (birdsPerDay.length==0){
            return 0;
        }
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < numberOfDays && i < birdsPerDay.length;i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for(int busy : birdsPerDay){
            if (busy >= 5){
                sum++;
            }
        }
        return sum;
    }

}
