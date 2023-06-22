package org.codewars.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private final Scanner scanner;

    public Reader() {
        scanner = new Scanner(System.in);
    }

    public int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("An invalid integer was entered. Attempt again:");
            }
        }
    }

    public BigInteger readBigInteger() {
        while (true) {
            try {
                return new BigInteger(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("An invalid BigInteger was entered. Attempt again:");
            }
        }
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
        return scanner.nextLine();
    }

    public int[] readArrInt() {
        return new int[0];
    }

    public double[] readArrDouble() {
        return new double[0];
    }

    public String[] readArrString() {
        List<String> strings = new ArrayList<>();
        System.out.println("Enter new String for array from new line.\nEnter string with 2 spaces (\"  \") to finish input:");
        while (true) {
            String tmp = scanner.nextLine();
            if (tmp.equals("  ")) {
                break;
            }
            strings.add(tmp);
        }
        return strings.toArray(new String[0]);
    }

    public long[] readArrLong() {
        return new long[0];
    }

    public Boolean readBoolean() {
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("true") || input.equals("t")) {
                return true;
            } else if (input.equals("false") || input.equals("f")) {
                return false;
            } else {
                System.out.println("An invalid value was entered. Enter 'true' or 'false':");
            }
        }
    }
}
