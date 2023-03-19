package seminar3.personal;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Employee {

    public Nurse(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public List<Employee> getSubordinates() {
        return new ArrayList<>();
    }
}
