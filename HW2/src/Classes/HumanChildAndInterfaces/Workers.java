package Classes.HumanChildAndInterfaces;

import Classes.Human;

public abstract class Workers extends Human {

    private String positionAtWork;
    private int salary;
    private float workExperience;

    public Workers(
                String name, 
                String surname, 
                String status, 
                int phoneNumber, 
                String mail, 
                String addres,
                String positionAtWork,
                int salary,
                float workExperience
                ) {
        super(name, surname, status, phoneNumber, mail, addres);
        this.positionAtWork = positionAtWork;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public Workers(
                String name, 
                String surname, 
                String status,
                String positionAtWork,
                int salary,
                float workExperience
                ) {
        super(name, surname, status);
        this.positionAtWork = positionAtWork;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public int getSalary() {
        return salary;
    }

    public float getWorkExperience() {
        return workExperience;
    }
}
