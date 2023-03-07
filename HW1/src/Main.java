import seminar1.child.Dog;
import seminar1.child.Duck;
import seminar1.newChild.Crow;
import seminar1.newChild.Dolphin;
import seminar1.newChild.Fish;
import seminar1.newChild.Swan;
import seminar1.newChild.Tiger;
import seminar1.newChild.Wolf;
import seminar1.parent.Animal;
import seminar1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("Tom", "Blue");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("Donald", "White");
        System.out.println(duck);
        Dog dog = new Dog("Barbos", "Dark");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.forEach(Animal::speak);
        System.out.println("--------Separator------------");

        // animals.forEach(a -> System.out.println(a));

        for (Animal a: animals) {
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
        }
        System.out.println("--------Separator------------");

        vaska.hunt();

        System.out.println("--------Separator------------");
        
        Wolf wolf1 = new Wolf("GreyWolf", "gray");
        Tiger tiger1 = new Tiger("Sherhan", "Orange dark striped");
        Swan swan1 = new Swan("Vasily", "white");
        Crow crow1 = new Crow("Nikita","black");
        Dolphin dolfin1 = new Dolphin("Ivan", "gray");
        Fish fish1 = new Fish("Fisher","red");

        List<Animal> animals2 = new ArrayList<>();
        animals2.add(wolf1);
        animals2.add(tiger1);
        animals2.add(swan1);
        animals2.add(crow1);
        animals2.add(dolfin1);
        animals2.add(fish1);

        for (Animal b: animals2) {
            b.fly();
            b.go();
            b.swim();
            System.out.println("--------Separator------------");
        }
        
    }
}
