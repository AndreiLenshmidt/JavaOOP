package seminar3.personal;

import java.util.List;

public abstract class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract List<Employee> getSubordinates();

    @Override
    public String toString() {
        return String.format(
                "%s {firstname: %s, lastName: %s}%n", this.getClass().getSimpleName(), firstName, lastName
        );
    }
}
