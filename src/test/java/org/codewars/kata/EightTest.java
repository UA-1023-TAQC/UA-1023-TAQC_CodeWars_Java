package org.codewars.kata;


import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EightTest extends UserImplementations {


    @DataProvider(name = "litersTestData")
    private Object[][] litersTestData() {
        Object[][] testData = new Object[][]{
                {2, 1},
                {0.97, 0},
                {14.64, 7}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);

    }


    @Test(dataProvider = "litersTestData")
    public void testLiters(Eight impl, double value, int expected) {
        int actual = impl.liters(value);
        assertEquals(actual, expected);
    }


    @Test
    public void testGetVolumeOfCuboid() {
    }

    @Test
    public void testMpgToKPM() {
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @DataProvider(name = "countPositivesSumNegatives")
    private Object[][] countPositivesSumNegatives() {
        Object[][] testData = new Object[][] {
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14},new int[]{8, -50}},
                {null, new int[]{}},
                {new int[]{}, new int[]{}}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);
    }
    @Test(dataProvider = "countPositivesSumNegatives")
    public void testCountPositivesSumNegatives(Eight impl, int[] value, int[] expected) {
        int[] actual = impl.countPositivesSumNegatives(value);
        assertEquals(actual, expected, "Wrong count positives and sum negatives");
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }

    @Test
    public void testAm_i_wilson() {
    }
}