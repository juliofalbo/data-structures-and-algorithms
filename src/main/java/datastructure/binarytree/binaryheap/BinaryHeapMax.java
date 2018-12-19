package datastructure.binarytree.binaryheap;

import java.util.Arrays;

/**
 * extractMax -> O(1)
 * heapifyUp && heapifyDown -> O(log n) [single run]
 *
 */
public class BinaryHeapMax {
    private int capactity = 10;
    private int size = 0;

    public NodeHeap[] children = new NodeHeap[capactity];

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
        return children[leftChildIndex(index)];
    }

    private NodeHeap rightChild(int index) {
        return children[rightChildIndex(index)];
    }

    private NodeHeap parent(int index) {
        return children[parentIndex(index)];
    }

    public NodeHeap extractMax() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        NodeHeap item = children[0];
        children[0] = children[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    private void ensureCapactity() {
        if (size == capactity) {
            children = Arrays.copyOf(children, capactity * 2);
            capactity *= 2;
        }
    }

    public void insert(NodeHeap NodeHeap) {
        ensureCapactity();
        children[size] = NodeHeap;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index).getKey() < children[index].getKey()) {
            swap(parentIndex(index), index);
            index = parentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && rightChild(index).getKey() > leftChild(index).getKey()) {
                smallerChildIndex = rightChildIndex(index);
            }

            if (children[index].getKey() > children[smallerChildIndex].getKey()) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "[" + children[i].getKey() + "]");
        }
    }

    private void swap(int indexOne, int indexTwo) {
        NodeHeap temp = children[indexOne];
        children[indexOne] = children[indexTwo];
        children[indexTwo] = temp;
    }

    public int getSize() {
        return size;
    }


}
