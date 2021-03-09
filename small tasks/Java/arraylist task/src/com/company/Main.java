package com.company;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>(); // Create an ArrayList object
	// write your code here
        namesList.add("jesper");
        namesList.add("is");
        namesList.add("awesome");
        System.out.println(namesList);
        namesList.add(2, "not");
        System.out.println(namesList);
        namesList.set(2, "totally");
        System.out.println(namesList);

        namesList.remove("totally");

        System.out.println(namesList);

        Collections.sort(namesList);
        for(String name : namesList)
        {
            System.out.println(name);
        }
    }
}
