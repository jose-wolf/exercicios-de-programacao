package com.br.codewars.java.eightkyu.neverVisitA;


import java.util.HashMap;
import java.util.Map;

public class NeverVisitA {

    public static void main(String[] args) {
        System.out.println(subtractSum(10));
    }

    public static String subtractSum(int n){
        Map<Integer,String> frutas = listaFrutas();

        int subtraction = sumOfDigits(n);
        while (!frutas.containsKey(subtraction)){
            n = subtraction;
            subtraction = sumOfDigits(n);
        }
        return frutas.get(subtraction);
    }

    public static int sumOfDigits (int n){

        int sum = 0;
        int sub = 0;
        String numeroString = String.valueOf(n);
        char[] digitos = numeroString.toCharArray();
        for (char digito : digitos){
            sum += Character.getNumericValue(digito);
        }
        sub = sum;

        int subtraction = n - sub;
        return subtraction;
    }

    public static Map<Integer,String> listaFrutas(){
        HashMap<Integer,String> frutas = new HashMap<>();

        frutas.put(1, "kiwi");
        frutas.put(2, "pear");
        frutas.put(3, "kiwi");
        frutas.put(4, "banana");
        frutas.put(5, "melon");
        frutas.put(6, "banana");
        frutas.put(7, "melon");
        frutas.put(8, "pineapple");
        frutas.put(9, "apple");
        frutas.put(10, "pineapple");
        frutas.put(11, "cucumber");
        frutas.put(12, "pineapple");
        frutas.put(13, "cucumber");
        frutas.put(14, "orange");
        frutas.put(15, "grape");
        frutas.put(16, "orange");
        frutas.put(17, "grape");
        frutas.put(18, "apple");
        frutas.put(19, "grape");
        frutas.put(20, "cherry");
        frutas.put(21, "pear");
        frutas.put(22, "cherry");
        frutas.put(23, "pear");
        frutas.put(24, "kiwi");
        frutas.put(25, "banana");
        frutas.put(26, "kiwi");
        frutas.put(27, "apple");
        frutas.put(28, "melon");
        frutas.put(29, "banana");
        frutas.put(30, "melon");
        frutas.put(31, "pineapple");
        frutas.put(32, "melon");
        frutas.put(33, "pineapple");
        frutas.put(34, "cucumber");
        frutas.put(35, "orange");
        frutas.put(36, "apple");
        frutas.put(37, "orange");
        frutas.put(38, "grape");
        frutas.put(39, "orange");
        frutas.put(40, "grape");
        frutas.put(41, "cherry");
        frutas.put(42, "pear");
        frutas.put(43, "cherry");
        frutas.put(44, "pear");
        frutas.put(45, "apple");
        frutas.put(46, "pear");
        frutas.put(47, "kiwi");
        frutas.put(48, "banana");
        frutas.put(49, "kiwi");
        frutas.put(50, "banana");
        frutas.put(51, "melon");
        frutas.put(52, "pineapple");
        frutas.put(53, "melon");
        frutas.put(54, "apple");
        frutas.put(55, "cucumber");
        frutas.put(56, "pineapple");
        frutas.put(57, "cucumber");
        frutas.put(58, "orange");
        frutas.put(59, "cucumber");
        frutas.put(60, "orange");
        frutas.put(61, "grape");
        frutas.put(62, "cherry");
        frutas.put(63, "apple");
        frutas.put(64, "cherry");
        frutas.put(65, "pear");
        frutas.put(66, "cherry");
        frutas.put(67, "pear");
        frutas.put(68, "kiwi");
        frutas.put(69, "pear");
        frutas.put(70, "kiwi");
        frutas.put(71, "banana");
        frutas.put(72, "apple");
        frutas.put(73, "banana");
        frutas.put(74, "melon");
        frutas.put(75, "pineapple");
        frutas.put(76, "melon");
        frutas.put(77, "pineapple");
        frutas.put(78, "cucumber");
        frutas.put(79, "pineapple");
        frutas.put(80, "cucumber");
        frutas.put(81, "apple");
        frutas.put(82, "grape");
        frutas.put(83, "orange");
        frutas.put(84, "grape");
        frutas.put(85, "cherry");
        frutas.put(86, "grape");
        frutas.put(87, "cherry");
        frutas.put(88, "pear");
        frutas.put(89, "cherry");
        frutas.put(90, "apple");
        frutas.put(91, "kiwi");
        frutas.put(92, "banana");
        frutas.put(93, "kiwi");
        frutas.put(94, "banana");
        frutas.put(95, "melon");
        frutas.put(96, "banana");
        frutas.put(97, "melon");
        frutas.put(98, "pineapple");
        frutas.put(99, "apple");
        frutas.put(100, "pineapple");

        return frutas;
    }
}


