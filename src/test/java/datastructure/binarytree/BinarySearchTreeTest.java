package datastructure.binarytree;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @Before
    public void setUp() throws Exception {
        bst = new BinarySearchTree();
    }

    @Test
    public void insert() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        Assert.assertEquals("e", bst.find(5));
        Assert.assertEquals("c", bst.find(3));
        Assert.assertEquals("b", bst.find(2));
        Assert.assertEquals("d", bst.find(4));
        Assert.assertEquals("g", bst.find(7));
        Assert.assertEquals("f", bst.find(6));
        Assert.assertEquals("h", bst.find(8));
        Assert.assertEquals(null, bst.find(99));

        bst.prettyPrint();
        bst.printPreOrderTraversal();
    }

    @Test
    public void minKey() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");

        Assert.assertEquals(2, bst.findMinKey());
        bst.prettyPrint();
    }

    @Test
    public void deleteNoChild() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(8, "h");

        bst.delete(2);

        Assert.assertNull(bst.find(2));

        bst.prettyPrint();
    }

    @Test
    public void deleteOneChild() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");

        bst.prettyPrint();
        bst.delete(7);

        System.out.println("--- DELETE 7 --- \n");

        Assert.assertNull(bst.find(7));

        bst.prettyPrint();
    }

    @Test
    public void deleteTwoChildren() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(7, "g");
        bst.insert(6, "f");
        bst.insert(10, "h");
        bst.insert(9, "i");
        bst.insert(11, "j");
        bst.insert(1, "k");
        bst.insert(13, "l");
        bst.insert(12, "m");
        bst.insert(25, "n");
        bst.insert(22, "o");

        bst.prettyPrint();

        System.out.println("--- DELETE 7 --- \n");

        bst.delete(7);

        Assert.assertNull(bst.find(7));

        bst.prettyPrint();
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertExistsNode() throws Exception {
        bst.insert(5, "e");
        bst.insert(3, "c");
        bst.insert(2, "b");
        bst.insert(4, "d");
        bst.insert(25, "n");
        bst.insert(5, "o");

        bst.prettyPrint();
    }
}
