package com.company;

public class View {

    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";
    public View(){

    }
    public static void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
