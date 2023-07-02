package org.codewars.utils;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.math.BigInteger;
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

    @DataProvider(name = "readIntTestData")
    private Object[][] readIntTestData() {
        return new Object[][]{
                {"-2147483648", -2147483648},
                {"0", 0},
                {"67", 67},
                {"2147483647", 2147483647},
        };
    }
    @Test(dataProvider = "readIntTestData")
    public void testReadInt(String input, int expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        int actual = reader.readInt();
        Assert.assertEquals(actual, expected);
    }
    @DataProvider(name = "readIntTestDataInvalid")
    private Object[][] readIntTestDataInvalid() {
        return new Object[][]{
                {"@#$%\n1", 1, "An invalid integer was entered. Attempt again:\n"},
                {"3.4e-38\n38", 38, "An invalid integer was entered. Attempt again:\n"},
                {"9.1\n91", 91, "An invalid integer was entered. Attempt again:\n"},
                {"  \n477", 477, "An invalid integer was entered. Attempt again:\n"},
                {"six\n6", 6, "An invalid integer was entered. Attempt again:\n"},
                {"sda\ngjklpu scfhte566gtu asd\n7", 7, "An invalid integer was entered. Attempt again:\nAn invalid integer was entered. Attempt again:\n"}
        };
        };
    @Test(dataProvider = "readIntTestDataInvalid")
    public void testReadIntInvalid(String input, int expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        int actual = reader.readInt();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readBigIntegerTestData")
    private Object[][] readBigIntegerTestData() {
        return new Object[][]{
                {"0", new BigInteger("0")},
                {"1", new BigInteger("1")},
                {"-225", new BigInteger("-225")},
                {"34778324257332478453", new BigInteger("34778324257332478453")},
        };
    }
    @Test(dataProvider = "readBigIntegerTestData")
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        BigInteger actual = reader.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readBigIntegerTestDataInv")
    private Object[][] readBigIntegerTestDataInv() {
        return new Object[][]{
                {"1rhqewjeqwjk", new BigInteger("1"), "No line found"}
        };
    }
    @Test(dataProvider = "readBigIntegerTestDataInv")
    public void testReadBigIntegerInv(String input, BigInteger expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        try {
            BigInteger actual = reader.readBigInteger();
            Assert.assertEquals(actual, expected);
        } catch (NoSuchElementException e) {
            Assert.assertEquals(e.getMessage(), expectedOut);
        }
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
