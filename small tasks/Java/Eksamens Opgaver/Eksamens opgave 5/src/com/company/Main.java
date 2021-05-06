package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
	// write your code here

        /*Menuvalg

Skriv en metode, som præsenterer brugeren for følgende menu på skærmen:

1. Beregn

2. Udskriv

3. Hjælp

Metoden skal:

· udskrive menuen på skærmen

· læse brugerens valg (fra tastaturet)

· returnere menuvalget som et heltal

· Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et forkert menuvalg)*/
    }

    public static void menu(){
        while(true) {
            String menuMainStr = "\nInput number of what you would like to do\n" +
                    "\n\t1 - Beregn" +
                    "\n\t2 - Udskriv" +
                    "\n\t3 - Hjælp" +
                    "\n\t4 - Exit\n";
            String menuMainInput = getUserInput(menuMainStr);
            switch (menuMainInput) {
                case "1" -> System.out.println("Option 1");
                case "2" -> System.out.println("Option 2");
                case "3" -> System.out.println("Option 3");
                case "4" -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
    }
    public static String getUserInput(String msg){
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
