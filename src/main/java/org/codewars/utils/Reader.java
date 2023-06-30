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

    public Reader(Scanner scan) {
        scanner = scan;
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

    public double readDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Your value is invalid. Try again");
                scanner.nextLine();
            }
        }
    }

    public float readFloat() {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (Exception e) {
                System.out.println("Your value is invalid. Try again");
                scanner.nextLine();
            }
        }
    }

    public long readLong() {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (Exception e) {
                System.out.println("Your value is invalid. Try again");
                scanner.nextLine();
            }
        }
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int[] readArrInt() {
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

    public double[] readArrDouble() {
        while (true) {
            System.out.print("Enter double numbers, separated with space: ");
            String input = scanner.nextLine();
            String[] numberStrings = input.split(" ");
            double[] numbers = new double[numberStrings.length];
            try {
                for (int i = 0; i < numberStrings.length; i++) {
                    numbers[i] = Double.parseDouble(numberStrings[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Your value is invalid\nTry again");
                continue;
            }
            return numbers;
        }
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
        while (true) {
            System.out.print("Enter numbers, separated with space: ");
            String input = scanner.nextLine();
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
