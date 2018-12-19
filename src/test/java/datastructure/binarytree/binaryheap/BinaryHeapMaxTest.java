package datastructure.binarytree.binaryheap;

import org.junit.Assert;
import org.junit.Test;

/**
 * This balancing strategy defines that the NodeHeap with the highest key must always remain as root
 */
public class BinaryHeapMaxTest {

    private BinaryHeapMax maxHeap;

    @Test
    public void extractMax() throws Exception {
        maxHeap = new BinaryHeapMax();
        maxHeap.insert(new NodeHeap(99));
        maxHeap.insert(new NodeHeap(22));
        maxHeap.insert(new NodeHeap(19));
        maxHeap.insert(new NodeHeap(67));
        maxHeap.print();

        System.out.println("--- Insert(81) ---");
        maxHeap.insert(new NodeHeap(81));
        maxHeap.print();

        // Test insert
        Assert.assertEquals(99, maxHeap.children[0].getKey());
        Assert.assertEquals(81, maxHeap.children[1].getKey());
        Assert.assertEquals(19, maxHeap.children[2].getKey());
        Assert.assertEquals(22, maxHeap.children[3].getKey());
        Assert.assertEquals(67, maxHeap.children[4].getKey());
    }

    @Test
    public void extractMaxBigger() throws Exception {
        maxHeap = new BinaryHeapMax();
        maxHeap.insert(new NodeHeap(42));
        maxHeap.insert(new NodeHeap(29));
        maxHeap.insert(new NodeHeap(18));
        maxHeap.insert(new NodeHeap(14));
        maxHeap.insert(new NodeHeap(7));
        maxHeap.insert(new NodeHeap(18));
        maxHeap.insert(new NodeHeap(12));
        maxHeap.insert(new NodeHeap(11));
        maxHeap.insert(new NodeHeap(13));
        Assert.assertEquals(9, maxHeap.getSize());
        maxHeap.print();

        System.out.println("--- REMOVE ALL WITH EXTRACT MAX ---");

        Assert.assertEquals(42, maxHeap.extractMax().getKey());
        Assert.assertEquals(29, maxHeap.extractMax().getKey());
        Assert.assertEquals(18, maxHeap.extractMax().getKey());
        Assert.assertEquals(18, maxHeap.extractMax().getKey());
        Assert.assertEquals(14, maxHeap.extractMax().getKey());
        Assert.assertEquals(13, maxHeap.extractMax().getKey());
        Assert.assertEquals(12, maxHeap.extractMax().getKey());
        Assert.assertEquals(11, maxHeap.extractMax().getKey());
        Assert.assertEquals(7, maxHeap.extractMax().getKey());
        Assert.assertEquals(0, maxHeap.getSize());

        maxHeap.print();
    }

}
