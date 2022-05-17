package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n==1) {
            return 1;
        } else {// use the recurrence relation
            return n * factorial(n-1);
        }
    }
}






