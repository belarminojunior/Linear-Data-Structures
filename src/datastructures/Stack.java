package datastructures;

import interfaces.StackInterface;

public class Stack<T> implements StackInterface<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int pointer = -1;

    public Stack(int initialSize) {
        this.data = new Object[initialSize];
    }

    public Stack() {
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1;
    }

    public int size() {
        return pointer;
    }

    @Override
    public T peek() throws Exception {
        if (isEmpty())
            throw new Exception("Can't peek an empty Stack.");
        return (T)data[pointer];
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't pop an empty Stack.");
        }

        T removed = (T) data[pointer];
        pointer--;
        return removed;
    }

    @Override
    public void push(T element) {
        validateElement(element);
        if(isFull())
            resize();

        pointer++;
        data[pointer] = element;
    }

    private boolean isFull() {
        return data.length == pointer - 1;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public void display() {
        for (int i = pointer; i >= 0; i--) {
            String num = String.valueOf(data[i]);
            int numLength = num.length();

            System.out.println("┌─" + "─".repeat(numLength) + "─┐");
            System.out.println("│ " + num + " │");
            System.out.println("└─" + "─".repeat(numLength) + "─┘");
        }
    }

    private void validateElement(T element) {
        if (element == null)
            throw new NullPointerException("Null value");
    }
}
