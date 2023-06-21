package org.codewars.utils;

import java.math.BigInteger;
import java.util.Scanner;

public class Reader {
    private static final Scanner scanner = new Scanner(System.in);
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
        return new int[0];
    }
    public static double[] readArrDouble() {
        return new double[0];
    }
    public static String[] readArrString() {
        return new String[0];
    }
    public static long[] readArrLong() {
        while(true) {
            System.out.print("Enter numbers, separated with space: ");
            String input = scanner.nextLine();

            if(input.isEmpty()) throw new IllegalArgumentException("Line is empty");

            String[] numberStrings = input.split(" ");
            long[] numbers = new long[numberStrings.length];
            try {
                for (int i = 0; i < numberStrings.length; i++) {
                    numbers[i] = Long.parseLong(numberStrings[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Your value is invalid\nTry again");
                continue;
            }
            return numbers;
        }
    }
    public static Boolean readBoolean() {
        return true;
    }
}
