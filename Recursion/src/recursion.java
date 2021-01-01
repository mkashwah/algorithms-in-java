public class recursion {
    public static void main(String[] args) {
        //testing factorial using recursion
        factorial fact = new factorial();
        int findFactorial = fact.findFactorialRecursive(5);
        System.out.println("factorial of 5 by recursion = " + findFactorial);

        //testing factorial using iteration
        int findFactorialIterative = fact.findFactorialIterative(5);
        System.out.println("factorial of 5 by iteration = " + findFactorialIterative);
    }
}
