package org.codewars.utils;

import org.codewars.UserImplementations;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class ReaderTest {

    @Test
    public void testReadInt() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @Test
    public void testReadDouble() {
    }

    @DataProvider(name = "readFloatTestData")
    private Object[][] readFloatTestData() {
        Object[][] testData = new Object[][]{
                {new Scanner("10"), 10f},
                {new Scanner("0"), 0.0f},
                {new Scanner("53,08"), 53.08f},
                {new Scanner("-23453,9999999999"), -23453.9999999999f},
                {new Scanner(",9"), 0.9f},
                {new Scanner("53.08"), 53.08f}
        };
        return testData;
    }
    @Test(dataProvider = "readFloatTestData")
    public void testReadFloat(Scanner scanner, float expected) {
        Reader reader = new Reader(scanner);
        float actual = reader.readFloat();
        assertEquals(actual, expected);
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