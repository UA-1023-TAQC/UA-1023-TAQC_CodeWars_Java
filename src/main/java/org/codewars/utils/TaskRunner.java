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
        System.out.println("Artificial Rain");
        int[] garden = {0};
        int i = 1;
        while(i == 1){
            System.out.println("Input the set of n rectangles of varying height as the representation of vertical garden ");
            garden = reader.readArrInt();
            System.out.println("The input data is: " + Arrays.toString(garden));
            for(int element: garden){
                i = 0;
                if(element <= 0){
                    System.out.println("Sorry, that input is invalid. Please enter a numbers greater than 0.");
                    i = 1;
                    break;
                }
            }}
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
