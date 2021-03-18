package com.company;

import java.util.ArrayList;

public class Dog {
    String name="";
    boolean isHungry=true;
    String owner="";

    ArrayList<String> offSprings = new ArrayList<String>();

    public Dog(String name, boolean hungry) {
        this.name=name;
        this.isHungry=hungry;
    }

    public void getOffSprings() {
        System.out.println(offSprings);
    }

    public void addOffSpring(String name) {
        offSprings.add(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        this.isHungry = hungry;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String feedDog() {
        String notHungry=name+" is eating food and is not hungry anymore";
        isHungry=false;
        return notHungry;
    }
}
