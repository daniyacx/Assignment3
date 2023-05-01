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
}
