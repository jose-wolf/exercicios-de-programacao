package com.br.Exercism.java.squeakyClean;

public class SqueackClean {

    public static void main(String[] args) {
        String s1 = "my   Id";
        System.out.println(SqueackClean.clean(s1));

        String s2 = "a-bc";
        System.out.println(SqueackClean.clean(s2));

        String s3 = "H3110 W0rld";
        System.out.println(SqueackClean.clean(s3));

        String s4 = "a$#.b";
        System.out.println(SqueackClean.clean(s4));
    }

    public static String clean (String identifier){
        String task1 = identifier.replace(" ","_");

        StringBuilder sb = new StringBuilder();
        boolean capitalazeText = false;
        for(char c : task1.toCharArray()){
            if(c == '-'){
                capitalazeText = true;
            } else if (capitalazeText) {
                sb.append(Character.toUpperCase(c));
                capitalazeText = false;
            }else {
                sb.append(c);
            }
        }

        String task2 = sb.toString();

        String task3 = task2.replace(" ","_")
                            .replace("3","e")
                            .replace("1","l")
                            .replace("4","a")
                            .replace("7","t")
                            .replace("0","o");


        String task4 = task3.replaceAll("[^a-zA-Z0-9\\s]", "");

        return task4;

        // Verificar depois do pq não funcionar as taks correstamente
    }
}
