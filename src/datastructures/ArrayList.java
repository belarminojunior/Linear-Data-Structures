package datastructures;

import interfaces.ArrayListInterface;

import java.util.Arrays;

public class ArrayList<T> implements ArrayListInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialSize) {
        if (initialSize < 0)
            throw new IllegalArgumentException("Invalid initial capacity " + initialSize);

        this.data = new Object[initialSize];
        this.size = 0;
    }

    @Override
    public void add(T element) {
        if (isFull())
            resize();

        data[size++] = element;
    }

    @Override
    public void add(int index, T element) {
        validateIndex(index);
        validateElement(element);

        if(isFull())
            resize();

        for (int i = size(); i >= index ; i--) {
            data[i+1] = data[i];
        }

        data[index] = element;
        size++;

    }

    @Override
    public T remove(int index) {
        validateIndex(index);
        T oldValue = (T) data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
        }
        data[--size] = null;
        return oldValue;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return (T) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T element) {
        validateElement(element);

        for (int i = 0; i < size(); i++) {
            if (data[i] == element)
                return true;
        }

        return false;
    }

    @Override
    public int indexOf(T element) {
        validateElement(element);

        for (int i = 0; i < data.length; i++) {
            if (data[i] == element)
                return i;
        }

        return  -1;
    }

    @Override
    public void clear() {
        size = 0;
        data = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public T[] toArray() {
        return (T[]) Arrays.copyOf(data, size);
    }

    @Override
    public String toString() {
        String output = "[";

        for (int i = 0; i < size(); i++) {
            if (i == size() - 1)
                output += data[i] + "]";
            else
                output += data[i] + ", ";
        }

        return output;
    }

    private boolean isFull() {
        return data.length == size;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private void  validateIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void validateElement(T element) {
        if (element == null)
            throw new NullPointerException("Null value");
    }
}