package datastructure.linkedlist;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList<>();
    }

    @Test
    public void addFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(3, (int) linkedList.getFirst());
        Assert.assertEquals(1, (int) linkedList.getLast());
    }

    @Test
    public void setFirst() {
        linkedList.addFront(1);
        Assert.assertEquals(1, (int) linkedList.getFirst());
    }

    @Test
    public void setLast() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(1, (int) linkedList.getLast());
    }

    @Test
    public void addBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(1, (int) linkedList.getFirst());
        Assert.assertEquals(3, (int) linkedList.getLast());
    }

    @Test
    public void size() {
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assert.assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void contains() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(true, linkedList.contains(1));
        Assert.assertEquals(true, linkedList.contains(2));
        Assert.assertEquals(true, linkedList.contains(3));
        Assert.assertEquals(false, linkedList.contains(4));
    }

    @Test
    public void deleteValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteValue(2);

        Assert.assertEquals(2, linkedList.size());
        Assert.assertEquals(1, (int) linkedList.getFirst());
        Assert.assertEquals(3, (int) linkedList.getLast());
    }

    @Test
    public void removeFront() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.removeFront();
        Assert.assertEquals(2, (int) linkedList.getFirst());

        linkedList.removeFront();
        Assert.assertEquals(3, (int) linkedList.getFirst());
    }

    @Test
    public void removeBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.removeBack();
        Assert.assertEquals(2, (int) linkedList.getLast());

        linkedList.removeBack();
        Assert.assertEquals(1, (int) linkedList.getLast());
    }

}
