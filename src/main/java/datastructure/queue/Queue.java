package datastructure.queue;

/**
 * FIFO -> First In First Out
 */
public class Queue<T> {

    private static class Node<T> {
        T data;
        Node next;
        private Node(T data) {
            this.data = data;
        }
    }

    private Node head; // remove here
    private Node tail; // add here
    private int size;

    public boolean isEmpty() {
        return headIsNull();
    }

    public T peek() {
        return (T) head.data;
    }

    public void add(int data) {
        Node newNode = new Node<>(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        if (headIsNull()) {
            head = tail;
        }
        size++;
    }

    public T remove() {
        validateHead();
        T data = (T) head.data;
        head = head.next;

        if (headIsNull()) {
            tail = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    private boolean headIsNull() {
        return head == null;
    }

    private void validateHead() {
        if (headIsNull()){
            throw new IllegalStateException("Queue is empty");
        }
    }
}
