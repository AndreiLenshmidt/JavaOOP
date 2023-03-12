package Classes;

import java.util.ArrayList;
import java.util.List;

import Classes.AnimalChildAndInterfaces.Fliable;
import Classes.AnimalChildAndInterfaces.Runnable;
import Classes.AnimalChildAndInterfaces.Speakable;
import Classes.AnimalChildAndInterfaces.Swimmable;

public class VeterinaryClinic {

    private final List<Animal> ANIMALS;
    private List<Human> HUMANS;

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
        this.HUMANS = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public VeterinaryClinic addHuman(Human human) {
        HUMANS.add(human);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Human> getHUMANS() {
        return HUMANS;
    }

    public List<Object> getAll() {
        List<Object> result = new ArrayList<>();
        result.addAll(getAllHumans());
        result.addAll(getAllAnimals());
        return result;
    }

    public List<Human> getAllHumans() {
        List<Human> result = new ArrayList<>();
        for (Human human: getHUMANS()) {
            if (human instanceof Human) {
                result.add((Human) human);
            }
        }
        return result;
    }

    public List<Animal> getAllAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Animal) {
                result.add((Animal) animal);
            }
        }
        return result;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Fliable> getFliable() {
        List<Fliable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Fliable) {
                result.add((Fliable) animal);
            }
        }
        return result;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }
}
