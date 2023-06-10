package interfaces;

import nodes.LLNode;

public interface LinkedListInterface<T> {
    int size();
    boolean isEmpty();
    void addFirst(T element);
    void addLast(T element);
    void add(int index, T element);
    T removeFirst();
    T removeLast();
    void remove(int index);
    T get (int index);

    int indexOf();
    boolean contains(T element);

    void display();

}
