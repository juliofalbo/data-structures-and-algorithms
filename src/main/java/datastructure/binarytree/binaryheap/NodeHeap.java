package datastructure.binarytree.binaryheap;

public class NodeHeap {
    private int key;
    private String value;

    public NodeHeap(int key) {
        this.key = key;
        this.value = "key -> " + key;
    }

    public NodeHeap(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}