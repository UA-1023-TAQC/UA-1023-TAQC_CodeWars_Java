package org.codewars.utils;

import java.math.BigInteger;
import java.util.InputMismatchException;

public class TaskRunner {

    private final Users user;

    public static void setUser(int id) {
        // TODO: Implement setUser() method
    }

    public static long[] runGap() {
        return new long[0];
    }

    public static BigInteger runPerimeter() {
        return new BigInteger("0");
    }

    public static int runZeros() {
        return 0;
    }

    public static double runF() {
        return 0.0;
    }

    public static long runFindNb() {
        return 0;
    }

    public static double runMean() {
        return 0;
    }

    public static double runVariance() {
        return 0;
    }

    public static String runBalance() {
        return null;
    }

    public static String runNbaCup() {
        return null;
    }

    public static String runStockSummary() {
        return null;
    }

    public static double runGetVolumeOfCuboid() {
        return 0.0;
    }

    public static int runLiters() {
        return 0;
    }

    public static int runWhereIsHe() {
        return 0;
    }

    public static long runNewAvg() {
        return 0;
    }

    public static String runSeriesSum() {
        return null;
    }

    public static int runStringToNumber() {
        return 0;
    }

    public static int[] runcountPositivesSumNegatives() {
        return new int[0];
    }

    public static float runMpgToKPM() {
        return 0.0f;
    }


    public void runTwoDecimalPlaces() {
        try{
        System.out.println("Run task Formatting decimal places");
        System.out.println("Input a number of the double type to format");
        double number = Reader.readDouble();
        double result = user.getEightImpl().TwoDecimalPlaces(number);
        System.out.println("The number rounded to two decimal places is" + result);
        } catch (InputMismatchException e) {
            System.out.println("Error! The value you entered is not an integer.");
        }
    }


    public static boolean runAmIWilson() {
        return false;
    }

    public static int[] runDivisibleBy() {
        return new int[0];
    }

    public static int[] runSquareOrSquareRoot() {
        return new int[0];
    }

    public static double runSolve() {
        return 0.0;
    }

    public static long[] runSmallest() {
        return new long[0];
    }

    public static int runArtificialRain() {
        return 0;
    }

}
