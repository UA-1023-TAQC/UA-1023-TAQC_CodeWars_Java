package org.codewars.kata.implementation.DappY127;

import org.codewars.kata.Base;
import org.codewars.kata.Six;

import java.util.HashMap;
import java.util.Map;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.util.stream.Stream.of;

public class SixImpl extends Base implements Six {
    private static void updateMatchStatistics(int pointsA, int pointsB, boolean home, int[] stats) {
        if (home) {
            int temp = pointsA;
            pointsA = pointsB;
            pointsB = temp;
        }

        stats[3] += pointsA;
        stats[4] += pointsB;

        if (pointsA > pointsB) {
            stats[0]++;
        } else if (pointsA < pointsB) {
            stats[1]++;
        } else {
            stats[2]++;
        }
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
        book = book.replaceAll("[^A-Za-z0-9.\\n ]", "");
        book = book.replaceAll("  ", " ");
        book = book + "\n";
        String newBook = "";
        double originalBalance = 0;
        double balance = 0;
        int previousNewLinePosition = 0;
        double total = 0;
        List<Double> averageList = new ArrayList<Double>();
        DecimalFormat decimalFormat = new DecimalFormat("#.00", DecimalFormatSymbols.getInstance(Locale.US));

        for (int i = -1; (i = book.indexOf("\n", i + 1)) != -1; i++) {
            int beginning = 0;
            int countDigits = 0;
            String amountStr = "";
            double amount = 0;

            for (int j = i; j > 0; j--) {
                if (j == 1) {
                    amountStr = Character.toString(book.charAt(0));
                    while (countDigits > 0) {
                        amountStr = amountStr + Character.toString(book.charAt(beginning - 1));
                        beginning++;
                        countDigits--;
                    }
                    amount = amount + Double.parseDouble(amountStr);
                    originalBalance = amount;
                    balance = originalBalance;
                    newBook = "Original Balance: " + amountStr + "\\r\\n";
                    previousNewLinePosition = i;
                    break;
                }
                if (Character.isDigit(book.charAt(j - 2)) || Character.toString(book.charAt(j - 2)).equals(".")) {
                    beginning = j;
                    countDigits++;
                } else {
                    for (int p = previousNewLinePosition + 1; p < beginning - 2; p++) {
                        newBook = newBook + Character.toString(book.charAt(p));
                    }

                    while (countDigits >= 0) {
                        amountStr = amountStr + Character.toString(book.charAt(beginning - 2));
                        beginning++;
                        countDigits--;
                    }

                    amount = amount + Double.parseDouble(amountStr);

                    balance = balance - amount;
                    total = total + amount;
                    previousNewLinePosition = i;
                    averageList.add(amount);
                    double rounded = Math.round(balance * 100.00) / 100.00;
                    newBook = newBook + decimalFormat.format(amount) + " Balance " + decimalFormat.format(rounded)
                            + "\\r\\n";
                    break;
                }

            }
        }
        newBook = newBook.replaceAll("  ", " ");
        newBook = newBook + "Total expense  " + decimalFormat.format(Math.round(total * 100.00) / 100.00) + "\\r\\n"
                + "Average expense  "
                + decimalFormat
                .format(Math.round(averageList.stream().mapToDouble(val -> val).average().orElse(0.0) * 100.00)
                        / 100.00);

        return newBook;
    }

    public double f(double x) {
        return x / (Math.sqrt(1 + x) + 1);
    }

    public double mean(String town, String strng) {
        String[] townsData = strng.split("\n");

        for (String townData : townsData) {
            if (townData.startsWith(town + ":")) {
                String[] records = townData.split(":")[1].split(",");
                double sum = 0;
                int count = 0;

                for (String record : records) {
                    sum += Double.parseDouble(record.split(" ")[1]);
                    count++;
                }

                return sum / count;
            }
        }

        return -1;
    }

    public double variance(String town, String strng) {
        String[] townsData = strng.split("\n");

        for (String townData : townsData) {
            if (townData.startsWith(town + ":")) {
                String[] records = townData.split(":")[1].split(",");
                double mean = mean(town, strng);
                double sumOfSquares = 0;
                int count = 0;

                for (String record : records) {
                    double rainfall = Double.parseDouble(record.split(" ")[1]);
                    sumOfSquares += Math.pow(rainfall - mean, 2);
                    count++;
                }

                return sumOfSquares / count;
            }
        }

        return -1;
    }

    public String nbaCup(String resultSheet, String toFind) {
        if (toFind.isEmpty()) {
            return "";
        }

        int[] stats = new int[5];
        for (String match : of(resultSheet.split(",")).filter(s -> s.contains(toFind)).toArray(String[]::new)) {
            if (match.contains(".")) {
                return "Error(float number):" + match;
            }
            String[] teams = match.substring(0, match.lastIndexOf(' ')).replaceAll(" \\d+ ", "@").split("@");
            if (teams[0].equals(toFind) || teams[1].equals(toFind)) {
                int pointsA = Integer.parseInt(match.substring(match.lastIndexOf(' ') + 1));
                int pointsB = Integer.parseInt(match.substring(teams[0].length() + 1, match.indexOf(teams[1]) - 1));
                updateMatchStatistics(pointsA, pointsB, match.startsWith(toFind), stats);
            }
        }
        return toFind + (stats[3] + stats[4] > 0 ? ":W=" + stats[0] + ";D=" + stats[2] + ";L=" + stats[1] + ";Scored=" + stats[3] + ";Conceded=" + stats[4] + ";Points=" + (3 * stats[0] + stats[2]) : ":This team didn't play!");
    }

    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        Map<Character, Integer> categoryQuantities = new HashMap<>();

        for (String art : lstOfArt) {
            String[] splitArt = art.split(" ");
            if (splitArt.length >= 2) {
                char category = splitArt[0].charAt(0);
                int quantity = Integer.parseInt(splitArt[1]);
                categoryQuantities.put(category, categoryQuantities.getOrDefault(category, 0) + quantity);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String category : lstOf1stLetter) {
            char c = category.charAt(0);
            int quantity = categoryQuantities.getOrDefault(c, 0);
            result.append("(").append(c).append(" : ").append(quantity).append(") - ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 3, result.length());
        }

        return result.toString();
    }
}
