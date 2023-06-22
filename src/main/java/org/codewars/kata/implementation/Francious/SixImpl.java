package org.codewars.kata.implementation.Francious;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public static double mean(String town, String strng) {
        String[] towns = strng.split("\n");
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] months = townData.split(",");
                double total = 0;
                int count = 0;
                for (String month : months) {
                    String[] data = month.split(" ");
                    total += Double.parseDouble(data[1]);
                    count++;
                }
                return total / count;
            }
        }
        return -1;
    }

    public static double variance(String town, String strng) {
        String[] towns = strng.split("\n");
        for (String townData : towns) {
            if (townData.startsWith(town + ":")) {
                String[] months = townData.split(",");
                double mean = mean(town, strng);
                double squaredDiffSum = 0;
                int count = 0;
                for (String month : months) {
                    String[] data = month.split(" ");
                    double rainfall = Double.parseDouble(data[1]);
                    squaredDiffSum += Math.pow(rainfall - mean, 2);
                    count++;
                }
                return squaredDiffSum / count;
            }
        }
        return -1;
    }

    public long findNb(long m) {
        long n = 1;
        long volume = 0;

        while (volume < m) {
            volume += n * n * n;
            if (volume == m) {
                return n;
            }
            n++;
        }

        return -1;
    }

    public String balance(String book) {
        String[] newString = book.split("\n");
        double totalBalance = Double.parseDouble(newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", ""));
        String resultString = "Original Balance: " + newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", "");
        System.out.println(resultString);
        for (int i = 1; i < newString.length; i++) {
            String temp = newString[i].replaceAll("[^a-zA-Z0-9\\s\\.]", "").replaceAll("  ", " ").trim();
            totalBalance = totalBalance - Double.parseDouble(temp.split(" ")[2]);
            resultString += "\\r\\n" + temp + " Balance " + String.format("%.2f", totalBalance);
        }
        double expense = Double.parseDouble(newString[0].replaceAll("[^a-zA-Z0-9\\s\\.]", "")) - totalBalance;
        resultString += "\\r\\nTotal expense  " + String.format("%.2f", expense);
        resultString += "\\r\\nAverage expense  " + String.format("%.2f", Math.round(expense / (newString.length - (double) 1) * 100.0) / 100.0);
        return resultString;
    }

    public double f(double x) {
      return x / (Math.pow((1 + x), 0.5) + 1);
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        int nullCount = 0;

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            char temp = lstOf1stLetter[i].charAt(0);
            int count = 0;

            for (int j = 0; j < lstOfArt.length; j++) {
                if (temp == lstOfArt[j].charAt(0)) {
                    count += Integer.parseInt(lstOfArt[j].split(" ")[1]);
                    if (Integer.parseInt(lstOfArt[j].split(" ")[1]) == 0) {
                        nullCount += 1;
                    }
                }
            }
            result += String.format("(%s : %d)", temp, count);
        }

        if (nullCount == lstOfArt.length) {
            return "";
        }

        return result.replace(")(", ") - (");
    }
}
