package com.company;

import java.util.ArrayList;

public class Main {
    public static Zoo zoo = new Zoo();

    public static void main(String[] args) {
        Dog dog = new Dog(4);
        Cat cat = new Cat(4);
        Spider spider = new Spider(8);
	// Adding my animals to the Zoo
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(spider);

        // Zoo functions
        zoo.makeAllSounds();
        zoo.printNumberOfLegs();

    }

}
