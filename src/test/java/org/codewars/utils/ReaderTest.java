package org.codewars.utils;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.NoSuchElementException;

public class ReaderTest {
    private InputStream sysIn;
    private PrintStream sysOut;

    @BeforeMethod
    public void setup() {
        sysIn = System.in;
        sysOut = System.out;
    }

    @AfterMethod
    public void tearDown() {
        System.setIn(sysIn);
        System.setOut(sysOut);
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
        return new Object[][]{
                {"10", 10f},
                {"0", 0.0f},
                {"53,08", 53.08f},
                {"-23453,9999999999", -23453.9999999999f},
                {",9", 0.9f}
        };
    }
    @Test(dataProvider = "readFloatTestData")
    public void testReadFloat(String input, float expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        float actual = reader.readFloat();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readFloatTestDataInv")
    private Object[][] readFloatTestDataInv() {
        return new Object[][]{
                {"sda\nadwqwdcsd sdqwqwwqe12qwdc xcsd\n20,1", 20.1f, "Your value is invalid. Try again\nYour value is invalid. Try again\n"}
        };
    }
    @Test(dataProvider = "readFloatTestDataInv")
    public void testReadFloatInv(String input, float expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        float actual = reader.readFloat();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadLong() {
        System.setIn(new ByteArrayInputStream("9876543210".getBytes()));
        Reader reader = new Reader();
        long actual = reader.readLong();
        Assert.assertEquals(actual, 9876543210L);
    }

    @DataProvider(name = "readLongTestDataInvalid")
    private Object[][] readLongTestDataInv() {
        return new Object[][]{
                {"qwerty\nqwertyqwerty\n1234567890", 1234567890L, "Your value is invalid. Try again\nYour value is invalid. Try again\n"},
                {"qwerty\n1234567890", 1234567890L, "Your value is invalid. Try again\n"},
        };
    }

    @Test(dataProvider = "readLongTestDataInvalid")
    public void testReadLongInvalid(String input, long expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        try {
            long actual = reader.readLong();
            Assert.assertEquals(actual, expected);
        } catch (NoSuchElementException e) {
            Assert.assertEquals(e.getMessage(), expectedOut);
        }
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