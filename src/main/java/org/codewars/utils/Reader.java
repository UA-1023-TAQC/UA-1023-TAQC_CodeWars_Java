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
        while(true) {
            try{
                return scanner.nextDouble();
            } catch(Exception e) {
                System.out.println("Your value is invalid. Try again");
                scanner.nextLine();
            }
        }
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
        return new long[0];
    }
    public static Boolean readBoolean() {
        return true;
    }
}
