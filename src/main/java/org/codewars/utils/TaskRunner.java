package org.codewars.utils;

import java.math.BigInteger;
import org.codewars.utils.Reader;

public class TaskRunner {
    private final Users user;
    public static void setUser(int id){
        // TODO: Implement setUser() method
    }
    public static void runGap() {
        System.out.println("Run task gap");
        System.out.println("Input number which indicated gap we are looking for");
        int g = Reader.readInt();
        System.out.println("Input number which gives the start of the search");
        int m = Reader.readLong();
        System.out.println("Input number which gives the end of the search");
        int n= Reader.readLong();
        long[] result = user.getFiveImpl().gap(g, m, n);
        System.out.println(result);
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
