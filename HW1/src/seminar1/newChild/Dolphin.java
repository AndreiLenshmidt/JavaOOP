package seminar1.newChild;

import seminar1.parent.Animal;

public class Dolphin extends Animal {
    public Dolphin(String name, String color) {
        super(name, color);
        this.typeOfMove = "swim";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak for Dolphin lannguage!%n", getType());
    }
}

