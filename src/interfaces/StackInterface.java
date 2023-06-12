package interfaces;

public interface StackInterface<T> {

    boolean isEmpty();
    T peek();
    T pop();
    T push (T element);
    int search(T element);

}
