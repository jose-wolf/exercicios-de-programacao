package com.br.codewars.java.eightkyu.complementaryDNA;

public class DnaStrand {

    public static void main(String[] args) {

        String dna = "TTTT";
        String complement = DnaStrand.makeComplement(dna);
        System.out.println(complement);

    }

    public static String makeComplement(String dna) {
        StringBuilder complementar = new StringBuilder();
        for (char c : dna.toCharArray()){
            switch (c){
                case 'A': complementar.append('T');
                break;
                case 'T': complementar.append('A');
                    break;
                case 'C': complementar.append('G');
                    break;
                case 'G': complementar.append('C');
                    break;
            }
        }
        return  complementar.toString();
    }

}
