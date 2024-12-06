package com.br.codewars.java.eightkyu.drawStairs;

public class Stairs {
    public static void main(String[] args) {
        System.out.println(draw(2));
    }

    public static String draw(int n){
        if(n <= 0) return "";

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(" ".repeat(i)).append("I\n");
        }
        return sb.toString().trim();
    }
}
