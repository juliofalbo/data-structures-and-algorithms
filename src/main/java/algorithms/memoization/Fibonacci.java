package algorithms.memoization;

public class Fibonacci {

    private int[] memo = new int[1001];

    public int memoizationAlgorithm(int n) {
//        System.out.println("n = " + n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] == 0){
            memo[n] = memoizationAlgorithm(n - 1) + memoizationAlgorithm(n - 2);
        }
        return memo[n];
    }

    public int recursiveAlgorithm(int n) {
//        System.out.println("Start fib(" + n + ")");
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveAlgorithm(n - 1) + recursiveAlgorithm(n - 2);
        }
    }

}
