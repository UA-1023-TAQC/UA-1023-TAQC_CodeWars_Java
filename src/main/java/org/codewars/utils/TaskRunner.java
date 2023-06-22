package org.codewars.utils;

public class TaskRunner {
    private final Reader reader;
    private Users user;

    public TaskRunner(int userId) {
        user = Users.getById(userId);
        reader = new Reader();
    }

    public void runGap() {

    }

    public void runPerimeter() {

    }

    public void runZeros() {

    }

    public void runF() {

    }

    public void runMean() {

    }

    public void runVariance() {

    }

    public void runBalance() {

    }

    public void runNbaCup() {

    }

    public void runGetVolumeOfCuboid() {

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

    public void runcountPositivesSumNegatives() {

    }

    public void runMpgToKPM() {

    }

    public void runTwoDecimalPlaces() {

    }

    public void runAmIWilson() {

    }

    public void runDivisibleBy() {

    }

    public void runSquareOrSquareRoot() {

    }

    public void runSolve() {

    }

    public void runSmallest() {

    }

    public void runArtificialRain() {

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
