package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SixTest extends UserImplementations {

    @DataProvider(name = "findNbTestData")
    private Object[][] findNbTestData() {
        Object[][] testData = new Object[][]{
                {2022, 4183059834009L},
                {-1, 24723578342962L},
                {4824, 135440716410000L},
                {3568, 40539911473216L}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.SIXES, testData);
    }
    @Test(dataProvider = "findNbTestData")
    public void testFindNb(Six impl, long expected, long value) {
        long actual = impl.findNb(value);
        assertEquals(actual,expected);
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}