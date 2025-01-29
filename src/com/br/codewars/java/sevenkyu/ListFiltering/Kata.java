package com.br.codewars.java.sevenkyu.ListFiltering;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2.5);
        list.add(-2.5);
        list.add(2.1324);
        list.add("adsa");
        list.add("312");

        List<Object> filterList = filterList(list);

        System.out.println(filterList);

    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>();

        for(Object lista : list){
            if(lista instanceof  Integer){
                Integer number = (Integer) lista;

                if(number >= 0) result.add(lista);
            }
        }
        return result;
    }
}
