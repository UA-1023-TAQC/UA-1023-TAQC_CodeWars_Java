package org.codewars.utils;

import java.math.BigInteger;
import java.util.Scanner;

public class Reader {
    private final Scanner scanner;

    Reader() {
        scanner = new Scanner(System.in);
    }

    public int readInt() {
        return 0;
    }

    public BigInteger readBigInteger() {
        return BigInteger.ZERO;
    }

    public Double readDouble() {
        return 0.0;
    }

    public float readFloat() {
        return 0.0f;
    }

    public long readLong() {
        return 0;
    }

    public String readString() {
        return "";
    }

    public int[] readArrInt() {
        return new int[0];
    }

    public double[] readArrDouble() {
        return new double[0];
    }

    public String[] readArrString() {
        return new String[0];
    }

    public long[] readArrLong() {
        return new long[0];
    }

    public Boolean readBoolean() {
        return true;
    }
}
