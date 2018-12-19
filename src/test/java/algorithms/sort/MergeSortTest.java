package algorithms.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort mergeSort;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void sort() throws Exception {
        int array[] = {4, 7, 14, 1, 3, 9, 17};

        int left = 0;
        int right = array.length - 1;

        mergeSort.sort(array, left, right);

        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(3, array[1]);
        Assert.assertEquals(4, array[2]);
        Assert.assertEquals(7, array[3]);
        Assert.assertEquals(9, array[4]);
        Assert.assertEquals(14, array[5]);
        Assert.assertEquals(17, array[6]);

        System.out.println("\n --- Sorted array ---");
        mergeSort.printArray(array);
    }

}
