package interfaces;

public interface ArrayListInterface<T> {
    void add(T element);
    void add(int index, T element);
    T remove(int index);
    int size();
    boolean isEmpty();
    boolean contains(T element);
    int indexOf();
    void clear();
    void toArray();
}
