package homework;

public class Main{
    public static void main(String[] args){
        User user = new Persister("Bob");
        user.report();
        user.save();

        Persister persister = new Persister("Rob");
        persister.report();
        persister.save();
    }
}