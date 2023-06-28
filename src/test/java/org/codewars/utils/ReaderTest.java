package org.codewars.utils;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.testng.Assert.*;

public class ReaderTest {

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @DataProvider(name = "readDoubleTestData")
    private Object[][] readDoubleTestData() {
        Object[][] testData = new Object[][] {
                {new Scanner("7"), 7.0},
                {new Scanner("0"), 0.0},
                {new Scanner("-2,54"), -2.54},
                {new Scanner(",666666660"), 0.66666666}
        };
        return testData;
    }
    @Test(dataProvider = "readDoubleTestData")
    public void testReadDouble(Scanner scanner, double expected) {
        Reader reader = new Reader(scanner);
        double actual = reader.readDouble();
        assertEquals(actual, expected);
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadLong() {
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadArrInt() {
    }

    @Test
    public void testReadArrDouble() {
    }

    @Test
    public void testReadArrString() {
    }

    @Test
    public void testReadArrLong() {
    }

    @Test
    public void testReadBoolean() {
    }
}