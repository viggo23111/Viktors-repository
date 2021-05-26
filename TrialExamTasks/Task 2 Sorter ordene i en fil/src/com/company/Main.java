package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words=FileHandler.fileToArraylist();
        FileHandler.cleanUp(words);
    }
}
