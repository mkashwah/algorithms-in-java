/** This class implements two methods to find a factorial of a number
 * First method uses recursion
 * Second method uses iteration by for loop
 * Please note that the methods in this class are not foolproofed for now
 * @author M. Kashwah
 */
public class factorial {

    /**
     * This methods finds a factorial for input integer >= 1 by using recursion
     * ex: 5! = 5 * 4 * 3 * 2
     * @param num integer > 1 to find its factorial
     * @return factorial of num
     */
    public int findFactorialRecursive(int num) {
        int answer = 1;
        while(num > 1){
            return num*findFactorialRecursive(num-1);
        }
        return answer;
    }

    /**
     * This methods finds a factorial for input integer >= 1 by using iteration
     * @param num integer > 1 to find its factorial
     * @return factorial of num
     */
    public  int findFactorialIterative(int num){
        int answer = 1;
        for (int i = num; i >= 1; i--){
            answer *= i;
        }
        return answer;
    }


}
