package seminar1.child;

import seminar1.parent.Animal;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color);
        this.typeOfMove = "fly";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Quack!%n", getType());
    }
}
