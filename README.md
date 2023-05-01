# Assignment3
This repository contains implementations of basic data structures. The following data structures are implemented:

1) Array List
2) Linked List
3) Queue
4) Stack

Each implementation has its own file with the class name matching the data structure name.
## Description

The Stack and Queue Implementations are data structures used to manage collections of elements. A Stack follows the Last-In-First-Out (LIFO) principle, while a Queue follows the First-In-First-Out (FIFO) principle.

## Method Description
### Queue
The `MyArrayListQueue` and `MyLinkedListQueue` classes implement a queue, which is a data structure that follows the FIFO (first in, first out) principle. They have the following methods:

`enqueue(E element)`: Adds an element to the end of the queue.

`dequeue()`: Removes and returns the first element in the queue.

`peek()`: Returns the first element in the queue without removing it.

`size()`: Returns the size of the queue.

`isEmpty()`: Returns a boolean indicating if the queue is empty.

### Stack
The MyArrayListStack and MyLinkedListStack classes implement a stack, which is a data structure that follows the LIFO (last in, first out) principle. They have the following methods:

`push(E element)`: Adds an element to the top of the stack.

`pop()`: Removes and returns the top element in the stack.

`peek()`: Returns the top element in the stack without removing it.

`size()`: Returns the size of the stack.

`isEmpty()`: Returns a boolean indicating if the stack is empty.
## Solution
``` /**
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
```

```
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
   ```
