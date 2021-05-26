package com.company;

public class Main {

    public static void main(String[] args) {
        ProvisionsMedarbejder provisionsMedarbejder = new ProvisionsMedarbejder(30000,50000,20);
        System.out.println("Provisions Medarbejder");
        System.out.println(provisionsMedarbejder.calculateSalary());

        System.out.println("Time lønnet Medarbejder");
        TimelønnetMedarbejder timelønnetMedarbejder = new TimelønnetMedarbejder(200,200);
        System.out.println(timelønnetMedarbejder.calculateSalary());

        System.out.println("Fast løn Medarbejder");
        FastLønMedarbejder fastLønMedarbejder = new FastLønMedarbejder(40000);
        System.out.println(fastLønMedarbejder.calculateSalary());


        // write your code here
        /*1.        Lønberegning

Skriv et program, som beregner løn for medarbejdere.
1.
Skriv et interface Betaling med metoden: public double beregnLøn()

2.
Skriv tre klasser, som implementerer interfacet.

Klassen FastLønMedarbejder har flg. attribut:
•       månedsløn

Lønberegning er enkel, idet denne type medarbejder får fast månedsløn.


Klassen TimelønnetMedarbejder har flg. attributter:
•       antal timer
•       timeløn

Lønberegning er antal timer ganget med timelønnen.


Klassen ProvisionsMedarbejder har flg. attributter:
•       grundløn
•       salg
•       provision (procentsats)

Lønberegning er grundløn plus provision af medarbejderens salg.
Eksempel: Grundløn 20000 kr. Salg 10000 kr. Provision 20% giver en løn på 22000kr.
*/
    }
}
