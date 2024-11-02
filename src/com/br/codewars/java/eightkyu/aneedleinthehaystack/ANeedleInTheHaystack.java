package com.br.codewars.java.eightkyu.aneedleinthehaystack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANeedleInTheHaystack {

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1));
    }


    public static String findNeedle(Object[] haystack) {
        int position = 0;
        List<Object> list = Arrays.asList(haystack);
        for (int i = 0; i < list.size(); i++){
           position = list.indexOf("needle");
        }
        return "found the needle at position " + position;
    }

}
