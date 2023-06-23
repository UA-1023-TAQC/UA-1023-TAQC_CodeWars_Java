package org.codewars.utils;

import java.math.BigInteger;
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
        System.out.println("Run task Perimeter of squares in a rectangle");
        System.out.println("Input the number of squares in the rectangle");
        BigInteger x = reader.readBigInteger();
        BigInteger result = user.getFiveImpl().perimeter(x);
        System.out.println("Sum of the perimeters of all the squares is : " + result);
    }

    public void runZeros() {
        System.out.println("Run task Number of trailing zeros of N!");
        System.out.println("Input number to calculate the number of trailing zeros");
        int x = reader.readInt();
        int result = user.getFiveImpl().zeros(x);
        System.out.println("The number of trailing zeros is " + result);
    }

    public void runF() {
        System.out.println("Floating-point Approximation");
        System.out.println("Input x ");
        double x = reader.readDouble();
        double result = user.getSixImpl().f(x);
        System.out.printf("Result: %f%n", result);
    }


    public void rainfall() {
        System.out.println("Run task Rainfall");
        System.out.println("Input the name of the city");
        String town = reader.readString();
        System.out.println("Input string with rainfall records. City entries should be separated by \\n." + "The name of each city is followed by :");
        String str = reader.readString();
        double resultMean = user.getSixImpl().mean(town, str);
        double resultVariance = user.getSixImpl().variance(town, str);
        if (resultMean == -1 || resultVariance == -1) {
            System.out.println("No such city in the records.");
        } else {
            System.out.println("The average of rainfall for the city of " + town + " is: " + resultMean);
            System.out.println("The variance of rainfall for the city of " + town + " is: " + resultVariance);
        }
    }

    public void runBalance() {
        System.out.println("Run task Easy Balance Checking");
        System.out.println("Input data of check book.The first line should show the opening balance." + " Each other line (if it is not empty) contains the following information: " + "check number, category, check amount.");
        String x = reader.readString();
        String result = user.getSixImpl().balance(x);
        System.out.println("Check book " + result);
    }

    public void runGetVolumeOfCuboid() {

    }

    public void runNbaCup() {
        System.out.println("Run task 'Ranking NBA teams'");
        System.out.println("Input string with results of NBA teams");
        String resultSheet = reader.readString();
        System.out.println("Input string of the name of a team ");
        String toFind = reader.readString();
        String result = user.getSixImpl().nbaCup(resultSheet, toFind);
        System.out.println(result);
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

    public void runLiters() {
        System.out.println("Run task liters\n" + "Enter the time in hours to count the number of liters Nathan will drink:");
        double time = reader.readDouble();
        int result = user.getEightImpl().liters(time);
        System.out.println("Nathan will drink " + result + " liters");
    }

    public void runTwoDecimalPlaces() {
        System.out.println("Run task Formatting decimal places");
        System.out.println("Input a number of the double type to format");
        double number = reader.readDouble();
        double result = user.getEightImpl().TwoDecimalPlaces(number);
        System.out.println("The number rounded to two decimal places is " + result);
    }

    public void runAmIWilson() {
        System.out.println("Run task Wilson primes");
        System.out.println("Input number");
        double number = reader.readDouble();
        boolean result = user.getEightImpl().am_i_wilson(number);
        if (result) System.out.println("It is a Wilson prime");
        else System.out.println("It is not a Wilson prime");
    }

    public void runSquareOrSquareRoot() {
        System.out.println("Run task To square(root) or not to square(root)");
        System.out.println("Input an array of integers.The input array should always contain only positive numbers " + "and should never be empty or zero.");
        int[] array = reader.readArrInt();
        int[] result = user.getEightImpl().squareOrSquareRoot(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("A new array : " + result);

    }

    public void runCountPositivesSumNegatives() {
        System.out.println("Run task Count of positives / sum of negatives");
        int[] givenArr = reader.readArrInt();
        int[] result = user.getEightImpl().countPositivesSumNegatives(givenArr);
        System.out.println("The count of positives numbers: " + result[0] + "; sum of negative numbers: " + result[1]);
    }

    public void runSmallest() {
        System.out.println("Run task Find the smallest");
        System.out.println("Input a positive number");
        long number = reader.readLong();
        long[] result = user.getFiveImpl().smallest(number);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("The smallest number obtained is : " + result);
    }


    public void runMpgToKPM() {
        System.out.println("Run task 'Miles per gallon to kilometers per lite'");
        System.out.println("Input mpg value");
        float mpg = reader.readFloat();
        float result = user.getEightImpl().mpgToKPM(mpg);
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

    public void runDivisibleBy() {
        System.out.println("Run task divisibleBy\n" + "Enter the array of integers:");
        int[] numbers = reader.readArrInt();
        System.out.println("Enter the divisor: ");
        int divider = reader.readInt();
        int[] resultArr = user.getEightImpl().divisibleBy(numbers, divider);
        System.out.println("There are the numbers which are divisible by the given divisor:\n" + resultArr);
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setUser(int userId) {
        this.user = Users.getById(userId);
    }

    public void runSolve() {
        System.out.println("Run task Which x for that sum?\nEnter the sum:");
        double m = reader.readDouble();
        double x = user.getFiveImpl().solve(m);
        System.out.println("For the given sum x is " + x);
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
