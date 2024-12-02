package com.br.codewars.java.sevenkyu.maximumProduct;

public class MaxProduct {

    public static void main(String[] args) {

        int[] teste2 = new int[]{1,5,10,9};
        System.out.println(adjacentElementsProduct(teste2));

        int[] teste3 = new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921};
        System.out.println(adjacentElementsProduct(teste3));
    }

    public static int adjacentElementsProduct(int[] array) {
        if(array.length < 2){
            return 0;
        }

        int somaMaiorProduto = Integer.MIN_VALUE;

        for(int i =0 ; i < array.length - 1; i++){
            int produto = array[i] * array[i + 1];
            if(produto > somaMaiorProduto){
                somaMaiorProduto = produto;
            }
        }
        return somaMaiorProduto;
    }

}
