import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> list;

    public MyLinkedListQueue() {

        list = new LinkedList<E>();
    }
    /**
     * @enqueue adds the specified element to the end of the queue
     * @param element the element to add
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
     * @dequeue retrieves and removes the head of the queue
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.remove(0);
    }

    /**
     * @peek retrieves, but doesnt remove, the head of the queue
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (E) list.get(0);
    }

    /**
     * @size returns the number of elements in the queue
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }
}