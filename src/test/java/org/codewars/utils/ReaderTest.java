package org.codewars.utils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;

public class ReaderTest {
    private InputStream sysIn;

    @BeforeMethod
    public void setup() {
        sysIn = System.in;
    }

    @AfterMethod
    public void tearDown() {
        System.setIn(sysIn);

    }

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
                {new Scanner("sda\nadwqwdcsd sdqwqwwqe12qwdc xcsd\n20,1"), 20.1f}
        };
        return testData;
    }
    @Test(dataProvider = "readFloatTestData")
    public void testReadFloat(Scanner scanner, float expected) {
        Reader reader = new Reader(scanner);
        float actual = reader.readFloat();
        scanner.close();
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