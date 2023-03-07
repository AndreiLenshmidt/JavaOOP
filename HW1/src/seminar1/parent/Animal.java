package seminar1.parent;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;
    protected String typeOfMove;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
        this.typeOfMove = "go";
    }

    public Animal(String color, int legsCount, String typeOfMove) {
        this("DefaultName", color);
        this.legsCount = legsCount;
        this.typeOfMove = typeOfMove;
    }

    public Animal() {
        this("DefaultName", "DefaultColor");
    }

    // todo: ���� ������, ���������� �� ��������� �������.
    //  !!!�������� �������� �� ������ ������� ������ ����� � sysout java

//    public void wakeUp() {
//        System.out.println(getType() + ": ���������");
//    }
//
//    public void findFood() {
//        String out = String.format("%s: ����� ���%n", getType());
//        System.out.println(out);
//    }
//
//    public void eat() {
//        System.out.printf("%s: ����%n", getType());
//    }
//
//    public void toPlay() {
//        System.out.printf("%s: �������%n", getType());
//    }
//
//    public void goToSleep() {
//        System.out.printf("%s: �����%n", getType());
//    }

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    //todo: ���� ������� � �������. !!! �������� ��������, �� � ������� ���� ���� ������(���� �� ����� ������������)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getTypeOfMove(), getLegsCount()
        );
    }

    private void wakeUp() {
        System.out.println(getType() + ": wake up");
    }

    private void findFood() {
        String out = String.format("%s: find food%n", getType());
        System.out.println(out);
    }

    private void eat() {
        System.out.printf("%s: eat%n", getType());
    }

    private void toPlay() {
        System.out.printf("%s: play%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: go to sleep%n", getType());
    }
    
    public void fly() {
        if (String.valueOf(getTypeOfMove()).equalsIgnoreCase("fly"))
            System.out.printf("%s is flying!%n", getType());
        else 
            System.out.printf("This %s cant't fly!%n", getType());
}
    
    public void go() {
        if (String.valueOf(getTypeOfMove()).equalsIgnoreCase("go"))
            System.out.printf("%s is going!%n", getType());
        else if (String.valueOf(getTypeOfMove()).equalsIgnoreCase("go-swim")) 
            System.out.printf("%s is going!%n", getType());
        else 
            System.out.printf("This %s cant't go!%n", getType());
    }
    
    public void swim() {
        if (String.valueOf(getTypeOfMove()).equalsIgnoreCase("swim"))
            System.out.printf("%s is swiming!%n", getType());
        else if (String.valueOf(getTypeOfMove()).equalsIgnoreCase("go-swim")) 
            System.out.printf("%s is swiming!%n", getType());
        else 
            System.out.printf("This %s cant't swim!%n", getType());
    }
    
}
