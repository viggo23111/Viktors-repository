package com.company;

public abstract class Car {
    String regNum;
    String brand;
    String model;
    int year;
    int amountOfDoors;

    public Car(String regNum, String brand, String model, int year, int amountOfDoors) {
        this.regNum = regNum;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }

    public abstract double calculateGreenPropertyTax();

}


