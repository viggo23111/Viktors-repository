package com.company;

public class ElectricCar extends Car {
    private int batteryCapacityKwh;
    private int maxKm;
    private float whPrKm;

    public ElectricCar(String regNum, String brand, String model, int year, int amountOfDoors, int batteryCapacityKwh, int maxKm, float whPrKm) {
        super(regNum, brand, model, year, amountOfDoors);
        this.batteryCapacityKwh = batteryCapacityKwh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }

    public void setBatteryCapacityKwh(int batteryCapacityKwh) {
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(float whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double calculateGreenPropertyTax() {
        float wattPrKm=getWhPrKm();
        float kmPrl= 100 / (wattPrKm / 91.25f);
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
