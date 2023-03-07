package seminar1.child;

import seminar1.parent.Animal;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
        this.typeOfMove = "go-swim";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Gav!%n", getType());
    }
}
