package Classes;

public abstract class Animal implements Speed {
    private String name;
    private int animalID = 0;
    private final String color;
    private int legsCount;
    protected String illness = "healthy";

    public Animal (String name, String color, int legsCount) {
        this.name = name;
        this.animalID = animalID++;
        this.color = color;
        this.legsCount = legsCount;
    }

    public Animal(String color, int legsCount) {
        this("DefaultName", color, legsCount);
    }

    public Animal() {
        this("DefaultName", "DefaultColor", 4);
    }
        
    public String getName() {
        return name;
    }

    public int getID() {
        return animalID;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getIllness() {
        return illness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString() {
        return String.format(
            "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getID(), getLegsCount()
            );
    }

    @Override
    public double speed() {
        return 0.0;
    }



    // public void hunt() {
    //     wakeUp();
    //     findFood();
    //     eat();
    //     toPlay();
    //     goToSleep();
    // }
        
    // private void wakeUp() {
    //     System.out.println(getType() + ": wake up");
    //  }
            
    // private void findFood() {
    //     System.out.printf("%s: find food%n", getType());
    // }

    // private void eat() {
    //     System.out.printf("%s: eat%n", getType());
    // }

    // private void toPlay() {
    //     System.out.printf("%s: play%n", getType());
    // }

    // private void goToSleep() {
    //     System.out.printf("%s: go to sleep%n", getType());
    // }
    
}
