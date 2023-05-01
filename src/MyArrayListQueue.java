import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> list;

    public MyArrayListQueue() {
        list = new ArrayList<E>();
    }
    public void enqueue(E element) {
        list.add(element);
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }
}