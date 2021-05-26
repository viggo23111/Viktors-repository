package com.company;

public class GuessGame {
    int correctGuess;
    int max = 10;

    public GuessGame(int correctGuess) {
        this.correctGuess = correctGuess;
    }

    public boolean turn(Player player){
        boolean correct=false;
        int numberGuess = player.gætEtTal(max);
        if (numberGuess==correctGuess){
            correct=true;
        }
        return correct;
    }
}
