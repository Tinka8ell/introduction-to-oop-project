package com.tinkabell.exercises;

public class Parrot extends Bird{

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Who's a pretty boy? I'm " + name + " and I'm a " + color + " parrot.");
    }
}
