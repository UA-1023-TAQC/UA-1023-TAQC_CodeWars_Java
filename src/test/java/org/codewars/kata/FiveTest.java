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

    @Test
    public void testArtificialRain() {
    }
}