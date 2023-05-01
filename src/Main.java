import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        MyArrayListQueue<Integer> queue = new MyArrayListQueue<Integer>();

        // Enqueue some elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue and print elements until queue is empty
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        // Try to dequeue from an empty queue (should throw NoSuchElementException)
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }

        // Add more elements and check queue size and peek element
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek element: " + queue.peek());
    }
}
