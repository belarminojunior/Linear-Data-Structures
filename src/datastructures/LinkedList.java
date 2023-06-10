package datastructures;

import interfaces.LinkedListInterface;
import nodes.LLNode;

public class LinkedList<T> implements LinkedListInterface<T> {
    private int size;
    private LLNode<T> head;
    private LLNode<T> tail;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(T element) {
        LLNode<T> node = new LLNode<>(element);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }

        size++;
    }

    @Override
    public void addLast(T element) {
        LLNode<T> node = new LLNode<>(element);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public void add(int index, T element) {
        if (index == 0)
            addFirst(element);
        if (index == size)
            addLast(element);
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf() {
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public void display() {
        LLNode<T> temp = head;

        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();

            if (temp.getNext() == null)
                System.out.println(temp.getData());
        }
    }
}
