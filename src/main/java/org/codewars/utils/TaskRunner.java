package org.codewars.utils;

import java.math.BigInteger;

public class TaskRunner {
    private static final Reader reader = new Reader();
    private Users user;
    public static void setUser(int id){
        // TODO: Implement setUser() method
    }
    public static long[] runGap() {
        return new long[0];
    }

    public static BigInteger runPerimeter(){
        return new BigInteger("0");
    }

    public static int runZeros(){
       return 0;
    }

    public static double runF(){
        return 0.0;
    }

    public static long runFindNb(){
        return 0;
    }

    public static double runMean(){
        return 0;
    }

    public static double runVariance(){
        return 0;
    }

    public static String runBalance(){
        return null;
    }

    public static String runNbaCup(){
        return null;
    }

    public static String runStockSummary(){
        return null;
    }

    public static double runGetVolumeOfCuboid(){
        return 0.0;
    }

    public static int runLiters(){
        return 0;
    }

    public static int runWhereIsHe(){
        return 0;
    }

    public  static long runNewAvg(){
        return 0;
    }

    public static String runSeriesSum(){
        return null;
    }

    public static int runStringToNumber(){
        return 0;
    }

    public static int[] runcountPositivesSumNegatives(){
        return new int[0];
    }

    public static float runMpgToKPM(){
        return 0.0f;
    }

    public static double runTwoDecimalPlaces(){
        return 0.0;
    }

    public static boolean runAmIWilson(){
        return false;
    }

    public void runDivisibleBy(){
        System.out.println("Run task divisibleBy\n" +
                "Enter the array of integers:");
        int[] numbers = reader.readArrInt();
        System.out.println("Enter the divisor: ");
        int divider = reader.readInt();
        int [] resultArr = user.getEightImpl().divisibleBy(numbers, divider);
        System.out.println("There are the numbers which are divisible by the given divisor:\n" + resultArr);
    }

    public static int[] runSquareOrSquareRoot(){
        return new int[0];
    }

    public static double runSolve(){
        return 0.0;
    }

    public static long[] runSmallest(){
        return new long[0];
    }

    public static int runArtificialRain(){
        return 0;
    }

}
