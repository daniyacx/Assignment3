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
}