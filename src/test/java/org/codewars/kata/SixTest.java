package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

import static org.testng.Assert.*;

public class SixTest extends UserImplementations {

    @Test
    public void testFindNb() {
    }

    @Test
    public void testBalance() {
    }

    @DataProvider(name = "fTestData")
    private Object[][] fTestData() {
        Object[][] testData = new Object[][]{
                {2.6e-08, 1.29999999155e-08},
                {1.4e-09, 6.999999997549999e-10},
                {5.0e-06, 2.499996875007812e-06},
                {2.4e-07, 1.1999999280000085e-07}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.SIXES, testData);

    }
    private void assertFuzzyEquals(double act, double exp){
        boolean inrange;
        double merr = 1e-12;
        if (exp == 0.0)
            inrange = Math.abs(act) <= merr;
        else {
            double e = Math.abs((act - exp) / exp);
            inrange = e <= 1e-12;
        }
        if (inrange == false) {
            DecimalFormat df = new DecimalFormat("#.0000000000000000");
            System.out.println("Expected must be near " + exp +", but got " + act);
        }
        assertEquals(true, inrange);
    }
    @Test(dataProvider = "fTestData")
    public void testF(Six impl, double value, double expected) {
        double actual = impl.f(value);
        assertFuzzyEquals(actual, expected);
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
