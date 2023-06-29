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

    @DataProvider(name = "wilsonTestData")
    private Object[][] wilsonTestData() {
        Object[][] testData = new Object[][]{
                {0, false},
                {1, false},
                {5, true},
                {13, true},
                {563, true}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);
    }
    @Test(dataProvider = "wilsonTestData")
    public void testAm_i_wilson(Eight impl, int value, boolean expected) {
        boolean actual = impl.am_i_wilson(value);
        assertEquals(actual, expected);
    }
}