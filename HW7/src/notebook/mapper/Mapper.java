package notebook.mapper;

/**
 * ��������� ������� �� ������ ���� � ������.
 * @param <E> ���, �������� � ��
 * @param <T> ���, ���������� ��� ����������� E
 */
public interface Mapper<E, T> {
    T toInput(E e);
    T toInput2(E e);
    E toOutput(T t);
}
