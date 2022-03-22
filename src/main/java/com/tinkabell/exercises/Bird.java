package com.tinkabell.exercises;

public abstract class Bird {
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        Bird pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        Bird polly = new Parrot("Polly", "Green");
        polly.speak();
        polly.fly();
    }
}
