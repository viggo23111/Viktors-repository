package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        checkCapitalWords();
    }
    /*Stort bogstav

Skriv et lille program, der indlæser et antal tekststrenge fra tastaturet og stopper, når der trykkes på <retur>tasten
(dvs. uden at brugeren har skrevet nogen tekst).

Til sidst skal det udskrives på skærmen, hvor mange af de indlæste tekststrenge, som begyndte med et stort forbogstav (A-Z).

Eksempel:

Der var en gang

der var engang

Engang var der

2 tekststrenge begyndte med stort forbogstav*/
    public static void checkCapitalWords() {
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        int capitalStringCounter = 0;

        //While is true as long as if input is not equal to ""
        while (true) {
            System.out.println("Type a word press enter without any text to finish.");
            String inputString = myScanner.nextLine(); // Take whole line
            if (inputString.equals("")) {
                break;
            }
                String[] arr = inputString.split(" ");
                if (Character.isUpperCase(arr[0].charAt(0))) {
                    capitalStringCounter++;
                }
            }
        System.out.println(capitalStringCounter + " tekststrenge begyndte med stort forbogstav");
    }
}
