package org.codewars.utils;

import java.math.BigInteger;
import java.util.Scanner;

public class Reader {
    static Scanner scanner = new Scanner(System.in);
    public static int readInt() {
        return 0;
    }
    public static BigInteger readBigInteger() {
        return BigInteger.ZERO;
    }
    public static Double readDouble() {
        return 0.0;
    }
    public static float readFloat() {
        return 0.0f;
    }
    public static long readLong() {
        return 0;
    }
    public static String readString() {
        return "";
    }
    public static int[] readArrInt() {
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Line is empty");
        }
        String[] strArr = input.split("\\s+");
        int[] arr = new int[strArr.length];

        try {
            for (int i = 0; i < strArr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Incorect line. Enter whole numbers.");
        }
        scanner.close();
        return arr;
    }
    public static double[] readArrDouble() {
        return new double[0];
    }
    public static String[] readArrString() {
        return new String[0];
    }
    public static long[] readArrLong() {
        return new long[0];
    }
    public static Boolean readBoolean() {
        return true;
    }
}
