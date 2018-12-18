package datastructure.stack;

import java.util.EmptyStackException;

/**
 * LIFO -> Last In First Out
 */
public class Stack<T> {

    private static class Node<T> {
        T data;
        Node next;
        private Node(T data) {
            this.data = data;
        }
    }

    private Node head; // add and remove here
    private int size;

    public boolean isEmpty() {
        return headIsNull();
    }

    public T peek() {
        return (T) head.data;
    }

    public void push(int data) {
        Node newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() {
        validateHead();
        T data = (T) head.data;
        head = head.next;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    private void validateHead() {
        if (headIsNull()){
            throw new EmptyStackException();
        }
    }

    private boolean headIsNull() {
        return head == null;
    }
}
