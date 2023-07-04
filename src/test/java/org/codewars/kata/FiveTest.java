package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiveTest extends UserImplementations {

    @DataProvider(name = "gapTestData")
    private Object[][] gapTestData() {
        Object[][] testData = new Object[][]{
                {2, 100, 110, new long[]{101, 103}},
                {4,100,110, new long[]{103, 107}},
                {6,100,110, null},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);
    }
    @Test (dataProvider = "gapTestData")
    public void testGap(Five impl, int g, long m, long n, long[] expected) {
        long[] actual = impl.gap(g, m, n);
        assertEquals(actual, expected);
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @DataProvider(name = "solveTestData")
    private Object[][] solveTestData() {
        Object[][] testData = new Object[][]{
                {2.0, 0.5},
                {8.0, 0.7034648345913732},
                {12.0, 0.75}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);

    }

    @Test(dataProvider = "solveTestData")
    public void testSolve(Five impl, double value, double expected) {
        double actual = impl.solve(value);
        assertEquals(actual, expected);
    }

    @Test
    public void testSmallest() {
    }


    @DataProvider(name = "artificialRainTestData")
    private Object[][] artificialRainTestData() {
        Object[][] testData = new Object[][]{
                {new int[] {2}, 1},
                {new int[] {1,2,1,2,1}, 3},
                {new int[] {1,2,1,1,1,3,3,4}, 6}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);
    }
    @Test(dataProvider = "artificialRainTestData")
    public void testArtificialRain(Five impl, int[] value, int expected) {
        int actual = impl.artificialRain(value);
        assertEquals(actual, expected);
    }
}