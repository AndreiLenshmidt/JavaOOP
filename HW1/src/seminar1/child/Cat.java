package seminar1.child;

import seminar1.parent.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
        this.typeOfMove = "go";
    }

    @Override
    public void speak() {
        System.out.printf("%s speak: Meow!%n", getType());
    }
}
