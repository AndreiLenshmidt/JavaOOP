package seminar3.child;

import seminar3.parent.Animal;
import seminar3.parent.Speakable;

/**
 * Шуточный класс, в котором некий "человек"  наследует от животного его поведение и состояние.
 * Класс создан в учебных целях и не несёт в себе скрытых смыслов и оскорблений :)
 */
public class HumanExtendsAnimal extends Animal implements Speakable {
    private final String name;
    private final int legsCount;

    public HumanExtendsAnimal(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s что-то говорит.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
}
