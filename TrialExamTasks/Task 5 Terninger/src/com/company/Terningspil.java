package com.company;

import java.util.Scanner;

public class Terningspil {
    Terning terning1 = new Terning();
    Terning terning2 = new Terning();

    public void terningProdukt() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilket produkt vil du have?:");
        int produkt = input.nextInt();
        if (produkt>36){
            throw new Exception("Produkt is not possible!");
        }
        int dice1=0;
        int dice2=0;
        while (produkt!=terning1.getAntalØjne() * terning2.getAntalØjne()){
            terning1.kast();
            terning2.kast();
            dice1 =terning1.getAntalØjne();
            dice2 =terning2.getAntalØjne();
            System.out.println(dice1 +"*" + dice2 +" = " +dice1*dice2 );
        }
    }
}
