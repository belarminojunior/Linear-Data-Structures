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
    T remove(int index);
    LLNode<T> get (int index);
    LLNode<T> find(T value);
    boolean contains(T element);
    void display();

}
