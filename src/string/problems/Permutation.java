package string.problems;

import java.util.Set;

public class Permutation {

    public static String swapString(String a, int i, int j){
        char [] b = a.toCharArray();
        char ch = 0;
        ch = b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutation of the string are: ");
        generatePermutation(str, 0, len);

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

    }
    private static void generatePermutation(String str, int start, int end ) {

        if (start == end - 1)
            System.out.println(str);
        else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutation(str, start + 1, end);
                str = swapString(str, start, i);
            }
        }
    }
    public static Set<String> getPermutation(String bob){
        return null;
    }

}

