package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        combineStringsAndReplaceChar("", "String2",'r','x');
    }
    /*Strenge

Skriv en metode, der som parametre modtager to strenge og to tegn (typen char).

Metoden skal gøre følgende:

· sætte de to inputstrenge sammen

· udskifte alle tegn i den sammensatte streng, som matcher det første inputtegn med det andet inputtegn og returnere det nye strengindhold

· Inddrag fejlhåndtering (hvordan vil du fx håndtere en tom streng som input)*/

    public static void combineStringsAndReplaceChar(String s1, String s2, char c1, char c2){
        if (s1=="" || s2==""){
            Scanner myScanner = new Scanner(System.in); // Make scanner obj
            System.out.println("One of the strings is empty!! ");
            System.out.println("Do you want to proceed with the replacement: y/n");
            String input = myScanner.nextLine(); // Take whole line
            if (input.toLowerCase().equals("y")){
                String combinedString = s1 + " " + s2;
                String replacedString = combinedString.replace(c1, c2);
                System.out.println(replacedString);
            }else if (input.toLowerCase().equals("n")){
                System.out.println("Program will close... ");
            }else{
                System.out.println("Wrong input !!!!");
                combineStringsAndReplaceChar(s1,s2,c1,c2);
            }
        }else {
            String combinedString = s1 + " " + s2;
            String replacedString = combinedString.replace(c1, c2);
            System.out.println(replacedString);
        }
    }
}
