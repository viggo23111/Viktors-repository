package com.company;
import java.util.ArrayList; // import the ArrayList class
public class Garage {
    /*
    Der skal være en klasse der hedder Garage, som har en ArrayList der kan indeholde biler. Garageklassen
    skal have et navn, samt en metode til at tilføje biler til bilparken. Den skal override toString, sådan at den
    skriver alle de biler ud der holder i garagen. Den skal også have en metode der hedder
    beregnGrønAfgiftForBilpark() der beregner den samlede grønne afgift for alle bilerne i garagen.
    Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper
    af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og
    skriv resultatet ud.
     */
    private ArrayList<Car> cars = new ArrayList<Car>(); // Create an ArrayList of cars
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public double calculateGreenPropertyTaxForGarage(){
        double greenPropertyTaxForGarage = 0;
        for (int i = 0; i <cars.size(); i++) {
           greenPropertyTaxForGarage=greenPropertyTaxForGarage+cars.get(i).calculateGreenPropertyTax();
        }
        return greenPropertyTaxForGarage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String s="Cars in "+getName()+"\n";
        for (int i = 0; i <cars.size(); i++) {
            s=s+"RegNr:" + cars.get(i).getRegNum()+" "+ "Brand:" +cars.get(i).getBrand()+" " + "Model:" +cars.get(i).getModel()+" " + "Year:" +cars.get(i).getYear()+" " + "Doors:" +cars.get(i).getAmountOfDoors()+"\n";
        }
        return s;
    }
}
