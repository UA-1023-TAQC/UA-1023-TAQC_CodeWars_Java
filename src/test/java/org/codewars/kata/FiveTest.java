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

    @Test
    public void testSolve() {
    }

    @Test
    public void testSmallest() {
    }

    @Test
    public void testArtificialRain() {
    }
}