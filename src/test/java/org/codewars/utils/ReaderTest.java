package org.codewars.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

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

    @Test
    public void testReadArrLong() {
    }

    @DataProvider(name = "readBooleanTestData")
    private Object[][] readBooleanTestData() {
        Object[][] testData = new Object[][]{
                {"false", false},
                {"f", false},
                {"true", true},
                {"t", true}
        };
        return testData;

    }
    @Test(dataProvider = "readBooleanTestData")
    public void testReadBoolean(String value, boolean expected) {
        System.setIn(new ByteArrayInputStream(value.getBytes()));
        Reader reader = new Reader();
        Boolean result = reader.readBoolean();
        assertEquals(result, expected);
    }
}