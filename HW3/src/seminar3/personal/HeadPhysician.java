package seminar3.personal;

import java.util.ArrayList;
import java.util.List;

public final class HeadPhysician extends Employee{
    private final List<Employee> subordinates;

    public HeadPhysician(String firstName, String lastName) {
        super(firstName, lastName);
        this.subordinates = new ArrayList<>();
    }

    public HeadPhysician addSubordinate(Employee employee) {
        subordinates.add(employee);
        return this;
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
