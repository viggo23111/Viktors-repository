package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How high is the grass now in CM: ");
        float num1 = scanner.nextFloat();
        System.out.print("How high is the grass allowed to be in CM ");
        float num2 = scanner.nextFloat();
        System.out.println("Amount of days before the grass should be mowed: " + df.format(calculateAmountOfDays(num1,num2)));

	// write your code here

        /*Hvor tit skal græsset slås

Om sommeren vokser græsset ca. 0,8 cm om dagen.

Skriv en metode, der tager imod 2 inputparametre: hvor langt græsset er lige nu og hvor højt det må være for at skulle slås.
Metoden skal beregne og returnere hvor mange dage der er til, at græsset skal slås næste gang.

Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.

1. Græsset skal overstige denne værdi, før vi starter græsslåmaskinen

2. Græsset skal slås, inden værdien overstige.

Du vælger selv hvilken løsning du vil implementere.

Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.

Alle tal, som bliver udskrevet, bør kun have 2 decimaler efter kommaet*/
    }

    public static float calculateAmountOfDays(float num1,float num2){
        float grassGrowInCM =0.8f;
        float cmBetween=num2-num1;
        float amountOfDays=0;
        if (cmBetween<0){
            System.out.println("ERROR please type an smaller number in the current grass length!!!!");
        }
        else {
            amountOfDays=cmBetween/grassGrowInCM;
        }
        return amountOfDays;
    }
}
