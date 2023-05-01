import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> list;

    public MyLinkedListQueue() {

        list = new LinkedList<E>();
    }
    public void enqueue(E element) {
        list.add(element);
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.remove(0);
    }
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.get(0);
    }
}