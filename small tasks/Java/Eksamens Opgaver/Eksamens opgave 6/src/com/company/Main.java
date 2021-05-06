package com.company;

import java.util.ArrayList;

public class Main {
    private static ArrayList<String> words = new ArrayList<>();
    public static void main(String[] args) {

        // Proper case
        wordScanner("hallo med dig GamlE VEN");
        for (String s : words) {
            System.out.println(s);
        }
	// write your code here

        /*Proper case

Skriv en metode, der tager imod en sætning af ord med blanktegn imellem. Sætningen ændres efter følgende regler:

· Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.

· Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.

· Ord på max. 3 bogstaver skal skrives med småt.

Metoden skal returnere den ændrede sætning.

· Inddrag fejlhåndtering (Hvordan vil du f.eks. håndtere en null-string som input?*/
    }

    public static void wordScanner(String sentence) {
        String[] tempWords;;
        tempWords=sentence.split(" ");
        for (String s : tempWords) {
            words.add(convertWord(s));
        }
    }

    public static String convertWord(String word) {
        String tempWord = word;
        if (!word.toUpperCase().equals(word)) {
            if (word.length() > 3) {
                tempWord = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            if (word.length() <= 3) {
                tempWord = word.toLowerCase();
            }
        }
        return tempWord;
    }
}
