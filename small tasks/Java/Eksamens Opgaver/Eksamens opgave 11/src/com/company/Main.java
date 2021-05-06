package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] vowels = { "a", "e", "i", "o", "u" };
        checkStringInArray(vowels,"e");
    }
    /*Søgning

Skriv en metode, der som parametre modtager et array af typen String samt en String.

Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, hvis strengen findes i arrayet og –1 hvis strengen ikke findes i arrayet.

Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du i stedet kaster en exception.*/


    public static void checkStringInArray(String[] stringArray, String s){
        boolean stringInArray = false;
        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals(s)){
                System.out.println("String is in array at index: "+i);
                stringInArray=true;
            }
        }
        if (stringInArray==false){
            System.out.println("String is not in the array!");
        }
    }
}
