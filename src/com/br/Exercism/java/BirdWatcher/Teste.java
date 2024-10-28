package com.br.Exercism.java.BirdWatcher;

import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {

        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};

        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        System.out.println(Arrays.toString(birdWatcher.getLastWeek()));

        System.out.println(birdWatcher.getToday());

        birdsPerDay = new int[]{2, 5, 0, 7, 4, 1};

        BirdWatcher birdCount  = new BirdWatcher(birdsPerDay);

        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday());

        System.out.println(birdCount.hasDayWithoutBirds());

        System.out.println(birdCount.getCountForFirstDays(4));

        System.out.println(birdCount.getBusyDays());

    }

}
