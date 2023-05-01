import java.util.EmptyStackException;
import java.util.ArrayList;
public class MyArrayListStack<E> {
    private ArrayList<E> list;

    public MyArrayListStack() {
        list = new ArrayList<>();
    }

    public void push(E element) {
        list.add(element);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(0);
    }
}