public class recursion {
    public static void main(String[] args) {
        //testing factorial using recursion
        factorial fact = new factorial();
        int findFactorial = fact.findFactorialRecursive(5);
        System.out.println("factorial of 5 by recursion = " + findFactorial);

        //testing factorial using iteration
        int findFactorialIterative = fact.findFactorialIterative(5);
        System.out.println("factorial of 5 by iteration = " + findFactorialIterative);

        //testing Fibonacci using recursion
        fibonacci fib = new fibonacci();
        int fibRecursive = fib.fibonacciRecursive(6);
        System.out.println("Fibonacci at 6 using recursion = " + fibRecursive);

        //testing Fibonacci using iteration
        int fibIterative = fib.fibonacciIterative(6);
        System.out.println("Fibonacci at 6 using iteration = " + fibIterative);


        //testing reverseString
        reverseString reverser = new reverseString();
        String testString = "Recursion is painful";
        System.out.println(reverser.reverse(testString));


    }
}
