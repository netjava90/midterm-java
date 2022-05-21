package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = sc.nextLine();
        String str1 = str;

        String rev = "";

        int length = str.length();

        for(int i = length-1; i >= 0; i--){
            rev = rev+str.charAt(i);
        }

        if(str1.equals(rev)){
            System.out.println(str1+" Is a palindrome String");
        }
       else {
           System.out.println(str1+" Is NOT a palindrome String");
        }
    }

}
