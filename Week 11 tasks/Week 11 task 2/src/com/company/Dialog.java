package com.company;

import java.util.Scanner;

public class Dialog {

    public Dialog(){

    }
    public static double doDiag(){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Indtast varens pris: ");
        double number = myScan.nextDouble();
        return number;
    }
}
