package seminar3.child;

import seminar3.parent.Animal;
import seminar3.parent.Speakable;

public class Cat extends Animal implements Speakable {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }
}
