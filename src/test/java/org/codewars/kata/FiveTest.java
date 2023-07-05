package org.codewars.kata;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

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

    @DataProvider(name = "testZerosData")
    private Object[][] testZerosData() {
        Object[][] testData = new Object[][]{
                {12, 2},
                {6, 1},
                {0, 0},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);

    }
    @Test(dataProvider = "testZerosData")
    public void testZeros(Five impl, int value, int expected) {
        double actual = impl.zeros(value);
        assertEquals(actual, expected);
    }


    @DataProvider(name ="perimeterTestData")
    private Object[][] perimeterTestData(){
        Object[][] testData = new Object[][]{
                {BigInteger.valueOf(5), BigInteger.valueOf(80)},
                {BigInteger.valueOf(7), BigInteger.valueOf(216)},
                {BigInteger.valueOf(30), BigInteger.valueOf(14098308)},
        };
        return UserImplementations.combineImplWithTests(UserImplementations.FIVES, testData);
    }
    @Test(dataProvider = "perimeterTestData")
    public void testPerimeter(Five impl, BigInteger n, BigInteger expected) {
        BigInteger actual =impl.perimeter(n);
        assertEquals(actual,expected);
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