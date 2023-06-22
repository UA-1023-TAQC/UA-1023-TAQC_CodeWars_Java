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

    public void rainfall() {
        try {
            System.out.println("Run task Rainfall: mean method");
            System.out.println("Input the name of the city");
            String town = Reader.readString();
            System.out.println("Input string with rainfall records. City entries should be separated by \\n." +
                    "The name of each city is followed by :");
            String str = Reader.readString();
            double resultMean = user.getSixImpl().mean(town, str);
            double resultVariance = user.getSixImpl().variance(town, str);
            if (resultMean == -1 || resultVariance == -1) {
                System.out.println("No such city in the records.");
            } else {
                System.out.println("The average of rainfall for the city of " + town + " is: " + resultMean);
                System.out.println("The variance of rainfall for the city of " + town + " is: " + resultVariance);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error! You entered incorrect data.");
        }
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

    public static double runTwoDecimalPlaces() {
        return 0.0;
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
