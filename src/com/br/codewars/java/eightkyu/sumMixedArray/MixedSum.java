package com.br.codewars.java.eightkyu.sumMixedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MixedSum {

    public static void main(String[] args) {

        List list = Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7);

        System.out.println(sum(list));

    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        List<Integer> numbers = convertStringInNumber(mixed);
        for (Integer number : numbers){

            sum += number;

        }
        return sum;
    }

    public static List<Integer> convertStringInNumber(List<?> mixed){


        List<Integer> listNumber = new ArrayList<>();
        for (Object item : mixed){
            if (item instanceof String){
                listNumber.add(Integer.parseInt((String) item));
            } else if (item instanceof Integer) {
                listNumber.add((Integer) item);
            }
        }

        return listNumber;
    }


}
