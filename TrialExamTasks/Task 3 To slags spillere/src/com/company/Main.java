package com.company;

public class Main {

    public static void main(String[] args) {
        int max= 10;
	// write your code here
        /*Skriv et interface der hedder Spiller,  som indeholder metoden gætEtTal.
         Denne metode tager en int som parameter der angiver hvad det maksimale tal man kan gætte på er
          (dvs hvis vi kalder variablen for max, så kan der gættes på et tal mellem 1 og max).
           Metoden returnerer en int, som er det tal spilleren har gættet på.
Skriv to klasser som implementerer dette interface:
Menneskespiller, hvor brugeren skal indtaste sit gæt som læses med en Scanner.
Computerspiller som gætter på et tilfældigt tal ved brug af Random.

Hvis du har tid …
Skriv en klasse der hedder Gættespil, med en instansvariabel der angiver hvilket tal der skal gættes, som en int der sættes i konstruktøren.
Skriv en metode der hedder tur som tager en Spiller som parameter.
Denne metode skal udskrive i konsollen hvilket tal spilleren gætter på og returnere en boolean der angiver om spilleren gætter på det rigtige tal.
*/
        Menneskespiller menneskespiller = new Menneskespiller();
       // menneskespiller.gætEtTal(max);
        GuessGame guessGame = new GuessGame(5);
        System.out.println(guessGame.turn(menneskespiller));
        Computerspiller computerspiller = new Computerspiller();
        //System.out.println("Computer have guessed: "+computerspiller.gætEtTal(max));
    }
}
