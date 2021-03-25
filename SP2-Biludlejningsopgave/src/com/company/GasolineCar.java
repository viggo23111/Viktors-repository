package com.company;

public class GasolineCar extends Car{
    private float octaneAmount;
    private float kmPrL;

    public GasolineCar(String regNum, String brand, String model, int year, int amountOfDoors, float octaneAmount, float kmPrL) {
        super(regNum, brand, model, year, amountOfDoors);
        this.octaneAmount = octaneAmount;
        this.kmPrL = kmPrL;
    }

    public float getOctaneAmount() {
        return octaneAmount;
    }

    public void setOctaneAmount(float octaneAmount) {
        this.octaneAmount = octaneAmount;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double calculateGreenPropertyTax() {
        float kmPrl=getKmPrL();
        double greenPropertyTax = 0;
        if (kmPrl<=20 && kmPrl>=50) {
            greenPropertyTax = 330;
        } else if (kmPrl<=15 && kmPrl>20) {
            greenPropertyTax = 1050;
        } else if (kmPrl<=10 && kmPrl>15) {
            greenPropertyTax = 2340;
        }else if (kmPrl<=5 && kmPrl>10) {
            greenPropertyTax = 5500;
        }else if (kmPrl>5){
            greenPropertyTax = 10470;
        }
        return greenPropertyTax;
    }
}
