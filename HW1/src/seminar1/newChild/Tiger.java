package seminar1.newChild;

import seminar1.parent.Animal;

public class Tiger extends Animal {
    public Tiger(String name, String color) {
        super(name, color);
        this.typeOfMove = "go";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Grrrr...!%n", getType());
    }
}