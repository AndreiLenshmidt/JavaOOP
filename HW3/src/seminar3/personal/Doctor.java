package seminar3.personal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Employee {
    private final List<Employee> subordinates;

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
        this.subordinates = new ArrayList<>();
    }

    public Doctor addSubordinate(Employee employee) {
        subordinates.add(employee);
        return this;
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }
}
