package string.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    //public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    @Test
    public void testanagram() {
        boolean actualResult = Anagram.isAnagram("cat", "tac");
        Assert.assertNotEquals( false, actualResult);
        System.out.println("test passed");
    }

    }

