package org.codewars.utils;

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

    @DataProvider(name = "readStringTestData")
    private Object[][] readStringTestData() {
        Object[][] testData = new Object[][] {
                {new Scanner("Hello"), "Hello"},
                {new Scanner("   World   "), "   World   "},
                {new Scanner("\n\nNew Line\n\n"), ""},
                {new Scanner("Special\tCharacters"), "Special\tCharacters"},
                {new Scanner("Привіт, світ!"), "Привіт, світ!"},
                {new Scanner(""), null}  // Ожидается генерация исключения NoSuchElementException
        };
        return testData;
    }
    @Test(dataProvider = "readStringTestData")
    public void testReadString(Scanner scanner, String expected) {
        Reader reader = new Reader(scanner);
        try {
            String actual = reader.readString();
            assertEquals(actual, expected);
        } catch (NoSuchElementException e) {
            assertEquals(expected, "");
        }
    }

    @Test
    public void testReadArrLong() {
    }

    @Test
    public void testReadBoolean() {
    }
}