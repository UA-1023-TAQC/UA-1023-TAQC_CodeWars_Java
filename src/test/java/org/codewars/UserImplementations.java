package org.codewars;

import org.codewars.kata.Eight;

public class UserImplementations {
    public static final Eight[] EIGHTS = new Eight[]{
            new org.codewars.kata.implementation.Anastasiia3795.EightImpl(),
            new org.codewars.kata.implementation.andriyav.EightImpl(),
            new org.codewars.kata.implementation.DappY127.EightImpl(),
            new org.codewars.kata.implementation.Francious.EightImpl(),
            new org.codewars.kata.implementation.kovalchukvita.EightImpl(),
            new org.codewars.kata.implementation.mosvvy.EightImpl(),
            new org.codewars.kata.implementation.Naccarato21.EightImpl(),
            new org.codewars.kata.implementation.Natalinatali.EightImpl(),
            new org.codewars.kata.implementation.Tk4V.EightImpl(),
            new org.codewars.kata.implementation.VolodumurBesarab.EightImpl(),
            new org.codewars.kata.implementation.zakotiukk.EightImpl()
    };

    public static Object[][] combineImplWithTests(Object[] implementations, Object[][] testData) {
        Object[][] fullTestData = new Object[testData.length * implementations.length][testData[0].length + 1];
        int count = 0;
        for (Object impl : implementations) {
            for (Object[] row : testData) {
                fullTestData[count][0] = impl;
                System.arraycopy(row, 0, fullTestData[count], 1, row.length);
                count++;
            }
        }
        return fullTestData;
    }
}
