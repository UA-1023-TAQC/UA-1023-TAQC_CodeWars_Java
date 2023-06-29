package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class SixTest extends UserImplementations {

    @Test
    public void testFindNb() {
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

    @DataProvider(name = "stockSummaryTestData")
    private Object[][] stockSummaryTestData() {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] cd = new String[]{"A", "B"};
        String expected = "(A : 200) - (B : 1140)";
        Object[][] testData = new Object[][]{ {art, cd, expected}};
        return UserImplementations.combineImplWithTests(UserImplementations.SIXES, testData);
    }
    @Test(dataProvider = "stockSummaryTestData")
    public void testStockSummary(Six impl, String[] art, String[] cd, String expected) {
        String actual = impl.stockSummary(art, cd);
        assertEquals(actual, expected);
    }
}