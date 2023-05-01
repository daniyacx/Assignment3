public class MyArrayList implements MyList {
    private Object[] arr;
    private int size;

    MyArrayList() {
        this.size = 0;
        this.arr = new Object[5];
    }

    /**
     * @return size;
     * @size returns size of the array
     **/
    @Override
    public int size() {
        return size;
    }

    /**
     * @param o element that we need
     * @return false if not contains, true if contains
     * @contains checks whether there is an element in the array or not
     **/
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }

    /**
     * @increaseBuffer increases the size of the array by doubling it
     **/
    public void increaseBuffer() {
        Object[] newArr = new Object[arr.length * 2];
        for (int i = 0; i == arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    /**
     * @param item element that we add
     * @add() adds one element to the array
     **/
    @Override
    public void add(Object item) {
        if (size == arr.length) {
            increaseBuffer();
        } else {
            arr[size++] = item;
        }
    }

    /**
     * @param item  the element to add
     * @param index the index at which to add the element
     * @throws IndexOutOfBoundsException if the index is invalid
     * @add() adds an element to the array at the specified index
     **/
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length) {
            increaseBuffer();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        size++;
        arr[index] = item;
    }

    /**
     * @param item the element to be removed
     * @return true if the element was successfully removed, false otherwise
     * @remove() removes the first occurrence of the specified element from the list, if it is present
     **/
    @Override
    public boolean remove(Object item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().equals(item.toString())) {
                Object removed = remove(i);
                System.out.println(removed);
                return true;
            }
        }
        return false;
    }

    /**
     * @param index the index of the element to be removed
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of range
     * @remove removes the element at the specified index and returns it
     **/
    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (; index < size; index++) {
            if (index < arr.length - 1) {
                arr[index] = arr[index + 1];
            }
        }
        size--;
        return "Successfully removed element";
    }

    /**
     * @clear creates new clear array
     **/
    @Override
    public void clear() {
        this.arr = new Object[5];
        this.size = 0;
    }

    /**
     * returns the element at the specified position in this list
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     **/
    @Override
    public Object get(int index) {
        // Check if the index is valid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Check if the element is present in the underlying array
        if (index < arr.length) {
            return arr[index];
        } else {
            // Return a message indicating that the index is not found
            return "Index not found";
        }
    }

    /**
     * @param o the element to search for
     * @return the index of the first occurrence of the specified element in this list,
     * or -1 if this list doesnt contain the element
     * @indexOf returns the index of the first occurrence of the specified element in this list
     **/
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toString().equals(o.toString())) {
                return i;
            }
        }
        return 1;
    }

    /**
     * @param o the element to search for
     * @return the last index of the element in the list, or -1 if not found
     * @lastIndexOf returns the last index of the specified element in the list
     **/
    @Override
    public int lastIndexOf(Object o) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].toString().equals(o.toString())) {
                return i;
            }
        }
        return 1;
    }

    /**
     * @sort sorts the elements in the list in ascending order
     **/
    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ((int) arr[j] < (int) arr[i]) {
                    Object box = arr[i];
                    arr[i] = arr[j];
                    arr[j] = box;
                }
            }
        }
    }
}