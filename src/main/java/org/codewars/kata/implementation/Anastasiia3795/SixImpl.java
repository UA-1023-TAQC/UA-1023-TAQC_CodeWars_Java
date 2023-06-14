package org.codewars.kata.implementation.Anastasiia3795;

import org.codewars.kata.Six;

import static java.lang.String.format;

public class SixImpl implements Six {
    public long findNb(long m) {
        return 0;
    }

    public String balance(String book) {
        String[] bookingElems = ((book.replaceAll("[!=:;?{},]", ""))
                .replaceAll("\\s{2,}", " ").trim()
                .replaceAll("\n", " "))
                .split(" ");

        double totalExpense = 0;
        double balance = Double.parseDouble(bookingElems[0]);
        String result = "Original Balance: " + format("%.2f", balance) + "\\r\\n";

        int count = 0;
        for(int i = 1; i < bookingElems.length; i += 3) {
            balance -= Double.parseDouble(bookingElems[i+2]);
            totalExpense += Double.parseDouble(bookingElems[i+2]);
            result += bookingElems[i] + " " + bookingElems[i+1] + " "
                    + bookingElems[i+2] + " Balance "
                    + format("%.2f", (balance)) + "\\r\\n";
            count ++;
        }

        result += "Total expense  " + format("%.2f", totalExpense) + "\\r\\n";
        result += "Average expense  " + format("%.2f", totalExpense/count);
        return result.replaceAll(",", ".");
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
