package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         //range of number between 0 and 39 is 40.
        int i = 0, n = 39, firstNum = 0, secondNum = 1;
        System.out.println( " + n + ");

        while (i <= n) {
            System.out.print(firstNum + ", ");

            int nextTerm = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextTerm;

            i++;
        }
    }
}
