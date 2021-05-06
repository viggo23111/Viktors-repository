package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sortArray();

        /*Sortering
        Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen
         i alfabetisk faldende orden på skærmen.

        Hvis der indlæses:abekat musefælde ananas slut solskin skal der udskrives følgende på skærmen:

        solskin slut musefælde ananas abekat*/
    }

    public static void sortArray(){
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        int amountOfWords = 5;
        String[] stringArr = new String[amountOfWords];
        for (int i = 0; i < amountOfWords; i++) {
            System.out.println("Type a word");
            String inputString = myScanner.nextLine(); // Take whole line
            stringArr[i] = inputString;
        }
        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j < stringArr.length; j++) {
            for (int i = j + 1; i < stringArr.length; i++) {
                // comparing adjacent strings
                if (stringArr[i].compareTo(stringArr[j]) > 0) {
                    temp = stringArr[j];
                    stringArr[j] = stringArr[i];
                    stringArr[i] = temp;
                }
            }
            System.out.println(stringArr[j]);
        }
    }
}
