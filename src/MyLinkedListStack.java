import java.util.EmptyStackException;
public class MyLinkedListStack<E> extends MyLinkedList {
    private MyLinkedList<E> list;
    MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    /**
     * @push pushes an element onto the top of the stack
     * @param element the element to be pushed onto the stack
     */
    public void push(E element) {
        list.add(element, 0);
    }

    /**
     * @isEmpty checks if the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * @pop removes and returns the element at the top of the stack
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) list.remove(0);
    }

    /**
     * @peek returns the element at the top of the stack without removing it
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) list.get(0);
    }

    /**
     * @size returns the number of elements in the stack
     * @return the number of elements in the stack
     */
    public int size() {
        return list.size();
    }
}
