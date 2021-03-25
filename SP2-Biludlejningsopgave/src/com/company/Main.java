package com.company;

public class Main {
    /*
   Biludlejningsopgave
I skal lave et system til en biludlejningsvirksomhed. Der skal være følgende klasser:
1. Bil. En bil har attributterne regNr, mærke, model, årgang, antalDøre. Klassen er abstrakt.
2. Benzinbil. Denne klasse nedarver fra Bil og har desuden attributterne oktantal og kmPrL.
3. Dieselbil. Denne klasse nedarver fra Bil og har desuden attributterne har Partikelfilter og kmPrL.
4. Elbil. Denne klasse nedarver fra Bil og har desuden attributterne batterikapacitetKWh, maxKm og
whPrKm.
Alle 4 bilklasser skal have gettere og settere, samt en konstruktør.
Benzinbil, Dieselbil og Elbil skal override toString-metoden.
I Bil-klassen skal der være en abstrakt metode der hedder beregnGrønEjerafgift(), som returnerer en
double. Alle de 3 subklasser skal implementere denne metode, på følgende måder:
1. For en Benzinbil er afgiften afhængig af kmPrL. Hvis den er mellem 20 og 50 er den 330kr, mellem
15 og 20 er den 1050 kr, mellem 10 og 15 er den 2340kr, mellem 5 og 10 er den 5500kr, og under 5
er den 10470kr.
2. For en Elbil gælder de samme regler som for benzinbilen, blot skal man først omregne whPrKm til
kmPrL. Det udregnes således: 100 / (whPrKm / 91,25). Se evt. formlen her: https://fdm.dk/alt-ombiler/dine-rettigheder/boderafgifter/ejerafgift-elbil.
3. For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også
afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr, mellem 15 og 20 er
den 1390 kr, mellem 10 og 15 er den 1850kr, mellem 5 og 10 er den 2770kr, og under 5 er den
15260kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter
monteret.
Der skal være en klasse der hedder Garage, som har en ArrayList der kan indeholde biler. Garageklassen
skal have et navn, samt en metode til at tilføje biler til bilparken. Den skal override toString, sådan at den
skriver alle de biler ud der holder i garagen. Den skal også have en metode der hedder
beregnGrønAfgiftForBilpark() der beregner den samlede grønne afgift for alle bilerne i garagen.
Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper
af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og
skriv resultatet ud.
Aflevering: Projektet lægges på github og uploades på Moodle via link til repository.
Afleveringen er individuel, men I må gerne arbejde i grupper
     */

    public static void main(String[] args) {
        Car carEL1 = new ElectricCar("11111111x", "Tesla",  "S",2020,5, 85,600, 0.14f);
        Car carEL2 = new ElectricCar("11111111y", "Tesla",  "3",2020,5, 65,500, 0.12f);
        Car carEL3 = new ElectricCar("11111111z", "Tesla",  "X",2020,5, 100,530, 0.20f);
        Car car2 = new DieselCar("222222222", "BMW",  "540d Sedan xDrive aut. M Sport",2020,5, true,17.5f);
        Car car3 = new GasolineCar("333333333", "Porsche",  "Panamera 4 Sport Turismo",2020,5, 100,9.3f);
        Garage garage= new Garage("Viktors garage");
        garage.addCar(carEL1);
        garage.addCar(carEL2);
        garage.addCar(carEL3);
        garage.addCar(car2);
        garage.addCar(car3);

        System.out.println("Total green property tax for the garage: "+garage.calculateGreenPropertyTaxForGarage()+" DKK");
        System.out.println(garage);
    }
}
