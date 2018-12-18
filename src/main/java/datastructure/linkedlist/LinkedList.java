package datastructure.linkedlist;

public class LinkedList<T> {

    private static class Node<T> {

        T data;

        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    public void addFront(final T data) {
        Node<T> newNode = new Node<>(data);

        if (headIsNull()) {
            head = newNode;
            return;
        }

        newNode.next = this.head;
        head = newNode;
    }

    public T getFirst() {
        validateHead();
        return (T) head.data;
    }

    public T getLast() {
        return (T) findTail().data;
    }

    public void addBack(final T data) {
        if(headIsNull()){
            addFront(data);
            return;
        }
        findTail().next = new Node<>(data);
    }

    public int size() {
        if(headIsNull()){
            return 0;
        }
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean contains(T data){
        Node current = head;
        if(current.data.equals(data)){
            return true;
        }
        while (current.next != null) {
            if(current.next.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        head = null;
    }

    public void removeFront() {
        head = head.next;
    }

    public void removeBack() {
        validateHead();
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public void deleteValue(final T data) {
        validateHead();
        if(head.data.equals(data)){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data.equals(data)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    private void validateHead() {
        if(headIsNull()){
            throw new IllegalStateException("The list is empty");
        }
    }

    private Node findTail() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    private boolean headIsNull() {
        return head == null;
    }
}
