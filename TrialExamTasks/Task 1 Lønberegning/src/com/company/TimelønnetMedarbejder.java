package com.company;

public class TimelønnetMedarbejder implements Payment{
    double  amountOfHours;
    double  hourlyRate;

    public TimelønnetMedarbejder(double amountOfHours, double hourlyRate) {
        this.amountOfHours = amountOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return amountOfHours*hourlyRate;
    }
}
