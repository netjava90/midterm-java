package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestingMath {
    //public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    // Test factorial
    @Test
    public void testFactorial() {
        int expectedResult = 120;
        int actualResult = Factorial.factorial(5);
        Assert.assertEquals( expectedResult, actualResult);
        System.out.println("test passed");
    }


    // Test pattern
    @Test
    public void testPattern() {
        int actualResult = Pattern.pattern();
        Assert.assertEquals(-1,  actualResult);
        System.out.println("test passed");
    }


    // Test findMissingNumber method
    @Test
    public void testFindMissingNumber() {
        int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int actualResult = FindMissingNumber.missingNumber(array);
        Assert.assertEquals( expectedResult, actualResult);
        System.out.println("test passed");
    }


       }



