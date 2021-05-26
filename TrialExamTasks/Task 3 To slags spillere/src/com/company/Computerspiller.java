package com.company;

import java.util.Scanner;

public class Computerspiller implements Player{
    @Override
    public int gætEtTal(int max) {
        int lowestNumber = 1;
        int randomGuess = lowestNumber + (int)(Math.random() * ((max - lowestNumber) + 1));
        return randomGuess;
    }
}
