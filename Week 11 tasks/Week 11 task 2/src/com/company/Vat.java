package com.company;

public class Vat {
    final static int PRCVAT = 25;

    public Vat(){
    }
    double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
