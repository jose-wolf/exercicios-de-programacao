package com.br.Exercism.java.languageList;

public class Teste {

    public static void main(String[] args) {

        LanguageList languageList = new LanguageList();

        System.out.println(languageList.isEmpty());

        System.out.println();

        languageList.addLanguage("python");
        languageList.addLanguage("Java");
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("JavaScript");

        for(String linguagens: languageList.getLanguages()){
            System.out.println(linguagens);
        }

        System.out.println();

        languageList.removeLanguage("JavaScript");

        for(String linguagens: languageList.getLanguages()){
            System.out.println(linguagens);
        }

        System.out.println();
        System.out.println(languageList.firstLanguage());


        System.out.println(languageList.count());

        System.out.println(languageList.containsLanguage("Java"));

        System.out.println(languageList.isExciting());
    }

}
