package notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * �����������, ��� ���������� CreateReadUpdateDelete (CRUD) ��������
 * @param <E> ��� ������ ������
 * @param <I> ��� ID ������ ������ E
 */
public interface GBRepository<E, I> {
    List<E> findAll();
    E create(E e, String saveFormat, boolean saveType);
    Optional<E> findById(I id);
    E update(I id, E e);
    boolean delete(I id);
}
