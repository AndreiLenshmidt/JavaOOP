package seminar3.drugstore.components;

public abstract class Component {
    private final String name;
    private final String weight;
    private final int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s, weight: %s, power: %s}", this.getClass().getSimpleName(), name, weight, power
        );
    }

    @Override
    public boolean equals(Object obj) {
        Component a = (Component) obj;
        return a.name == this.name;
    }

    @Override
    public int hashCode()
    {
        int result = 17;
 
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (weight == null ? 0 : weight.hashCode());
        result = 31 * result + power;
 
        return result;
    }

}
