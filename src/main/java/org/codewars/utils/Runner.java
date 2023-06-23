package org.codewars.utils;

import java.io.Reader;

public class TaskRunner {
    private final Reader reader;
    private final Users user;
    public void runWhereIsHe() {
        System.out.println("Run task whereIsHe");
        System.out.println("Input total amount of people in the line");
        int p = reader.readInt();
        System.out.println("Input number of people which standing in front of him");
        int bef = reader.readInt();
        System.out.println("Input number of people which standing behind him");
        int aft = reader.readInt();
        int result = user.getSevenImpl().whereIsHe(p, bef, aft);
        System.out.println(String.format("Result: %d", result));
    }
}
