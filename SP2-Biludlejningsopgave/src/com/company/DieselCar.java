package com.company;

public class DieselCar extends Car{
    private boolean particulateFilter;
    private float kmPrl;

    public DieselCar(String regNum, String brand, String model, int year, int amountOfDoors, boolean particulateFilter, float kmPrl) {
        super(regNum, brand, model, year, amountOfDoors);
        this.particulateFilter = particulateFilter;
        this.kmPrl = kmPrl;
    }

    public boolean isParticulateFilter() {
        return particulateFilter;
    }

    public void setParticulateFilter(boolean particulateFilter) {
        this.particulateFilter = particulateFilter;
    }

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public double calculateGreenPropertyTax() {
        float kmPrl=getKmPrl();
        double greenPropertyTax = 0;
        if (kmPrl<=20 && kmPrl>=50) {
            greenPropertyTax = 330+130;
        } else if (kmPrl<=15 && kmPrl>20) {
            greenPropertyTax = 1050+1390;
        } else if (kmPrl<=10 && kmPrl>15) {
            greenPropertyTax = 2340+1850;
        }else if (kmPrl<=5 && kmPrl>10) {
            greenPropertyTax = 5500+2770;
        }else if (kmPrl>5){
            greenPropertyTax = 10470+15260;
        }
        if(isParticulateFilter()==false){
            greenPropertyTax=greenPropertyTax+1000;
        }
        return greenPropertyTax;
    }
}
