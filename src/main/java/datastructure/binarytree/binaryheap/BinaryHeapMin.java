package datastructure.binarytree.binaryheap;

import java.util.Arrays;

public class BinaryHeapMin {
    private int capactity = 10;

    private int size = 0;

    public NodeHeap[] items = new NodeHeap[capactity];

    private int leftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return parentIndex(index) >= 0;
    }

    private NodeHeap leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private NodeHeap rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private NodeHeap parent(int index) {
        return items[parentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo) {
        NodeHeap temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureCapactity() {
        if (size == capactity) {
            items = Arrays.copyOf(items, capactity * 2);
            capactity *= 2;
        }
    }


    public NodeHeap extractMin() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        NodeHeap item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(NodeHeap item) {
        ensureCapactity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index).getKey() > items[index].getKey()) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && rightChild(index).getKey() < leftChild(index).getKey()) {
                smallerChildIndex = rightChildIndex(index);
            }
            if (items[index].getKey() < items[smallerChildIndex].getKey()) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "[" + items[i].getKey() + "]");
        }
    }

    public int getSize() {
        return size;
    }
}
