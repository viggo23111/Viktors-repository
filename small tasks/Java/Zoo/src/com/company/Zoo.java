package com.company;
import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(){
    }

    public void makeAllSounds(){
        for(Animal a : animals)
        {
            a.makeSound();
        }
    }

    public void addAnimal(Animal animal){
            animals.add(animal);
    }

    public void printNumberOfLegs(){
        int sumOfLegs=0;
        for (int i = 0; i < animals.size(); i++) {
            sumOfLegs= sumOfLegs+animals.get(i).getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: "+sumOfLegs);
    }
}
