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
        InputStream sysIn = System.in;
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

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadLong() {
        String input = "123456789";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        long result = reader.readLong();
        Assert.assertEquals(result, 123456789);
    }

    @Test
    public void testReadLongErr() {
        String input = "1ggg56789\nw\n123456789";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));

        Reader reader = new Reader();
        long result = reader.readLong();
        Assert.assertEquals(out.toString().replace("\r", ""), "Your value is invalid. Try again\nYour value is invalid. Try again\n");
        Assert.assertEquals(result, 123456789);
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