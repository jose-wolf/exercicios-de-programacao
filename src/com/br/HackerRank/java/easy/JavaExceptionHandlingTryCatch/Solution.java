package com.br.HackerRank.java.easy.JavaExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try{
            int firstValue = Integer.parseInt(input.nextLine());
            int secondValue = input.nextInt();

            int result = firstValue/secondValue;
            System.out.println(result);

        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("java.util.InputMismatchException");
        }

        input.close();

    }

}
