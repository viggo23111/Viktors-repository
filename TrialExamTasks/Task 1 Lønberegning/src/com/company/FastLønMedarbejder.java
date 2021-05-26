package com.company;

public class FastLønMedarbejder implements Payment{
    double  månedsløn;

    public FastLønMedarbejder(double månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public double calculateSalary() {
        return månedsløn;
    }
}
