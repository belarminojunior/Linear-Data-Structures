package nodes;

public class LLNode<T> {

    private T data;
    private LLNode<T> next;

    public LLNode(T data) {
        this.data = data;
        this.next = null;
    }

    public LLNode(T data, LLNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LLNode<T> getNext() {
        return next;
    }

    public void setNext(LLNode<T> next) {
        this.next = next;
    }
}
