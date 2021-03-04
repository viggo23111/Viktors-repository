package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[12][1];

    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner fileReader = new Scanner(file);
            int i = 0;
            while (fileReader.hasNextLine()) {
                text[i] = fileReader.nextLine().split(" ");
               // System.out.println(text[i].length);
                i++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
       // printWordStartingWith("a");
       // printWordOfLength(6);
        printWordsWithDoubleConsonant();
        //printPartOfWord("København",6,4);
        //isPalindrome("Den laks skal ned");
        //printLongestLine();
    }

    private static void printLongestLine() {
        try {
            File file = new File("data.txt");
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNextLine()) {
                text[i] = scan.nextLine().split("\\. ");
                i++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        int maxLength = 0;
        String longestString = null;
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() > maxLength) {
                    maxLength = s.length();
                    longestString = s;
                }
            }
        }
        System.out.println(longestString);
    }

    private static void printPartOfWord(String word, int i, int iEnd) {
        try {
            System.out.println(word.substring(i, iEnd));
        }catch(StringIndexOutOfBoundsException e) {
            //System.out.println("Error out of bounds ! ");
            if(word.length() > i){
                System.out.println(word.substring(i));
            } else if (word.length() < i){
                System.out.println("argument 2 er højere end ordets længe ");
            }
        }

    }

    public static void isPalindrome(String word){
        String strReverse = new StringBuffer(word.toLowerCase()).reverse().toString();
        if(word.toLowerCase().equals(strReverse))
        {
            System.out.println(word + " is palindrome string.");
        }
        else
        {
            System.out.println(word + " is not palindrome string.");
        }
    }

    private static void printWordsWithDoubleConsonant() {
        boolean wordIsValid = false;
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                for (int j = 0; j < s.length() -1; j++) {
                    char c = s.charAt(j);
                    if (s.charAt(j) == s.charAt(j+1)){
                        if (checkCharType(c)){
                            wordIsValid=true;
                        }
                    }else{
                        wordIsValid=false;
                    }
                    if (wordIsValid==true){
                        System.out.println(s);
                    }
                }
            }
        }
    }

    private static boolean checkCharType(char c){
        char ch = c;
        if (Character.isDigit(ch)) {
            return false;
        }else{
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return false;
            } else {
                return true;
            }
        }
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
