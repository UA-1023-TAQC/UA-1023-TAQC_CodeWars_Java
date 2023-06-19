package org.codewars.kata.implementation.andriyav;

import java.util.Arrays;

import org.codewars.kata.Six;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    public long findNb(long m) {
        long func_result = 0;
        int i;
        for (i = 0; func_result < m; i++) {
            func_result += (long) Math.pow(i, 3);
            if (func_result > m) {
                return -1;
            }
        }
        return i - 1;
    }

    public String balance(String book) {
        int count_n = (book.length() - book.replace("\n", "").length()) / "\n".length();
        book = book.replace("!", "");
        book = book.replace(";", "");
        book = book.replace("}", "");
        book = book.replace("{", "");
        Matcher number1 = Pattern.compile("([A-Za-z]+)").matcher(book);
        int b = 0;
        while (number1.find()) {
            b += 1;
        }
        System.out.println(b);
        String[][] allMatches = new String[b][3];
        Matcher bill = Pattern.compile("(\\d+.\\d{2})").matcher(book);

        String bill_total = null;
        float bill_total_float = 0;
        while (bill.find()) {
            bill_total = bill.group();
            bill_total_float = Float.parseFloat(bill_total);
            break;
        }
        int count = 0;
        Matcher m = Pattern.compile("\\d+ [A-Za-z]+[\\s\\w! :=]+\\d?.\\d+").matcher(book);
        while (m.find()) {
            String grouper = m.group();
            Matcher number = Pattern.compile("(\\d+ )").matcher(grouper);
            Matcher letters = Pattern.compile("([A-Za-z]+)").matcher(grouper);
            Matcher prices = Pattern.compile("(\\d+.\\d+)").matcher(grouper);
            while (number.find()) {
                if (number.group().strip() == null) {
                    allMatches[count][0] = "";
                } else allMatches[count][0] = number.group().strip();
            }
            while (letters.find()) {
                if (letters.group() == null) {
                    allMatches[count][1] = "";
                } else allMatches[count][1] = letters.group();
            }
            while (prices.find()) {
                if (prices.group() == null) {
                    allMatches[count][2] = "";
                } else allMatches[count][2] = prices.group();
            }
            count++;
        }
        StringBuilder result = new StringBuilder();
        String bill_total_float_str = String.format(Locale.US, "%.2f", bill_total_float);
        result.append("Original Balance: " + bill_total_float_str);
        float total_balance = 0;
        int total_count = 0;
        for (int i = 0; i < allMatches.length; i++) {
            try {
                bill_total_float -= (Float.parseFloat(allMatches[i][2]));
            } catch (Exception e) {
                bill_total_float -= 0;
            }
            String formattedValue = String.format(Locale.US, "%.2f", bill_total_float);
            result.append("\\r\\n");
            result.append(allMatches[i][0] + " " + allMatches[i][1] + " " + allMatches[i][2] + " Balance " + formattedValue);
            try {
                total_balance += Float.parseFloat(allMatches[i][2]);
                total_count += 1;
            } catch (Exception e) {
                total_balance += 0;
            }
        }
        float average_expense = Math.round((total_balance / total_count) * 100) / 100f;
        String total_balance_str = String.format(Locale.US, "%.2f", total_balance);
        String average_expense_str = String.format(Locale.US, "%.2f", average_expense);
        result.append("\\r\\n");
        result.append("Total expense  " + total_balance_str);
        result.append("\\r\\n");
        result.append("Average expense  " + average_expense_str);
        String result_str = result.toString();
        return result_str;
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

        String[] check = {};
        if (Arrays.toString(check).equals(Arrays.toString(lstOfArt))) {
            return "";
        } else {
            String result = "";
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                int sum = 0;
                String result_sum = "";
                for (int k = 0; k < lstOfArt.length; k++) {
                    if (lstOf1stLetter[i].charAt(0) == lstOfArt[k].charAt(0)) {
                        String[] split_str = lstOfArt[k].split(" ");
                        sum += Integer.parseInt(split_str[1]);
                    }
                    result_sum = "(" + lstOf1stLetter[i] + " : " + String.valueOf(sum) + ")";
                }
                result += " - " + result_sum;
            }
            return result.replaceFirst(" - ", "");
        }
    }
}
