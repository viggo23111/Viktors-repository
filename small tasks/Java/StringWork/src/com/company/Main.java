package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[8][1];

    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner fileReader = new Scanner(file);
            int i = 0;
            while (fileReader.hasNextLine()) {
                text[i] = fileReader.nextLine().split(" ");
                System.out.println(text[i].length);
                i++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        printWordStartingWith("a");
        printWordOfLength(6);
    }

    private static void printWordOfLength(int l) {
        for (int i = 0; i < text.length; i++) {
            for (String s:text[i]) {
                if (s.length()==l){
                    if (s.contains(",") || s.contains(".")|| s.contains("(")|| s.contains(")")){
                    }else {
                        System.out.println(s);
                    }
                }
            }
        }
    }

    private static void printWordStartingWith(String pattern) {
        pattern = pattern.toLowerCase();
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())|| s.startsWith(pattern.toUpperCase())) {
                    System.out.println(s);
                }
            }
        }
    }
}
