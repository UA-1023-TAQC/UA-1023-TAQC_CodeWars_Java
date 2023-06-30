package org.codewars.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

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
        assertEquals(expectedValue, actualValue);
    }

    @DataProvider(name = "testReadArrLongDataInvalid" )
    private Object[][] testReadArrLongDataInvalid(){
        return new Object[][]{
                {"s 5 2 4 8 2\n2 5 2 4 8 2", new long[]{2, 5, 2, 4, 8, 2}, "Enter numbers, separated with space: " +
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