package seminar1.newChild;

import seminar1.parent.Animal;

public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
        this.typeOfMove = "swim";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Bool...bool...bool...%n", getType());
    }
}

