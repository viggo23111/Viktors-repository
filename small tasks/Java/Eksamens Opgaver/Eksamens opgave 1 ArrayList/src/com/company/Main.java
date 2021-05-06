package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> tests = new ArrayList<String>();
	// write your code here
        addStringToArrayList(tests,"test1");
        addStringToArrayList(tests,"test1");
        addStringToArrayList(tests,"");
        System.out.println(tests);
    }


    /* Opgave 1 ArrayList

Skriv en metode, der modtager 2 parametre: en arrayliste og en streng.

Metoden skal gøre følgende:

· Indsætte strengen i arraylisten, hvis den ikke findes i listen i forvejen. Ellers gøres ingenting med streng og arrayliste.

· returnere værdien true, hvis strengen er blevet indsat i arraylisten. Ellers false.

· Inddrag fejlhåndtering i din løsning, således at null værdier undgås i arraylisten

· Hold listen sorteret.*/


    public static boolean addStringToArrayList(ArrayList arrayTest, String data){
        if(arrayTest.contains(data)){
            System.out.println("Data is already in the list!");
            return false;

        }else if(data.equals("")){
            System.out.println("Data is null!");
            return false;
        }else{
            arrayTest.add(data);
            System.out.println("Data added :)");
            return true;
        }
    }
}
