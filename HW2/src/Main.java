import Classes.Animal;
import Classes.VeterinaryClinic;
import Classes.AnimalChildAndInterfaces.impl.Cat;
import Classes.AnimalChildAndInterfaces.impl.Crow;
import Classes.AnimalChildAndInterfaces.impl.Dog;
import Classes.AnimalChildAndInterfaces.impl.Dolphin;
import Classes.AnimalChildAndInterfaces.impl.Duck;
import Classes.AnimalChildAndInterfaces.impl.Fish;
import Classes.AnimalChildAndInterfaces.impl.Swan;
import Classes.AnimalChildAndInterfaces.impl.Tiger;
import Classes.AnimalChildAndInterfaces.impl.Wolf;
import Classes.HumanChildAndInterfaces.WorkersChild.Doctor;

public class Main {
    public static void main(String[] args) {

        Cat cat01 = new Cat("Leopold", "ginger", 4);
        Duck duck01 = new Duck("Donald", "White", 2);
        Dog dog01 = new Dog("Barbos","Black", 4);
        Dolphin dolf01 = new Dolphin("Bobic", "Blue", 0);
        Crow crow01 = new Crow("Karkusha", "Black", 2);
        Fish fish01 = new Fish("Nemo", "Orange", 0);
        Swan swan01 = new Swan("Key", "White", 2);
        Tiger tiger01 = new Tiger("Sherhan", "Orange-black", 4);
        Wolf wolf01 = new Wolf("Balto", "Grey", 4);
        Doctor doctor01 = new Doctor("Pavel", "Ivanov", 35000, 5.8f);

        VeterinaryClinic patient = new VeterinaryClinic();

        patient
                .addAnimal(cat01)
                .addAnimal(duck01)
                .addAnimal(dog01)
                .addAnimal(dolf01)
                .addAnimal(crow01)
                .addAnimal(fish01)
                .addAnimal(swan01)
                .addAnimal(tiger01)
                .addAnimal(wolf01)
                .addHuman(doctor01);

        for (Animal animal : patient.getANIMALS()) {
            animal.speed();
        }

        System.out.println("--------This is Speakable--------");
        System.out.println(patient.getSpeakable());
        System.out.println("--------This is Runnable--------");
        System.out.println(patient.getRunnable());
        System.out.println("--------This is Fliable--------");
        System.out.println(patient.getFliable());
        System.out.println("--------This is Swimmable--------");
        System.out.println(patient.getSwimmable());
        System.out.println("--------This is All Animals--------");
        System.out.println(patient.getAllAnimals());
        System.out.println("--------This is All--------");
        System.out.println(patient.getAll());
        System.out.println("--------This were All--------");
    }
}

