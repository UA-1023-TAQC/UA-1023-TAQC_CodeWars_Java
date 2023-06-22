package org.codewars.utils;

import java.math.BigInteger;

public class TaskRunner {
    private final Users user;

    public TaskRunner(int userId) {
        user = Users.getById(userId);
    }


    public static long[] runGap() {
        return new long[0];
    }

    public static BigInteger runPerimeter(){
        return new BigInteger("0");
    }

    public static int runZeros(){ return 0; }

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

    public void runStockSummary(){
        System.out.println("Help the bookseller !");
        System.out.println("Input the stock list ");
        String[] lstOfArt = Reader.readArrString();
        System.out.println("Input the list of categories ");
        String[] lstOf1stLetter = Reader.readArrString();
        String result = user.getSixImpl().stockSummary(lstOfArt,lstOf1stLetter);
        System.out.printf("Result: %s", result);
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

    public void runSeriesSum(){
        System.out.println("Run task Sum of the first nth term of Series");
        System.out.println("Input the number");
        int number = Reader.readInt();
        String result = user.getSevenImpl().seriesSum(number);
        System.out.println("Sum of following series up to number " + number + "is: " + result);
    }

    public void runStringToNumber(){
        System.out.println("Run task Convert a String to a Number!\n");
        System.out.println("Input the string that you want to convert to integer type:");
        String str = Reader.readString();
        int res = user.getEightImpl().stringToNumber(str);
        System.out.println("Converted string to int:" + res);
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
