package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(min(4, 2, 3));
        printEvenNumbers(10);
        System.out.println();
        System.out.println(smallestAbsVal(-10, 20, 30));
        reverseVertical("laptop");
        // processName();
        repeatString("hej");
       // shortestName(3);
        randomNumbers();
        maxMin();
        printMultiple(5);
        int[] listOfnumbers = {1, 2, 3, 4, 10};
        System.out.println(max(listOfnumbers));

        int[] a = {1,1,1,1};
        int[] b = {2,2,2,2};
        System.out.println(allLess(a,b));
    }


    //Opgave 1
    //Skriv en metode der hedder min som tager tre integers som parametre og returnerer den mindste af de tre værdier.
    //For eksempel vil et kald til min (3, -2, 7) returnere -2, og et kald til min(19, 27, 6) returnere 6.
    //Brug Math.min i din løsning.
    private static int min(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        return smallest;
    }

    //    Opgave 2
//    Skriv en metode der hedder printEvenNumbers som tager et maximum nummer som argument og udskriver hvert lige tal fra 2
//    og op til dette maximum, inklusiv, og omkranset af curly braces. For eksempel vil disse kald:
//    printEvenNumbers(8);
//    printEvenNumbers(12);
//    udskrive følgende:
//    {2}  {4}  {6}  {8}
//    {2}  {4}  {6}  {8}  {10}  {12}
//    Du kan gå ud fra at den værdi der gives til printEvenNumbers har en værdi af 2 eller mere.
    private static void printEvenNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.print(" {" + i + "} ");
            }
        }
    }
//    Opgave 3
//    Skriv en metode der hedder smallestAbsVal der tager tre ints som parametre og returnerer den mindste af de tres absolutte værdier.
//    For eksempel vil et kald til smallestAbsVal(1, 9, -11) returnere 1, og et kald til smallestAbsVal(-8, 2, 12) returnere 2.

    private static int smallestAbsVal(int a, int b, int c) {
        int smallest = 0;
        if (a < 0) {
            smallest = Math.min(b, c);
        } else if (b < 0) {
            Math.min(a, c);
        } else if (c < 0) {
            Math.min(a, b);
        } else {
            smallest = Math.min(a, Math.min(b, c));
        }
        return smallest;
    }

//    Opgave 4
//    Skriv en metode der hedder sumDigits som returnerer summen af den absolutte  værdi af en integers cifre.
//    For eksempel vil et kald til sumDigits(931) returnere 13 og et kald til sumDigits(-99) returnere 18.


    //    Opgave 5
//    Skriv en metode der hedder reverseVertical som tager en String som parameter og udskriver hvert bogstav på en separat linje,
//    i omvendt rækkefølge. For eksempel vil et kald til reverseVertical(”laptop”) udskrive følgende:
//    potpal
    private static void reverseVertical(String text) {
        for (int i = text.length(); i > 0; --i) {
            System.out.println(text.charAt(i - 1));
        }
    }

    //    Opgave 6
//    Skriv en metode som hedder processName som tager en Scanner som parameter og prompter brugeren til at skrive sit fulde navn,
//    og som derefter udskriver navnet med store bogstaver. Her er et eksempel på en brugerdialog:
//    Skriv venligst dit fulde navn: Lille Lise
//    Navnet med store bogstaver: LILLE LISE System.out.println("Type anything and the scanner will take that input and print it");
    private static void processName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv venligst din fulde navn: ");
        String textInput = scan.next();
        String textInputUpper = textInput.toUpperCase();
        System.out.println("Navnet med store bogstaver: " + textInputUpper);
    }


    //      Opgave 7
//      Skriv en metode der hedder repeat som tager en String som parameter,
//      beregner dens længde og returnerer en String der er concatenated længdens gange.
//      For eksempel vil kaldet repeat(”Hej”) returnere ”HejHejHej”. Hvis inputtet er en tom streng skal metoden også returnere en tom streng.
    private static void repeatString(String s) {
        String result = s;
        for (int i = 0; i < s.length() - 1; i++) {
            result = result + s;
        }
        System.out.println(result);
    }

    //    Opgave 8
//    Skriv en metode der hedder shortestName som tager en Scanner samt en int n som parametre,
//    og prompter brugeren for n navne, for derefter at udskrive det korteste navn (det der indeholder færrest bogstaver), for eksempel således:
//    Navn #1? Kaj
//    Navn #2? Andrea
//    Navn #3? Povl
//    Navn #4? Keld
//    Kaj er det korteste navn.
    private static void shortestName(int n) {
        ArrayList<String> namesList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <n+1; i++) {
            System.out.println("Navn "+"#"+i+"?");
            String inputString = input.nextLine();
            namesList.add(inputString);
        }
        String smallest = namesList.get(0);
        for (int i = 1; i < namesList.size(); i++) {
            if (namesList.get(i).length() < smallest.length()) {
                smallest = namesList.get(i);
            }
        }
        System.out.println(smallest+" er det korteste navn.");
    }

    //    Opgave 9
//    Skriv en metode kaldet randomNumbers som indeholder et do/while loop der gentagne gange udskriver tilfældige tal mellem 0 og 1000
//    indtil et nummer over 900 udskrives. Der skal mindst skrives én linje, selv om det første nummer er over 900. Her er et eksempel:
//    Random number: 235
//    Random number: 15
//    Random number: 810
//    Random number: 147
//    Random number: 915
    private static void randomNumbers() {
        int max = 1000;
        int min = 0;
        int range = max - min + 1;
        int endLoop = 0;
        while (endLoop < 900) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println("Random number: " + rand);
            endLoop = rand;
        }
    }
//    Opgave 10
//    Skriv en metode maxMin med et såkaldt sentinel loop som gentagne gange prompter brugeren til at taste et tal,
//    og når tallet -1 (sentinel) bliver tastet viser maximum og minimum af de tal brugeren indtastede. Her er et eksempel:
//    Skriv et tal (eller -1 for at afslutte): 5
//    Skriv et tal (eller -1 for at afslutte): 2
//    Skriv et tal (eller -1 for at afslutte): 17
//    Skriv et tal (eller -1 for at afslutte): 8
//    Skriv et tal (eller -1 for at afslutte): -1
//    Maximum var 17
//    Minimum var 2

    private static void maxMin() {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        System.out.println("Skriv et tal (eller -1 for at afslutte):");
        Scanner input = new Scanner(System.in);
        int firstInput =input.nextInt();
        int n;
        numberList.add(firstInput);
            while ((n=input.nextInt()) >-2 ) {
                if (input.nextInt() == -1) {
                    System.out.println("Min: " + Collections.min(numberList));
                    System.out.println("Max: " + Collections.max(numberList));
                    break;
                } else {
                    numberList.add(n);
                }
            }
    }


//    Opgave 11
//    Skriv en metode kalde printMultiple der tager en integer som parameter og bruger et såkaldt fencepost loop til at udskrive de første 10 gange af tallet,
//    separeret med ordet ”og”. For eksempel vil et kald til metoden med tallet 5 give følgende:
//    5 og 10 og 15 og 20 og 25 og 30 og 35 og 40 og 45 og 50

    private static void printMultiple(int a) {
        int newA = a;
        for (int i = 0; i < 10; i++) {
            System.out.print(newA + " og ");
            newA = newA + a;
        }
        System.out.println();
    }


//    Opgave 12
//    Skriv en metode der hedder max og som tager et array af integers som parameter og returnerer den største værdi i arrayet.
//    Du kan gå ud fra at arrayet indeholder mindst et element.

    private static int max(int[] listofNumbers) {
        int result = listofNumbers[0];
        for (int i = 1; i < listofNumbers.length; ++i) {
            if (result < listofNumbers[i]) result = listofNumbers[i];
        }
        return result;
    }


    //    Opgave 13
//    Skriv en metode kaldet allLess der tager to arrays som parametre og returnerer true
//    hvis hvert element i det første array er mindre end elementet på samme index i det andet array.
//    Metoden returnerer false hvis arraysne ikke er lige lange.
    private static boolean allLess(int[] a, int[] b) {
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }
        return true;
    }
}

