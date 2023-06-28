package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FiveTest extends UserImplementations {

    @Test
    public void testGap() {
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

    @DataProvider(name = "smallestTestData")
    private Object[][] smallestTestData() {
        Object[][] testData = new Object[][]{
                {261235, new long[] {126235, 2, 0}},
                {209917, new long[] {29917, 0, 1}},
                {285365, new long[] {238565, 3, 1}},
                {269045, new long[] {26945, 3, 0}},
                {269045, new long[] {26945, 3, 0}},
                {296837, new long[] {239687, 4, 1}}
        };

        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);
    }
    @Test(dataProvider = "smallestTestData")
    public void testSmallest(Five impl, int value, long[] expected) {
        long[] actual = impl.smallest(value);
        assertEquals(actual, expected);
    }

    @Test
    public void testArtificialRain() {
    }
}