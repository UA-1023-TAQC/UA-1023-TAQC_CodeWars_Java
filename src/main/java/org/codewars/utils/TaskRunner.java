package org.codewars.utils;

import java.math.BigInteger;

public class TaskRunner {
    public TaskRunner(Users user) {
        this.user = user;
    }

    private static Users user;

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

    public static void runAmIWilson()
    {
        System.out.println("Run task Wilson primes");
        System.out.println("Input number");
        double number = Reader.readDouble();
        boolean result = user.getEightImpl().am_i_wilson(number);
        if (result)
            System.out.println(String.format("It is a Wilson prime"));
        else
            System.out.println(String.format("It is not a Wilson prime"));
    }

    public static int[] runDivisibleBy(){
        return new int[0];
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
