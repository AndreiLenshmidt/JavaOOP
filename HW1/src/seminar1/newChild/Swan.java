package seminar1.newChild;

import seminar1.parent.Animal;

public class Swan extends Animal {
    public Swan(String name, String color) {
        super(name, color);
        this.typeOfMove = "fly";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: proudly silent...%n", getType());
    }
}
