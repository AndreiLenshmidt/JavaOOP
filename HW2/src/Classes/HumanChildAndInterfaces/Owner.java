package Classes.HumanChildAndInterfaces;

import Classes.Human;

public class Owner extends Human {

    private String animalName;
    private int animalID;

    public Owner(
                String name, 
                String surname, 
                String status, 
                int phoneNumber, 
                String mail, 
                String addres,
                String animalName,
                int animalID
                ) {
        super(name, surname, status, phoneNumber, mail, addres);
        this.animalName = animalName;
        this.animalID = animalID;
    }

    public Owner(
                String name, 
                String surname, 
                String status,
                String animalName,
                int animalID
                ) {
        super(name, surname, status);
        this.animalName = animalName;
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalID() {
        return animalID;
    }
    
    
}
