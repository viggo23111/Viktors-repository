package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculater(100,10);
        /*Regning

Skriv en metode der modtager to heltal som parametre. Såfremt begge tal ligger i intervallet 1-50 (begge tal inklusive)
 skal metoden foretage følgende regneoperationer på tallene:

· Addition

· Subtraktion

· Division

· Multiplikation

og efterfølgende udskrive resultatet af operationerne på skærmen.

· Såfremt et af tallene eller begge tal ikke opfylder betingelsen om at ligge i intervallet 1-50, skal metoden kaste en IllegalArgumentException.*/
    }

    public static void calculater(int a, int b){
        if (a<0 |a>50| b<0 |b>50){
            System.out.println();
            throw new IllegalArgumentException("Numbers are not between 1-50");
        }
        System.out.println("Addition:");
        System.out.println(a + " + "+ b + ":");
        int addition=a+b;
        System.out.println(addition);

        System.out.println("Subtraktion:");
        System.out.println(a + " - " + b + ":");
        int Subtraktion=a-b;
        System.out.println(Subtraktion);

        System.out.println("Division:");
        System.out.println(a + " / "+ b + ":");
        int Division=a/b;
        System.out.println(Division);

        System.out.println("Multiplikation:");
        System.out.println(a + " * "+ b + ":");
        int Multiplikation=a*b;
        System.out.println(Multiplikation);
    }
}
