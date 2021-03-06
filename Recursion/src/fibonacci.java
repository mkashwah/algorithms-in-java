/**
 * Given a number N return the index value of the Fibonacci sequence, where the sequence is:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 * the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3
 *
 * For example: fibonacciRecursive(6) should return 8
 * @author M. Kashwah
 */
public class fibonacci {
    /**
     * This method finds Fibonacci number at index num using recursion
     * @param num positive integer equals to index of a Fibonacci entry
     * @return Fibonacci at index num
     */
    public int fibonacciRecursive(int num){
        if (num <2){      //base case
            return num;
        } else {             //recursive case
            return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
        }
    }

    /**
     * This method finds Fibonacci number at index num using iterations
     * @param num positive integer equals to index of a Fibonacci entry
     * @return Fibonacci at index num
     */
    public int fibonacciIterative(int num){
        int sum = 0;
        int fib0 = 0;
        int fib1 = 1;
        if (num == 0){
            return fib0;
        } else if (num == 1){
            return fib1;
        }else {
            for (int i = 0; i <= num - 2; i++) {
                sum = fib0 + fib1;
                fib0 = fib1;
                fib1 = sum;
            }
            return sum;
        }
    }

}
