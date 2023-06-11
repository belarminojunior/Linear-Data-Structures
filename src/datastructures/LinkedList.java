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

        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }

        LLNode<T> temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.getNext();
        }

        LLNode<T> node = new LLNode<>(element, temp.getNext());
        temp.setNext(node);

        size++;

    }

    @Override
    public T removeFirst() {
        T value = head.getData();

        head = head.getNext();
        if (head == null) {
            tail = null;
        }

        size--;
        return value;
    }

    @Override
    public T removeLast() {
        if (size <= 1)
            return removeFirst();

        LLNode<T> secondLast = get(size - 2);
        T value = tail.getData();
        tail = secondLast;
        tail.setNext(null);
        size--;

        return value;
    }

    @Override
    public T remove(int index) {
        if (index == 0)
            return removeFirst();
        if (index == size - 1)
            return removeLast();

        LLNode<T> prev = get(index - 1);
        T value = prev.getNext().getData();

        prev.setNext(prev.getNext().getNext());
        size--;

        return value;
    }

    @Override
    public LLNode<T> get(int index) {
        LLNode<T> node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node;
    }

    public LLNode<T> find(T value) {
        LLNode<T> node = head;

        while (node != null) {
            if (node.getData() == value)
                return node;
            node = node.getNext();
        }

        return null;
    }

    @Override
    public boolean contains(T element) {
        return find(element) != null;
    }

    @Override
    public void display() {
        LLNode<T> temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
}
