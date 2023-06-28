package org.codewars.kata;


import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

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

    @DataProvider(name = "squareOrSquareRootTestData")
    private Object[][] squareOrSquareRootTestData() {
        Object[][][] testData = new Object[][][]{
                {{ 4, 3, 9, 7, 2, 1 }, { 4, 3, 9, 7, 2, 1 }}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);

    }
    @Test(dataProvider = "squareOrSquareRootTestData")
    public void testSquareOrSquareRoot(Eight impl, int[] value, int[] expected) {
        int[] actual = impl.squareOrSquareRoot(value);
        assertEquals(Arrays.toString(expected),  Arrays.toString(actual));
    }

    @Test
    public void testCountPositivesSumNegatives() {
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