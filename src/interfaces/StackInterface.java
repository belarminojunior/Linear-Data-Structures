package interfaces;

public interface StackInterface<T> {

    boolean isEmpty();
    int size();
    T peek() throws Exception;
    T pop() throws Exception;
    void push (T element);
    void display();

}
