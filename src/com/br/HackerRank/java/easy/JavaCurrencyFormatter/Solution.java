package com.br.HackerRank.java.easy.JavaCurrencyFormatter;
import java.text.NumberFormat;
import java.util.*;
public class Solution {

    public static void main(String[] args) {

        double value = 12324.134;

        Locale indiaLocale = new Locale("en", "in");
        NumberFormat upaymant = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ipayment  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat cpayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fpayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US:" + upaymant.format(value));
        System.out.println("India:" + ipayment.format(value));
        System.out.println("China:" + cpayment.format(value));
        System.out.println("France:" + fpayment.format(value));
    }

}
