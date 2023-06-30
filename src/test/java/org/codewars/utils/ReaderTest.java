package org.codewars.utils;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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
    public void testReadLongWithValidInput() {
        String input = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        Reader reader = new Reader(scanner);
        long result = reader.readLong();
        assertEquals(result, 1234567890L);
    }

    @Test//(expectedExceptions = NoSuchElementException.class)
    public void testReadLongWithInvalidInput() {
        String input = "qwertyqwerty";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        Reader reader = new Reader(scanner);
        assertThrows(NoSuchElementException.class, () -> reader.readLong());
    }

    @Test
    public void testReadLongWithInvalidThenValidInput() {
        String input = "qwerty\n1234567890";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);
        Reader reader = new Reader(scanner);
        //assertThrows(NoSuchElementException.class, () -> reader.readLong());
        long result = reader.readLong();
        assertEquals(result, 1234567890L);
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