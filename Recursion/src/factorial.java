/** This class implements two methods to find a factorial of a number
 * First method uses recursion
 * Second method uses iteration by for loop
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

    
}
