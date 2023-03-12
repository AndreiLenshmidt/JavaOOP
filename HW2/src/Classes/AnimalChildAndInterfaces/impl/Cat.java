package Classes.AnimalChildAndInterfaces.impl;

import Classes.Animal;
import Classes.AnimalChildAndInterfaces.Diseaseable;
import Classes.AnimalChildAndInterfaces.Runnable;
import Classes.AnimalChildAndInterfaces.Speakable;


public class Cat extends Animal implements Runnable, Speakable, Diseaseable {

    public Cat(String name, String color, int legsCount) {
        super(name, color, legsCount);
    }
    
    @Override
    public void setIll(String illness) {
        this.illness = illness;
    }
    
    @Override
    public void getIll() {
        System.out.printf("%s %s ill %s %n", getType(), getName(), this.illness);
    }
    
    @Override
    public void run() {
        System.out.printf("%s: can run%n", getType());
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Meow!%n", getType());
    }

    @Override
    public double speed() {
        float speed = 25.00f;
        System.out.printf("%s speed: %f%n", getType(),speed);
        return speed;
    }
}
