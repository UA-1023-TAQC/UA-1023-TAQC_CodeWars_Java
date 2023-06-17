package org.codewars.kata.implementation.Natalinatali;

import org.codewars.kata.Six;

import static java.lang.String.format;

public class SixImpl implements Six {
    public long findNb(long m) {
        int counter = 0;
        while (m > 0){
            counter++;
            double cub = Math.pow(counter, 3);
            m -= cub;
        }
        if(m < 0){
            return -1;
        }

        return counter;
    }

    public String balance(String book) {
        String[] rows = book.replaceAll("[^a-zA-Z0-9\n. ]", "")
                .replaceAll("\n", " ")
                .split(" ");


        double originalBalance = Double.parseDouble(rows[0]);//1000
        String checkBook = "Original Balance: " + format("%.2f", originalBalance) + "\n";


        int count = 0;
        double expense = 0;
        for(int i = 1; i < rows.length; i += 3) {
            originalBalance -= Double.parseDouble(rows[i+2]);
            expense += Double.parseDouble(rows[i+2]);
            checkBook += rows[i] + " " + rows[i+1] + " "
                    + rows[i+2] + " Balance "
                    + format("%.2f", (originalBalance)) + "\n";
            count ++;

        }
        checkBook += "Total expense  " + format("%.2f", expense) + "\n";
        checkBook += "Average expense  " + format("%.2f", expense/count);
        return  checkBook;
    }

    public double f(double x) {
        return 0;
    }

    public double mean(String town, String strng) {
        return 0;
    }

    public double variance(String town, String strng) {
        return 0;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
