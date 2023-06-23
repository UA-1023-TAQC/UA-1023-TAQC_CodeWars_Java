package org.codewars.kata.implementation.kovalchukvita;

import org.codewars.kata.Six;

public class SixImpl implements Six {
    public long findNb(long m) {
        long count = 0; //count of cubes
        for (int i = 1; i < m - 1; i++) { //i - lelgth of cubes
            long volume = (long) Math.pow(i, 3);
            m = m - volume; //remaining volume
            count++;
        }
        if (m != 0) {
            return -1; // is not possible to construct a sum of cubes
        }

        return count;
    }

    public String balance(String book) {
        String[] str = book.replaceAll("[^\\w\n. ]", "").split("\n");

        StringBuilder report = new StringBuilder("Original Balance: " + str[0] + (book = "\\r\\n"));

        double balance = Double.parseDouble(str[0]);
        double sum = 0;

        for (int i = 1; i < str.length; i++) {
            sum += Double.parseDouble(str[i].split("\\s+")[2]);
            report.append(str[i].trim().replaceAll("\\s+", " "))
                    .append(String.format(" Balance %.2f", balance - sum)).append(book);
        }

        return report + String.format("Total expense %.2f%sAverage expense %.2f", sum, book, sum / (str.length - 1));
    }

    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    public double mean(String town, String strng) {
        if (!strng.contains(town + ":")) return -1;
        double[] v = doubleArr(town, strng);
        double sum = 0;
        for (int i = 0; i < v.length; i++) sum += v[i];
        return sum / v.length;
    }

    public double variance(String town, String strng) {
        if (!strng.contains(town + ":")) return -1;
        double[] v = doubleArr(town, strng);
        double mean = mean(town, strng);
        double temp = 0;
        for (double a : v) temp += (mean - a) * (mean - a);
        return temp / v.length;
    }

    public double[] doubleArr(String town, String strng) {
        String[] s = strng.split("\n");
        for (int i = 0; i < s.length; i++)
            if (s[i].split(":")[0].equals(town)) {
                String[] nm = s[i].split(":")[1].split(",");
                double[] v = new double[nm.length];
                for (int i2 = 0; i2 < nm.length; i2++)
                    v[i2] = Double.parseDouble(nm[i2].split(" ")[1]);
                return v;
            }
        return null;
    }

    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
