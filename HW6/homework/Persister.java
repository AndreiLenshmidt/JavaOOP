package homework;

public class Persister extends User {

    public Persister(String name){
        super(name);
    }

    @Override
    public void save() {
        System.out.println("Save persister: " + getName());
    }

    @Override
    public void report() {
        System.out.println("Report for persister: " + getName());
    }
}
