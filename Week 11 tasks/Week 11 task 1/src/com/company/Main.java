/*
FORMÅL: At kunne redesigne ved at skifte standard datatyper ud med egne klasser
OPGAVEN: Der er fem delopgaver.
1) I main skal man lave et hundeobjekt med navn og ejer
2) Modificér hunde-klassen så den kan fodres. Den skal derfor have en boolean
attribut - isHungry - som skal initialiseres til true. Lav en metode - feedDog -
som tager hensyn til om hunden er sulten. Husk at sætte hunden til mæt når den
er blevet fodret.
3) Modificér hunde-klassen så den kan få hvalpe. Dvs indfør en attribut a la:
private String[] offSpring;
Konstruktøren skal initialisere offSpring med en bestemt længde.
Tilføj nu en getter og en setter. Setter-metoden skal sørge for at fylde
offSpring fra neden - dvs tjek hvor de tomme pladser starter. Dernæst skal den
også tage højde for at hunden faktisk kan få flere hvalpe end først antaget i
konstruktøren (så noget med at bruge Arrays.copyOf-metoden hvis det oprindelige
array er fyldt op)
*/
package com.company;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.addOffSpring("woodiesnoopie");
        myDog.addOffSpring("woodiesfido");

        // print alle hvalpe
        myDog.getOffSprings();

        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);
    }

}