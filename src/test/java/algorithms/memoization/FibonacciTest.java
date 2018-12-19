package algorithms.memoization;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void recursiveAlgorithm() throws Exception {
        Assert.assertEquals(0, fibonacci.recursiveAlgorithm(0));
        Assert.assertEquals(1, fibonacci.recursiveAlgorithm(1));
        Assert.assertEquals(1, fibonacci.recursiveAlgorithm(2));
        Assert.assertEquals(2, fibonacci.recursiveAlgorithm(3));
        Assert.assertEquals(3, fibonacci.recursiveAlgorithm(4));
        Assert.assertEquals(5, fibonacci.recursiveAlgorithm(5));
        Assert.assertEquals(8, fibonacci.recursiveAlgorithm(6));
        Assert.assertEquals(13, fibonacci.recursiveAlgorithm(7));
        Assert.assertEquals(21, fibonacci.recursiveAlgorithm(8));
    }

    @Test
    public void memoizedAlgorithm() throws Exception {
        Assert.assertEquals(0, fibonacci.memoizationAlgorithm(0));
        Assert.assertEquals(1, fibonacci.memoizationAlgorithm(1));
        Assert.assertEquals(1, fibonacci.memoizationAlgorithm(2));
        Assert.assertEquals(2, fibonacci.memoizationAlgorithm(3));
        Assert.assertEquals(3, fibonacci.memoizationAlgorithm(4));
        Assert.assertEquals(5, fibonacci.memoizationAlgorithm(5));
        Assert.assertEquals(8, fibonacci.memoizationAlgorithm(6));
        Assert.assertEquals(13, fibonacci.memoizationAlgorithm(7));
        Assert.assertEquals(21, fibonacci.memoizationAlgorithm(8));
    }

    @Test
    public void timeRecursiveAlgorith() {
        long startTime = System.currentTimeMillis();
        fibonacci.recursiveAlgorithm(50);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime);
    }

    @Test
    public void timeMemoizedAlgorithm() {
        long startTime = System.currentTimeMillis();
        fibonacci.memoizationAlgorithm(1000);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime);
    }

}
