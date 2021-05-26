package com.company;

import java.util.Scanner;

public class Menneskespiller implements Player{
    @Override
    public int gætEtTal(int max) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Guess a number betweeen 1 and "+max+": ");
        int guess = scan.nextInt();
        if (guess>max){
            System.out.println("Your guess is higher than the max!");
            return 0;

        }else{
            System.out.println("You have guessed: "+guess);
            return guess;
        }
        /*Denne metode tager en int som parameter der angiver hvad det maksimale tal man kan gætte på er
          (dvs hvis vi kalder variablen for max, så kan der gættes på et tal mellem 1 og max).
           Metoden returnerer en int, som er det tal spilleren har gættet på.
         */
    }
}
