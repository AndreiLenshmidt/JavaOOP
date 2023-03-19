package seminar4.gb.array.list;

import seminar4.gb.array.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;
    private int arraySizeCounter;

    public GBArrayList() {
        this.values = (T[]) new Object[10];
        this.arraySizeCounter = 0;
    }

    @Override
    public boolean add(T t) {
        try {
            if (values.length > this.arraySizeCounter) {
                values[this.arraySizeCounter] = t;
                this.arraySizeCounter++;
                return true;
            } else return addCreateNewArray(t);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    
    public boolean addCreateNewArray(T t) {
        // ��� ��� try-catch ����� ��������, ��
        // ���� try-catch ����� ��-�� �������� down-�����, ����� ���-�� ���������� ����������
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length/2 + temp.length];
            //������ -> � ������ �������� -> ���� -> � ������ �������� -> �������
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[this.arraySizeCounter-1] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
            this.arraySizeCounter--;
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int index) {
        if (index < this.arraySizeCounter) {
            return values[index];
        } else return null;
    }

    @Override
    public int size() {
        return this.arraySizeCounter;
    }

    @Override
    public void update(int index, T type) {
        if (index < this.arraySizeCounter) {
            values[index] = type;
        } else System.out.println("index out of range");
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
