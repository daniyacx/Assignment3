import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> list;
    public MyArrayListQueue() {
        list = new ArrayList<E>();
    }

    /**
     * @enqueue adds the specified element to the end of the queue
     * @param element the element to be added
     */
    public void enqueue(E element) {
        list.add(element);
    }

    /**
     * @isEmpty returns true if the queue is empty, false otherwise
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * @dequeue removes and returns the element at the front of the queue
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    /**
     * @peek returns the element at the front of the queue without removing it
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    /**
     * @size returns the number of elements in the queue
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }
}