package org.codewars.utils;

import java.math.BigInteger;

public class TaskRunner {
    private final Users user;

    public TaskRunner(int id) {
        user = Users.getById(id);
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

    public void runGetVolumeOfCuboid(){

        System.out.println("Run task Volume of a Cuboid.");
        System.out.println("Input length of the cuboid ");
        double length = reader.readDouble();
        System.out.println("Input width of the cuboid ");
        double width = reader.readDouble();
        System.out.println("Input height of the cuboid");
        double height = reader.readDouble();
        double result =  user.getEightImpl().getVolumeOfCuboid(length, width, height);
        System.out.println(String.format("Result: %f", result));

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
