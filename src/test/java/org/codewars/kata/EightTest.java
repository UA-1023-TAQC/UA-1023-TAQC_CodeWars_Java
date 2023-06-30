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


    @DataProvider(name = "MpgToKPMTestData")
    private Object[][] MpgToKPMTestData() {
        Object[][] testData = new Object[][]{
                {3.54f, 10, 0.001f},
                {7.08f, 20, 0.001f},
                {10.62f, 30, 0.001f},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);

    }
    @Test(dataProvider = "MpgToKPMTestData")
    public void testMpgToKPM(Eight impl, float expected, float value, float data ) {
        double actual = impl.mpgToKPM(value);
        assertEquals(actual, expected, data);
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

    @DataProvider(name = "divisibleByTestData")
    private Object[][] divisibleByTestData() {
        Object[][] testData = new Object[][]{
                {new int[] {1,2,3,4,5,6}, 2, new int[] {2,4,6}},
                {new int[] {1,2,3,4,5,6}, 3, new int[] {3,6}},
                {new int[] {0,1,2,3,4,5,6}, 4, new int[] {0,4}}
        };

        return UserImplementations.combineImplWithTests(UserImplementations.EIGHTS, testData);
    }

    @Test(dataProvider = "divisibleByTestData")
    public void testDivisibleBy(Eight impl, int[] numbers, int divider, int[] expected) {
        int[] actual = impl.divisibleBy(numbers, divider);
        assertEquals(actual, expected);
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