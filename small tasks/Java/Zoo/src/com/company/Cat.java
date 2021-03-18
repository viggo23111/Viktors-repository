package com.company;

public class Cat extends Animal{

    public Cat(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}