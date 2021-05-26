package com.company;

public class ProvisionsMedarbejder implements Payment{
    double basicSalary;
    double sale;
    double commissionInPercentage;

    public ProvisionsMedarbejder(double basicSalary, double sale, double commissionInPercentage) {
        this.basicSalary = basicSalary;
        this.sale = sale;
        this.commissionInPercentage = commissionInPercentage;
    }

    @Override
    public double calculateSalary() {
        //Eksempel: Grundløn 20000 kr. Salg 10000 kr. Provision 20% giver en løn på 22000kr.
        return basicSalary+sale*(commissionInPercentage/100);
    }
}
