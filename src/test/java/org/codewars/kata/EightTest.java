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

    @DataProvider(name = "getVolumeOfCuboidTestData")
    private Object[][] getVolumeOfCuboidTestData() {
        Object[][] testData = new Object[][]{
                {1, 2, 2, 4},
                {6.3, 2, 5, 63},
                {86.94277953642487, 55.602452271607994, 89.56383587984139, 432972.33902047126}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);

    }
    @Test(dataProvider = "getVolumeOfCuboidTestData")
    public void testGetVolumeOfCuboid(Eight impl, double length, double width, double height, double expected) {
        double actual = impl.getVolumeOfCuboid(length, width, height);
        assertEquals(actual, expected);
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

    @DataProvider(name = "stringToNumberTestData")
    private Object[][] stringToNumberTestData() {
        Object[][] testData = new Object[][]{
                {"2", 2},
                {"0", 0},
                {"-123", -123},
                {"495797", 495797},
                {"2147483647", 2147483647}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);

    }
    @Test(dataProvider = "stringToNumberTestData")
    public void testStringToNumber(Eight impl, String value, int expected) {
        int actual = impl.stringToNumber(value);
        assertEquals(actual, expected, "Number was parsed wrong:");
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