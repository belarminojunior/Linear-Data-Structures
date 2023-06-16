package interfaces;

public interface QueueInterface<T> {

    void insert(T element);
    T remove();
    T front();
    void display();
    boolean isEmpty();
    int size();

}
