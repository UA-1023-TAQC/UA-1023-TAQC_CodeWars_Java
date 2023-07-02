package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SevenTest extends UserImplementations {

    @Test
    public void testNewAvg() {
    }

    @DataProvider(name= "seriesSumTestData")
    private Object[][] seriesSumTestData() {
        Object[][] testData = new Object[][]{
                {5,"1,57"},
                {9,"1,77"},
                {15,"1,94"},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.SEVENS, testData);
    }
    @Test (dataProvider = "seriesSumTestData")
    public void testSeriesSum(Seven impl, int n, String expected) {
        String actual =impl.seriesSum(n);
        assertEquals(actual,expected);
    }

    @DataProvider(name = "whereIsHeTestData")
    private Object[][] whereIsHeTestData() {
        Object[][] testData = new Object[][]{
                {3, 1, 1, 2},
                {5, 2, 3, 3},
                {61, 11, 55, 50},
                {42, 7, 18, 19},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.SEVENS, testData);

    }
    @Test (dataProvider = "whereIsHeTestData")
    public void testWhereIsHe(Seven impl, int p, int bef, int aft, int expected) {
        int actual = impl.whereIsHe(p, bef, aft);
        assertEquals(actual, expected);
    }
}