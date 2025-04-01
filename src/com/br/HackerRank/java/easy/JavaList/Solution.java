package com.br.HackerRank.java.easy.JavaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }
        scanner.nextLine();

        int q = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < q; i++) {
            String query = scanner.next();

            if (query.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                addNumber(list,index, value);
                scanner.nextLine();
            } else if (query.equals("Delete")) {
                int index = scanner.nextInt();
                deleteNumber(list,index);
            }
        }
        printList(list);
        scanner.close();
    }

    public static void printList(List<Integer> list){
        for(Integer elements : list){
            System.out.print(elements + " ");
        }
        System.out.println();
    }
    public static void addNumber(List<Integer> list, int index, int number){
        list.add(index,number);
    }

    public static void deleteNumber(List<Integer> list, int index){
        list.remove(index);
    }
}
