package org.codewars.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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

    @DataProvider(name = "testReadArrIntData" )
    private Object[][] testReadArrIntData(){
        Object[][] testData = new Object[][]{
                {"1 3 5 7 9", new int[]{1, 3, 5, 7, 9}},
                {"12 13 14 22 23 24", new int[]{12, 13, 14, 22, 23, 24}},
                {"123 234 345", new int[] {123, 234, 345}}
        };
        return testData;
    }
    @Test(dataProvider = "testReadArrIntData")
    public void testReadArrInt(String input, int[] expected) {
        InputStream i = new ByteArrayInputStream(input.getBytes());
        System.setIn(i);
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader(scanner);
        int[] actual = reader.readArrInt();
        assertEquals(expected, actual);
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