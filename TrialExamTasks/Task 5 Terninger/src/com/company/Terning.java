package com.company;

public class Terning {
    int antalØjne;


    public void kast(){
        int upperBound = 6;
        int lowerBound = 1;
        int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
        antalØjne= number;
    }

    public int getAntalØjne() {
        return antalØjne;
    }
}
