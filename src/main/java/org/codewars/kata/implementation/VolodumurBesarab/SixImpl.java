package org.codewars.kata.implementation.VolodumurBesarab;

import org.codewars.kata.Six;

import java.text.DecimalFormat;

public class SixImpl implements Six {
    public long findNb(long m) {
        long n = 1;
        long sum = 0;

        while (sum < m) {
            sum += n * n * n;

            if (sum == m) {
                return n;
            }

            n++;
        }
        return -1;
    }

    public String balance(String book) {
        if (book == null || book == "")
            return "";

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        book = book.replaceAll("!", "");
        book = book.replaceAll("=", "");
        book = book.replaceAll(":", "");
        book = book.replaceAll("\\?", "");
        book = book.replaceAll(";", "");
        book = book.replaceAll("\\{", "");
        book = book.replaceAll("}", "");
        String result = "";
        double totalExpense = 0;
        String[] lines = book.split("\n");
        Double balance = Double.parseDouble(lines[0]);
        result += "Original Balance: " + lines[0] + "\\r\\n";
        lines[0] = null;
        for (var line : lines) {
            if (line != null) {
                String dataLine;
                char lastSymbol = line.charAt(line.length() - 1);
                if (lastSymbol == ' ')
                    dataLine = line.substring(0, line.length() - 1);
                else
                    dataLine = line;
                int indexOfLastSpace = dataLine.lastIndexOf(' ');
                int indexOfDot = dataLine.indexOf('.');
                Double checkAmount = Double.valueOf(dataLine.substring(indexOfLastSpace, indexOfDot + 3));
                balance -= checkAmount;
                totalExpense += checkAmount;
                int cutLine = dataLine.indexOf(' ');
                while (line.charAt(cutLine + 1) != ' ')
                    cutLine++;
                result += line.substring(0, cutLine + 1) + " " + decimalFormat.format(checkAmount) + " Balance " + String.format("%.2f", balance) + "\\r\\n";
            }
        }
        result += "Total expense  " + String.format("%.2f", totalExpense) + "\\r\\n";
        result += "Average expense  " + String.format("%.2f", totalExpense / (lines.length - 1));
        result = result.replaceAll(",", ".");
        return result;
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
