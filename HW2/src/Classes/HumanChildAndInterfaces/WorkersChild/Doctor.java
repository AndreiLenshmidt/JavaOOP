package Classes.HumanChildAndInterfaces.WorkersChild;

import Classes.HumanChildAndInterfaces.Workers;

public class Doctor extends Workers {
    
    public Doctor(
                String name, 
                String surname,  
                int phoneNumber, 
                String mail, 
                String addres,
                int salary,
                float workExperience
                ) {
        super (
                name, 
                surname, 
                "Worker", 
                phoneNumber, 
                mail, 
                addres, 
                "Doctor", 
                35000, 
                workExperience
              );
    }

    public Doctor(
                String name, 
                String surname, 
                int salary,
                float workExperience
                ) {
        super(name, surname, "Worker", "Doctor", 35000, workExperience);
    }

    
}
