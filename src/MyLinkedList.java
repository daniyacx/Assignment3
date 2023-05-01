public class MyLinkedList<E> implements MyList{

    private static class Node<E> {
        public E item;
        public Node<E> previous;
        public Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    /**
     @return size;
     @size() - returns size of the array
     **/
    @Override
    public int size() {
        return size;
    }

    /**
     @contains checks whether there is an element in the array or not
     @param o - element that we need
     @return false - if not contains, true - if contains
     **/
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (get(i) == o) {
                return true;
            }
        }
        return false;
    }
    /**
     @param item - element that we add
     **/
    @Override
    public void add(Object item) {
        Node<E> node = new Node<>((E) item);
        if (head == null) {
            node.next = null;
            node.previous = null;
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }
    /**
     @add adds one element to the array by the index
     @param item element that we add
     @param index index of element that we need to add
     **/
    @Override
    public void add(Object item, int index) {
        // Throw an exception if the index is out of bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // Create a new node with the item to be added
        Node<E> newNode = new Node(item);
        if (index == 0) {
            // If the item is to be added at the head, update head and the new node's next pointer
            newNode.next = head;
            head = newNode;
        } else {
            // Otherwise, iterate through the list to find the node before the index where the new node should be added
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        // Increment the size of the list
        size++;
    }

    /**
     @remove removes one element from the array
     @param item element that we need to remove
     @return true if the function removes the element, otherwise, false
     **/
    @Override
    public boolean remove(Object item) {
        // If the list is empty, return false
        if (head == null) {
            return false;
        }
        // If the item to be removed is the head element, update head and return true
        if (head.item.equals(item)) {
            head = head.next;
            return true;
        }
        Node<E> current = head;
        while (current.next != null) {
            // If the item to be removed is found, remove it and return true
            if (current.next.item.equals(item)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        // If the item to be removed is not found, return false
        return false;
    }

    /**
     * @remove removes the element at the specified position in this list
     * @param index the index of the element to be removed
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of range
     **/
    public Object remove(int index) {
        // Check if the linked list is empty
        if (head == null) {
            return null;
        }

        // Check if the given index is the head node
        if (index == 0) {
            // Remove the head node and return the removed node
            Node<E> removedNode = head;
            head = head.next;
            return removedNode;
        }
        // Set current node to the head of the linked list
        Node<E> current = head;
        // Initialize a variable to keep track of the current index
        int count = 0;
        // Iterate over each node in the linked list until the node before the given index is reached
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        // Check if the given index is out of bounds or if the next node is null
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException();
        }
        // Remove the node at the given index and return the removed node
        Node<E> removedNode = current.next;
        current.next = current.next.next;
        return removedNode;
    }

    /**
     @clear creates new clear array
     **/
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    /**
     @get returns the element at the specified position in this list
     @param index the index of the element to retrieve
     @return the element at the specified position in this list
     throws IndexOutOfBoundsException if the index is out of range
     **/
    public Object get(int index) {
        // Check if the given index is within the bounds of the linked list
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Set current node to the head of the linked list
        Node<E> current = head;
        // Iterate over each node in the linked list until the given index is reached
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // Return the element stored in the node at the given index
        return current.item;
    }

    /**
     @indexOf returns the index of the first occurrence of the specified element in this list
     @param o the element to search for
     @return the index of the first occurrence of the specified element in this list,
     or -1 if this list does not contain the element
     **/
    public int indexOf(Object o) {
        Node<E> current = head;
        int index = 0;
        // Iterate over each node in the linked list
        while (current != null) {
            // Check if the current node's item is equal to the Object o
            if (current.item.equals(o)) {
                // If it is, return the current index
                return index;
            }
            // Move to the next node in the linked list and increment the index
            current = current.next;
            index++;
        }
        // If the element is not found, return -1
        return -1;
    }
    /**
     @lastIndexOf returns the last index of the specified element in this list
     @param o the element to search for
     @return the last index of the specified element in this list,
     or -1 if this list does not contain the element
     **/
    public int lastIndexOf(Object o) {
        // Set current node to the head of the linked list
        Node<E> current = head;
        int lastIndex = -1;
        int index = 0;
        // Iterate over each node in the linked list
        while (current != null) {
            // Check if the current node's item is equal to the Object o
            if (current.item.equals(o)) {
                // If it is, update the lastIndex variable to the current index
                lastIndex = index;
            }
            // Move to the next node in the linked list and increment the index
            current = current.next;
            index++;
        }
        // Return the last index of the specified element in the linked list, or -1 if it is not found
        return lastIndex;
    }

    /**
     @sort sorts the linked list in ascending order using the bubble sort algorithm
     **/
    @Override
    public void sort() {
        if (head == null || head.next == null) {
            // if the list is empty or has only one element, it is already sorted.
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node<E> prev = null;
            Node<E> current = head;
            Node<E> next = head.next;

            while (next != null) {
                if (((Comparable)current.item).compareTo(next.item) > 0) {
                    // If the current node's item is greater than the next node's item,
                    // swap the nodes by adjusting their pointers.
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    // Update the previous and next pointers to continue iterating.
                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    // If the current node's item is less than or equal to the next node's item,
                    // Update the previous and current pointers to continue iterating.
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }
}