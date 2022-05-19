package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        //convert into chararray
        else {
           char [] str1Array =str1.toCharArray();
           char [] str2Array =str2.toCharArray();

        //sort the array
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array,str2Array);
        }
    }
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

      Scanner sc = new Scanner(System.in);

      System.out.println("please enter string 1 : ");
      String str1 = sc.nextLine();

      System.out.println("please enter string 2 : ");
      String str2 = sc.nextLine();

      str1 = str1.replaceAll("\\s", "").toUpperCase();
      str2 = str2.replaceAll("\\s", "").toUpperCase();

      if (isAnagram(str1,str2))
          System.out.println("Strings : " + str1 +" and " + str2 + " are anagram");
      else
          System.out.println("Strings : " + str1 +" and " + str2 + " are NOT anagram");
    }
}
