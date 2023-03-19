package seminar3.drugstore;

import seminar3.drugstore.components.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterator<Component> {
    private final List<Component> components;
    private int index;

    public Drug() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    //todo ���� ����� ���������������, ����� �������� ������ ���������;
//    public void getComponents() {
//        components.forEach(System.out::println);
//    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }


}
