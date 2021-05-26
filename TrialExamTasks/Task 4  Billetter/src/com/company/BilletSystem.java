package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BilletSystem {
    public ArrayList<Billet> billetter = new ArrayList<>();

    public void opretBillet(int varighed, double prisPrTime) throws IOException {
        if (varighed>24){
            throw new IOException("Varighed Kan ikke være mere end 24!");
        }
        Billet billet = new Billet(varighed,prisPrTime);
        billetter.add(billet);
    }

    public void getBilletter() {
        Collections.sort(billetter, Comparator.comparing(Billet::getPrisPrTime));
    }
}
