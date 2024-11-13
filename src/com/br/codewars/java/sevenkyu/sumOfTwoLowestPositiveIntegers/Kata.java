package com.br.codewars.java.sevenkyu.sumOfTwoLowestPositiveIntegers;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        long[] array = new long[]{19, 5, 42, 2, 77};
        System.out.println(sumTwoSmallestNumbers((array)));

        long[] array2 = new long[]{15, 28, 4, 2, 43};
        System.out.println(sumTwoSmallestNumbers((array2)));

        long[] array3 = new long[]{23, 71, 33, 82, 1};
        System.out.println(sumTwoSmallestNumbers((array3)));


    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        long menor1 = numbers[0];
        long menor2 = numbers[1];
        return menor1 + menor2;
    }
}
