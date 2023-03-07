package seminar1.newChild;

import seminar1.parent.Animal;

public class Wolf extends Animal {
    public Wolf(String name, String color) {
        super(name, color);
        this.typeOfMove = "go-swim";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Auuuuuf...!%n", getType());
    }
}
