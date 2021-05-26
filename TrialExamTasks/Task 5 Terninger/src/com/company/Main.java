package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        /*Skriv en klasse der hedder Terning med en instansvariabel der repræsenterer det antal øjne som terningen viser.
         Skriv en metode der hedder kast som ændrer værdien af øjnene. Terningen er  6-sidet.
Skriv en klasse der hedder Terningspil, med en metode kaldet terningProdukt som prompter brugeren  for et ønsket produkt,
for derefter at kaste med to terninger indtil det ønskede tal opnås. For hver kast udskrives resultatet på konsollen.

Et eksempel på en kørsel af programmet:
Hvilket produkt vil du have?: 24
3 og 1 = 3
3 og 5 = 15
6 og 1 = 6
3 og 4 = 12
6 og 2 = 12
6 og 4 = 24

Hvis du har tid …
Udvid programmet sådan at der kastes en exception hvis brugeren ønsker et produkt som det ikke er muligt at få med to 6-sidede terninger.
*/
        Terningspil terningspil = new Terningspil();
        terningspil.terningProdukt();
    }
}
