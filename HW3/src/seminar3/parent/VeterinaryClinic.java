package seminar3.parent;

import seminar3.personal.Employee;
import seminar3.personal.HeadPhysician;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VeterinaryClinic implements Iterable<Employee>{
    private final List<Animal> ANIMALS;
    private final Employee headPhysician;

    public VeterinaryClinic(HeadPhysician headPhysician) {
        this.ANIMALS = new ArrayList<>();
        this.headPhysician = headPhysician;
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
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

    public Employee getHeadPhysician() {
        return headPhysician;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {
            final List<Employee> employees = deepTree(headPhysician);
            final Iterator<Employee> iterator = employees.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Employee next() {
                return iterator.next();
            }
        };
    }

    private List<Employee> deepTree(Employee employee) {
        List<Employee> result = new ArrayList<>();
        result.add(employee);

        if (employee.getSubordinates().size() == 0) {
            return result;
        }

        for (Employee e: employee.getSubordinates()) {
            result.addAll(deepTree(e));
        }
        return result;
    }
}
