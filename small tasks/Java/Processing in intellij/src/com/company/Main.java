package com.company;

import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        MySketch mySketch = new MySketch();
        PApplet.runSketch(processingArgs, mySketch);


    }
}