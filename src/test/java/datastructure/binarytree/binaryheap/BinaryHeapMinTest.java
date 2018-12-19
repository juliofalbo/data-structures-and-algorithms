package datastructure.binarytree.binaryheap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryHeapMinTest {

    private BinaryHeapMin minHeap;

    @Before
    public void setUp() throws Exception {
        minHeap = new BinaryHeapMin();
        minHeap.add(new NodeHeap(6));
        minHeap.add(new NodeHeap(5));
        minHeap.add(new NodeHeap(4));
        minHeap.add(new NodeHeap(3));
        minHeap.add(new NodeHeap(2));
        minHeap.add(new NodeHeap(1));
    }

    @Test
    public void insert() throws Exception {
        minHeap.print();
        Assert.assertEquals(1, minHeap.items[0].getKey());
        Assert.assertEquals(3, minHeap.items[1].getKey());
        Assert.assertEquals(2, minHeap.items[2].getKey());
        Assert.assertEquals(6, minHeap.items[3].getKey());
        Assert.assertEquals(4, minHeap.items[4].getKey());
        Assert.assertEquals(5, minHeap.items[5].getKey());
    }

    @Test
    public void extractMin() throws Exception {
        minHeap.print();

        System.out.println("--- REMOVE ALL WITH EXTRACT MIN ---");

        Assert.assertEquals(1, minHeap.extractMin().getKey());
        Assert.assertEquals(2, minHeap.extractMin().getKey());
        Assert.assertEquals(3, minHeap.extractMin().getKey());
        Assert.assertEquals(4, minHeap.extractMin().getKey());
        Assert.assertEquals(5, minHeap.extractMin().getKey());
        Assert.assertEquals(6, minHeap.extractMin().getKey());
        Assert.assertEquals(0, minHeap.getSize());
    }
}
