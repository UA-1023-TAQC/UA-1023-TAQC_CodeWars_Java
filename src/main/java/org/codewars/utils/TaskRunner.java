package org.codewars.utils;

import java.util.Arrays;

public class TaskRunner {
    private final Reader reader;
    private Users user;

    public TaskRunner(int userId) {
        user = Users.getById(userId);
        reader = new Reader();
    }

    public void runGap() {
        System.out.println("Run task gap");
        System.out.println("Input number which indicated gap we are looking for");
        int g = reader.readInt();
        System.out.println("Input number which gives the start of the search");
        long m = reader.readLong();
        System.out.println("Input number which gives the end of the search");
        long n = reader.readLong();
        long[] result = user.getFiveImpl().gap(g, m, n);
        System.out.println(result);
    }

    public void runPerimeter() {

    }

    public void runZeros() {

    }

    public void runF() {
        System.out.println("Floating-point Approximation");
        System.out.println("Input x ");
        double x = reader.readDouble();
        double result =  user.getSixImpl().f(x);
        System.out.println(String.format("Result: %f", result));
    }

    public void runMean() {

    }

    public void runVariance() {

    }

    public void runBalance() {

    }
    
    public void runGetVolumeOfCuboid() {

    }

    public void runNbaCup(){
        System.out.println("Run task 'Ranking NBA teams'");
        System.out.println("Input string with results of NBA teams");
        String resultSheet = reader.readString();
        System.out.println("Input string of the name of a team ");
        String toFind = reader.readString();
        String result = user.getSixImpl().nbaCup(resultSheet, toFind);
        System.out.println(result);
    }

    public void runLiters() {

    }

    public void runWhereIsHe() {

    }

    public void runNewAvg() {
        System.out.println("Run task 'Looking for a benefactor'");
        System.out.println("Input financial donations array");
        double[] arr = reader.readArrDouble();
        System.out.println("Input number which donations should reach an average");
        double nav = reader.readDouble();
        long result = user.getSevenImpl().newAvg(arr, nav);
        System.out.println(result);
    }

    public void runTwoDecimalPlaces() {

    }

    public void runAmIWilson()
    {
        System.out.println("Run task Wilson primes");
        System.out.println("Input number");
        double number = reader.readDouble();
        boolean result = user.getEightImpl().am_i_wilson(number);
        if (result)
            System.out.println(String.format("It is a Wilson prime"));
        else
            System.out.println(String.format("It is not a Wilson prime"));
    }

    public void runDivisibleBy() {

    }

    public void runSquareOrSquareRoot() {

    }

    public void runCountPositivesSumNegatives(){
        System.out.println("Run task Count of positives / sum of negatives");
        int[] givenArr = Reader.readArrInt();
        int[] result = user.getEightImpl().countPositivesSumNegatives(givenArr);
        System.out.println("The count of positives numbers: " + result[0] +
                "; sum of negative numbers: " + result[1]);
    }
    public void runSolve() {

    }

     public void runSmallest() {

     }
    
    public void runMpgToKPM(){
        System.out.println("Run task 'Miles per gallon to kilometers per lite'");
        System.out.println("Input mpg value");
        float mpg = reader.readFloat();
        float result = user.getFiveImlp().mpgToKPM(mpg);
        System.out.println(result);
    }

    public void runArtificialRain() {
        System.out.println("Artificial Rain");
        int[] garden = {0};
        int i = 1;
        while (i == 1) {
            System.out.println("Input the set of n rectangles of varying height as the representation of vertical garden ");
            garden = reader.readArrInt();
            System.out.println("The input data is: " + Arrays.toString(garden));
            for (int element : garden) {
                i = 0;
                if (element <= 0) {
                    System.out.println("Sorry, that input is invalid. Please enter a numbers greater than 0.");
                    i = 1;
                    break;
                }
            }
        }
        int result = user.getFiveImpl().artificialRain(garden);
        System.out.printf("Result: %s", result);
    }

    public void runFindNb() {
        System.out.println("Build a pile of Cubes");
        System.out.println("Input the total volume of the building. ");
        long m = reader.readLong();
        long result = user.getSixImpl().findNb(m);
        System.out.printf("Result: %s%n", result);

    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUser(int userId) {
        this.user = Users.getById(userId);
    }

    public void runStockSummary() {
        System.out.println("Help the bookseller !");
        System.out.println("Input the stock list ");
        String[] lstOfArt = reader.readArrString();
        System.out.println("Input the list of categories ");
        String[] lstOf1stLetter = reader.readArrString();
        String result = user.getSixImpl().stockSummary(lstOfArt, lstOf1stLetter);
        System.out.printf("Result: %s", result);
    }

    public void runSeriesSum() {
        System.out.println("Run task Sum of the first nth term of Series");
        System.out.println("Input the number");
        int number = reader.readInt();
        String result = user.getSevenImpl().seriesSum(number);
        System.out.println("Sum of following series up to number " + number + "is: " + result);
    }

    public void runStringToNumber() {
        System.out.println("Run task Convert a String to a Number!\n");
        System.out.println("Input the string that you want to convert to integer type:");
        String str = reader.readString();
        int res = user.getEightImpl().stringToNumber(str);
        System.out.println("Converted string to int:" + res);
    }

}
