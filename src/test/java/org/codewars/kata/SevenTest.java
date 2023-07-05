package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.*;

public class SevenTest extends UserImplementations {
    @BeforeClass
    private void beforeClass() {
        Locale.setDefault(Locale.US);
    }

    @DataProvider(name = "testNewAvgData")
    private Object[][] testNewAvgData() {
        Object[][] testData = new Object[][]{
                {new double[]{191665.1, 88389.40000000001, 101141.70000000001,
                        211404.6, 75956.1, 61985.00000000001, 202103.00000000003,
                        131474.2, 105405.3, 88633.6, 179521.1, 105726.50000000001,
                        193063.2, 52027.8, 10495.1, 148401.0, 126592.40000000001,
                        40632.9, 188769.90000000002, 167888.6, 130959.40000000001,
                        91037.1, 104243.70000000001, 24671.9, 124075.6, 154069.30000000002,
                        45614.8, 116549.40000000001, 206438.1, 44597.3, 29803.4,
                        171752.90000000002, 57049.3, 160542.80000000002},
                        125512.10294117649, 460243},
                {new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628}
        };
        return UserImplementations.combineImplWithTests(UserImplementations.SEVENS, testData);
    }
    @Test(dataProvider = "testNewAvgData")
    public void testNewAvg(Seven impl, double[] value, double navg, double expected) {
        double actual = impl.newAvg(value, navg);
        assertEquals(actual, expected);
    }


    @DataProvider(name= "seriesSumTestData")
    private Object[][] seriesSumTestData() {
        Object[][] testData = new Object[][]{
                {5,"1.57"},
                {9,"1.77"},
                {15,"1.94"},
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