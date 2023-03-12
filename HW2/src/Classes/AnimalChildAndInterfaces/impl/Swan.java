package Classes.AnimalChildAndInterfaces.impl;

import Classes.Animal;
import Classes.AnimalChildAndInterfaces.Diseaseable;
import Classes.AnimalChildAndInterfaces.Fliable;
import Classes.AnimalChildAndInterfaces.Speakable;
import Classes.AnimalChildAndInterfaces.Swimmable;

public class Swan extends Animal implements Speakable, Diseaseable, Swimmable, Fliable {
    public Swan(String name, String color, int legsCount) {
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
    public void swim() {
        System.out.printf("%s: can swim%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s: can fly%n", getType());
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: proudly silent...%n", getType());
    }

    @Override
    public double speed() {
        float speed = 100.00f;
        System.out.printf("%s speed: %f%n", getType(),speed);
        return speed;
    }
}
