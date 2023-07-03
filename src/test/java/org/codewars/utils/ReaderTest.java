package org.codewars.utils;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;

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

    @DataProvider(name = "readLongTestDataValid")
    private Object[][] readLongTestDataValid() {
        return new Object[][]{
                {"1234567890", 1234567890L},
                {"-9876543210", -9876543210L},
                {"0", 0L},
                {"  12345  ", 12345L},
                {"  -999  ", -999L},
                {"999999999999999", 999999999999999L},
                {"-123", -123L},
                {"  0  ", 0L},
        };
    }

    @Test(dataProvider = "readLongTestDataValid")
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        long actual = reader.readLong();
        Assert.assertEquals(actual, expected);
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
        long actual = reader.readLong();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
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

    @DataProvider(name = "readArrStringTestData")
    private Object[][] readArrStringTestData(){
        return new Object[][]{
                {"Hello\nWorld\n  ", new String[]{"Hello","World"}},
                {"qq\n12345\n?!\n  ", new String[]{"qq","12345","?!"}},
        };
    }
    @Test(dataProvider = "readArrStringTestData")
    public void testReadArrString(String input,String[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader=new Reader();
        String[] actual =reader.readArrString();
        Assert.assertEquals(expected,actual);
    }
    @DataProvider(name = "readArrStringTestDataInvalid")
    private Object[][] readArrStringTestDataInvalid(){
        return new Object[][]{
                {"Hello\nWorld\n\nInv\n  ", new String[]{"Hello", "World","","Inv"}, "Enter new String for array from new line.\n"
                        + "Enter string with 2 spaces (\"  \") to finish input:\n"},
                {"!!!!\n12345\n\n  ", new String[]{"!!!!", "12345",""}, "Enter new String for array from new line.\n"
                        + "Enter string with 2 spaces (\"  \") to finish input:\n"}
        };
    }
    @Test(dataProvider = "readArrStringTestDataInvalid")
    public void testReadArrStringInvalid(String input,String[] expected, String expectedOut){
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        String[] actual = reader.readArrString();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual,expected);
    }


    @DataProvider(name = "testReadArrLongData" )
    private Object[][] testReadArrLongData(){
        return new Object[][]{
                {"1 2 3 4 5 2", new long[]{1, 2, 3, 4, 5, 2}},
                {"2 5 2 4 8 2", new long[]{2, 5, 2, 4, 8, 2}}
        };
    }
    @Test(dataProvider = "testReadArrLongData")
    public void testReadArrLong(String str, long[] expectedValue) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        Reader reader = new Reader();
        long[] actualValue = reader.readArrLong();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @DataProvider(name = "testReadArrLongDataInvalid" )
    private Object[][] testReadArrLongDataInvalid(){
        return new Object[][]{
                {"s 5 2 4 8 2\n2 5 2 4 8 2", new long[]{2, 5, 2, 4, 8, 2}, "Enter numbers, separated with space: " +
                "Your value is invalid\nTry again\nEnter numbers, separated with space: "},
                {"1 2 3 4 5 six\n1 2 3 4 5 6", new long[]{1, 2, 3, 4, 5, 6}, "Enter numbers, separated with space: " +
                        "Your value is invalid\nTry again\nEnter numbers, separated with space: "}
        };
    }

    @Test(dataProvider = "testReadArrLongDataInvalid")
    public void testReadArrLongInvalid(String str, long[] expectedValue, String expectedOut) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        long[] actualValue = reader.readArrLong();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actualValue, expectedValue);
    }


    @Test
    public void testReadBoolean() {
    }
}