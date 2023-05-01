import java.util.NoSuchElementException;
public class MyArrayListQueue {
    private static MyArrayList queue = new MyArrayList();
    MyArrayListQueue() {
    }
    public static void enqueue(Object o) {
        queue.add(o);
    }
}