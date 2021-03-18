package com.company;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String bodyStyle;
    private String driver;

    public Car (String brand,String model,int year,String bodyStyle) {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.bodyStyle=bodyStyle;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
