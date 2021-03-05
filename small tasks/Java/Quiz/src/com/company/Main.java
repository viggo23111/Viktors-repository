package com.company;
import java.util.Scanner;
public class Main{
    static int num1 = 0;
    static int num2= 0;

    public static void main(String args[]) {
        num1 = generateNumbers(10,1);
        num2= generateNumbers(10,1);
        swapNumbers();
        printExercise();
        int input = readAnswer();
        evaluate(input);

    }

    public static int generateNumbers(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    public static void swapNumbers() {
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
    }

        public static void printExercise() {
            System.out.println("What is "+num1 + " - "+num2);
        }

        public static int readAnswer() {
            Scanner myScanner = new Scanner(System.in);
            int input = myScanner.nextInt();
            return input;
        }

        public static void evaluate(int input) {
            int correctAnswer=num1-num2;
            if (correctAnswer==input){
                System.out.println("Correct!");
            }else{
                System.out.println("Wrong!");
            }
        }
}
