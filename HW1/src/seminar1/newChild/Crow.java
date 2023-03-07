package seminar1.newChild;

import seminar1.parent.Animal;

public class Crow extends Animal {
    public Crow(String name, String color) {
        super(name, color);
        this.typeOfMove = "fly";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Carrrr...%n", getType());
    }
}
