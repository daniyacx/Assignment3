import java.util.EmptyStackException;
public class MyLinkedListStack<E> extends MyLinkedList {
    private MyLinkedList<E> list;

    MyLinkedListStack() {
        list = new MyLinkedList<>();
    }
    public void push(E element) {
        list.add(element, 0);
    }
    public boolean isEmpty() {
        return list.size() == 0;
    }
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) list.remove(0);
    }
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) list.get(0);
    }
    public int size() {
        return list.size();
    }
}
