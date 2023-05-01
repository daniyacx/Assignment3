import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    private ArrayList<E> list;

    public MyArrayListStack() {
        list = new ArrayList<>();
    }

    /**
     * @push pushes an element onto the top of this stack
     * @param element the element to be pushed onto this stack
     */
    public void push(E element) {
        list.add(element);
    }

    /**
     * @isEmpty tests if this stack is empty
     * @return true if and only if this stack contains no items; false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * @pop removes and returns the element at the top of this stack
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(size() - 1);
    }

    /**
     * @peek returns the element at the top of this stack without removing it
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(size() - 1);
    }

    /**
     * @size returns the number of elements in this stack
     * @return the number of elements in this stack
     */
    public int size() {
        return list.size();
    }
}