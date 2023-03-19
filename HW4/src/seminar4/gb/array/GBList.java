package seminar4.gb.array;

//Simple
public interface GBList<T> extends Iterable<T>{
    boolean add(T t);
    void remove(int index);
    T get(int index);
    int size();
    void update(int index, T t);
}
