package seminar4.gb.array.list;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayIterator<T> implements Iterator<T> {
    private int index;
    private final T[] values;

    public ArrayIterator(T[] values) {
        index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return values[index] != null;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
