package com.company;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException {
        BilletSystem billetSystem = new BilletSystem();
        billetSystem.opretBillet(10,420);
        billetSystem.opretBillet(5,430);
        billetSystem.opretBillet(10,402);
        billetSystem.opretBillet(10,534);
        billetSystem.opretBillet(10,410);
        System.out.println(billetSystem.billetter);
        billetSystem.getBilletter();
        System.out.println(billetSystem.billetter);

    }
}
