package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        drawSquare(20, "* ");

        /*Kvadrat
Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
I det følgende eksempel er tallet 6 modtaget som parameter til metoden:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
· Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen
· Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et negativt heltal eller et meget stort heltal som ikke kan printes på én linje)*/
    }

    public static void drawSquare(int amount, String sign) {
        int max = 20;
        if (amount < 0) {
            System.out.println("NEGATIVE NUMBER");
            return;
        }
        if (amount > max) {
            System.out.println("OVER MAX NUMBER");
            return;
        }
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}
